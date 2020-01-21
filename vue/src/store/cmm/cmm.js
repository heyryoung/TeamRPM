import axios from 'axios'

const state = {
    carAllCount : '',
    searchResultEmpty : false,
    category1 : [],
    category2 : [],
    category3 : [],
    categoryList:[],
    showCarList : [],
    makerList: [],
    modelGroupList : [],
    fuelTypeList: [],
    regionList: [],
    checkedItems : [],
    seenHistoryList : [],
    pageLimit : 15,
    pageNum : 1,
    resultLength : 0,
    initFlag : false


};
const getters = {
    makerList : state => state.makerList,
    regionList : state => state.regionList,
    searchResultEmpty : state => state.searchResultEmpty,
    showCarList : state => state.showCarList,
    fuelTypeList: state => state.cmm.fuelTypeList,
    checkedItems : state => state.checkedItems,
    seenHistoryList : state => state.seenHistoryList,
    initFlag : state => state.initFlag
};
const actions = {
    async init({commit}){
        console.log('initFla>>>>g' + state.initFlag);
        if(!state.initFlag) {
            axios
                .get(`http://localhost:8080/init`)
                .then(({data}) => {
                    commit('INIT', data)
                })
                .catch(() => {
                    alert('잘못된 요청입니다!')
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
                .catch(()=>
                    alert("들어옴 실패")
                )
        },
    async  CHECKER({commit}, param){
            commit('CHECKER',param);
        },
        addSeenHistory ({commit}, param) {
            commit('ADDSEENHISTORY',param);
        },
        async checkReset ({commit}) {
            commit('CHECKERRESET');
        },
        async setPageLimit({commit}, limit){
            commit('PAGELIMIT', limit)
        },
        async pageClick({commit}, data){
            axios
                .get(`http://localhost:8080/getshowcarlist/`+data.start+'/'+data.end)
                .then(({data})=>{
                    commit('SHOWCARLIST', data)})
                .catch(()=>{
                    alert('잘못된 요청입니다.')
                })
        },
        async pageNumSetting({commit}, data){
            commit('PAGENUMSETTING', data)
        }

};
const mutations = {
    INIT (state, data){
        state.carAllCount = data.allCount
        state.resultLength = data.allCount
        state.categoryList = []
        state.fuelTypeList = []
        state.makerList = []
        state.regionList = []
        state.showCarList = []
        state.showCarList=[]
        state.initFlag = true
        for(let list of data.carInitList){
            state.showCarList.push(list)
        }

         data.categoryList.forEach(el => {
               state.categoryList.push({checked : false , bigCategory: 'categoryList' ,code : el.categorycd , name: el.categorynm})
           })
          data.makerList.forEach(el => {
               state.makerList.push({checked : false, bigCategory: 'makerList' , code : el.code , name: el.name, count : el.count})
           })
           data.fuelTypeList.forEach(el => {
               state.fuelTypeList.push({checked : false, bigCategory: 'fuelTypeList' , code : el.fuelTyped , name: el.fuleTypedName})
           })
           data.regionList.forEach(el => {
               state.regionList.push({checked : false, bigCategory: 'regionList' , code : el.centerRegionCode , name: el.centerRegion})
           })

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
            state.category2.push({checked : false , bigCategory: 'modelGroupList' , name: data.category[i], count : data.count[i]})
        }
    },
    CATEGORY3 (state, data){
        state.category3 = []
        for(let i=0;i<data.category.length;i++){
            state.category3.push({name : data.category[i], count : data.count[i]})
        }
    },
    SEARCHWITHCONDITION (state, data) {
        state.resultLength = data.resultLength
        state.pageNum = 1
        state.showCarList = []
        for(let list of data.showCarList){
            state.showCarList.push(list)
        }
        if (state.resultLength === 0)
            state.searchResultEmpty = true
        else
            state.searchResultEmpty = false
     },
    CHECKER (state, data) {
        let foundItem ={};
        switch (data.bigCategory) {
            case 'categoryList':
                foundItem = state.categoryList.find( item => item.name === data.name)
                break
            case 'makerList':
                foundItem = state.makerList.find( item => item.name === data.name)
                break
            case 'fuelTypeList':
                foundItem = state.fuelTypeList.find( item => item.name === data.name)
                break
            case 'regionList':
                foundItem = state.regionList.find( item => item.name === data.name)
                break
            case 'modelGroupList':
                foundItem = state.modelGroupList.find( item => item.name === data.name)
                break
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
    },
    PAGELIMIT(state, data){
        state.pageLimit = data
    },
    SHOWCARLIST(state, data){
        state.showCarList=[]
        if(data){
            for(let i = 0; i<data.length;i++){
                state.showCarList.push(data[i])
            }
        }else{
            state.searchResultEmpty = true
        }
    },
    PAGENUMSETTING(state, data){
        state.pageNum = data
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