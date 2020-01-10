import Vue from 'vue'
import App from './RPM.vue'
import router from '@/router'
import axios from 'axios'
import {store} from '@/store'
import vuex from 'vuex'

Vue.config.productionTip = false

new Vue({
  render: h => h(App),
  router,
  axios,
  store,
  vuex
}).$mount('#app')
