<template>
  <div class="globalHeader">
    <a-row :wrap="false">
      <a-col flex="200px">
        <RouterLink to="/">
          <div class="title-bar">
            <img class="logo" src="../assets/logo.png" alt="logo" />
            <div class="title">智图云枢</div>
          </div>
        </RouterLink>
      </a-col>
      <a-col flex="auto">
        <a-menu
          v-model:selectedKeys="current"
          mode="horizontal"
          :items="items" @click="doMenuClick"
        />
      </a-col>
      <a-col flex="120px">
        <div class="user-login-status">
          <div class="user-login-status">
            <div v-if="loginUserStore.loginUser.id">
              {{ loginUserStore.loginUser.userName ?? '无名' }}
            </div>
            <div v-else>
              <a-button type="primary" href="/user/login">登录</a-button>
            </div>
          </div>

        </div>
      </a-col>
    </a-row>


  </div>
</template>
<script lang="ts" setup>
const loginUserStore = useLoginUserStore()

import { h, ref } from 'vue';
import { HomeOutlined } from '@ant-design/icons-vue';
import { MenuProps } from 'ant-design-vue';
import router from '@/router'

const items = ref<MenuProps['items']>([
  {
    key: '/',
    icon: () => h(HomeOutlined),
    label: '主页',
    title: '主页',
  },
  {
    key: '/about',
    label: '关于',
    title: '关于',
  },
  {
    key: 'others',
    label: h('a', { href: 'https://github.com/derhimmelvin', target: '_blank' }, '个人GitHub'),
    title: '个人GitHub',
  },
]);

import { useRouter } from "vue-router";
import { useLoginUserStore } from '@/stores/useLoginUserStore.ts'
const routerTransfer = useRouter();

// 路由跳转事件
const doMenuClick = ({ key }: { key: string }) => {
  routerTransfer.push({
    path: key,
  });
};

const current = ref<string[]>(['/']);
router.afterEach(to => {
  current.value = [to.path];
})



</script>

<style scoped>
.title-bar {
  display: flex;
  align-items: center;
}

.title {
  color: black;
  font-size: 18px;
  margin-left: 16px;
}

.logo {
  height: 48px;
}
</style>

