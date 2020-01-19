import axios from 'axios'

const state = {
    carAllCount : '',
    searchResultEmpty : false,
    category1 : [],
    category2 : [],
    category3 : [],
    carSearchResults:[],
    categoryList:[],
    makerList: [],
    fuelTypeList: [],
    regionList: [],
    checkedItems : [],
    seenHistoryList : []

};
const getters = {
    getCategory1 : state => state.category1,
    getCategory2 : state => state.category2,
    getCategory3 : state => state.category3,
    getCarAllCount : state => state.carAllCount,
    makerList : state => state.makerList,
    regionList : state => state.regionList,
    searchResultEmpty : state => state.searchResultEmpty,
    checkedItems : state => state.checkedItems,
    seenHistoryList : state => state.seenHistoryList,
    initFlag : state => (state.checkedItems.length > 0)
};
const actions = {
    async init({commit}){
        if(!state.initFlag) {
            axios
                .get(`http://localhost:8080/init`)
                .then(({data}) => {
                    commit('INIT', data)
                })
                .catch(() => {
                    alert('잘못된 요청입니다.')
                })
        }
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

    async  searchWithCondition({commit}, param){
            let url = `http://localhost:8080/searchWithCondition`;
            let headers = {
                'authorization': 'JWT fefege..',
                'Accept' : 'application/json',
                'Content-Type': 'application/json'
            };
            axios
                .post(url, param ,headers)
                .then(({data})=>
                {
                    commit('SEARCHWITHCONDITION',data)
                })
                .catch(()=>{
                    alert("들어옴 실패")
                })
        },
    async CHECKER ({commit}, param) {
        commit('CHECKER',param);
    },
    addSeenHistory ({commit}, param) {
        commit('ADDSEENHISTORY',param);
    },
    async checkReset ({commit}) {
        commit('CHECKERRESET');
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
};
const mutations = {
    INIT (state, data){
        state.carAllCount = data.allCount;
        state.carSearchResults = data.carSearchResults;
        state.categoryList = [];
        state.fuelTypeList = [];
        state.makerList = [];
        state.regionList = [];

             data.categoryList.forEach(el => {
                   state.categoryList.push({checked : false , bigCategory: 'categoryList' ,code : el.categorycd , name: el.categorynm})
               });
              data.makerList.forEach(el => {
                   state.makerList.push({checked : false, bigCategory: 'makerList' , code : el.code , name: el.name, count : el.count})
               });
               data.fuelTypeList.forEach(el => {
                   state.fuelTypeList.push({checked : false, bigCategory: 'fuelTypeList' , code : el.fuelTyped , name: el.fuleTypedName})
               });
               data.regionList.forEach(el => {
                   state.regionList.push({checked : false, bigCategory: 'regionList' , code : el.centerRegionCode , name: el.centerRegion})
               })
        state.initFlag = true
        state.carAllCount = data.allCount


    },
    CATEGORY1 (state, data){
        state.category1 = [];
        state.category2 = [];
        state.category3 = [];
        for(let i=0;i<data.category.length;i++){
            state.category1.push({name : data.category[i], count : data.count[i]})
        }
    },
    CATEGORY2 (state, data){
        state.category2 = [];
        state.category3 = [];
        for(let i=0;i<data.category.length;i++){
            state.category2.push({checked : false , bigCategory: 'modelGroupList' , name: data.category[i], count : data.count[i]})
        }
    },
    CATEGORY3 (state, data){
        state.category3 = [];
        for(let i=0;i<data.category.length;i++){
            state.category3.push({name : data.category[i], count : data.count[i]})
        }
    },
    SEARCHWITHCONDITION (state, data) {
        state.carSearchResults = [];
        state.carSearchResults = data.carSearchResults;
        if (state.carSearchResults.length === 0) state.searchResultEmpty = true;
        else state.searchResultEmpty = false;
     },
    CHECKER (state, data) {
        let foundItem ={};
        switch (data.bigCategory) {
            case 'categoryList':
                foundItem = state.categoryList.find( item => item.code === data.code);
                break;
            case 'makerList':
                foundItem = state.makerList.find( item => item.code === data.code);
                break;
            case 'fuelTypeList':
                foundItem = state.fuelTypeList.find( item => item.code === data.code);
                break;
            case 'regionList':
                foundItem = state.regionList.find( item => item.code === data.code);
                break;
        }
        foundItem.checked = !foundItem.checked
        if(foundItem.checked) state.checkedItems.push(foundItem)
        else state.checkedItems.splice(state.checkedItems.indexOf(foundItem),1)
    },
    ADDSEENHISTORY (state, data) {
        state.seenHistoryList.push(data)
    },
    CHECKERRESET (state) {
        state.checkedItems = []
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