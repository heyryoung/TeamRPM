import axios from 'axios'
const state = {
    context: 'http://localhost:8080/',
    carSearchResults :[],
    categoryList: [],
    makerList: [],
    fuelTypeList: [],
    regionList: []
}
const getters = {
    getContext : state => state.context,
    getCarSearchResults : state => state.carSearchResults
}
const actions = {

    async init(){

    }



    async setCarList({commit}){
        axios
            .get(`http://localhost:8080/sch`)
            .then(({data})=>{commit('SETCARLIST',data)})
            .catch(()=>{
                alert('AXIOS 실패')
            })
    }

}
const mutations = {
    SETCARLIST (state, data) {
        state.carSearchResults = data.carSearchResults
        alert("들어옴")
        alert(this.carSearchResults[0].categorycd)
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