import axios from 'axios'
const state = {
    carAllCount : '',
    category1 : [],
    category2 : [],
    category3 : []
}
const getters = {
    getCarAllCount : state => state.carAllCount,
    getCategory1 : state => state.category1,
    getCategory2 : state => state.category2,
    getCategory3 : state => state.category3

}
const actions = {
    async welcome({commit}){
        axios
            .get(`http://localhost:8080/welcome`)
            .then(({data})=>{commit('ALLCOUNT',data)})
            .catch(()=>{
                alert('잘못된 요청입니다.')
            })
    },
    async getCategory1({commit}, param){
        axios
            .get(`http://localhost:8080/getcategory/`+param.param+'/'+param.column)
            .then(({data})=>{
                commit('CATEGORY1', data)})
            .catch(()=>{
                alert('잘못된 요청입니다.')
            })
    },
    async getCategory2({commit}, param){
        axios
            .get(`http://localhost:8080/getcategory/`+param.param+'/'+param.column)
            .then(({data})=>{
                commit('CATEGORY2', data)})
            .catch(()=>{
                alert('잘못된 요청입니다.')
            })
    },
    async getCategory3({commit}, param){
        axios
            .get(`http://localhost:8080/getcategory/`+param.param+'/'+param.column)
            .then(({data})=>{
                commit('CATEGORY3', data)})
            .catch(()=>{
                alert('잘못된 요청입니다.')
            })
    }
}
const mutations = {
    ALLCOUNT (state, data){
        state.carAllCount = data.allCount
    },
    CATEGORY1 (state, data){
        state.category1 = []
        state.category2 = []
        state.category3 = []
        for(let i=0;i<data.category.length;i++){
            state.category1.push({name : data.category[i], count : data.count[i]})
        }
    },
    CATEGORY2 (state, data){
        state.category2 = []
        state.category3 = []
        for(let i=0;i<data.category.length;i++){
            state.category2.push({name : data.category[i], count : data.count[i]})
        }
    },
    CATEGORY3 (state, data){
        state.category3 = []
        for(let i=0;i<data.category.length;i++){
            state.category3.push({name : data.category[i], count : data.count[i]})
        }
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