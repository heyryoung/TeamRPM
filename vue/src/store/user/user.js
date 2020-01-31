import axios from 'axios'
import router from '@/router'
//import {store} from "../../store";

const state = {
    user : {},
    auth: false,
    fail : 'fail'
}
const getters = {

    getMember : state=>state.user,
    getIsAuth : state=>state.auth,
    getFail : state=>state.fail


}
const actions = {
    async login({commit}, { userid, passwd}){
        let url = `http://localhost:8080/login`
        alert(url.toString())
        let headers ={  'authorization': 'JWT fefege..',
            'Accept' : 'application/json',
            'Content-Type': 'application/json'}
        axios.post(url, {userid,passwd}, headers)
            .then(({data})=>{

                //alert(data.result.toString())
                if(data.result == "success") {
                    commit('LOGIN_COMMIT', data)
                    alert(data.token)
                    localStorage.setItem("token", data.token)



                   // store.dispatch('getMycar', {user: data.user})
                    //store.dispatch('getRecord', {mycar: store.state.carbook.mycar})

                    router.push('/')


                }else{
                    alert('login fail')
                    commit('LOGIN_FAIL')




                }
            })
            .catch(()=>{
                alert('axios fail')

            })
    },
    async logout({commit}){
        alert('in the logout')
        commit('LOGOUT_COMMIT')
        localStorage.removeItem("token")

    },
    async getUserInfo({commit}){
        alert('getuser')
        let token = localStorage.getItem("token")
        let headers = {  'authorization': 'JWT fefege..',
            'Accept' : 'application/json',
            'Content-Type': 'application/json'}
        axios.post('http://localhost:8080/getUserInfo/'+token , headers)
            .then(({data})=>{
                if(data.result === "success"){


                    commit('LOGIN_COMMIT', data)
                }else{
                    commit('LOGOUT_COMMIT')

                }
            })


    }



}
const mutations = {
    LOGIN_COMMIT(state, data){
        state.auth = true
        state.user = data.user
        state.fail = false


    },
    LOGIN_FAIL(state){
        state.fail = 'fail'

    },
    COMMIT_FAIL(state){
        alert('commit')
        state.fail = 'success'
    },
    LOGOUT_COMMIT(state){
        state.auth = false
        state.user  = {}

    }
}
export default {
    name: 'user',
    namespaced: true,
    state,
    getters,
    actions,
    mutations
}