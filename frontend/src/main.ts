import { createApp } from 'vue';
import App from './App.vue';

import { createMemoryHistory, createRouter } from 'vue-router';

import Login from './pages/Login.vue';
import Room from './pages/Room.vue';
import RoomSelect from './pages/RoomSelect.vue';

const routes = [
  { path: '/', component: Login },
  { path: '/room-select', component: RoomSelect },
  { path: '/room:id', component: Room },
];

const router = createRouter({
  history: createMemoryHistory(),
  routes,
});

createApp(App).use(router).mount('#app');
