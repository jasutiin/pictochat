<script setup lang="ts"></script>

<template>
  <div class="container">
    <h1>Room Select</h1>
    <nav>
      <RouterLink to="/room:1">Room 1</RouterLink>
      <RouterLink to="/room:2">Room 2</RouterLink>
      <RouterLink to="/room:3">Room 3</RouterLink>
      <RouterLink to="/room:4">Room 4</RouterLink>
      <RouterLink to="/">Back</RouterLink>
    </nav>
  </div>
</template>

<style scoped>
.container {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}

nav {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}
</style>
