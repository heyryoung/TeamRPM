import Vue from 'vue'
import Vuex from 'vuex'
import contents from "./contents/contents"
import user from './user/user'
import recommend from "./recommend/recommend"
import cmm from "./cmm/cmm"

import snsPage from './social/snsPage'
import snsDetail from './social/snsDetail'
import snsModify from './social/snsModify'
import magazine from './magazine/magazine'


Vue.use(Vuex)

export const store = new Vuex.Store({
    modules: {
        cmm,
        recommend,
        user,
        snsPage,
        snsDetail,
        snsModify,
        contents,
        magazine


    },
    strict: true
})