import Vue from 'vue'
import Vuex from 'vuex'
import contents from "./contents/contents"
import user from './user/user'
import carbook from "./carbook/carbook"
import decenter from './magazine/decenter'
import magazine from './magazine/magazine'

Vue.use(Vuex)

export const store = new Vuex.Store({
    modules: {
        user,
        carbook,
        contents,
        magazine,
        decenter

    },
    strict: true
})