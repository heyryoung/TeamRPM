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