<script setup>
import axios from 'axios';




async function onTest() {
  // api 호출
  const res = await axios.get('/api');
  
	alert(res.data);
}

</script>

<template>
  <div class="about">
    <h1>This is an about page</h1>
    <a href="javascript:void(0);" @click="onTest">api 테스트</a>
  </div>
</template>

<style>
@media (min-width: 1024px) {
  .about {
    min-height: 100vh;
    display: flex;
    align-items: center;
  }
}
</style>
