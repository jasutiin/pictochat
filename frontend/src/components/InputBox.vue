<script setup lang="ts">
import { onMounted, ref } from 'vue';
import { sendCanvasImage } from '../api/message';

const isDrawing = ref(false);
const lastX = ref(0);
const lastY = ref(0);

const canvas = ref<HTMLCanvasElement | null>(null);
const ctx = ref<CanvasRenderingContext2D | null>(null);

onMounted(() => {
  if (canvas.value) {
    ctx.value = canvas.value.getContext('2d');
    const canvasElement = canvas.value;

    if (ctx.value) {
      const startDrawing = (e: MouseEvent) => {
        isDrawing.value = true;
        const rect = canvasElement.getBoundingClientRect();
        lastX.value = e.clientX - rect.left;
        lastY.value = e.clientY - rect.top;
      };

      const draw = (e: MouseEvent) => {
        if (!isDrawing.value) return;
        const rect = canvasElement.getBoundingClientRect();
        const mouseX = e.clientX - rect.left;
        const mouseY = e.clientY - rect.top;

        if (ctx.value) {
          ctx.value.lineWidth = 3;
          ctx.value.lineCap = 'round';
          ctx.value.strokeStyle = 'black';

          ctx.value.beginPath();
          ctx.value.moveTo(lastX.value, lastY.value);
          ctx.value.lineTo(mouseX, mouseY);
          ctx.value.stroke();
        }

        lastX.value = mouseX;
        lastY.value = mouseY;
      };

      const stopDrawing = () => {
        isDrawing.value = false;
      };

      canvasElement.addEventListener('mousedown', startDrawing);
      canvasElement.addEventListener('mousemove', draw);
      canvasElement.addEventListener('mouseup', stopDrawing);
      canvasElement.addEventListener('mouseout', stopDrawing);

      window.addEventListener('keydown', (event: KeyboardEvent) => {
        if (event.key === 'Enter' && canvas.value) {
          sendCanvasImageData();
          resetCanvas();
        }
      });
    }
  }
});

const sendCanvasImageData = async () => {
  if (!canvas.value || !ctx.value) return;

  const imageData = canvas.value.toDataURL('image/png');
  await sendCanvasImage(imageData);
};

const resetCanvas = () => {
  if (canvas.value && ctx.value) {
    ctx.value.clearRect(0, 0, canvas.value.width, canvas.value.height);
  }
};
</script>

<template>
  <canvas class="input-container" ref="canvas"></canvas>
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
