<template>
  <div class="black-bg" v-if="isModal">
    <div class="white-bg">
      <h1>상세페이지임</h1>
      <p>상세페이지 내용임</p>
      <button @click="isModal = false">닫기</button>
    </div>
  </div>

  <div class="menu">
    <a v-for="(menu, i) in menus" :key="i">{{ menu }}</a>
  </div>
  <div v-for="(dat, i) in data" :key="i">
    <img :src="dat.image" class="room-img" />
    <h4 @click="isModal = true">{{ dat.title }}</h4>
    <p>{{ dat.price }}원</p>
  </div>
</template>

<script>
import data from "./assets/oneroom.js";

export default {
  name: "App",
  data() {
    return {
      menus: ["Home", "Shop", "About"],
      data: data,
      isModal: false,
    };
  },
  methods: {
    increase(i) {
      this.신고수[i] += 1;
    },
  },
  components: {},
};
</script>

<style>
body {
  margin: 0;
}
div {
  box-sizing: border-box;
}
.black-bg {
  width: 100%;
  height: 100%;
  background: rgba(0, 0, 0, 0.5);
  position: fixed;
  padding: 20px;
}
.white-bg {
  width: 100%;
  background-color: white;
  border-radius: 8px;
  padding: 20px;
}

#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

.menu {
  background: darkslateblue;
  padding: 15px;
  border-radius: 5px;
}

.menu a {
  color: white;
  padding: 10px;
}
.room-img {
  width: 100%;
  margin-top: 40px;
}
</style>
