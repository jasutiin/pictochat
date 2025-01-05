<script setup lang="ts"></script>

<template>
  <div class="container">
    <div class="top-container">
      <div class="white-bar">
        <div class="square-top"></div>
        <div class="square-bot"></div>
      </div>
      <div class="inner">
        <div class="title">Pictochat</div>
      </div>
    </div>
    <div class="bottom-container">
      <h1 class="item">Room {{ $route.params.id }}</h1>
      <RouterLink to="/room-select" class="item">Back</RouterLink>
    </div>
  </div>
</template>

<style scoped>
.container {
  display: flex;
  width: 600px;
  flex-direction: column;
  justify-content: center;
  align-items: center;
  font-size: xx-large;
  background-color: #c9c9c9;
  background-size: 15px 15px;
  background-image: linear-gradient(to bottom, white 1px, transparent 3px);
}

.bottom-container {
  width: inherit;
  display: flex;
  flex-direction: column;
  height: 50%;
  justify-content: center;
  align-items: center;
}

.top-container {
  display: flex;
  width: inherit;
  height: 50%;
}

.title {
  display: flex;
  padding: 10px;
  align-items: center;
  height: 20px;
  border: 3px solid white;
  border-radius: 20px;
  background-color: grey;
  color: white;
  margin: 10px;
}

.white-bar {
  display: flex;
  flex-direction: column;
  justify-content: space-between;
  height: 100%;
  background-color: white;
  width: 40px;
}

.inner {
  display: flex;
  flex-direction: column;
  justify-content: end;
  height: 100%;
  flex: 1;
}

.square-top {
  width: 40px;
  height: 40px;
  border-bottom: 1px dotted black;
}

.square-bot {
  width: 40px;
  height: 40px;
  border-top: 1px dotted black;
}

.item {
  margin: 10px;
}

@media (max-width: 426px) {
  .container {
    width: 100vw;
  }
}
</style>
