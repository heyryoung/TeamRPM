import Vue from 'vue'
import Vuex from 'vuex'
import cmm from "./cmm/cmm"
import contents from "./contents/contents"

Vue.use(Vuex)

export const store = new Vuex.Store({
    modules: {
        cmm,
        contents
    },
    strict: true
})