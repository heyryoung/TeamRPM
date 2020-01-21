<template>
    <div id="wrap">
        <link rel="shortcut icon" href="https://www.kcar.com/resources/images/common/favicon.ico" type="image/x-icon">
        <link rel="icon" href="https://www.kcar.com/resources/images/common/favicon.ico" type="image/x-icon">
        <link rel="apple-touch-icon-precomposed"
              href="https://www.kcar.com/resources/images/mobile/common/apple-touch-icon.png">
        <link rel="stylesheet" href="https://www.kcar.com/resources/css/re_import.css?v=20191223103556">
        <link rel="stylesheet" href="https://www.kcar.com/resources/css/plugin/selectric.css?v=20191223103556">
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
                                       autocomplete="off" v-on:keyup.enter="searchWithCondition()">
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
                                <a class="type"   @click="bigCategoryIsOpen('list_h list_h05 on')">연식<small></small></a>
                                <div class="sub_type_list" data-init="true"  >
                                    <div id="startYear"  class="selectric-wrapper selectric-selectric selectric-below selectric-hover" @click= "searchKeyClick(`startYear`)">
                                        <div class="selectric-hide-select"><select name="wr_gt_v_mfr_date"
                                                                                   id="modelYear01" class="selectric"
                                                                                   data-unit="년">
                                            <option value="">최소</option>
                                            <option value="2019">2019년</option>
                                            <option value="2018">2018년</option>
                                        </select></div>
                                        <div class="selectric"><span class="label" >최소</span></div>
                                        <div class="selectric-items" tabindex="-1">
                                            <div class="selectric-scroll">
                                                <ul>
                                                    <li data-index="0" class="selected">최소</li>
                                                    <li data-index="1" class="">2019년</li>
                                                    <li data-index="2" class="">2018년</li>
                                                </ul>
                                            </div>
                                        </div>
                                        <input class="selectric-input" tabindex="0"></div>
                                    <span class="wave">~</span>
                                    <div class="selectric-wrapper selectric-selectric selectric-hover" id="endYear"  @click= "searchKeyClick(`endYear`)">
                                        <div class="selectric-hide-select"><select name="wr_lt_v_mfr_date"
                                                                                   id="modelYear02" class="selectric"
                                                                                   data-unit="년"
                                                                                   tabindex="-1">
                                            <option value="">최대</option>
                                            <option value="2019">2019년</option>
                                            <option value="2018">2018년</option>
                                        </select></div>
                                        <div class="selectric"><span class="label" data-beusable-tracking="">최대</span></div>
                                        <div class="selectric-items" tabindex="-1">
                                            <div class="selectric-scroll">
                                                <ul>
                                                    <li data-index="0" class="selected">최대</li>
                                                    <li data-index="1" class="">2019년</li>
                                                    <li data-index="2" class="">2018년</li>
                                                </ul>
                                            </div>

                                        </div>
                                        <input class="selectric-input" tabindex="0"></div>
                                </div>
                            </li>
                            <li class="list_h list_h04 on" id="list_h list_h04 on">
                                <a class="type"   @click="bigCategoryIsOpen(`list_h list_h04 on`)">주행거리<small></small></a>
                                <div class="sub_type_list"  data-init="true"  >
                                    <div id="startMileage" @click="searchKeyClick(`startMileage`)"
                                         class="selectric-wrapper selectric-selectric selectric-below selectric-hover">
                                        <div class="selectric-hide-select"><select name="wr_gt_n_mileage"
                                                                                   id="distance01" class="selectric"
                                                                                   data-unit="km" data-bro="mileage"
                                                                                   data-comma="comma"
                                                                                   data-beusable-tracking=""
                                                                                   tabindex="-1">
                                            <option value="">최소</option>
                                            <option value="10000">10,000km</option>
                                            <option value="20000">20,000km</option>
                                            <option value="30000">30,000km</option>
                                        </select></div>
                                        <div class="selectric"><span class="label">최소</span></div>
                                        <div class="selectric-items" tabindex="-1">
                                            <div class="selectric-scroll">
                                                <ul>
                                                    <li data-index="0" class="selected">최소</li>
                                                    <li data-index="1" class="">10,000km</li>
                                                    <li data-index="2" class="">20,000km</li>
                                                    <li data-index="3" class="">30,000km</li>
                                                </ul>
                                            </div>
                                        </div>
                                        <input class="selectric-input" tabindex="0"></div>
                                    <span class="wave">~</span>
                                    <div  id="endMileage" @click="searchKeyClick(`endMileage`)"
                                          class="selectric-wrapper selectric-selectric selectric-below selectric-hover">
                                        <div class="selectric-hide-select"><select name="wr_lt_n_mileage"
                                                                                   id="distance02" class="selectric"
                                                                                   data-unit="km" data-bro="mileage"
                                                                                   data-comma="comma"
                                                                                   data-beusable-tracking=""
                                                                                   tabindex="-1">
                                            <option value="">최대</option>
                                            <option value="10000">10,000km</option>
                                        </select></div>
                                        <div class="selectric"><span class="label">최대</span></div>
                                        <div class="selectric-items" tabindex="-1">
                                            <div class="selectric-scroll">
                                                <ul>
                                                    <li data-index="0" class="selected">최대</li>
                                                    <li data-index="1" class="">10,000km</li>
                                                </ul>
                                            </div>
                                        </div>
                                        <input class="selectric-input" tabindex="0"></div>
                                </div>
                            </li>
                            <li class="list_h list_h07" id="list_h list_h07">
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
                            <li v-for="checkedItem of checkedItems" :key="checkedItem.code">{{checkedItem.name}}<span class="close" @click="check(checkedItem)">닫기</span></li>
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
                                <div class="align">
                                    <span class="basic"><a href="" class="txt default"
                                                           data-bro="order">기본정렬</a></span>
                                    <span><a href="" class="txt" data-bro="order">가격순</a><a
                                            href="" class="down" data-show="order">낮은순</a><a
                                            href="" class="up" data-show="order">높은순</a></span>
                                    <span><a href="" class="txt" data-bro="order">주행거리 순</a><a
                                            href="" class="down" data-show="order">낮은순</a><a
                                            href="" class="up" data-show="order">높은순</a></span>
                                    <span><a href="" class="txt" data-bro="order">연식 순</a><a
                                            href="" class="down" data-show="order">낮은순</a><a
                                            href="" class="up" data-show="order">높은순</a></span>
                                    <input id="orderInput" class="orderbyInput" type="hidden" name="orderby" value="">
                                    <input id="3dOrderInput" class="3dOrderInput" type="hidden"
                                           name="wr_eq_v_3dview_flag" value="">
                                </div>
                                <div class="detail_check">
                                    <div class="count_sel">
                                        <div id="carCnt" @click="searchKeyClick(`carCnt`)"
                                             class="selectric-wrapper selectric-selectric selectric-below selectric-hover">
                                            <div class="selectric-hide-select"><select name="limit" id="listCount"
                                                                                       class="selectric"
                                                                                       data-beusable-tracking=""
                                                                                       tabindex="-1">
                                                <option value="15">15개</option>
                                                <option value="30">30개</option>
                                                <option value="45">45개</option>
                                                <option value="60">60개</option>
                                            </select></div>
                                            <div class="selectric"><span class="label"
                                                                         data-beusable-tracking="">15개 </span></div>
                                            <div class="selectric-items" tabindex="-1">
                                                <div class="selectric-scroll">
                                                    <ul>
                                                        <li data-index="0" class="selected">15개</li>
                                                        <li data-index="1" class="">30개</li>
                                                        <li data-index="2" class="">45개</li>
                                                        <li data-index="3" class="last">60개</li>
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
                                <tr v-for="carSearchResult of carSearchResults" :key="carSearchResult.carcd" @click="addHistory(carSearchResult)">
                                    <td class="thumb">
                                        <a :href="carSearchResult.carUrl" target="_blank">
                                            <div class="mark_area"></div>
                                            <img :src="carSearchResult.middleImg" alt="자동차 썸네일">
                                        </a>
                                    </td>
                                    <td class="car_info">
                                    <router-link to="/product">
                                        <a href="" target="_blank" class="name" ></a>
                                        {{carSearchResult.truckName}}
                                    </router-link>
                                    <span class="md_year">{{carSearchResult.mfrDate}}({{carSearchResult.beginYear}}년형)  &nbsp;&nbsp; {{carSearchResult.mileage}}km &nbsp;&nbsp;{{carSearchResult.fuelTypecdName}}</span>
                                    <span class="price">{{carSearchResult.price}}만원 <em></em></span>
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
                                                <span>단순교환</span><span>SUV</span>
                                            </li>
                                            <li>
                                                <span>성동</span><span></span>
                                            </li>
                                            <li>
                                                <span>5인승</span><span>&nbsp;</span>
                                            </li>
                                        </ul>
                                        <span class="online_buy">{{carSearchResult.simpleComment}}</span>
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
                        <div class="cm_pagination"><input id="pagingInput" class="pagingInput" type="hidden"
                                                          name="pageno" value="">
                            <ul class="pagination">
                                <li class="num on"><a href="">1</a></li>
                                <li class="num"><a href="">2</a></li>
                                <li class="num"><a href="">3</a></li>
                                <li class="num"><a href="">4</a></li>
                                <li class="num"><a href="">5</a></li>
                                <li class="num"><a href="">6</a></li>
                                <li class="num"><a href="">7</a></li>
                                <li class="num"><a href="">8</a></li>
                                <li class="num"><a href="">9</a></li>
                                <li class="num"><a href="">10</a></li>
                                <li class="move next"><a href="">다음</a></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
