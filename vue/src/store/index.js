import Vue from 'vue'
import Vuex from 'vuex'
import cmm from "./cmm/cmm"
import user from './user/user'
import recommend from "./recommend/recommend";
Vue.use(Vuex)

export const store = new Vuex.Store({
    modules: {
        cmm,
        user,
        recommend
    },
    strict: true
})