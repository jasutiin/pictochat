<script setup lang="ts"></script>

<template>
  <div class="container">
    <div class="top-container"></div>
    <div class="bottom-container">
      <div class="design">Choose a Chat Room to join.</div>
      <div class="content">
        <h1>Room Select</h1>
        <nav>
          <RouterLink to="/room/1">Room 1</RouterLink>
          <RouterLink to="/room/2">Room 2</RouterLink>
          <RouterLink to="/room/3">Room 3</RouterLink>
          <RouterLink to="/room/4">Room 4</RouterLink>
          <RouterLink to="/">Back</RouterLink>
        </nav>
      </div>

      <div class="design"></div>
    </div>
  </div>
</template>

<style scoped>
.container {
  display: flex;
  width: 100%;
  display: flex;
  flex-direction: column;
  flex: 1;
  justify-content: center;
  align-items: center;
}

.bottom-container {
  width: 100%;
  display: flex;
  flex-direction: column;
  flex: 1;
  justify-content: center;
  align-items: center;
  background-color: white;
  background-size: 60px 60px;
  background-image: linear-gradient(to right, #ababab 1px, transparent 3px),
    linear-gradient(to bottom, #ababab 1px, transparent 3px);
}

.top-container {
  width: 100%;
  flex: 1;
  background-color: white;
  background-size: 60px 60px;
  background-image: linear-gradient(to right, #ababab 1px, transparent 3px),
    linear-gradient(to bottom, #ababab 1px, transparent 3px);
}

.design {
  display: flex;
  justify-content: center;
  align-items: center;
  flex: 0.2;
  margin: auto;
  background-color: royalblue;
  width: 100%;
  font-size: x-large;
}

.content {
  display: flex;
  flex-direction: column;
  justify-content: center;
  flex: 1;
}

nav {
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
}

@media screen and (min-width: 426px) {
  .container {
    max-width: 500px;
  }
}
</style>