import { mapState , mapGetters } from 'vuex'
export default {
    name: 'searchMain',
    data() {
        return {
            searchWord: '',
            carcd: '',
            maker : ''
        }
    },
    computed: {
        ...mapState({
        carSearchResults : state => state.cmm.carSearchResults,
        categoryList: state => state.cmm.categoryList,
        makerList: state => state.cmm.makerList,
        modelList: state => state.cmm.modelList,
        fuelTypeList: state => state.cmm.fuelTypeList,
        regionList: state => state.cmm.regionList,
        centerList: state => state.cmm.centerList,
        searchResultEmpty : state => state.cmm.searchResultEmpty,
        checkedItems : state => state.cmm.checkedItems,
        seenHistoryList : state => state.cmm.seenHistoryList,
            modelListIsOpen : state => state.cmm.modelListIsOpen
        }),
        ...mapGetters('cmm', {
            initFlag : 'initFlag'
        })
        ,
        modelIsList : function () {
            return this.$store.state.cmm.modelList
        },

    },
    methods: {
        check(checkedItem){
            this.$store.dispatch('cmm/CHECKER', checkedItem , { root: true })
            this.searchWithCondition()
        },
        checkMakeTree(param){
            this.$store.dispatch('cmm/CHECKER',param, { root: true })
            this.$store.dispatch('cmm/getTreeChild',param)
            this.searchWithCondition()
            this.$store.dispatch('cmm/SYNCCHECKER')
        },
        searchKeyClick(searchKeyID) {
            const searchKey = document.getElementById(searchKeyID)
            if (searchKey.className === "selectric-wrapper selectric-selectric selectric-below") {
                searchKey.className = "selectric-wrapper selectric-selectric selectric-below selectric-open"
            } else {
                searchKey.className = "selectric-wrapper selectric-selectric selectric-below"
            }
        },
        addHistory(caritem){
            this.$store.dispatch('cmm/addSeenHistory',caritem)
        },
        bigCategoryIsOpen(categoryType) {
            const searchConditionCategory = document.getElementById(categoryType)
            if (searchConditionCategory.className.substr(-2, 2) === 'on') {
                searchConditionCategory.className = (searchConditionCategory.className.substring(0, searchConditionCategory.className.length - 3));
            } else {
                searchConditionCategory.className = searchConditionCategory.className + " on"
            }
        },
        searchWithCondition() {
            let checkedCategoryList = []
            let checkedModelList = []
            let checkedFuelTypeList = []
            let checkedRegionList = []
            let maker = ''

            this.$store.state.cmm.categoryList.forEach(e => {
                if (e.checked == true) checkedCategoryList.push(e)
            })
            this.$store.state.cmm.makerList.forEach(e => {
                if (e.checked == true) maker = e.code
            })
            this.$store.state.cmm.modelList.forEach(e => {
                if (e.checked == true) checkedModelList.push(e)
            })
            this.$store.state.cmm.fuelTypeList.forEach(e => {
                if (e.checked == true) checkedFuelTypeList.push(e)
            })
            this.$store.state.cmm.regionList.forEach(e => {
                if (e.checked == true) checkedRegionList.push(e)
            })
            let data = {
                categoryList: checkedCategoryList,
                modelList: checkedModelList,
                fuelTypeList: checkedFuelTypeList,
                regionList: checkedRegionList,
                searchWord: this.searchWord,
                carcd: this.carcd,
                maker : maker
            }
            this.$store.dispatch('cmm/searchWithCondition', data)
            },
        reset () {
            this.$store.dispatch('cmm/checkReset')
        }

    },
        created() {
        if(!this.$store.state.cmm.initFlag)
            this.$store.dispatch('cmm/init')
        }
    }
</script>
<style scoped>
</style>
