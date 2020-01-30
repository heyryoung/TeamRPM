

const state = {
    customerDetail:''
}
const getters = {

}

const actions={
    inputDetail({commit},customer){
        commit('CUSTOMERDETAILINIT',customer)
    }
}
const mutations = {
    CUSTOMERDETAILINIT(state, customer){
        state.customerDetail=customer
    }
}
export default {
    name: 'recommend',
    namespaced: true,
    state,
    getters,
    actions,
    mutations
}