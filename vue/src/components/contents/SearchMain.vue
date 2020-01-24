<template>
    <div id="wrap">
        <link rel="shortcut icon" href="https://www.kcar.com/resources/images/common/favicon.ico" type="image/x-icon">
        <link rel="icon" href="https://www.kcar.com/resources/images/common/favicon.ico" type="image/x-icon">
        <link rel="apple-touch-icon-precomposed"
              href="https://www.kcar.com/resources/images/mobile/common/apple-touch-icon.png">
        <link rel="stylesheet" type="text/css"  href="css/re_import.css">
        <link rel="stylesheet" type="text/css"   href="css/re_trade.css">
        <link rel="stylesheet" type="text/css"   href="css/plugin/selectric.css">
        <div id="headerNew" class="header_new">
        </div>
        <div id="content">
            <div id="sub_content">
                <div class="carSearch_cont">
                    <div class="detail_box">
                        <div class="box_top">
                            <h3>차량 검색</h3>
                            <a href="#" id="resetBtn" class="reset" @click="reset()">초기화</a>
                        </div>
                        <div class="quick_search">
                            <div class="ip_field">
                                <input type="text" name="quickSearch" id="searchWord" v-model="searchWord" placeholder="모델명 입력 예시) 아반떼 MD"
                                       autocomplete="off" v-on:keyup.enter="searchWithCondition()" >
                                <label for="quickSearch">검색아이콘</label>
                                <ul class="drop_box"></ul>
                            </div>
                        </div>
                        <div class="sel_field">
                            <hr/>
                        </div>
                        <ul class="search_list_wrap">
                            <li class="list_h list_h01 " id="list_h list_h01 ">
                                <a class="type"  @click="bigCategoryIsOpen(`list_h list_h01 `)" >차종 <small></small></a>
                                <div class="sub_type_list sub_type_tree" >
                                    <ul class="row_list">
                                        <li v-for="category of categoryList"
                                            :key="category.code">
                                            <div class="checker" :id="category.code"><span :class="{checked:category.checked}" @click="check(category)">
                                                <input type="checkbox"
                                                                                                      name="categoryList"
                                                                                                      :id="category.code"
                                                                                                      class="uniform"
                                                                                                      :v-bind="category.name"
                                            ></span>
                                            </div>
                                            <label :for="category.code">{{category.name}}</label>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                            <li class="list_h list_h02 on"  id="list_h list_h02 on">
                                <a class="type" @click="bigCategoryIsOpen(`list_h list_h02 on`)">제조사/모델<small></small></a>
                                <div class="sub_type_list sub_type_tree" >
                                    <div class="scroll-wrapper scrollbar-dynamic" style="position: relative;" >
                                        <div id="makerFrame"
                                             class="scrollbar-dynamic scroll-content scroll-sscrolly_visible"
                                             style="height: auto; margin-bottom: 0px; margin-right: 0px; max-height: 229px;">
                                            <ul class="tree" style="display: block;" >
                                                <li id="false"
                                                    v-for="maker of makerList" :key="maker.code" >
                                                    <div class="row false">
                                                    <span class="txt"><div class="checker" id="uniform-v_makecd">
                                                    <span :class="{checked:maker.checked}" @click="checkMakeTree(maker)" >
                                                        <input type="checkbox" id="v_makecd0" name="v_makecd" class="uniform maker">
                                                    </span></div>
                                                    <label for="v_makecd0">{{maker.name}}</label></span><span class="count">
                                                    </span><span class="count">{{maker.count}}</span>
                                                    </div>
                                                <ul class="tree" style="display: block;" v-show="modelListIsOpen" >
                                                            <li v-for="model of modelList" :key="model.code">
                   <div class="row false">
                       <span class="txt">
                       <div class="checker" id="uniform-v_model_grp_cd0">
                           <span :class="{checked:model.checked}" @click="check(model)" >
                               <input type="checkbox" id="v_model_grp_cd0" name="v_model_grp_cd" class="uniform maker" value="001" data-v_model_grp_cd="001" data-count="59" data-v_makecd="001" data-v_model_grp_nm="i30" data-v_makenm="현대" data-v_car_type="KOR" data-beusable-tracking="">
                           </span>
                       </div>
                       <label for="v_model_grp_cd0">{{model.name}}</label>
                       </span>
                       <span class="count">{{model.count}}</span>
                   </div>
                                                </li>
                                            </ul>

                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li class="list_h list_h05 on" id="list_h list_h05 on">
                                <a class="type"   @click="bigCategoryIsOpen('list_h list_h05 on')">가격<small></small></a>
                                <div class="sub_type_list" data-init="true" >
                                    <div class="selectric-wrapper selectric-selectric selectric-below selectric-hover"
                                         id="selectMinPrice"   @click="selectBoxChanger(`selectMinPrice`)" >
                                        <div class="selectric-hide-select" >
                                            <select name="wr_gt_v_mfr_date"
                                                    v-for="minPrice of minPriceList" :key="minPrice.code"
                                                    id="modelYear01" class="selectric" ata-unit="년">
                                            <option value="startYear.code"> {{minPrice.name}}</option>
                                        </select></div>
                                        <div class="selectric"><span class="label" >{{selectedMinPrice.name}}</span></div>
                                        <div class="selectric-items" tabindex="-1"  id = "minPrice" style="width: 120px; height: 300px;">
                                            <div class="selectric-scroll">
                                                <ul v-for="minPrice of minPriceList" :key="minPrice.code">
                                                    <li @click="setStartOrmaxPrice(minPrice)" >{{minPrice.name}}
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                        <input class="selectric-input" tabindex="0"></div>
                                    <span class="wave">~</span>
                                    <div class="selectric-wrapper selectric-selectric selectric-hover" id="selectMaxPrice"   @click="selectBoxChanger(`selectMaxPrice`)"  >
                                        <div class="selectric-hide-select"><select name="wr_lt_v_mfr_date"
                                                                                   id="modelYear02" class="selectric"
                                                                                   data-unit="년"
                                                                                   tabindex="-1"
                                                                                   v-for="maxPrice of maxPriceList" :key="maxPrice.code">
                                            <option value="endYear.code"> {{maxPrice.name}}</option>
                                        </select></div>
                                        <div class="selectric"><span class="label" data-beusable-tracking="">{{selectedMaxPrice.name}}</span></div>
                                        <div class="selectric-items" tabindex="-1" id = "maxPrice"  style="width: 120px; height: 300px;">
                                            <div class="selectric-scroll">
                                                <ul  v-for="maxPrice of maxPriceList" :key="maxPrice.code">
                                                    <li @click="setStartOrmaxPrice(maxPrice)">{{maxPrice.name}}
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                        <input class="selectric-input" tabindex="0"></div>
                                </div>
                            </li>
                           <li class="list_h list_h04 on" id="list_h list_h04 on">
                                <a class="type"   @click="bigCategoryIsOpen(`list_h list_h04 on`)">주행거리<small></small></a>
                                <div class="sub_type_list"  data-init="true"  >
                                    <div class="selectric-wrapper selectric-selectric selectric-below selectric-hover"
                                        id="selectMinMileage"   @click="selectBoxChanger(`selectMinMileage`)">
                                        <div class="selectric-hide-select"><select name="wr_gt_n_Milage"
                                                                                   id="distance01" class="selectric"
                                                                                   data-unit="km" data-bro="Milage"
                                                                                   v-for="minMilage of minMilages"
                                                                                   :key="minMilage.code"
                                                                                   tabindex="-1"
                                                                                   >
                                            <option :value="minMilage.code"> {{minMilage.name}} </option>
                                        </select></div>
                                        <div class="selectric"><span class="label">{{selectedMinMilage.name}}</span></div>
                                        <div class="selectric-items" tabindex="-1" id = "minMilage" style="width: 120px; height: 300px;">
                                            <div class="selectric-scroll" >
                                                <ul v-for="minMilage of minMilages" :key="minMilage.code">
                                                    <li @click="setStartOrmaxMilage(minMilage)">{{minMilage.name}}</li>
                                                </ul>
                                            </div>
                                        </div>
                                        <input class="selectric-input" tabindex="0"></div>
                                    <span class="wave">~</span>
                                    <div class="selectric-wrapper selectric-selectric selectric-below selectric-hover"
                                          id="selectMaxMileage"   @click="selectBoxChanger(`selectMaxMileage`)">
                                        <div class="selectric-hide-select"><select name="wr_lt_n_Milage"
                                                                                   id="distance02" class="selectric"
                                                                                   v-for="maxMilage of maxMilages"
                                                                                   :key="maxMilage.code"
                                                                                   tabindex="-1"
                                                                                   >
                                            <option :value="maxMilage.code">{{maxMilage.name}}</option>
                                        </select></div>
                                        <div class="selectric"><span class="label">{{selectedMaxMilage.name}}</span></div>
                                        <div class="selectric-items" tabindex="-1"  id="maxMilage" style="width: 120px; height: 300px;">
                                            <div class="selectric-scroll">
                                                <ul v-for="maxMilage of maxMilages" :key="maxMilage.code">
                                                    <li @click="setStartOrmaxMilage(maxMilage)"> {{maxMilage.name}}
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                        <input class="selectric-input" tabindex="0"></div>
                                </div>
                            </li>
                            <li class="list_h list_h07" id="list_h list_h07" >
                                <a class="type" @click="bigCategoryIsOpen(`list_h list_h07`)">연료 <small></small></a>
                                <div class="sub_type_list">
                                    <ul class="row_list"  v-for="fuelType of fuelTypeList" :key="fuelType.code">
                                        <li>
                                            <div class="checker" id="uniform-carFuel1"><span :class="{checked:fuelType.checked}" @click="check(fuelType)"><input type="checkbox"
                                                                                                    name="fuelTypeList"
                                                                                                    id="fuelTypeList"
                                                                                                    class="uniform"
                                                                                                    value="fuelType.code"></span>
                                            </div>
                                            <label for="carFuel1">{{fuelType.name}} </label>
                                        </li>
                                        <li>
                                        </li>
                                    </ul>
                    </div>
                            </li>
                            <li class="list_h list_h12" id="list_h list_h12">
                                <a class="type"   @click="bigCategoryIsOpen(`list_h list_h12`)">지역 <small></small></a>
                                <div class="sub_type_list sub_type_tree"  >
                                    <div class="scroll-wrapper scrollbar-dynamic" style="position: relative;">
                                        <div class="sscrollbar-dynamic scroll-content scroll-sscrolly_visible"
                                             style="height: 260px; margin-bottom: 0px; margin-right: 0px; max-height: none;">
                                            <ul class="tree">
                                                <li class="dep01" v-for=" region of regionList" :key="region.code">
                                                    <div class="row">
