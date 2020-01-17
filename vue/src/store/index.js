import Vue from 'vue'
import Vuex from 'vuex'
import cmm from "./cmm/cmm"
import login from './user/login'

Vue.use(Vuex)

export const store = new Vuex.Store({
    modules: {
        cmm,
        login,
    },
    strict: true

})