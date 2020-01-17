<template>
    <div>
        <div class="mypage_CarList interest">
            <div class="tit_area">
                <h3>손님 리스트</h3>
                <p></p>
            </div>

            <div class="align_field">
                <div class="all_check">
                    <div class="checker" id="uniform-allCheck"><span :class="{checked:allchecked}" @click="allcheck" :key="allchecked"><input type="checkbox" name="allCheck"
                                                                            id="allCheck" class="uniform" title="전체체크"></span>
                    </div>
                </div>
                <div class="align">

                    <span><a href="" class="3dview_flag txt "><em class="vr_ordermark"></em> 3D 라이브 뷰 차량</a></span>

                    <span class="basic"><a href="" class="txt">기본정렬</a></span>
                    <span><a href="" class="txt">가격순</a><a href="" class="down ">낮은순</a>
												<a href="" class="up ">높은순</a>
						</span>
                    <span><a href="" class="txt">주행거리 순</a><a
                            href="" class="down ">낮은순</a>
						<a href=""
                           class="up ">높은순</a>
						</span>
                    <span><a href="" class="txt">연식 순</a><a href="" class="down ">낮은순</a>
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

                    <tbody v-for="(customer,index) of List" :key="customer.customerID">
                    <tr>
                        <td class="check">
                            <div class="checker" id="uniform-interest_list_check1">
                                <span  :class="{checked:customer.checked}" @click="check(index)" @change='updateCheckall()' >
                                    <input type="checkbox" id="interest_list_check1" class="uniform"  >
                                </span>
                            </div>
                        </td>
                        <td class="thumb">
                            <a href="/customerDetail">
                                <img :src="customer.thumb" alt="자동차 썸네일">
                            </a>
                        </td>
                        <td class="car_info">
                            <a href="/customerDetail" class="name">{{customer.comment}}</a>
                            <span class="md_year">연식 :{{customer.minCarYear}}년 ~{{customer.maxCarYear}}년 </span>
                            <span class="price">가격 :{{customer.minPrice}}만원 ~{{customer.maxPrice}} 만원  <br>주행거리 :{{customer.minDistance}}km ~ {{customer.maxDistance}}km  </span>
                        </td>
                        <td class="car_opt">
                            <ul class="opt_list">
                                <li>
                                    <span class="pt">{{customer.acident}}</span>
                                    <span>{{customer.fuel}}</span>
                                </li>
                                <li>
                                    <span>{{customer.color}}</span>
                                    <span>{{customer.carType}}</span>
                                </li>
                                <li>
                                    <span>{{customer.region}}</span>
                                    <span>{{customer.people}}</span>
                                </li>
                            </ul>


                        </td>

                    </tr>


                    </tbody>
                </table>
            </div>

            <div class="btn_cont">
                <a href="" class="delete" >선택삭제</a>
            </div>

            <div class="cm_pagination">
                <ul class="pagination">
                    <li class="move prev"><a href=""><img
                            src="https://resources/images/content/buy/pagination_arrows.png" border="0" alt="이전10개"
                            style="cursor:pointer"></a></li>
                    <li class="num on"><a>1</a></li>
                    <li class="move next"><a href=""><img
                            src="https://resources/images/content/buy/pagination_arrows.png" border="0" alt="다음10개"
                            style="cursor:pointer"></a></li>
                </ul>
            </div>
        </div>
    </div>
</template>
<script>
    import {checkBox} from "../mixins/checkBox";

    export default {
        data(){
            return {
                allchecked:false,
                List:[
                    {customerID:"001",comment:"벤츠 suv 최저가 구합니다",checked: false, minCarYear:"2000",maxCarYear:"2010", minDistance:"10000",maxDistance:"150000", minPrice:"7000",maxPrice:"10000", acident:"무사고",
                        color:"갈색", region:"경기/인천", fuel:"디젤",carType:"SUV", people:"5인승",thumb:"https://story-img.kakaocdn.net/dn/qoQx7/hyBwU4vCEL/RswKkc4XSgAQPTF4piHXQ0/img_xl.jpg?width=1096&height=822&face=481_327_571_426&avg=%23c9c6c7"},

                    {customerID:"002",comment:"벤츠 sub 최저가 구합니다",checked: false, minCarYear:"2000",maxCarYear:"2010", minDistance:"10000",maxDistance:"150000", minPrice:"7000",maxPrice:"10000", acident:"무사고",
                        color:"갈색", region:"경기/인천", fuel:"디젤",carType:"SUV", people:"5인승",thumb:"https://story-img.kakaocdn.net/dn/qoQx7/hyBwU4vCEL/RswKkc4XSgAQPTF4piHXQ0/img_xl.jpg?width=1096&height=822&face=481_327_571_426&avg=%23c9c6c7"}
                ],

            }
        },
        methods: {

            goCompare(){
                alert('한눈에 비교하기')
            }

        },
        mixins:[checkBox]

    }
</script>