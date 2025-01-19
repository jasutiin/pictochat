<!-- https://stackoverflow.com/questions/57643096/stomp-destination-url-vs-endpoint-url -->
<!-- https://stomp-js.github.io/guide/stompjs/using-stompjs-v5.html -->

<script setup lang="ts">
import UpperScreen from '../components/UpperScreen.vue';
import Keyboard from '../components/Keyboard/Keyboard.vue';
import InputBox from '../components/InputBox.vue';
import Sidebar from '../components/Sidebar.vue';

import { onBeforeUnmount, ref } from 'vue';
import { Client } from '@stomp/stompjs';
import { useRoute } from 'vue-router';

import { global } from '../global/user.ts';
import { incrementCount } from '../api/chatCount.ts';
import { decrementCount } from '../api/chatCount.ts';

const route = useRoute();
const roomLetter = route.params.id;
const messageList = ref<any[]>([]);
console.log(roomLetter);

const client = new Client({
  brokerURL: `ws://localhost:8080/chat`,
  connectHeaders: {
    login: `${global.username}`,
    passcode: 'password', // keep this, i don't think it matters
  },
  debug: function (hey: string) {
    console.log(hey);
  },
  reconnectDelay: 5000, // if connection to websocket fails, try again in 5s
  heartbeatIncoming: 4000, // interval of checking if websocket connection is still live
  heartbeatOutgoing: 4000,
  onConnect: () => {
    client.subscribe(`/topic/room${roomLetter}`, (message) => {
      const parsedMessage = JSON.parse(message.body);
      messageList.value.push(parsedMessage);
    });
    client.publish({
      destination: `/topic/room${roomLetter}`,
      body: JSON.stringify({
        username: `${global.username}`,
        content: `${global.username} joined`,
        messageType: 'connect',
      }),
    });
  },
});

client.activate();
await incrementCount(roomLetter);

onBeforeUnmount(async () => {
  client.publish({
    destination: `/topic/room${roomLetter}`,
    body: JSON.stringify({
      username: `${global.username}`,
      content: `${global.username} left`,
      messageType: 'disconnect',
    }),
  });
  client.deactivate();
  await decrementCount(roomLetter);
  messageList.value = [];
});
</script>

<template>
  <div class="container">
    <UpperScreen :messages="messageList" />
    <div class="bottom-container">
      <Sidebar />
      <div class="right">
        <div class="exit">
          <RouterLink to="/room-select" class="item">X</RouterLink>
        </div>
        <div class="border">
          <InputBox />
          <Keyboard />
        </div>
      </div>
    </div>
  </div>
</template>

<style scoped>
.container {
  display: flex;
  width: 600px;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  font-size: xx-large;
  background-color: white;
}

.bottom-container {
  width: inherit;
  display: flex;
  flex-direction: row;
  height: 50%;
  justify-content: center;
  /* border-top: 8px solid #006eff54; */
  /* align-items: center; */
}

.exit {
  display: flex;
  height: 30px;
  width: inherit;
  background: white;
  justify-content: end;
}

.item {
  margin: 5px;
}

.right {
  display: flex;
  flex-direction: column;
  height: 100%;
  flex: 1;
}

.border {
  display: flex;
  flex-direction: column;
  flex: 1;
  border: 3px solid #5c5c5c;
  border-top-left-radius: 20px;
  border-bottom-left-radius: 20px;
  margin: 10px 0px;
  background-color: #8d8d8d;
  background-size: 15px 15px;
  background-image: linear-gradient(to bottom, white 1px, transparent 3px);
}

@media (max-width: 600px) {
  .container {
    width: 100vw;
  }
}
</style>
