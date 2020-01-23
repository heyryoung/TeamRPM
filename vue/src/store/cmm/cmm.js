import axios from 'axios'

const state = {
    context : 'http://localhost:8081',
    carAllCount : '',
    searchResultEmpty : false,
    category1 : [],
    category2 : [],
    category3 : [],
    categoryList:[],
    showCarList : [],
    makerList: [],
    originMakerList: [],
    modelGroupList : [],
    fuelTypeList: [],
    regionList: [],
    checkedItems : [],
    seenHistoryList : [],
    pageLimit : 15,
    pageNum : 1,
    resultLength : 0,
    modelList : [],
    initFlag : false,
    modelListIsOpen : false,
    orderBySub : 'default'

};
const getters = {
    makerList : state => state.makerList,
    modelList : state => state.modelList,
    regionList : state => state.regionList,
    searchResultEmpty : state => state.searchResultEmpty,
    showCarList : state => state.showCarList,
    fuelTypeList: state => state.cmm.fuelTypeList,
    checkedItems : state => state.checkedItems,
    seenHistoryList : state => state.seenHistoryList,
    initFlag : state => state.initFlag,
    modelListIsOpen : state => state.modelListIsOpen,
    resultLength : state => state.resultLength
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
                    alert('잘못된 요청입니다!')
                })
        }
    },
    async reset ({commit}) {
        commit('RESETTING')
    },
    async getTreeChild({commit}, param){
        commit('GETTREECHILD', param)
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

    async searchWithCondition({commit}, param){

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
                    console.log("들어옴 실패")
                )
        },

    async CHECKER ({ commit }, param ) {
        commit('CHECKER',param);
    },
    async addSeenHistory ({ commit }, param ) {
        commit('ADDSEENHISTORY', param );
    },
    async setPageLimit({ commit }, limit){
        commit('PAGELIMIT', limit)
    },
    async pageClick({ commit }, data){
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
    },
    async pageLimitSetting({commit}, data){
        commit('PAGELIMITSETTING', data)
    },
    async orderBySubSetting({commit}, data){
        commit('ORDERBYSUBSETTING', data)
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
        state.originMakerList = state.makerList
        state.originRegionList = state.regionList
        state.initFlag = true
        for(let list of data.carInitList){
            state.showCarList.push(list)
        }
    },
    RESETTING ( state ) {
            state.carAllCount = '',
            state.searchResultEmpty = false,
            state.categoryList = [],
            state.showCarList = [],
            state.makerList = [],
            state.originMakerList = [],
            state.modelGroupList = [],
            state.fuelTypeList = [],
            state.regionList = [],
            state.checkedItems = [],
            state.pageLimit = 15,
            state.pageNum = 1,
            state.resultLength = 0,
            state.modelList = [],
            state.modelListIsOpen = false
    },
    GETTREECHILD (state, param) {
        state.modelListIsOpen = !state.modelListIsOpen
        if (state.modelListIsOpen)  {
            param.checked = true
            state.makerList = []
            state.makerList.push(param)
        }
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
        if(data.showCarList)
            for(let list of data.showCarList){state.showCarList.push(list)}
        state.searchResultEmpty = (state.resultLength === 0)

        state.makerList = []
        if (!state.modelListIsOpen) {
            data.makerList.forEach(item => {
                state.makerList.push({
                    checked: false,
                    bigCategory: 'makerList',
                    code: item.code,
                    name: item.name,
                    count: item.count
                })
            })
        }else {
            state.makerList.push({
                    checked: true,
                    bigCategory: 'makerList',
                    code: data.makerList[0].code,
                    name: data.makerList[0].name,
                    count: data.makerList[0].count
                })
        }

        if (state.modelListIsOpen) {
            state.modelList = []
                data.modelList.forEach(el => {
                    state.modelList.push({
                        checked: !!(state.checkedItems.find(checkedItem => el.name === checkedItem.name)),
                        bigCategory: 'modelList',
                        code: el.code,
                        name: el.name,
                        count: el.count
                    })
            })
        }
     },


    CHECKER (state, data) {
        let foundItem ='';

        switch (data.bigCategory) {
            case 'categoryList':
                foundItem = state.categoryList.find( item => item.code === data.code)
                break
            case 'makerList':
                foundItem = state.makerList.find( item => item.code === data.code)
                break
            case 'fuelTypeList':
                foundItem = state.fuelTypeList.find( item => item.code === data.code)
                break
            case 'regionList':
                foundItem = state.regionList.find( item => item.code === data.code)
                break
            case 'modelList':
                foundItem = state.modelList.find( item => item.code === data.code)
                break
            }

        foundItem.checked = !foundItem.checked

        if( !foundItem.checked && foundItem.bigCategory === 'makerList' ){
            let processingList = state.checkedItems
            state.checkedItems = []
            state.modelList = []
            processingList.forEach( item => {
                console.log(item.bigCategory + "   " + item.name)
                if ( item.bigCategory != 'moldelList')  state.checkedItems.push(item)
            })
        }else {
            if(foundItem.checked) state.checkedItems.push(foundItem)
                else state.checkedItems.splice(state.checkedItems.indexOf(foundItem),1)
        }


    },
    ADDSEENHISTORY ( state, param) {
        if ( state.seenHistoryList.length === 0 ) {
            state.seenHistoryList.push( makeSeenCar(param) )
        }
        else {
            let existFlag = state.seenHistoryList.find(item => item.carcd === param.carcd)
            switch (existFlag != undefined ) {
                case true : existFlag.count++
                    break
                case false :
                    state.seenHistoryList.push(makeSeenCar(param))
                    break
            }
        }
        function makeSeenCar (param) {
            const date = new Date();
            param.count = 1;
            param.seenTime = date
            console.log('makeSeenCar>>> ' + date)
            return param
        }
    },
    PAGELIMIT(state, data){
        state.pageLimit = data
    },
    SHOWCARLIST(state, data){
        state.showCarList=[]
        for(let list of data){state.showCarList.push(list)}
    },
    PAGENUMSETTING(state, data){
        state.pageNum = data
    },
    PAGELIMITSETTING(state, data){
        state.pageLimit = data
    },
    ORDERBYSUBSETTING(state, data){
        state.orderBySub = data
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