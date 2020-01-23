import axios from 'axios'
import router from '@/router'

const state = {
    user : {},
    auth: false,




}
const getters = {
    getUSer : state=>state.user,
    getIsAuth : state=>state.auth,





}
const actions = {
    async login({commit}, { userid, passwd}){
        alert(`${userid},${passwd}` )

        let url = `http://localhost:8080/login`
        alert(url.toString())
        let headers ={  'authorization': 'JWT fefege..',
            'Accept' : 'application/json',
            'Content-Type': 'application/json'}
        axios.post(url, {userid,passwd}, headers)
            .then(({data})=>{

                alert(data.result)
                //alert(data.result.toString())
                if(data.result == "success") {
                    commit('LOGIN_COMMIT', data)
                    router.push('/')


                }else{
                    router.push('/login')
                    alert('login fail')


                }
            })
            .catch(()=>{
                alert('axios fail')

            })
    },
    async logout({commit}){
        alert('in the logout')
        commit('LOGOUT_COMMIT')

    },


}
const mutations = {
    LOGIN_COMMIT(state, data){
        state.auth = true
        state.user = data.user


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