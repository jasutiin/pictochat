<script setup lang="ts">
import { onMounted, ref } from 'vue';

const isDrawing = ref(false);
const lastX = ref(0);
const lastY = ref(0);

onMounted(() => {
  const canvas = document.getElementsByClassName(
    'input-container'
  )[0] as HTMLCanvasElement;
  const ctx = canvas.getContext('2d');

  if (ctx) {
    ctx.font = '15px Arial';
    ctx.fillText('Hello World', 80, 25);

    const startDrawing = (e: MouseEvent) => {
      isDrawing.value = true;
      const rect = canvas.getBoundingClientRect();
      lastX.value = e.clientX - rect.left;
      lastY.value = e.clientY - rect.top;
    };

    const draw = (e: MouseEvent) => {
      if (!isDrawing.value) return;
      const rect = canvas.getBoundingClientRect();
      const mouseX = e.clientX - rect.left;
      const mouseY = e.clientY - rect.top;

      ctx.lineWidth = 3;
      ctx.lineCap = 'round';
      ctx.strokeStyle = 'black';

      ctx.beginPath();
      ctx.moveTo(lastX.value, lastY.value);
      ctx.lineTo(mouseX, mouseY);
      ctx.stroke();

      lastX.value = mouseX;
      lastY.value = mouseY;
    };

    const stopDrawing = () => {
      isDrawing.value = false;
    };

    canvas.addEventListener('mousedown', startDrawing);
    canvas.addEventListener('mousemove', draw);
    canvas.addEventListener('mouseup', stopDrawing);
    canvas.addEventListener('mouseout', stopDrawing);
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
