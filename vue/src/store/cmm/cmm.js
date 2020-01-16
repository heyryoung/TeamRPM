import axios from 'axios'
const state = {
    context: 'http://localhost:8080/',
    carAllCount : ''
}
const getters = {
    getCarAllCount : state => state.carAllCount,
    getContext : state => state.context
}
const actions = {
    async welcome({commit}){
        axios
            .get(`http://localhost:8080/welcome`)
            .then(({data})=>{commit('ALLCOUNT',data)})
            .catch(()=>{
                alert('AXIOS 실패')
            })
    }
}
const mutations = {
    ALLCOUNT (state, data){
        state.carAllCount = data.allCount
    }

}
export default {
    name: 'cmm',
    namespaced: true,
    state,
    getters,
    actions,
    mutations



}