import axios from 'axios'

const state = {
    user : {},
    isAuth: false,
    token : localStorage.getItem('ac_token')




}
const getters = {
    getMember : state=>state.member,
    getIsAuth : state=>state.isAuth,
    getToken: state=>state.token





}
const actions = {
    async login({dispatch}, {context, userid, passwd}){
        alert(`${context},${userid},${passwd}` )

        let url = `${context}login`
        alert(url.toString())
        let headers ={  'authorization': 'JWT fefege..',
            'Accept' : 'application/json',
            'Content-Type': 'application/json'}
        axios.post(url, {userid,passwd}, headers)
            .then(({data})=>{
                //alert(data.result.toString())
                if(data.result == "success"){
                    alert(data.ac_token)

                    let token = data.ac_token
                    localStorage.setItem("ac_token", token)
                    dispatch("getUserInfo",{context})


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
    async getUserInfo({commit},{context}){
        //token load
        alert('in the info')
        let token = localStorage.getItem("ac_token")
        alert(token)

        let headers ={  'authorization': 'JWT fefege..',
            'Accept' : 'application/json',
            'Content-Type': 'application/json'}
        axios
            .post(`${context}getToken`, {token} ,headers )
            .then(res=> {

                commit('LOGIN_COMMIT', res)


            }).catch(()=>{

        })

    }
}
const mutations = {
    LOGIN_COMMIT(state, data){
        state.isAuth = true
        state.member = data.member


    },
    LOGOUT_COMMIT(state){
        state.isAuth = false
        state.member  = {}
        localStorage.removeItem('ac_token')

    }
}
export default {
    name: 'logins',
    namespaced: true,
    state,
    getters,
    actions,
    mutations
}