import axios from 'axios'

const state = {
    member : {},
    isAuth: false,

}
const getters = {
    getMember : state=>state.member,
    getIsAuth : state=>state.isAuth

}
const actions = {
    login({commit}, {context, userid, passwd}){
        alert(`${context},${userid},${passwd}` )
        let url = `${context}login`
        let headers ={  'authorization': 'JWT fefege..',
            'Accept' : 'application/json',
            'Content-Type': 'application/json'}
        axios.post(url, {userid,passwd}, headers)
            .then(({data})=>{
                alert(data.isAuth.toString())
                commit('commitLogin' ,data)
            })
            .catch(()=>{
                alert('axios fail')

            })
    },
    logout({commit}){
        commit('commitLogout')

    }
}
const mutations = {
    commitLogin(state, data){
        state.isAuth = true
        state.member = data.member


    },
    commitLogout(state){
        state.isAuth = false
        state.member  = null

    }
}
export default {
    name: 'login',
    namespaced: true,
    state,
    getters,
    actions,
    mutations
}