<script setup lang="ts">

import HelloWorld from '@/components/HelloWorld.vue'
import GlobalHeader from '@/components/GlobalHeader.vue'
</script>

<template>
  <div>
    <a-layout style="min-height: 100vh">
      <a-layout-header class="header"><global-header/></a-layout-header>
      <a-layout-content class="content">
        <router-view/>
      </a-layout-content>
      <a-layout-footer class="footer">
        <a href="https://github.com/derhimmelvin" target="_blank">GitHub of 艾尔文</a>
      </a-layout-footer>
    </a-layout>
  </div>
</template>

<style scoped>
  .header {
    background-color: #fff;
    margin-bottom: 28px;
    padding-inline: 18px;
  }
  .content {
    padding: 28px;
    margin-bottom: 28px;
  }
  .footer {
    background-color: #afafaf;
    text-align: center;
    padding: 18px;
  }
</style>
