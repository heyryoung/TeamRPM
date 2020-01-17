<template>
    <div>
        <div class="center_detail_cont">
            <div class="centerGuide">
                <form name="carSearchForm" action="/car/search/directcenter_search_list.do?i_sCenterCode=014" method="post">
                    <div class="centercar_sch mc_store">
                        <label for="centerSelect02">직영점차량 검색</label>
                        <div class="btn_wrap makeTypeBtn">
                            <a href="javascript:;" data-item="MAKE_TYPE010" class="btn_white on">국산차</a>
                            <a href="javascript:;" data-item="MAKE_TYPE020" class="btn_white">수입차</a>
                        </div>
                        <input type="hidden" name="i_sMakeType" id="makeType" value="MAKE_TYPE010">
                        <div class="selectric-wrapper selectric-selectric">
                            <div class="selectric-hide-select"><select class="selectric" id="makeList" name="i_sMakeCd" data-beusable-tracking="" tabindex="-1">
                                <option value="">제조사를 선택하세요</option>
                                <option value="001" data-cnt="57">현대</option>
                                <option value="007" data-cnt="6">제네시스</option>
                                <option value="002" data-cnt="76">기아</option>
                                <option value="003" data-cnt="48">쉐보레(GM대우)</option>
                                <option value="005" data-cnt="36">르노삼성</option>
                                <option value="004" data-cnt="14">쌍용</option>
                                <option value="088" data-cnt="0">대우버스</option>
                                <option value="006" data-cnt="0">기타 제조사</option>
                            </select></div>

                        </div>
                        <div class="selectric-wrapper selectric-selectric">
                            <div class="selectric-hide-select"><select class="selectric" id="modelList" name="i_sModelGrpCd" data-beusable-tracking="" tabindex="-1">
                                <option value="">모델를 선택하세요</option>
                            </select></div>

                          </div>
                        <div class="selectric-wrapper selectric-selectric">
                            <div class="selectric-hide-select"><select class="selectric" id="detailModelList" name="i_sModelCd" data-beusable-tracking="" tabindex="-1">
                                <option value="">세부모델를 선택하세요</option>
                            </select></div>

                           </div>
                        <button type="submit" class="btn_move searchCarCnt searchDirectcenter">검색 (237대)</button>
                    </div>
                </form>
            </div>
        </div>
        <div class="mypage_CarList interest">

            <div class="align_field">
                <div class="all_check">
                    <div class="checker" id="uniform-allCheck">
                        <span :class="{checked:allchecked}" @click="allcheck" :key="allchecked"><input type="checkbox" name="allCheck" id="allCheck" class="uniform" title="전체체크"></span>
                    </div>
                </div>
                <div class="align">
            
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
                                <span :class="{checked:car.checked}" @click="check(index)" @change='updateCheckall()'>
                                    <input type="checkbox" id="interest_list_check1" class="uniform">
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
                <a href="" class="delete">선택삭제</a>

                <div class="center_btn">
                    <button href="" @click="popRendor">추천 목록추가 하기</button>
                    <modals-container/>
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
    import sendCarPop from "./sendCarPop"
    import {checkBox} from "../mixins/checkBox";

    export default {
        data() {
            return {
                allchecked : false,
                List       : [
                    {
                        carID: "001", title: "벤츠 GLE-클래스 W166", subTitle: "GLE350 d 4MATIC 프리미엄", checked: false, caryear: "18년 11월식(18년형)", distance: "7,368km", price: "7,990만원", acident: "무사고",
                        color: "갈색", region: "경기/인천", fuel: "디젤", carType: "SUV", people: "5인승", thumb: "https://img.kcar.com/carpicture/carpicture06/pic6026/kcar_60263050_001.jpg"
                    },

                    {
                        carID: "002", title: "벤츠 GLE-클래스 W166", subTitle: "GLE350 d 4MATIC 프리미엄", checked: false, caryear: "18년 11월식(18년형)", distance: "7,368km", price: "7,990만원", acident: "무사고",
                        color: "갈색", region: "경기/인천", fuel: "디젤", carType: "SUV", people: "5인승", thumb: "https://img.kcar.com/carpicture/carpicture06/pic6026/kcar_60263050_001.jpg"
                    }
                ],
                checkedList: []

            }
        },
        methods: {

            popRendor() {

                for (let i = 0; i < this.List.length; i++) {
                    if (this.List[i].checked == true) {
                        this.checkedList.push(this.List[i])
                    }
                }
                this.$modal.show(sendCarPop, {
                    checkedList: this.checkedList,
                    modal      : this.$modal
                }, {
                    name     : 'dynamic-modal',
                    width    : '800px',
                    height   : '800px',
                    draggable: true,
                }, {closed: this.checkedList = []})
            },


        },
        mixins : [checkBox]
    }

</script>
<style>
    .center_btn button {
        display: inline-block;
        width: 217px;
        height: 45px;
        line-height: 43px;
        margin-left: 2px;
        border: 1px solid #000;
        text-align: center;
        font-size: 13px;
    }


    .btn_move{
        width: 140px !important;
    }
    .centerGuide{
        padding: 0!important;
    }
</style>