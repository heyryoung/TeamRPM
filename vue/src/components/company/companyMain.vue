<template>
    <div>
        <div id="asd" :class="fix">
            <div class="center_head" style="background: url(https://www.pantone.com/images/pages/20758/wallpaper/PANTONE-Color-of-the-Year-2019-living-coral-16-1546-v1-5120x2880.jpg) center top no-repeat;">
                <div class="head_cont">
                    <div class="center_tit">
                        <div class="region_name"></div>
                        <h3 class="center_name">RPM {{this.$store.state.user.member.name}}</h3>

                    </div>
                    <ul class="detail_tab">
                        <li v-for="(tab,index) of tabs" :key="tab.title" :class="{on:tab.switch}" @click="tabSwitch(index)"><a :href="tab.link"> {{tab.title}}</a></li>

                    </ul>

                </div>
            </div>
            <div id="sale" class="center_detail_cont">

                <div id="centerGuide" >
                    <div class="center_info">
                            <month_revenue></month_revenue>
                    </div>
                </div>

                <div id="recent_sale" class="mypage_CarList interest">
                    <div class="tit_area">
                        <h3>보유 차량</h3>
                        <p>판매완료시  자동 삭제됩니다.</p>

                    </div>
                    <carList></carList>
                </div>
                <div id="inventory" >
                    <customerList></customerList>

                </div>
            <div  id="centerEmployee" class="centerEmployee">
                <employee></employee>
            </div>
            </div>
        </div>
    </div>
</template>
<script>
import month_revenue from "./month_revenue";
import carList from "./carList";
import customerList from "./customerList";
import employee from "./employee";
    export default {
        components: {
            month_revenue,carList,customerList,employee
        },
        data() {
            return {
                fix:'direct_center_detail ',
                tabs: [
                    {title: "매출", link: "#sale", switch: true,},
                    {title: "보유차량", link: "#recent_sale", switch: false},
                    {title: "손님 리스트", link: "#inventory", switch: false},
                    {title: "직원", link: "#centerEmployee", switch: false},

                ],
            }
        },
        mounted() {



            },

        methods   : {
            handleScroll: function () {
               //console.log(scrollY)

                if(scrollY<536){
                    this.fix='direct_center_detail '
                }else{
                    this.fix='direct_center_detail is_fixed'
                }
                if(0<scrollY && scrollY<1062){
                    this.tabSwitch(0)
                }else if(1062<=scrollY && scrollY<2316){
                    this.tabSwitch(1)
                }else if(2316<=scrollY && scrollY<3430){
                    this.tabSwitch(2)
                }else if(3430<=scrollY){
                    this.tabSwitch(3)
                }

                // your code here
            },
            tabSwitch(i) {
                this.tabs[i].switch = true
                for (let a = 0; a < this.tabs.length; a++) {
                    if (a != i) {
                        this.tabs[a].switch = false
                    }
                }


            },

        },
        computed  : {

        },
        created() {
            window.addEventListener('scroll', this.handleScroll);
        },
        destroyed () {
            window.removeEventListener('scroll', this.handleScroll);
        }
    }

</script>
<style scoped>
    .center_info h4{
        float: left;
        font-size: 18px;
        letter-spacing: -1px;
        font-weight: bold;
        color: #181819;
        margin: 10px;
    }
    #sale,#recent_sale,#centerEmployee,#inventory{
        padding-top: 140px;
    }
    #centerEmployee{
        padding-bottom: 300px;
        height: 580px;

    }
</style>