<script setup lang="ts"></script>

<template>
  <div class="container">
    <RouterLink to="/room-select">Connect to Pictochat</RouterLink>
    <form><input type="text" name="username" /></form>
  </div>
</template>

<style scoped>
.container {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}
</style>
