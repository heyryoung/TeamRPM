import Vue from 'vue'
import Vuex from 'vuex'
import cmm from "./cmm/cmm"
import user from './user/login'

Vue.use(Vuex)

export const store = new Vuex.Store({
    modules: {
        cmm,
        user

    },
    strict: true

})