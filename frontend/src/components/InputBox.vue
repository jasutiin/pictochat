<script setup lang="ts">
import { onMounted } from 'vue';

// ensure that the component is mounted before
onMounted(() => {
  const canvas = document.getElementsByClassName(
    'input-container'
  )[0] as HTMLCanvasElement;
  const ctx = canvas.getContext('2d');

  if (ctx) {
    ctx.font = '15px Arial';
    ctx.fillText('Hello World', 80, 25);
  }
});
</script>

<template>
  <canvas class="input-container"></canvas>
</template>

<style scoped>
.input-container {
  border: 3px solid royalblue;
  border-radius: 20px;
  width: inherit;
  flex: 1;
  height: 50%;
  margin: 5px;
  background-color: white;
  background-size: 51px 51px;
  background-image: linear-gradient(to bottom, #006eff54 1px, transparent 3px);
}
</style>
