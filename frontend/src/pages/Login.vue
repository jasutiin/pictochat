<script setup lang="ts"></script>

<template>
  <div class="container">
    <RouterLink to="/room-select" class="item"
      ><h1>Connect to Pictochat</h1></RouterLink
    >
    <form class="item"><input type="text" placeholder="Username" /></form>
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
