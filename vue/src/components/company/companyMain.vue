<template>
    <div>
        <div id="asd" :class="fix">
            <div class="center_head" style="background: url(https://www.pantone.com/images/pages/20758/wallpaper/PANTONE-Color-of-the-Year-2019-living-coral-16-1546-v1-5120x2880.jpg) center top no-repeat;">
                <div class="head_cont">
                    <div class="center_tit">
                        <div class="region_name"></div>
                        <h3 class="center_name">RPM 1호점</h3>
                        <div class="car_num01">보유차량 276대</div>
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
                <div id="recent_sale" >
                    <carList></carList>

                </div>
                <div id="inventory" >
                    <customerList></customerList>

                </div>
                <div id="centerEmployee" class="centerEmployee">
                    <div class="employee_head">
                        <h4>직원안내</h4>
                    </div>
                    <!-- 전체사원 -->
                    <div class="employee_list" id="empl_all" style="display: block;">
                        <ul>


                            <li v-for="row of em_row" :key="row">
                                <ul >

                                    <li v-for="col of em_col" :key="col">
												<span class="img">
												<img src="https://img.kcar.com//DATA1/carpicture2/emp/pic/1124.jpg" onerror="this.src='/resources/images/content/direct/bg_employee.png'" alt="이학성">
												</span>
                                        <span class="employee_txt">


															지점장



												</span>
                                        <span class="employee_name">이학성</span>

                                    </li>


                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
import month_revenue from "./month_revenue";
import carList from "./carList";
import customerList from "./customerList";
    export default {
        components: {
            month_revenue,carList,customerList
        },
        data() {
            return {
                fix:'direct_center_detail ',
                em_row:[0,1,2,3,4],
                em_col:[0,1,2,3,4,5],
                recent_sale:[0,1,2,3],
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
                console.log(scrollY)

                if(scrollY<536){
                    this.fix='direct_center_detail '
                }else{
                    this.fix='direct_center_detail is_fixed'
                }
                if(0<scrollY && scrollY<1062){
                    this.tabSwitch(0)
                }else if(1062<=scrollY && scrollY<1893){
                    this.tabSwitch(1)
                }else if(1893<=scrollY && scrollY<2596){
                    this.tabSwitch(2)
                }else if(2596<=scrollY){
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
    }
</style>