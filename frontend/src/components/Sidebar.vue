<script setup lang="ts"></script>

<template>
  <div class="sidebar-container">
    <div class="sidebar-group">
      <button class="sidebar-button">Up</button>
      <button class="sidebar-button">Down</button>
    </div>
    <div class="sidebar-group pen-styles">
      <button class="sidebar-button">Pen</button>
      <button class="sidebar-button">Eraser</button>
      <button class="sidebar-button">0.7mm</button>
      <button class="sidebar-button">0.5mm</button>
    </div>
    <div class="sidebar-group keyboard-styles">
      <button class="sidebar-button">A/1</button>
      <button class="sidebar-button">Ã</button>
      <button class="sidebar-button">あ</button>
      <button class="sidebar-button">XD</button>
    </div>
  </div>
</template>

<style scoped>
.sidebar-container {
  display: flex;
  flex-direction: column;
  width: 40px;
  background: white;
  height: 100%;
}

.sidebar-group {
  display: flex;
  flex-direction: column;
  height: 80px;
  padding: 7px 0px;
  border-bottom: 1px dotted black;
}

.sidebar-container .sidebar-group:last-child {
  border: none;
}

.pen-styles {
  flex: 1;
}

.keyboard-styles {
  flex: 1;
}

.sidebar-arrows .sidebar-button:first-child {
  border-bottom: 3px solid #5c5c5c;
}

.sidebar-arrows .sidebar-button:last-child {
  border-top: 3px solid #5c5c5c;
}

.sidebar-button {
  font-size: large;
  flex: 1;
  background: #8d8d8d;
  border: none;
  margin: 1px 3px;
}
</style>
