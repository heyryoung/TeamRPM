import Vue from 'vue'
import Vuex from 'vuex'
import contents from "./contents/contents"
import user from './user/user'

Vue.use(Vuex)

export const store = new Vuex.Store({
    modules: {
        contents,
        user
    },
    strict: true
})