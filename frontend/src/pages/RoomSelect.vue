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
      <div class="design">
        <span class="head">Choose a Chat Room to join.</span>
        <RouterLink to="/" class="back">Back</RouterLink>
      </div>
      <nav>
        <RouterLink to="/room/A" class="item">
          <div class="letter">A</div>
          Chat Room A
          <div class="member-count">0/16</div>
        </RouterLink>
        <RouterLink to="/room/B" class="item">
          <div class="letter">B</div>
          Chat Room B
          <div class="member-count">0/16</div>
        </RouterLink>
        <RouterLink to="/room/C" class="item">
          <div class="letter">C</div>
          Chat Room C
          <div class="member-count">0/16</div>
        </RouterLink>
        <RouterLink to="/room/D" class="item">
          <div class="letter">D</div>
          Chat Room D
          <div class="member-count">0/16</div>
        </RouterLink>
        <RouterLink to="/room/E" class="item">
          <div class="letter">E</div>
          Chat Room E
          <div class="member-count">0/16</div>
        </RouterLink>
      </nav>
      <div class="design"></div>
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

.design {
  display: flex;
  justify-content: space-around;
  align-items: center;
  height: 150px;
  background-color: royalblue;
  width: 100%;
}

nav {
  padding: 30px 0px;
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
  background-color: #e2e2e2;
  height: 85px;
  width: 80%;
  margin: auto;
  border: 1px solid black;
}

.letter {
  display: flex;
  justify-content: center;
  align-items: center;
  font-size: xxx-large;
  width: 100px;
  border: 1px solid black;
  height: 100%;
  margin-right: 20px;
}

.member-count {
  padding: 5px 0px;
  display: flex;
  justify-content: center;
  align-items: center;
  margin: auto;
  width: 100px;
  border: 1px solid black;
}

@media (max-width: 600px) {
  .container {
    width: 100vw;
  }
}

@media (max-width: 425px) {
  .container {
    width: 100vw;
    font-size: x-large;
  }
}
</style>
