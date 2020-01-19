const state = {
    context: 'http://localhost:8080/',
    carSearchResults :[],
    categoryList: [],
    makerList: [],
    fuelTypeList: [],
    regionList: [],
    carAllCount : ''
}
const getters = {
    getContext : state => state.context,
    getCarSearchResults : state => state.carSearchResults

}
const actions = {

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