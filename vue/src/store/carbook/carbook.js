const state = {
    mycar : {},
    record: [],
    markerList: []

}
const getters = {
    getMycar : state=>state.mycar,
    getRecord: state=>state.record

}
const actions = {}
const mutations = {}
export default {
    name: 'carbook',
    namespaced: true,
    state,
    getters,
    actions,
    mutations
}