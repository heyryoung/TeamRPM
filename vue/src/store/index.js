import Vue from 'vue'
import Vuex from 'vuex'
import cmm from "./cmm/cmm"

Vue.use(Vuex)

export const store = new Vuex.Store({
    modules: {
        cmm
    },
    strict: true

})