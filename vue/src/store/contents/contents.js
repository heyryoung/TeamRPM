import axios from 'axios'
const state = {
    context: 'http://localhost:8080/',
    carSearchResults :[],
    carAllCount : '',
    category1 : [],
    category2 : [],
    category3 : []
}
const getters = {
    getContext : state => state.context,
    getCarSearchResults : state => state.carSearchResults,
    getCarAllCount : state => state.carAllCount,
    getCategory1 : state => state.category1,
    getCategory2 : state => state.category2,
    getCategory3 : state => state.category3
}
const actions = {
    async setCarList({commit}){
        axios
            .get(`http://localhost:8080/sch`)
            .then(({data})=>{commit('SETCARLIST',data)})
            .catch(()=>{
                alert('AXIOS 실패')
            })
    },
    async init({commit}){
        axios
            .get(`http://localhost:8080/init`)
            .then(({data})=>{commit('INIT',data)})
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
    SETCARLIST (state, data) {
        state.carSearchResults = data.carSearchResults
        alert("들어옴")
        alert(this.carSearchResults[0].categorycd)
    },
    INIT (state, data){
        state.carAllCount = data.allCount
        $

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
    name: 'contents',
    namespaced: true,
    state,
    getters,
    actions,
    mutations
}