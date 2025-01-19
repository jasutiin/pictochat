<script setup lang="ts">
import { global } from '../global/user.ts';
import { useRouter } from 'vue-router';

const router = useRouter();

const changeUsername = () => {
  global.username = (
    document.getElementById('username') as HTMLInputElement
  ).value;

  if (global.username === '' || global.username === null) {
    alert("can't have empty username");
  } else {
    router.push('/room-select');
  }
};
</script>

<template>
  <div class="container">
    <form>
      <button class="connect" :onclick="changeUsername">
        <h1>Connect to Pictochat</h1>
      </button>
      <input id="username" type="text" placeholder="Username" />
    </form>
  </div>
</template>

<style scoped>
.container {
  width: 600px;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  background-color: white;
  background-size: 60px 60px;
  background-image: linear-gradient(to right, #ababab 1px, transparent 3px),
    linear-gradient(to bottom, #ababab 1px, transparent 3px);
}

.item {
  margin: 10px;
}

form {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.connect {
  border: none;
  margin-bottom: 20px;
  font-size: large;
  background: none;
  cursor: pointer;
}

input {
  height: 25px;
  width: 180px;
  font-size: xx-large;
  border: 3px solid black;
  padding: 5px;
}

@media (max-width: 426px) {
  .container {
    width: 100vw;
  }
}
</style>
