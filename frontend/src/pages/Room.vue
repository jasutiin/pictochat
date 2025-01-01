<script setup lang="ts"></script>

<template>
  <div class="container">
    <h1 class="item">Room {{ $route.params.id }}</h1>
    <RouterLink to="/room-select" class="item">Back</RouterLink>
  </div>
</template>

<style scoped>
.container {
  width: 100%;
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

@media screen and (min-width: 426px) {
  .container {
    max-width: 500px;
  }
}
</style>
