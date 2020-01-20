import Vue from 'vue'
import Vuex from 'vuex'
import cmm from "./cmm/cmm"
import contents from "./contents/contents"
import user from './user/user'

Vue.use(Vuex)

export const store = new Vuex.Store({
    modules: {
        cmm,
        contents,
        user
    },
    strict: true
})