import axios from 'axios'
import router from '@/router'
//import {store} from "../../store";

const state = {
    user : {},
    auth: false,
    fail: false




}
const getters = {

    getMember : state=>state.user,
    getIsAuth : state=>state.auth,
    getFail : state=> state.fail



}
const actions = {
    async login({commit}, { userid, passwd}){
        let url = `http://localhost:8080/login`
        let headers ={  'authorization': 'JWT fefege..',
            'Accept' : 'application/json',
            'Content-Type': 'application/json'}
        axios.post(url, {userid,passwd}, headers)
            .then(({data})=>{

                //alert(data.result.toString())
                if(data.result == "success") {
                    commit('LOGIN_COMMIT', data)
                    localStorage.setItem("token", data.token)
                    if(data.mycar){
                        localStorage.setItem("mycar", JSON.stringify(data.mycar))
                        if(data.record){
                            console.log(`record = ${data.record}`)
                            localStorage.setItem("record", JSON.stringify(data.record))

                        }

                    }




                   // store.dispatch('getMycar', {user: data.user})
                    //store.dispatch('getRecord', {mycar: store.state.carbook.mycar})

                    router.push('/')


                }else{
                    commit('fail_commit')






                }
            })
            .catch(()=>{
                alert('axios fail')

            })
    },
    async logout({commit}){
        commit('LOGOUT_COMMIT')
        localStorage.removeItem("token")
        localStorage.removeItem("mycar")
        localStorage.removeItem("record")


    },
    async getUserInfo({commit}){
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


    },

    LOGOUT_COMMIT(state){
        console.log('로그아웃')
        state.auth = false
        state.user  = {}

    },
    fail_commit(state){
        console.log('commit fail')
        state.fail = true

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