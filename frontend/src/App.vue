<template>
  <div id="app">
    <basic-layout/>
  </div>
</template>

<script setup lang="ts">
import { useLoginUserStore } from '@/stores/useLoginUserStore.ts'

const loginUserStore = useLoginUserStore()
loginUserStore.fetchLoginUser()

import BasicLayout from '@/layouts/BasicLayout.vue'

import { healthUsingGet } from '@/api/mainController'

healthUsingGet().then((res) => {
  console.log(res)
})

</script>

<style scoped>

</style>
