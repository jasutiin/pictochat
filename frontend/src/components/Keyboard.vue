<script setup lang="ts"></script>

<template>
  <div class="outer-keyboard-container">
    <div class="keyboard-container"></div>
    <div class="output-container"></div>
  </div>
</template>

<style scoped>
.outer-keyboard-container {
  display: flex;
  flex-direction: row;
  flex: 1;
  width: inherit;
}

.keyboard-container {
  border: 3px solid #5c5c5c;
  flex: 1;
  border-radius: 20px;
  height: inherit;
  margin: 5px;
  background: white;
}

.output-container {
  border-top-left-radius: 20px;
  border-bottom-left-radius: 20px;
  border: 3px solid #5c5c5c;
  border-right: 0px;
  height: inherit;
  flex: 0.15;
  margin: 5px;
  margin-right: 0px;
  background: white;
}
</style>
