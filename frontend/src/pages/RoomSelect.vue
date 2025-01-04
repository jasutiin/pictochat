<script setup lang="ts"></script>

<template>
  <div class="container">
    <div class="top-container"></div>
    <div class="bottom-container">
      <div class="design">
        Choose a Chat Room to join. <RouterLink to="/">Back</RouterLink>
      </div>
      <nav>
        <RouterLink to="/room/1" class="item">Chat Room A</RouterLink>
        <RouterLink to="/room/2" class="item">Chat Room B</RouterLink>
        <RouterLink to="/room/3" class="item">Chat Room C</RouterLink>
        <RouterLink to="/room/4" class="item">Chat Room D</RouterLink>
        <RouterLink to="/room/5" class="item">Chat Room E</RouterLink>
      </nav>
      <div class="design"></div>
    </div>
  </div>
</template>

<style scoped>
.container {
  display: flex;
  width: 600px;
  display: flex;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  font-size: xx-large;
}

.bottom-container {
  width: inherit;
  display: flex;
  flex-direction: column;
  height: 50%;
  justify-content: center;
  align-items: center;
  background-color: white;
  background-size: 60px 60px;
  background-image: linear-gradient(to right, #ababab 1px, transparent 3px),
    linear-gradient(to bottom, #ababab 1px, transparent 3px);
}

.top-container {
  width: inherit;
  height: 50%;
  background-color: white;
  background-size: 60px 60px;
  background-image: linear-gradient(to right, #ababab 1px, transparent 3px),
    linear-gradient(to bottom, #ababab 1px, transparent 3px);
}

.design {
  display: flex;
  justify-content: center;
  align-items: center;
  height: 150px;
  background-color: royalblue;
  width: 100%;
}

nav {
  display: flex;
  /* position: absolute; */
  flex-direction: column;
  justify-content: center;
  align-items: center;
  width: inherit;
  overflow-y: scroll;
  height: 100%;
}

.item {
  display: flex;
  align-items: center;
  background-color: grey;
  height: 300px;
}

@media (max-width: 426px) {
  .container {
    width: 100vw;
  }
}
</style>
