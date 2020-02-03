import Vue from 'vue'
import Router from 'vue-router'
import SearchMain from '@/components/contents/SearchMain.vue'
import Home from '@/components/cmm/Home.vue'
import Join from '@/components/user/Join.vue'
import Login from '@/components/user/Login.vue'
import Product from '@/components/contents/Product.vue'
import Sale from '@/components/contents/Sale.vue'
import Magazine from '@/components/magazine/Magazine.vue'
import ChartMaker from '@/components/magazine/datacenter.vue'
import Mypage from '@/components/carbook/MyPage.vue'
import MypageModify from '@/components/carbook/MypageModify.vue'
import MypageModifyCheck from '@/components/carbook/MypageModifyCheck.vue'
import SeenCar from '@/components/contents/SeenCar.vue'
import StationInfo from '@/components/carbook/StationInfo.vue'
import MapList from '@/components/carbook/MapList.vue'
import MapList2 from '@/components/carbook/MapList2.vue'
import Condition from "@/components/recommend/condition.vue"
import RecommendContent from "@/components/recommend/recommendContent.vue"
import CarList from "@/components/company/carList.vue"
import chart from "@/components/company/chartExample.vue"
import companyHome from "@/components/company/companyHome.vue"
import customerDetail from "@/components/company/customerDetail.vue"
import companyMain from "@/components/company/companyMain.vue"
import CustomerList from "@/components/company/customerList.vue"
import recommendHome from "@/components/recommend/recommendHome.vue"
import SnsPage from "@/components/social/SnsPage.vue"
import SnsDetail from "@/components/social/SnsDetail.vue"
import SnsModify from "@/components/social/SnsModify.vue"
import SnsWrite from "@/components/social/SnsWrite.vue"
import MycarModify from '@/components/carbook/MycarModify.vue'
import Payment from '@/components/contents/Payment.vue'


Vue.use(Router)

export default new Router({
    mode: 'history',
    base:process.env.BASE_URL,
    routes : [
        {path: '/searchmain', name: 'searchmain', component: SearchMain},
        {path:'/', name:'home', component : Home},
        {path:'/join', name:'join', component : Join},
        {path:'/login', name:'login', component : Login},
        {path:'/product', name:'product', component : Product},
        {path:'/mypage', name:'mypage', component : Mypage},
        {path:'/mypageModify', name:'mypageModify', component : MypageModify},
        {path:'/mycarModify', name:'mycarModify', component : MycarModify},
        {path:'/mypageModifyCheck', name:'mypageModifyCheck', component : MypageModifyCheck},
        {path:'/seencar', name:'seencar', component : SeenCar},
        {path:'/magazine', name:'magazine', component : Magazine},
        {path:'/chartMaker', name:'chartMaker', component : ChartMaker},
        {path:'/stationInfo', name:'stationInfo', component : StationInfo},
        {path:'/mapList', name:'mapList', component : MapList},
        {path:'/mapList2', name:'mapList2', component : MapList2},
        {path:'/sale', name:'sale', component : Sale},
        {path:'/sns', name:'snspage', component : SnsPage},
        {path:'/snsdetail/:id', name:'snsdetail', component : SnsDetail},
        {path:'/snsmodify', name:'snsmodify', component : SnsModify},
        {path:'/snswrite', name:'snswrite', component : SnsWrite},
        {path:'/payment', name:'payment', component : Payment},
        // 강성조꺼
        {path: '/customerDetail',name: 'customerDetail', component:customerDetail},
        {path: '/companyHome',name: 'companyHome', component:companyHome,children:
                [
                    {path: '',name: 'companyMain', component:companyMain },
                    {path: 'customerList',name: 'CustomerList', component: CustomerList},
                    {path: 'carList',name: 'CarList', component: CarList},
                    {path: 'chart',name: 'chart', component:chart},
                ]},
        {path: '/recommendHome',name: 'recommendHome', component:recommendHome, children:[
                {path: '',name: 'RecommendContent', component: RecommendContent},
                {path: 'condition',name: 'Condition', component: Condition},

            ]}

    ]
})