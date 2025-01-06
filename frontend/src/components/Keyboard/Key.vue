<script setup lang="ts">
defineProps({ keyItem: String });
</script>

<template>
  <button v-if="keyItem === 'space'" class="key-container space">
    {{ keyItem }}
  </button>
  <button v-else-if="keyItem === 'enter'" class="key-container enter">
    {{ keyItem }}
  </button>
  <button v-else-if="keyItem === 'backspace'" class="key-container backspace">
    {{ keyItem }}
  </button>
  <button v-else-if="keyItem === 'shift'" class="key-container shift">
    {{ keyItem }}
  </button>
  <button v-else-if="keyItem === 'caps'" class="key-container caps">
    {{ keyItem }}
  </button>
  <button v-else class="key-container">{{ keyItem }}</button>
</template>

<style scoped>
.key-container {
  flex: 1;
  background: #b2b2b2;
  border: none;
  margin: 1px;
  font-size: x-large;
  padding: 0px 10px;
}
</style>
