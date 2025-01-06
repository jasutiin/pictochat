<script setup lang="ts">
import UpperScreen from '../components/UpperScreen.vue';
import Keyboard from '../components/Keyboard/Keyboard.vue';
import InputBox from '../components/InputBox.vue';
import Sidebar from '../components/Sidebar.vue';
</script>

<template>
  <div class="container">
    <UpperScreen />
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
  align-items: center;
}

.exit {
  display: flex;
  height: 30px;
  width: inherit;
  background: white;
  justify-content: end;
  /* align-items: center; */
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
