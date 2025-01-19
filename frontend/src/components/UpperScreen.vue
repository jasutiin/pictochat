<script setup lang="ts">
interface Message {
  username: string;
  content: string;
  type: string;
}

defineProps<{
  messages: Message[];
}>();
</script>

<template>
  <div class="top-container">
    <div class="white-bar">
      <div class="square-top"></div>
      <div class="square-bot"></div>
    </div>
    <div class="inner">
      <ul>
        <li class="title">Pictochat</li>
        <li class="message" v-for="message in messages" :key="message.content">
          {{ message.content }}
        </li>
      </ul>
    </div>
  </div>
</template>

<style scoped>
.top-container {
  display: flex;
  width: inherit;
  height: 50%;
  background-color: #8d8d8d;
  background-size: 15px 15px;
  background-image: linear-gradient(to bottom, white 1px, transparent 3px);
}

.title {
  display: flex;
  padding: 10px;
  align-items: center;
  height: 20px;
  border: 3px solid white;
  border-radius: 20px;
  background-color: #575757;
  color: white;
  margin: 10px;
}

.message {
  display: flex;
  padding: 10px;
  align-items: center;
  height: 20px;
  border: 3px solid white;
  border-radius: 20px;
  background-color: black;
  color: white;
  margin: 10px;
}

.white-bar {
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  height: 100%;
  background-color: white;
  width: 40px;
}

.inner {
  display: flex;
  flex-direction: column;
  justify-content: end;
  height: 100%;
  flex: 1;
}

.square-top {
  width: 40px;
  height: 40px;
  border-bottom: 1px dotted black;
}

.square-bot {
  width: 40px;
  height: 40px;
  border-top: 1px dotted black;
}
</style>
