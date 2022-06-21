<template>
  <div class="memo">
    <div class="act">
      <button class="btn btn-primary" @click="add()">+ 추가</button>
    </div>
    <ul>
      <li v-for="(d, idx) in state.data" :key="idx">{{ d }}</li>
    </ul>
  </div>
</template>
<script>
import { reactive } from "vue";
import axios from "axios";

export default {
  setup() {
    const state = reactive({
      data: [],
    });

    const add = () => {
      const content = prompt("내용을 입력해주세요.");

      axios.post("/api/memos", { content }).then((res) => {
        state.data = res.data;
      });
    };

    axios.get("/api/memos").then((res) => {
      state.data = res.data;
    });

    return { state, add };
  },
};
</script>
<style lang="scss" scoped>
.memo {
  .act {
    text-align: right;
    padding: 10px 10px 5px 5px;
  }
  ul {
    list-style: none;
    padding: 15px;
    margin: 0;

    li {
      padding: 15px;
      margin: 10px 0;
      border: 1px solid #eee;
    }
  }
}
</style>
