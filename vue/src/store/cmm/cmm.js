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
    async init({commit}){
        axios
            .get(`http://localhost:8080/init`)
            .then(({data})=>{commit('INIT',data)})
            .catch(()=>{
                alert('AXIOS 실패')
            })
    },
    async goSearchMainWithCondition({commit}, param){
        axios
            .get(`http://localhost:8080/getcategory/`+param.key1+'/'+param.key2+'/'+param.key3)
            .then(({data})=>{
                commit('CATEGORY3', data)})
            .catch(()=>{
                alert('잘못된 요청입니다.')
            })
    }
}
const mutations = {
    INIT (state, data){
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