<span class="txt">
<div class="checker" id="uniform-areaL1"><span :class="{checked:region.checked}" @click="check(region)"><input type="checkbox" name="wr_in_v_center_region_code" id="areaL1"
                                                      class="uniform" value="region.code"></span></div>
<label for="areaL1">{{region.name}}</label>
</span>
</div>
                                                </li>
                                            </ul>
                                        </div>
                                        <div class="scroll-element scroll-x">
                                            <div class="scroll-element_outer">
                                                <div class="scroll-element_size"></div>
                                                <div class="scroll-element_track"></div>
                                                <div class="scroll-bar"></div>
                                            </div>
                                        </div>
                                        <div class="scroll-element scroll-y">
                                            <div class="scroll-element_outer">
                                                <div class="scroll-element_size"></div>
                                                <div class="scroll-element_track"></div>
                                                <div class="scroll-bar"></div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </li>
                        </ul>
                        <div class="car_tags">
                            <h5>#핫마크 태그</h5>
                            <a href="#none" data-hotmarkcd="09">#특옵션</a>
                            <a href="#none" data-hotmarkcd="10">#1인소유</a>
                            <a href="#none" data-hotmarkcd="19">#짧은Km</a>
                            <a href="#none" data-hotmarkcd="20">#4WD</a>
                            <a href="#none" data-hotmarkcd="22">#세금계산서</a>
                            <a href="#none" data-hotmarkcd="26">#제조사AS</a>
                            <a href="#none" data-hotmarkcd="29">#신차급</a>
                            <a href="#none" data-hotmarkcd="30">#보험이력無</a>
                            <a href="#none" data-hotmarkcd="31">#7인승</a>
                            <a href="#none" data-hotmarkcd="33">#무이자할부</a>
                            <a href="#none" data-hotmarkcd="34">#세제혜택</a>
                            <a href="#none" data-hotmarkcd="35">#차계부有</a>
                            <a href="#none" data-hotmarkcd="36">#구변완료</a>
                            <a href="#none" data-hotmarkcd="37">#속도제한無</a>
                            <a href="#none" data-hotmarkcd="38">#보증연장</a>
                            <a href="#none" data-hotmarkcd="39">#바우처有</a>
                            <a href="#none" data-hotmarkcd="40">#리콜완료</a>
                            <a href="#none" data-hotmarkcd="41">#정비OK</a>
                            <a href="#none" data-hotmarkcd="42">#주행보조</a>
                            <a href="#none" data-hotmarkcd="43">#브라운시트</a>
                            <a href="#none" data-hotmarkcd="44">#베이지시트</a>
                            <input type="checkbox" name="wr_in_v_hot_markcd" id="hotMarkCd09" data-hotmarknm="특옵션"
                                   value="09">
                            <input type="checkbox" name="wr_in_v_hot_markcd" id="hotMarkCd10" data-hotmarknm="1인소유"
                                   value="10">
                            <input type="checkbox" name="wr_in_v_hot_markcd" id="hotMarkCd19" data-hotmarknm="짧은KM"
                                   value="19">
                            <input type="checkbox" name="wr_in_v_hot_markcd" id="hotMarkCd20" data-hotmarknm="4WD"
                                   value="20">
                            <input type="checkbox" name="wr_in_v_hot_markcd" id="hotMarkCd22" data-hotmarknm="세금계산서"
                                   value="22">
                            <input type="checkbox" name="wr_in_v_hot_markcd" id="hotMarkCd26" data-hotmarknm="제조사AS"
                                   value="26">
                            <input type="checkbox" name="wr_in_v_hot_markcd" id="hotMarkCd29" data-hotmarknm="신차급"
                                   value="29">
                            <input type="checkbox" name="wr_in_v_hot_markcd" id="hotMarkCd30" data-hotmarknm="보험이력無"
                                   value="30">
                            <input type="checkbox" name="wr_in_v_hot_markcd" id="hotMarkCd31" data-hotmarknm="7인승"
                                   value="31">
                            <input type="checkbox" name="wr_in_v_hot_markcd" id="hotMarkCd33" data-hotmarknm="무이자할부"
                                   value="33">
                            <input type="checkbox" name="wr_in_v_hot_markcd" id="hotMarkCd34" data-hotmarknm="세제혜택"
                                   value="34">
                            <input type="checkbox" name="wr_in_v_hot_markcd" id="hotMarkCd35" data-hotmarknm="차계부有"
                                   value="35">
                            <input type="checkbox" name="wr_in_v_hot_markcd" id="hotMarkCd36" data-hotmarknm="구변완료"
                                   value="36">
                            <input type="checkbox" name="wr_in_v_hot_markcd" id="hotMarkCd37" data-hotmarknm="속도제한無"
                                   value="37">
                            <input type="checkbox" name="wr_in_v_hot_markcd" id="hotMarkCd38" data-hotmarknm="보증연장"
                                   value="38">
                            <input type="checkbox" name="wr_in_v_hot_markcd" id="hotMarkCd39" data-hotmarknm="바우처有"
                                   value="39">
                            <input type="checkbox" name="wr_in_v_hot_markcd" id="hotMarkCd40" data-hotmarknm="리콜완료"
                                   value="40">
                            <input type="checkbox" name="wr_in_v_hot_markcd" id="hotMarkCd41" data-hotmarknm="정비OK"
                                   value="41">
                            <input type="checkbox" name="wr_in_v_hot_markcd" id="hotMarkCd42" data-hotmarknm="주행보조"
                                   value="42">
                            <input type="checkbox" name="wr_in_v_hot_markcd" id="hotMarkCd43" data-hotmarknm="브라운시트"
                                   value="43">
                            <input type="checkbox" name="wr_in_v_hot_markcd" id="hotMarkCd44" data-hotmarknm="베이지시트"
                                   value="44">
                        </div>
                    </div>
                    <div class="result_box_wrap">
                        <ul class="choice_area">
                            <li v-for="checkedItem of checkedItems" :key="checkedItem.code">{{checkedItem.name}}<span class="close" @click="removeHashTag(checkedItem)">닫기</span></li>
                        </ul> <!-- 검색 선택 항목 javascript -->
                        <div class="until_box">
                            <div class="top_field">
                                <div id="totalCount" class="total">총 <strong>{{this.$store.state.cmm.carAllCount}}</strong>대</div>
                                <div class="hit"></div>
                                <div id="headerCustom">
                                    <div class="primary">
                                    <div class="inner">
                                    <ul class="util_link">
                                        <router-link to="/seencar">
                                        <li class="recent">
                                            <a >
                                                <i class="ico"></i>최근본차량
                                                <span class="badge">{{seenHistoryList.length}}</span>
                                            </a>
                                        </li>
                                        </router-link>
                                        <li class="favorite">
                                            <a href="/user/interest_car.do">
                                                <i class="ico"></i>관심차량
                                                <span></span>
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                                </div>
                                </div>
                            </div>
                            <div class="align_field">
                                <div class="detail_check">
                                    <div class="count_sel">
                                        <div id="sorting" @click="searchKeyClick(`sorting`)"
                                             class="selectric-wrapper selectric-selectric selectric-below">
                                            <div class="selectric-hide-select"><select name="sortinf" id="sortingList"
                                                                                       class="selectric"
                                                                                       data-beusable-tracking=""
                                                                                       tabindex="-1"
                                                                                       v-for="orderBysub of orderBySubs" :key="orderBysub.sub">
                                                <option value="limit">{{orderBysub.name}}</option>
                                            </select></div>
                                            <div class="selectric" style="width: 100px;"><span class="label"
                                                                         data-beusable-tracking="" >{{orderByName}}</span></div>
                                            <div class="selectric-items" tabindex="-1" style="width: 100px;">
                                                <div class="selectric-scroll">
                                                    <ul  v-for="orderBysub of orderBySubs" :key="orderBysub.sub">
                                                        <li data-index="0" @click="orderBy(orderBysub)">{{orderBysub.name}}</li>
                                                    </ul>
                                                </div>
                                            </div>
                                            <input class="selectric-input" tabindex="0"></div>
                                    </div>
                                </div>
                                <div class="detail_check">
                                    <div class="count_sel">
                                        <div id="carCnt" @click="searchKeyClick(`carCnt`)"
                                             class="selectric-wrapper selectric-selectric selectric-below">
                                            <div class="selectric-hide-select"><select name="limit" id="listCount"
                                                                                       class="selectric"
                                                                                       data-beusable-tracking=""
                                                                                       tabindex="-1"
                                            v-for="limit of limits" :key="limit.name">
                                                <option value="limit">{{limit}}개</option>
                                            </select></div>
                                            <div class="selectric" style="width: 100px;"><span class="label"
                                                                         data-beusable-tracking="" >{{this.$store.state.cmm.pageLimit}}개씩보기</span></div>
                                            <div class="selectric-items" tabindex="-1" style="width: 100px;">
                                                <div class="selectric-scroll">
                                                    <ul  v-for="limit of limits" :key="limit.name">
                                                        <li data-index="0" @click="clickPageLimit(limit)">{{limit}}개씩보기</li>
                                                    </ul>
                                                </div>
                                            </div>
                                            <input class="selectric-input" tabindex="0"></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="result_list">
                            <table>
                                <caption>차량검색결과</caption>

                                <colgroup>
                                    <col style="width: 190px;">
                                    <col style="width: 300px;">
                                    <col style="width: 280px;">
                                    <col>
                                </colgroup>

                                <tbody>
                                <td class="empty_result" colspan="4" v-show="searchResultEmpty"><p><span>찾으시는 조건의 차량이 없으세요?</span>관심차량등록알림을 신청하면<br>해당차량 등록시 문자알림을 드립니다.</p>
                                    <img src="https://www.kcar.com//resources/images/common/ico_empty.jpg" alt="차량없음 이미지">
                                    <a href="/help/helpMain.do">관심차량등록알림 신청하기</a>
                                </td>
                                <tr v-for="showCar of showCarList" :key="showCar.carcd" >
                                    <td class="thumb">
                                        <a href="#" >
                                            <div class="mark_area"></div>
                                            <img @click="productClick(showCar)" :src="showCar.middleImg" alt="자동차 썸네일">
                                        </a>
                                    </td>
                                    <td class="car_info">
                                        <a class="name" @click="productClick(showCar)">
                                        {{showCar.truckName}}
                                        </a>
                                        <span class="md_year">{{ showCar.mfrDate | mfrDateFormatter }} &nbsp; ({{ showCar.beginYear | beginYearFormatter }}년형)&nbsp;{{ showCar.milage | thousandFormatter }}km &nbsp;&nbsp;{{showCar.fuelTypecdName}}</span>
                                    <span class="price">{{ showCar.price | thousandFormatter }}만원 <em></em></span>
                                    <a href=""><span
                                            class="monthly"></span></a>
                                </td>
                                    <td class="car_opt">
                                        <div class="mark">
                                            <span class="tip_list tip_09"><button type="button" class="tip_btn">특옵션</button> </span>
                                            <span class="tip_list tip_10"><button type="button" class="tip_btn">1인소유</button> <span
                                                    class="tip_hot none"></span></span>
                                            <span class="tip_list tip_26"><button type="button" class="tip_btn">제조사AS</button> <span
                                                    class="tip_hot none"></span></span>
                                        </div>
                                        <ul class="opt_list">
                                            <li>
                                                <span>{{showCar.categorynm}}</span><span>&nbsp;</span>
                                            </li>
                                            <li>
                                                <span>{{showCar.centerRegion}}</span><span>&nbsp;</span>
                                            </li>
                                            <li>
                                                <span>{{showCar.passCnt}}  인승</span><span>&nbsp;</span>
                                            </li>
                                        </ul>
                                        <span class="online_buy">{{showCar.simpleComment}}</span>
                                    </td>
                                    <td class="btn_area">
                                        <a id="toastid0"
                                           href=""
                                           class="oline_btn">온라인 구매</a>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                        <pager v-if="isAny" />
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
import { mapState , mapGetters } from 'vuex'
import Pager from '@/components/cmm/Pagination'
export default {
    name: 'searchMain',
    components : {Pager},
    data() {
        return {
            searchWord: '',
            carcd: '',
            limits : [15,30,45,60],
            orderBySubs : [{name : "기본정렬", sub : 'default'},
                {name : "가격▲", sub : 'priceASC'},
                {name : "가격▼", sub : 'priceDESC'},
                {name : "주행거리▲", sub : 'mileageASC'},
                {name : "주행거리▼", sub : 'mileageDESC'},
                {name : "연식▲", sub : 'beginyearASC'},
                {name : "연식▲", sub : 'beginyearDESC'}],
            orderByName : '기본정렬',
            minDefault : { code: 'minDefault' ,name : ` 최 소 ` , bigcategory : 'minDefault' },
            maxDefault : { code: 'maxDefault' ,name : ` 최 대 `, bigcategory : 'maxDefault'  },
            selectedMinPrice : { code: 'selectedMinPrice' , name : ` 최 소 ` , bigcategory : 'minPrice' },
            selectedMaxPrice : { code: 'selectedMaxPrice' , name : ` 최 대 ` , bigcategory : 'maxPrice' },
            selectedMinMilage : { code: 'selectedMinMilage' , name : ` 최 소 ` , bigcategory : 'minMilage' },
            selectedMaxMilage : { code: 'selectedMaxMilage' , name : ` 최 대 ` , bigcategory : 'maxMilage' }
        }
    },
    computed: {
        ...mapState({
            showCarList : state => state.cmm.showCarList,
            categoryList: state => state.cmm.categoryList,
            makerList: state => state.cmm.makerList,
            fuelTypeList: state => state.cmm.fuelTypeList,
            regionList: state => state.cmm.regionList,
            searchResultEmpty : state => state.cmm.searchResultEmpty,
            checkedItems : state => state.cmm.checkedItems,
            seenHistoryList : state => state.cmm.seenHistoryList,
            modelListIsOpen : state => state.cmm.modelListIsOpen,
            modelList : state => state.cmm.modelList
        }),
        ...mapGetters('cmm', {
            initFlag : 'initFlag'
        }),
        isAny : function(){
            return (this.$store.state.cmm.showCarList.length>0)

        },
        minPriceList : function(){
            let list = [this.minDefault]
            for(let i=1;i<=20;i++){
                list.push({ code : `${i*1000}` ,name : `${i},000만원`, bigCategory : 'minPrice' })
            }
            return list
        },
        maxPriceList : function(){
            let list = [this.maxDefault]
            for(let i=1;i<=20;i++){
                list.push({ code : `${i*1000}` ,name : `${i},000만원`, bigCategory : 'maxPrice'})
            }
            return list
        },
        minMilages : function(){
            let list = [this.minDefault]
            for(let i=1;i<=20;i++){
                list.push({ code : `${i*1000}` ,name : `${i}0,000km`, bigCategory : 'minMilage'})
            }
            return list
        },
        maxMilages : function(){
            let list = [this.maxDefault]
            for(let i=1;i<=20;i++){
                list.push({ code : `${i*1000}` ,name : `${i}0,000km`, bigCategory : 'maxMilage'})
            }
            return list
        },
        beginYearCalc : function () {
            return true
        }


    },
    methods: {
        check(targetItem){
            this.$store.dispatch('cmm/CHECKER', { targetItem : targetItem , act : 'checked' }, { root: true })
            this.searchWithCondition()
        },
        removeHashTag (targetItem) {
            this.$store.dispatch('cmm/CHECKER',{ targetItem : targetItem , act : 'remove' })
            this.searchWithCondition()
        },
        checkMakeTree(targetItem){
            this.$store.dispatch('cmm/CHECKER', { targetItem : targetItem , act : 'checked' }, { root: true })
            this.$store.dispatch('cmm/getTreeChild',targetItem )
            this.searchWithCondition()
        },
        searchKeyClick(searchKeyID) {
            const searchKey = document.getElementById(searchKeyID)
            searchKey.className = (searchKey.className === "selectric-wrapper selectric-selectric selectric-below")
                        ? "selectric-wrapper selectric-selectric selectric-below selectric-open"
                        : "selectric-wrapper selectric-selectric selectric-below"
        },
        selectBoxChanger(targetItem){
            const searchKey = document.getElementById(targetItem)
            //const cate2 = document.getElementById("m"+targetItem.substr(7))
            if(searchKey.className === "selectric-wrapper selectric-selectric selectric-below selectric-hover"){
                for (let elementsByClassNameElement of document.getElementsByClassName("selectric-wrapper selectric-selectric selectric-below selectric-hover selectric-open selectric-focus")) {
                    elementsByClassNameElement.className = "selectric-wrapper selectric-selectric selectric-below selectric-hover"
                }
                searchKey.className = "selectric-wrapper selectric-selectric selectric-below selectric-hover selectric-open selectric-focus"
            }else{
                searchKey.className = "selectric-wrapper selectric-selectric selectric-below selectric-hover"
            }
        },
        addHistory(carItem){
            this.$store.dispatch('cmm/addSeenHistory',carItem)
        },
        productClick(carItem){
            this.addHistory(carItem)
            this.$store.dispatch('cmm/setProduct',carItem)
            this.$router.push('/product')
        },
        bigCategoryIsOpen(categoryType) {
            const searchConditionCategory = document.getElementById(categoryType)
            searchConditionCategory.className = (searchConditionCategory.className.substr(-2, 2) === 'on')
                        ? (searchConditionCategory.className.substring(0, searchConditionCategory.className.length - 3))
                        : searchConditionCategory.className = searchConditionCategory.className + " on"
        },
        searchWithCondition() {
            let checkedCategoryList = []
            let checkedModelList = []
            let checkedFuelTypeList = []
            let checkedRegionList = []
            let maker = ''

            this.$store.state.cmm.checkedItems.forEach( item => {
                switch (item.bigCategory) {
                    case 'categoryList':
                        checkedCategoryList.push(item)
                        break
                    case 'makerList':
                        maker = item
                        break
                    case 'fuelTypeList':
                        checkedFuelTypeList.push(item)
                        break
                    case 'regionList':
                        checkedRegionList.push(item)
                        break
                    case 'modelList':
                        checkedModelList.push(item)
                        break
                }
            })

            let selectedConditionData = {
                    categoryList: checkedCategoryList,
                    modelList: checkedModelList,
                    fuelTypeList: checkedFuelTypeList,
                    regionList: checkedRegionList,
                    searchWord: this.searchWord,
                    carcd: this.carcd,
                    pageLimit : this.$store.state.cmm.pageLimit,
                    maker : maker.code,
                    minPrice : this.selectedMinPrice,
                    orderBySub : this.$store.state.cmm.orderBySub,
                    maxPrice : this.selectedMaxPrice,
                    minMilage : this.selectedMinMilage,
                    maxMilage : this.selectedMaxMilage
            }
            this.$store.dispatch('cmm/searchWithCondition', selectedConditionData)
        },

        clickPageLimit(pageLimit){
            this.$store.dispatch('cmm/pageLimitSetting', pageLimit)
            this.searchWithCondition()
        },
        orderBy(orderByValue){
            this.$store.dispatch('cmm/orderBySubSetting', orderByValue.sub)
            this.orderByName = orderByValue.name
            this.searchWithCondition()
        },
        setStartOrmaxPrice ( param ) {
            switch ( param.bigCategory ) {
                case 'minPrice' :
                    this.selectedMinPrice = param
                    break
                case 'maxPrice' :
                    this.selectedMaxPrice = param
                    break
            }
            this.searchWithCondition()
        },
        setStartOrmaxMilage ( param ) {
            switch ( param.bigCategory ) {
                case 'minMilage' :
                    this.selectedMinMilage = param
                    break
                case 'maxMilage' :
                    this.selectedMaxMilage = param
                    break
            }
            this.searchWithCondition()
        },
        reset () {
            this.resettingSelectBox()
            this.$store.dispatch('cmm/reset')
            this.$store.dispatch('cmm/init')
        },
        resettingSelectBox () {
            this.selectedMinPrice.code = this.minDefault.code
            this.selectedMinPrice.name = this.minDefault.name
            this.selectedMaxPrice.code = this.maxDefault.code
            this.selectedMaxPrice.name = this.maxDefault.name
            this.selectedMinMilage.code = this.minDefault.code
            this.selectedMinMilage.name = this.minDefault.name
            this.selectedMaxMilage.code = this.maxDefault.code
            this.selectedMaxMilage.name = this.maxDefault.name
        }
    },
    filters: {
        mfrDateFormatter: function (value) {
            if (!value) return ''
            value = value.toString()
            return value.slice(2,4)+`년` + value.slice(4,6)+`월식`
        },
        beginYearFormatter: function (value) {
            if (!value) return ''
            value = value.toString()
            return value.slice(2,4)+``
        },
        thousandFormatter: function (value) {
            if (!value) return ''
            if(value.toString().length === 3) return value
            value = value.toString()
            return value.slice( 0 , value.length-3)+`,`+ value.slice(-3,value.length)
        }
    },
    created() {
        if (!this.$store.state.cmm.initFlag)
            this.$store.dispatch('cmm/init')
        if (this.$store.state.cmm.mainConditionSettingFlag) {
            this.selectedMinPrice = this.$store.state.cmm.minPriceFromMain
            this.selectedMaxPrice = this.$store.state.cmm.maxPriceFromMain
            this.searchWord = this.$store.state.cmm.modelTextFromMain
            this.searchWithCondition()
            if ( this.selectedMinPrice.code != 'minDefault' ) this.selectBoxChanger(`selectMinPrice`)
            if ( this.selectedMinPrice.code != 'maxDefault' ) this.selectBoxChanger(`selectMaxPrice`)
            }
        }
}
</script>
<style scoped>
    .main_content{
        padding-bottom: 50px;
    }
    #searchbg{
        padding-bottom: 300px;
    }
    .mc_wide_searchbox{width:100%;background:#191b1a /*#F1F2F4 url( /resources/images/index/pc_index_visual_1112.jpg) top center no-repeat*/;opacity: 0.97;height:903px;position:relative;display:inline-block; z-index:1; margin-bottom:57px;}
    .mc_wide_searchbox .searchbg{width:100%;background:url( https://www.kcar.com/resources/images/index/search_bg.png) center no-repeat; opacity: 0.97; display:inline-block;}
    .mc_wide_searchbox .searchbg .mc_search{    margin: 0px auto 0 auto; }
    .mc_search .selectric-items .selectric-scroll {
        overflow-x: hidden;
        overflow-y: auto;
    }

</style>
