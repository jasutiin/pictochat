<script setup lang="ts">
import Key from './Key.vue';

const firstRow = ['1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '-', '='];
const secondRow = [
  'q',
  'w',
  'e',
  'r',
  't',
  'y',
  'u',
  'i',
  'o',
  'p',
  '-',
  '=',
  'backspace',
];
const thirdRow = ['caps', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'enter'];
const fourthRow = ['shift', 'z', 'x', 'c', 'v', 'b', 'n', 'm', ',', '.', '/'];
const fifthRow = [';', `'`, 'space', '[', ']'];
</script>

<template>
  <div class="outer-keyboard-container">
    <div class="keyboard-container">
      <div class="row">
        <Key v-for="keyItem in firstRow" :keyItem="keyItem" />
      </div>
      <div class="row">
        <Key v-for="keyItem in secondRow" :keyItem="keyItem" />
      </div>
      <div class="row">
        <Key v-for="keyItem in thirdRow" :keyItem="keyItem" />
      </div>
      <div class="row">
        <Key v-for="keyItem in fourthRow" :keyItem="keyItem" />
      </div>
      <div class="row">
        <Key v-for="keyItem in fifthRow" :keyItem="keyItem" />
      </div>
    </div>
    <div class="output-container">
      <button class="output-button">SEND</button>
      <button class="output-button">COPY</button>
      <button class="output-button">CLEAR</button>
    </div>
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
  display: flex;
  flex-direction: column;
  border: 3px solid #5c5c5c;
  flex: 1;
  border-radius: 20px;
  height: inherit;
  margin: 5px;
  margin-right: 2px;
  background: white;
}

.output-container {
  display: flex;
  flex-direction: column;
  border-top-left-radius: 20px;
  border-bottom-left-radius: 20px;
  border: 3px solid #5c5c5c;
  border-right: 0px;
  height: inherit;
  flex: 0.15;
  margin: 5px;
  margin-right: 0px;
  margin-left: 2px;
  background: white;
}

.output-container .output-button:nth-child(1) {
  border-top-left-radius: 15px;
}

.output-container .output-button:nth-child(3) {
  border-bottom-left-radius: 15px;
}

.output-button {
  flex: 1;
  border: none;
  background: #b2b2b2;
  font-size: x-large;
}

.row {
  display: flex;
  flex-direction: row;
  flex: 1;
}

.keyboard-container .row:first-child .key-container:first-child {
  border-top-left-radius: 16px;
}

.keyboard-container .row:first-child .key-container:last-child {
  border-top-right-radius: 16px;
}

.keyboard-container .row:last-child .key-container:first-child {
  border-bottom-left-radius: 16px;
}

.keyboard-container .row:last-child .key-container:last-child {
  border-bottom-right-radius: 16px;
}
</style>
