<template>
    <div>

        <div class="mypage_CarList interest">
            <div class="tit_area">
                <h3>보유 차량</h3>
                <p>판매완료시  자동 삭제됩니다.</p>

            </div>

            <div class="align_field">
                <div class="all_check">
                    <div class="checker" id="uniform-allCheck">
                        <span :class="{checked:allchecked}" @click="allcheck" :key="allchecked"><input type="checkbox" name="allCheck" id="allCheck" class="uniform" title="전체체크"></span>
                    </div>
                </div>
                <div class="align">
                    <!-- 20181217 VR차량 -->
                    <span><a href="" class="3dview_flag txt "><em class="vr_ordermark"></em> 3D 라이브 뷰 차량</a></span>
                    <!-- //20181217 VR차량 -->
                    <span class="basic"><a href=""
                                           class="txt">기본정렬</a></span>
                    <span><a href="" class="txt">가격순</a><a href="" class="down ">낮은순</a>
												<a href="" class="up ">높은순</a>
						</span>
                    <span><a href="" class="txt">주행거리 순</a><a
                            href="" class="down ">낮은순</a>
						<a href=""
                           class="up ">높은순</a>
						</span>
                    <span><a href="" class="txt">연식 순</a><a
                            href="" class="down ">낮은순</a>
						<a href="" class="up ">높은순</a>
						</span>
                </div>
            </div>
            <div class="result_list">
                <table>
                    <caption>관심차량</caption>

                    <colgroup>
                        <col style="width: 55px;">
                        <col style="width: 190px;">
                        <col style="width: 485px;">
                        <col style="width: 290px;">
                        <col>
                    </colgroup>

                    <tbody v-for="(car,index) of List" :key="car.carID">
                    <tr>
                        <td class="check">
                            <div class="checker" id="uniform-interest_list_check1">
                                <span  :class="{checked:car.checked}" @click="check(index)" @change='updateCheckall()' >
                                    <input type="checkbox" id="interest_list_check1" class="uniform"  >
                                </span>
                            </div>
                        </td>
                        <td class="thumb">
                            <a href="/product">
                                <img :src="car.thumb" alt="자동차 썸네일">
                            </a>
                        </td>
                        <td class="car_info">
                            <a href="/product" class="name">{{car.title}}<br> {{car.subTitle}} </a>
                            <span class="md_year">{{car.caryear}} &nbsp; {{car.distance}}</span>
                            <span class="price">{{car.price}} </span>
                        </td>
                        <td class="car_opt">
                            <ul class="opt_list">
                                <li>
                                    <span class="pt">{{car.acident}}</span>
                                    <span>{{car.fuel}}</span>
                                </li>
                                <li>
                                    <span>{{car.color}}</span>
                                    <span>{{car.carType}}</span>
                                </li>
                                <li>
                                    <span>{{car.region}}</span>
                                    <span>{{car.people}}</span>
                                </li>
                            </ul>


                        </td>

                    </tr>


                    </tbody>
                </table>
            </div>

            <div class="btn_cont">
                <a href="" class="delete" >선택삭제</a>

                <div class="center_btn">


                </div>
            </div>


            <div class="cm_pagination">
                <ul class="pagination">
                    <li class="move prev"><a href=""><img
                            src="/resources/images/content/buy/pagination_arrows.png" border="0" alt="이전10개"
                            style="cursor:pointer"></a></li>
                    <li class="num on"><a>1</a></li>
                    <li class="move next"><a href=""><img
                            src="/resources/images/content/buy/pagination_arrows.png" border="0" alt="다음10개"
                            style="cursor:pointer"></a></li>
                </ul>
            </div>
        </div>
    </div>
</template>
<script>

    import {checkBox} from "../mixins/checkBox";
    import axios from'axios'
    export default {
        data(){
            return {
                context:'http://localhost:8080/',
                allchecked:false,
                List:[
                    {carID:"001",title:"벤츠 GLE-클래스 W166",subTitle:"GLE350 d 4MATIC 프리미엄",checked: false, caryear:"18년 11월식(18년형)", distance:"7,368km", price:"7,990만원", acident:"무사고",
                        color:"갈색", region:"경기/인천", fuel:"디젤",carType:"SUV", people:"5인승",thumb:"https://img.kcar.com/carpicture/carpicture06/pic6026/kcar_60263050_001.jpg"},

                    {carID:"002",title:"벤츠 GLE-클래스 W166",subTitle:"GLE350 d 4MATIC 프리미엄",checked: false, caryear:"18년 11월식(18년형)", distance:"7,368km", price:"7,990만원", acident:"무사고",
                        color:"갈색", region:"경기/인천", fuel:"디젤",carType:"SUV", people:"5인승",thumb:"https://img.kcar.com/carpicture/carpicture06/pic6026/kcar_60263050_001.jpg"}
                ],
                checkedList:[

                ]

            }
        },
        methods: {

        },
        mixins:[checkBox],
        created(){
                axios
                .get(`${this.context}/company/carList`)
                    .then(res=>{
                        alert(res.data.result)
                    })
        .catch(e=>{
            alert(`axios fail${e}`)
        })
        }
    }


</script>
<style>
    .center_btn button{
        display: inline-block;
        width: 217px;
        height: 45px;
        line-height: 43px;
        margin-left: 2px;
        border: 1px solid #000;
        text-align: center;
        font-size: 13px;
    }
</style>