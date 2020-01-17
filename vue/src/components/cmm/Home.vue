<template>
    <div>
        <div id='app'>
           <div style="padding-top: 80px;"></div>
            <div id="content">
                <div class="main_content">
                    <!--검색-->
                    <div class="mc_wide_searchbox">
                        <img src="@/assets/image/mainhome.png" alt="">
                        <div class="searchbg">
                            <div class="mc_search">
                                <div class="search3box">
                                    <div  class="tab_want1 tab_want_menu" data-item="tab1">
                                        <h3><a id="tab1" @click="wantModel" class="on">원하는 모델이 있어요</a></h3>
                                    </div>
                                    <div id="divTabWant1" class="divTabWantGroup">
                                        <!--검색tab1 내용-->
                                        <div class="searchcont1">
                                            <ul>
                                                <li>
                                                    <span class="tit">RPM에서 판매하는 차 <strong class="all_car_cnt">총 {{this.$store.state.cmm.carAllCount}}대</strong></span>
                            <span class="searchinput">
                              <input type="text" class="placeho modelSearchInput" name="quickSearch" id="quickSearch" @click="searchBoxOn"
                                     v-model = "searchKeyWord" @keyup="stringMatchOn"
                                     placeholder=" 모델명을 입력해주세요. 예시)아반떼" maxlength="20" autocomplete="off"><a @click="goSearch" class="hid">검색</a>
                            </span>
                                                    <!--검색기록유-->
                                                    <div id = "searchBox" class="recentlist modelSearchDiv1 modelSearchGroup"
                                                         style="display:none">
                                                        <h3 class="tit">인기 모델명</h3>
                                                        <div class="recentl">
                                                            <ul>
                                                                <li class="firstlist"><a
                                                                        href="/car/search/car_search_list.do?&amp;i_sMakeCd=002&amp;i_sModelGrpCd=002&amp;i_sModelCd=122&amp;i_sMakeType=MAKE_TYPE010"
                                                                        onclick="mainEvent.moveCarSearchListWithCodeGroup(this);"
                                                                        data-item="002|002|122|KOR|올 뉴 K7">1. 올 뉴 K7</a>
                                                                </li>
                                                                <li class=""><a
                                                                        href="/car/search/car_search_list.do?&amp;i_sMakeCd=001&amp;i_sModelGrpCd=004&amp;i_sModelCd=141&amp;i_sMakeType=MAKE_TYPE010"
                                                                        onclick="mainEvent.moveCarSearchListWithCodeGroup(this);"
                                                                        data-item="001|004|141|KOR|그랜저 IG">2. 그랜저 IG</a>
                                                                </li>
                                                                <li class=""><a
                                                                        href="/car/search/car_search_list.do?&amp;i_sMakeCd=001&amp;i_sModelGrpCd=019&amp;i_sModelCd=136&amp;i_sMakeType=MAKE_TYPE010"
                                                                        onclick="mainEvent.moveCarSearchListWithCodeGroup(this);"
                                                                        data-item="001|019|136|KOR|아반떼 AD">3. 아반떼 AD</a>
                                                                </li>
                                                                <li class=""><a
                                                                        href="/car/search/car_search_list.do?&amp;i_sMakeCd=002&amp;i_sModelGrpCd=036&amp;i_sModelCd=113&amp;i_sMakeType=MAKE_TYPE010"
                                                                        onclick="mainEvent.moveCarSearchListWithCodeGroup(this);"
                                                                        data-item="002|036|113|KOR|올 뉴 카니발">4. 올 뉴
                                                                    카니발</a></li>
                                                                <li class=""><a
                                                                        href="/car/search/car_search_list.do?&amp;i_sMakeCd=007&amp;i_sModelGrpCd=002&amp;i_sModelCd=002&amp;i_sMakeType=MAKE_TYPE010"
                                                                        onclick="mainEvent.moveCarSearchListWithCodeGroup(this);"
                                                                        data-item="007|002|002|KOR|제네시스 G80">5. 제네시스
                                                                    G80</a></li>
                                                                <li class=""><a
                                                                        href="/car/search/car_search_list.do?&amp;i_sMakeCd=013&amp;i_sModelGrpCd=004&amp;i_sModelCd=001&amp;i_sMakeType=MAKE_TYPE020"
                                                                        onclick="mainEvent.moveCarSearchListWithCodeGroup(this);"
                                                                        data-item="013|004|001|IMP|벤츠 E-클래스">6. 벤츠
                                                                    E-클래스</a></li>
                                                                <li class=""><a
                                                                        href="/car/search/car_search_list.do?&amp;i_sMakeCd=003&amp;i_sModelGrpCd=046&amp;i_sModelCd=088&amp;i_sMakeType=MAKE_TYPE010"
                                                                        onclick="mainEvent.moveCarSearchListWithCodeGroup(this);"
                                                                        data-item="003|046|088|KOR|올 뉴 말리부">7. 올 뉴
                                                                    말리부</a></li>
                                                                <li class=""><a
                                                                        href="/car/search/car_search_list.do?&amp;i_sMakeCd=002&amp;i_sModelGrpCd=001&amp;i_sModelCd=135&amp;i_sMakeType=MAKE_TYPE010"
                                                                        onclick="mainEvent.moveCarSearchListWithCodeGroup(this);"
                                                                        data-item="002|001|135|KOR|K5 2세대">8. K5 2세대</a>
                                                                </li>
                                                                <li class=""><a
                                                                        href="/car/search/car_search_list.do?&amp;i_sMakeCd=001&amp;i_sModelGrpCd=017&amp;i_sModelCd=134&amp;i_sMakeType=MAKE_TYPE010"
                                                                        onclick="mainEvent.moveCarSearchListWithCodeGroup(this);"
                                                                        data-item="001|017|134|KOR|싼타페 더 프라임">9. 싼타페 더
                                                                    프라임</a></li>
                                                                <li class=""><a
                                                                        href="/car/search/car_search_list.do?&amp;i_sMakeCd=001&amp;i_sModelGrpCd=032&amp;i_sModelCd=133&amp;i_sMakeType=MAKE_TYPE010"
                                                                        onclick="mainEvent.moveCarSearchListWithCodeGroup(this);"
                                                                        data-item="001|032|133|KOR|올 뉴 투싼">10. 올 뉴
                                                                    투싼</a></li>
                                                            </ul>
                                                        </div>
                                                        <h3 class="tit1">최근 검색한 모델명<em>전체삭제</em><a href="javascript:;"
                                                                                                   onclick="mainEvent.deleteRecentSearchWordsCookie(-1)"
                                                                                                   class="clb"><img
                                                                src="https://www.kcar.com/resources/images/index/listclose.jpg" width="20"
                                                                height="21" alt="닫기" border="0"></a></h3>
                                                        <div class="recentr">
                                                            <ul>
                                                                <li class="noresult">최근 검색한 모델이 없습니다</li>
                                                                <li>
                                                                    <a href="/car/search/car_search_list.do?&amp;i_sMakeCd=002&amp;i_sModelGrpCd=002&amp;i_sModelCd=122&amp;i_sMakeType=MAKE_TYPE010">올
                                                                        뉴 K7</a><span><a href="javascript:;"
                                                                                         onclick="mainEvent.deleteRecentSearchWordsCookie(0);"><img
                                                                        src="https://www.kcar.com/resources/images/index/listclose.jpg"
                                                                        width="20" height="21" alt="닫기" border="0"></a></span>
                                                                </li>
                                                            </ul>
                                                        </div>
                                                        <div class="btclose divSearchConHide"><a
                                                                @click="searchBoxOff(`searchBox`)"><img
                                                                src="https://www.kcar.com/resources/images/index/recentclose.jpg" width="44"
                                                                height="20" alt="닫기" border="0"></a></div>
                                                    </div>
                                                    <!--키워드 입력중-->
                                                    <div id = "stringMatch" class="recentlist modelSearchDiv2 modelSearchGroup" style="display: none">
                                                        <h3 class="tit">추천직영차</h3>
                                                        <div class="recentr1">
                                                            <ul><li><div class="carthumlist "><a href="/car/info/car_info_imported_detail.do?i_sCarCd=EC60309032"><img src="https://img.kcar.com/3dcarpicture/2019/12/010/60309032_1/main/main780.jpg" width="100" height="66" alt="car" target="_blank"><span>시트로엥 DS7 크로스백 2.0 BlueHDi 소 시크<br><em>3,900만원</em></span></a></div></li><li><div class="carthumlist last"><a href="/car/info/car_info_detail.do?i_sCarCd=EC60325171"><img src="https://img.kcar.com/carpicture/carpicture02/pic6032/kcar_60325171_011.jpg" width="100" height="66" alt="car" target="_blank"><span>현대 쏘나타 DN8 2.0 가솔린<br><em>2,130만원</em></span></a></div></li></ul>
                                                        </div>
                                                        <!--검색기록무
                                                        <div class="recentr1" style="display:none">
                                                            <ul>
                                                                <li class="noresult">추천직영차가 없습니다</li>
                                                            </ul>
                                                        </div>
                                                        -->
                                                        <h3 class="tit1">연관 모델명</h3>
                                                        <div class="recentl1">
                                                            <ul><li><a href="javascript:;" onclick="mainEvent.moveCarSearchListWithCodeGroup(this);" data-item="022|006|006|IMP|DS3(12년~18년)">DS3(12년~18년)</a></li><li><a href="javascript:;" onclick="mainEvent.moveCarSearchListWithCodeGroup(this);" data-item="022|009|008|IMP|DS5(11년~18년)">DS5(11년~18년)</a></li><li><a href="javascript:;" onclick="mainEvent.moveCarSearchListWithCodeGroup(this);" data-item="022|006|009|IMP|DS3 카브리오(13년~18년)">DS3 카브리오(13년~18년)</a></li><li><a href="javascript:;" onclick="mainEvent.moveCarSearchListWithCodeGroup(this);" data-item="022|008|012|IMP|DS4 크로스백(16년~18년)">DS4 크로스백(16년~18년)</a></li><li><a href="javascript:;" onclick="mainEvent.moveCarSearchListWithCodeGroup(this);" data-item="022|008|007|IMP|DS4(12년~18년)">DS4(12년~18년)</a></li><li><a href="javascript:;" onclick="mainEvent.moveCarSearchListWithCodeGroup(this);" data-item="043|010|010|IMP|DTS(06년~11년)">DTS(06년~11년)</a></li><li><a href="javascript:;" onclick="mainEvent.moveCarSearchListWithCodeGroup(this);" data-item="070|002|002|IMP|DB9(04년~18년)">DB9(04년~18년)</a></li><li><a href="javascript:;" onclick="mainEvent.moveCarSearchListWithCodeGroup(this);" data-item="070|004|004|IMP|DBS(07년~18년)">DBS(07년~18년)</a></li><li><a href="javascript:;" onclick="mainEvent.moveCarSearchListWithCodeGroup(this);" data-item="070|008|075|IMP|DB7(94년~03년)">DB7(94년~03년)</a></li><li><a href="javascript:;" onclick="mainEvent.moveCarSearchListWithCodeGroup(this);" data-item="001|017|111|KOR|싼타페 DM(12년~15년)">싼타페 DM(12년~15년)</a></li><li><a href="javascript:;" onclick="mainEvent.moveCarSearchListWithCodeGroup(this);" data-item="001|025|124|KOR|제네시스 DH(13년~16년)">제네시스 DH(13년~16년)</a></li><li><a href="javascript:;" onclick="mainEvent.moveCarSearchListWithCodeGroup(this);" data-item="001|018|163|KOR|쏘나타 DN8(19년~현재)">쏘나타 DN8(19년~현재)</a></li><li><a href="javascript:;" onclick="mainEvent.moveCarSearchListWithCodeGroup(this);" data-item="054|002|006|IMP|쿠퍼 D 클럽맨(09년~18년)">쿠퍼 D 클럽맨(09년~18년)</a></li><li><a href="javascript:;" onclick="mainEvent.moveCarSearchListWithCodeGroup(this);" data-item="054|003|115|IMP|쿠퍼 D 컨트리맨(11년~18년)">쿠퍼 D 컨트리맨(11년~18년)</a></li><li><a href="javascript:;" onclick="mainEvent.moveCarSearchListWithCodeGroup(this);" data-item="054|001|117|IMP|쿠퍼 D(07년~18년)">쿠퍼 D(07년~18년)</a></li><li><a href="javascript:;" onclick="mainEvent.moveCarSearchListWithCodeGroup(this);" data-item="054|012|133|IMP|쿠퍼 D 페이스맨(13년~18년)">쿠퍼 D 페이스맨(13년~18년)</a></li><li><a href="javascript:;" onclick="mainEvent.moveCarSearchListWithCodeGroup(this);" data-item="001|019|037|KOR|아반떼 XD(00년~03년)">아반떼 XD(00년~03년)</a></li><li><a href="javascript:;" onclick="mainEvent.moveCarSearchListWithCodeGroup(this);" data-item="001|019|071|KOR|뉴 아반떼 XD(03년~06년)">뉴 아반떼 XD(03년~06년)</a></li><li><a href="javascript:;" onclick="mainEvent.moveCarSearchListWithCodeGroup(this);" data-item="001|019|081|KOR|아반떼 HD(06년~10년)">아반떼 HD(06년~10년)</a></li><li><a href="javascript:;" onclick="mainEvent.moveCarSearchListWithCodeGroup(this);" data-item="001|019|104|KOR|아반떼 MD(10년~13년)">아반떼 MD(10년~13년)</a></li><li><a href="javascript:;" onclick="mainEvent.moveCarSearchListWithCodeGroup(this);" data-item="001|019|136|KOR|아반떼 AD(15년~18년)">아반떼 AD(15년~18년)</a></li><li><a href="javascript:;" onclick="mainEvent.moveCarSearchListWithCodeGroup(this);" data-item="001|019|154|KOR|더 뉴 아반떼 AD(18년~현재)">더 뉴 아반떼 AD(18년~현재)</a></li><li><a href="javascript:;" onclick="mainEvent.moveCarSearchListWithCodeGroup(this);" data-item="054|001|118|IMP|쿠퍼 SD(12년~18년)">쿠퍼 SD(12년~18년)</a></li><li><a href="javascript:;" onclick="mainEvent.moveCarSearchListWithCodeGroup(this);" data-item="058|001|016|IMP|FX30d(09년~13년)">FX30d(09년~13년)</a></li><li><a href="javascript:;" onclick="mainEvent.moveCarSearchListWithCodeGroup(this);" data-item="082|004|004|IMP|xD(07년~14년)">xD(07년~14년)</a></li><li><a href="javascript:;" onclick="mainEvent.moveCarSearchListWithCodeGroup(this);" data-item="058|003|014|IMP|M30d(10년~13년)">M30d(10년~13년)</a></li></ul>
                                                        </div>
                                                        <div class="btclose divSearchConHide"><a @click="searchBoxOff(`stringMatch`)"><img src="https://www.kcar.com/resources/images/index/recentclose.jpg" width="44" height="20" alt="닫기" border="0"></a></div>
                                                    </div>
                                                </li>
                                                <li>
                            <span id="spanMakeType" class="btnl">
                              <a @click="korCar(`korCar`,`impCar`)" id="korCar" class="on" data-item="MAKE_TYPE010">국산차</a>
                              <a @click="impCar(`korCar`,`impCar`,`category1`)" id="impCar" data-item="MAKE_TYPE020">수입차</a>
                            </span>
                                                </li>
                                                <li class="spreset">
                                                    <div class="searchr1">
                                                        <div id="searchKey1" @click="searchKeyClick(`searchKey1`)"
                                                             class="selectric-wrapper selectric-selectric selectric-below selectric-hover">
                                                            <div class="selectric-hide-select">
                                                                <select id="makeList"
                                                                        title="제조사를 선택하세요"
                                                                        class="selectric"
                                                                        data-beusable-tracking=""
                                                                        tabindex="-1"
                                                                        v-for="category of this.$store.state.cmm.category1"
                                                                        :key="category.name">
                                                                <option data-type="MAKE_TYPE010"
                                                                        data-cnt="category.count">{{category.name}}</option>
                                                            </select></div>
                                                            <div class="selectric" ><span class="label"
                                                                                         data-beusable-tracking="" >{{keyWord1}}</span></div>
                                                            <div id = "category1" class="selectric-items" tabindex="-1">
                                                                <div class="selectric-scroll">
                                                                    <ul v-for="category of this.$store.state.cmm.category1" :key="category.name">
                                                                        <li data-index="1" @click="setCategory2(category.name, category.count)" class="">{{category.name}}<em>{{category.count}}</em>
                                                                        </li>
                                                                    </ul>
                                                                </div>
                                                            </div>
                                                            <input class="selectric-input" tabindex="0"></div>
                                                    </div>
                                                    <div class="searchr2">
                                                        <div id="searchKey2"  @click="searchKeyClick(`searchKey2`)"
                                                             class="selectric-wrapper selectric-selectric selectric-below selectric-hover">
                                                            <div class="selectric-hide-select"><select
                                                                    id="modelGroupList" title="모델을 선택하세요"
                                                                    class="selectric" data-beusable-tracking=""
                                                                    tabindex="-1"
                                                                    v-for="category of this.$store.state.cmm.category2"
                                                                    :key="category.name">
                                                                <option data-type="MAKE_TYPE010"
                                                                        data-cnt="category.count">{{category.name}}</option>
                                                            </select></div>
                                                            <div class="selectric"><span class="label"
                                                                                         data-beusable-tracking="">{{keyWord2}}</span></div>
                                                            <div id = "category2" class="selectric-items" tabindex="-1" >
                                                                <div class="selectric-scroll">
                                                                    <ul v-for="category of this.$store.state.cmm.category2" :key="category.name">
                                                                        <li data-index="1" @click="setCategory3(category.name, category.count)" class="">{{category.name}}<em>{{category.count}}</em>
                                                                        </li>
                                                                    </ul>
                                                                </div>
                                                            </div>
                                                            <input class="selectric-input" tabindex="0"></div>
                                                    </div>
                                                    <div class="searchr3">
                                                        <div id="searchKey3" @click="searchKeyClick(`searchKey3`)"

                                                             class="selectric-wrapper selectric-selectric selectric-below selectric-hover">
                                                            <div class="selectric-hide-select">
                                                                <select
                                                                    id="modelList"
                                                                   title="세부모델을 선택하세요"
                                                                   class="selectric"
                                                                   data-beusable-tracking=""
                                                                   tabindex="-1"
                                                                   v-for="category of this.$store.state.cmm.category3"
                                                                   :key="category.name">
                                                                <option data-type="MAKE_TYPE010"
                                                                        data-cnt="category.count">{{category.name}}</option>
                                                                </select></div>
                                                            <div class="selectric"><span class="label"
                                                                                         data-beusable-tracking="">{{keyWord3}}</span></div>
                                                            <div class="selectric-items" tabindex="-1">
                                                                <div class="selectric-scroll">
                                                                    <ul v-for="category of this.$store.state.cmm.category3" :key="category.name">
                                                                        <li data-index="1" @click="setKeyWord3(category.name, category.count)" class="">{{category.name}}<em>{{category.count}}</em>
                                                                        </li>
                                                                    </ul>
                                                                </div>
                                                            </div>
                                                            <input class="selectric-input" tabindex="0"></div>
                                                    </div>
                                                </li>
                                                <li class="search_btn" id="divBtnSearch">
                                                    <a @click="goSearchWithCondition()">검색하기&nbsp;<span v-if="resultCount">({{resultCount}}대)</span></a>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div  class="tab_want2 tab_want_menu" data-item="tab2">
                                        <h3><a id="tab2" @click="haveBudget">예산이 정해져 있어요</a></h3>
                                    </div>
                                    <!--검색tab2 내용-->
                                    <!---->
                                    <div id="divTabWant2" class="divTabWantGroup" style="display:none">
                                        <!--20180801 검색셀렉트박스 수정-->
                                        <div class="searchcont1">
                                            <ul>
                                                <li><span class="tit">RPM에서 판매하는 차 <strong class="all_car_cnt">총 {{this.$store.state.cmm.carAllCount}}대</strong></span>

                                                </li>
                                                <li>
                            <span id="spanMakeType" class="btnl">
                              <a @click="korCar(`korCar2`,`impCar2`)" id="korCar2"  data-item="MAKE_TYPE010">국산차</a>
                              <a @click="impCar(`korCar2`,`impCar2`,`category4`)" id="impCar2" data-item="MAKE_TYPE020">수입차</a>
                            </span>
                                                </li>
                                                <li class="spreset">
                                                    <div class="searchr1">
                                                        <div id="budgetCategory" @click="searchKeyClick(`budgetCategory`)"
                                                             class="selectric-wrapper selectric-selectric selectric-below selectric-hover">
                                                            <div class="selectric-hide-select">
                                                                <select
                                                                    id="makeList"
                                                                    title="제조사를 선택하세요"
                                                                    lass="selectric"
                                                                    data-beusable-tracking=""
                                                                    tabindex="-1"
                                                                    v-for="category of this.$store.state.cmm.category1"
                                                                    :key="category.name">
                                                                    <option data-type="MAKE_TYPE010"
                                                                        data-cnt="category.count">{{category.name}}</option>
                                                                </select></div>
                                                            <div class="selectric" ><span class="label"
                                                                                          data-beusable-tracking="">{{keyWord1}}</span></div>
                                                            <div id="category4" class="selectric-items" tabindex="-1">
                                                                <div class="selectric-scroll">
                                                                    <ul v-for="category of this.$store.state.cmm.category1" :key="category.name">
                                                                        <li data-index="1" @click="setCategory2(category.name, category.count)" class="">{{category.name}}<em>{{category.count}}</em>
                                                                        </li>
                                                                    </ul>
                                                                </div>
                                                            </div>
                                                            <input class="selectric-input" tabindex="0"></div>
                                                    </div>
                                                    <div class="searchr2">
                                                        <div id="priceDiv1" @click="searchKeyClick(`priceDiv1`)"
                                                        class="selectric-wrapper selectric-selectric selectric-below selectric-hover">
                                                            <div class="selectric-hide-select">
                                                                <select id="minCarPrice"
                                                                        title="최저가격을 선택하세요"
                                                                        class="selectric"
                                                                        tabindex="-1"
                                                                        v-for="price of prices"
                                                                        :key="price.name">
                                                                    <option value = "price.value">{{price.name}}</option>
                                                            </select></div>
                                                            <div class="selectric"><span
                                                                    class="label">{{minPrice}}</span></div>
                                                            <div class="selectric-items" tabindex="-1" style="width: 220px; height: 300px;">
                                                                <div class="selectric-scroll">
                                                                    <ul v-for="price of prices" :key="price.name">
                                                                        <li @click="setMinPrice(price.name)" data-index="price.index" class="">{{price.name}}</li>
                                                                    </ul>
                                                                </div>
                                                            </div>
                                                            <input class="selectric-input" tabindex="0"></div>
                                                    </div>
                                                    <div class="searchr3">
                                                        <div id="priceDiv2" @click="searchKeyClick(`priceDiv2`)"
                                                             class="selectric-wrapper selectric-selectric selectric-below selectric-hover">
                                                            <div class="selectric-hide-select">
                                                                <select id="maxCarPrice"
                                                                        title="최고가격을 선택하세요"
                                                                        class="selectric"
                                                                        tabindex="-1"
                                                                        v-for="price of prices"
                                                                        :key="price.name">
                                                                    <option value = "price.value">{{price.name}}</option>
                                                            </select></div>
                                                            <div class="selectric"><span
                                                                    class="label">{{maxPrice}}</span></div>
                                                            <div class="selectric-items" tabindex="-1" style="width: 220px; height: 300px;">
                                                                <div class="selectric-scroll">
                                                                    <ul v-for="price of prices" :key="price.name">
                                                                         <li @click="setMaxPrice(price.name)" data-index="price.index" class="">{{price.name}}</li>
                                                                    </ul>
                                                                </div>
                                                            </div>
                                                            <input class="selectric-input" tabindex="0"></div>
                                                    </div>
                                                </li>
                                                <li class="search_btn" id="divBtnSearchWithPrice"><a
                                                        href="javascript:;">검색하기&nbsp;<span></span></a></li>
                                                <!--//20180801 검색셀렉트박스 수정-->
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="tab_want3 tab_want_menu" data-item="tab3">
                                        <h3><router-link to="/searchMain">정해진게 없어요</router-link></h3>
                                    </div>

                                </div>
                            </div>
                        </div>
                    </div>
                    <!--추천차-->
                    <div class="mc_wide_common">
                        <div class="mc_carlist"><h2>추천 기획전 <a href="/group/themecar.do" class="more">더보기 </a></h2>
                            <div class="tabbox">
                                <ul>
                                    <li class="tab_reco1"><h3><a href="javascript:;"
                                                                 onclick="mainEvent.getThemeCarListWithCD(19122,this);"
                                                                 class="on">#1,000만원 미만 수입차 기획전</a></h3></li>
                                    <li class="tab_reco2"><h3><a href="javascript:;"
                                                                 onclick="mainEvent.getThemeCarListWithCD(19113,this);">#신차급
                                        무이자 할부 기획전</a></h3></li>
                                    <li class="tab_reco3"><h3><a href="javascript:;"
                                                                 onclick="mainEvent.getThemeCarListWithCD(19111,this);">#셀토스
                                        기획전</a></h3></li>
                                    <li class="tab_reco4"><h3><a href="javascript:;"
                                                                 onclick="mainEvent.getThemeCarListWithCD(19061,this);">#
                                        실속있는 당신을위한 K3기획전</a></h3></li>
                                </ul>
                            </div>
                            <div class="listwrap header_new1">
                                <div class="banner_box1">
                                    <div class="banner_inner_box1" id="divRecommendPromotionArea">
                                        <div class="bx-wrapper" style="max-width: 1182px;">
                                            <div class="bx-viewport"
                                                 style="width: 100%; overflow: hidden; position: relative; height: 389px;">
                                                <ul class="ulRecommendedCar"
                                                    style="width: 2215%; position: relative; transition-duration: 0s; transform: translate3d(-1198px, 0px, 0px);">
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;"
                                                        class="bx-clone"><a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60310068"
                                                            target="_blank"> <img
                                                            src="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60310068_001.jpg"
                                                            data-original="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60310068_001.jpg"
                                                            class="lazy" width="280" height="187" alt="car"
                                                            style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60310068"
                                                            target="_blank"> <span
                                                            class="model">폭스바겐 뉴 제타<br>2.0 TDI</span> </a> <span
                                                            class="year">13년 08월식 &nbsp;&nbsp; 87,737km</span> <span
                                                            class="money">960만원</span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60310068&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  21만원</span></a> <span
                                                            class="mark"><span class="tip_list tip_10"><button
                                                            type="button" class="tip_btn"
                                                            onclick="openHotMarkToolTip(this);">1인소유</button> <span
                                                            class="tip_hot none"><b>1인소유<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>소유자 변경 이력이 없는 차량(대여 이력 및 법인 명의 차량 제외)</i></span></span><span
                                                            class="tip_list tip_19"><button type="button"
                                                                                            class="tip_btn"
                                                                                            onclick="openHotMarkToolTip(this);">짧은Km</button> <span
                                                            class="tip_hot none"><b>짧은Km<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>연 10,000km 이내 주행 차량</i></span></span>   </span>
                                                    </li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;"
                                                        class="bx-clone"><a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60317016"
                                                            target="_blank"> <img
                                                            src="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60317016_001.jpg"
                                                            data-original="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60317016_001.jpg"
                                                            class="lazy" width="280" height="187" alt="car"
                                                            style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60317016"
                                                            target="_blank"> <span class="model">시트로엥 DS3<br>1.4 e-HDi 시크</span>
                                                    </a> <span class="year">12년 09월식(13년형) &nbsp;&nbsp; 70,829km</span>
                                                        <span class="money">830만원</span> <a
                                                                href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60317016&amp;maketing=car_keep_pop1')"><span
                                                                class="monthly">월할부금  18만원</span></a> <span
                                                                class="mark"><span class="tip_list tip_19"><button
                                                                type="button" class="tip_btn"
                                                                onclick="openHotMarkToolTip(this);">짧은Km</button> <span
                                                                class="tip_hot none"><b>짧은Km<a
                                                                href="javascript:closeHotMarkToolTip(this);"
                                                                class="tip_cl">닫기</a></b><i>연 10,000km 이내 주행 차량</i></span></span><span
                                                                class="tip_list tip_41"><button type="button"
                                                                                                class="tip_btn"
                                                                                                onclick="openHotMarkToolTip(this);">정비OK</button> <span
                                                                class="tip_hot none"><b>정비OK<a
                                                                href="javascript:closeHotMarkToolTip(this);"
                                                                class="tip_cl">닫기</a></b><i>입고 후 지점에서 수리한 내역이 있는 차량</i></span></span>   </span>
                                                    </li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;"
                                                        class="bx-clone"><a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60314040"
                                                            target="_blank"> <img
                                                            src="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60314040_001.jpg"
                                                            data-original="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60314040_001.jpg"
                                                            class="lazy" width="280" height="187" alt="car"
                                                            style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60314040"
                                                            target="_blank"> <span
                                                            class="model">인피니티 G25<br>세단 스마트</span> </a> <span
                                                            class="year">13년 08월식 &nbsp;&nbsp; 111,566km</span> <span
                                                            class="money">980만원</span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60314040&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  21만원</span></a> <span
                                                            class="mark"><span class="tip_list tip_09"><button
                                                            type="button" class="tip_btn"
                                                            onclick="openHotMarkToolTip(this);">특옵션</button> <span
                                                            class="tip_hot none"><b>특옵션<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>추가 선택 옵션 장착 혹은 최상위 등급 차량</i></span></span><span
                                                            class="tip_list tip_29"><button type="button"
                                                                                            class="tip_btn"
                                                                                            onclick="openHotMarkToolTip(this);">신차급</button> <span
                                                            class="tip_hot none"><b>신차급<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>출고 후 1년 이내 차량</i></span></span>    </span>
                                                    </li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;"
                                                        class="bx-clone"><a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60295354"
                                                            target="_blank"> <img
                                                            src="https://img.kcar.com/carpicture/carpicture09/pic6029/kcar_60295354_001.jpg"
                                                            data-original="https://img.kcar.com/carpicture/carpicture09/pic6029/kcar_60295354_001.jpg"
                                                            class="lazy" width="280" height="187" alt="car"
                                                            style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60295354"
                                                            target="_blank"> <span class="model">혼다 올뉴어코드<br>2.4</span>
                                                    </a> <span class="year">14년 09월식 &nbsp;&nbsp; 123,077km</span> <span
                                                            class="money">990만원</span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60295354&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  21만원</span></a> <span
                                                            class="mark"><span class="tip_list tip_41"><button
                                                            type="button" class="tip_btn"
                                                            onclick="openHotMarkToolTip(this);">정비OK</button> <span
                                                            class="tip_hot none"><b>정비OK<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>입고 후 지점에서 수리한 내역이 있는 차량</i></span></span>    </span>
                                                    </li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;">
                                                        <a href="/car/info/car_info_detail.do?i_sCarCd=EC60298267"
                                                           target="_blank"> <img
                                                                src="https://img.kcar.com/carpicture/carpicture09/pic6029/kcar_60298267_001.jpg"
                                                                data-original="https://img.kcar.com/carpicture/carpicture09/pic6029/kcar_60298267_001.jpg"
                                                                class="lazy" width="280" height="187" alt="car"
                                                                style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60298267"
                                                            target="_blank"> <span class="model">폭스바겐 골프 6세대<br>2.0 TDI</span>
                                                    </a> <span class="year">11년 07월식 &nbsp;&nbsp; 83,515km</span> <span
                                                            class="money">940만원</span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60298267&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  20만원</span></a> <span
                                                            class="mark"><span class="tip_list tip_19"><button
                                                            type="button" class="tip_btn"
                                                            onclick="openHotMarkToolTip(this);">짧은Km</button> <span
                                                            class="tip_hot none"><b>짧은Km<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>연 10,000km 이내 주행 차량</i></span></span>    </span>
                                                    </li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;">
                                                        <a href="/car/info/car_info_detail.do?i_sCarCd=EC60317316"
                                                           target="_blank"> <img
                                                                src="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60317316_001.jpg"
                                                                data-original="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60317316_001.jpg"
                                                                class="lazy" width="280" height="187" alt="car"
                                                                style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60317316"
                                                            target="_blank"> <span class="model">포드 뉴 토러스<br>3.5 Limited</span>
                                                    </a> <span class="year">11년 02월식 &nbsp;&nbsp; 78,642km</span> <span
                                                            class="money">750만원</span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60317316&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  16만원</span></a> <span
                                                            class="mark"><span class="tip_list tip_09"><button
                                                            type="button" class="tip_btn"
                                                            onclick="openHotMarkToolTip(this);">특옵션</button> <span
                                                            class="tip_hot none"><b>특옵션<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>추가 선택 옵션 장착 혹은 최상위 등급 차량</i></span></span><span
                                                            class="tip_list tip_10"><button type="button"
                                                                                            class="tip_btn"
                                                                                            onclick="openHotMarkToolTip(this);">1인소유</button> <span
                                                            class="tip_hot none"><b>1인소유<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>소유자 변경 이력이 없는 차량(대여 이력 및 법인 명의 차량 제외)</i></span></span><span
                                                            class="tip_list tip_22"><button type="button"
                                                                                            class="tip_btn"
                                                                                            onclick="openHotMarkToolTip(this);">세금계산서</button> <span
                                                            class="tip_hot none"><b>세금계산서<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>부가세 환급 대상 차량(경차, 승합차, 화물차)</i></span></span>    </span>
                                                    </li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;">
                                                        <a href="/car/info/car_info_detail.do?i_sCarCd=EC60263934"
                                                           target="_blank"> <img
                                                                src="https://img.kcar.com/carpicture/carpicture06/pic6026/kcar_60263934_001.jpg"
                                                                data-original="https://img.kcar.com/carpicture/carpicture06/pic6026/kcar_60263934_001.jpg"
                                                                class="lazy" width="280" height="187" alt="car"
                                                                style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60263934"
                                                            target="_blank"> <span class="model">폭스바겐 폴로<br>1.6 TDI R-Line</span>
                                                    </a> <span class="year">14년 05월식 &nbsp;&nbsp; 92,956km</span> <span
                                                            class="money">890만원 <em>980만원</em></span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60263934&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  21만원</span></a> <span
                                                            class="mark">   </span></li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;">
                                                        <a href="/car/info/car_info_detail.do?i_sCarCd=EC60318085"
                                                           target="_blank"> <img
                                                                src="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60318085_001.jpg"
                                                                data-original="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60318085_001.jpg"
                                                                class="lazy" width="280" height="187" alt="car"
                                                                style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60318085"
                                                            target="_blank"> <span
                                                            class="model">혼다 CR-V<br>2.4 4WD</span> </a> <span
                                                            class="year">07년 04월식 &nbsp;&nbsp; 131,902km</span> <span
                                                            class="money">650만원</span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60318085&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  14만원</span></a> <span
                                                            class="mark">   </span></li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;">
                                                        <a href="/car/info/car_info_detail.do?i_sCarCd=EC60319766"
                                                           target="_blank"> <img
                                                                src="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60319766_001.jpg"
                                                                data-original="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60319766_001.jpg"
                                                                class="lazy" width="280" height="187" alt="car"
                                                                style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60319766"
                                                            target="_blank"> <span
                                                            class="model">렉서스 ES350<br>슈페리어</span> </a> <span
                                                            class="year">11년 01월식 &nbsp;&nbsp; 126,133km</span> <span
                                                            class="money">990만원</span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60319766&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  21만원</span></a> <span
                                                            class="mark">   </span></li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;">
                                                        <a href="/car/info/car_info_detail.do?i_sCarCd=EC60313603"
                                                           target="_blank"> <img
                                                                src="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60313603_001.jpg"
                                                                data-original="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60313603_001.jpg"
                                                                class="lazy" width="280" height="187" alt="car"
                                                                style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60313603"
                                                            target="_blank"> <span class="model">시트로엥 DS3<br>1.4 e-HDi 시크</span>
                                                    </a> <span class="year">12년 12월식 &nbsp;&nbsp; 108,948km</span> <span
                                                            class="money">690만원</span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60313603&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  15만원</span></a> <span
                                                            class="mark"><span class="tip_list tip_10"><button
                                                            type="button" class="tip_btn"
                                                            onclick="openHotMarkToolTip(this);">1인소유</button> <span
                                                            class="tip_hot none"><b>1인소유<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>소유자 변경 이력이 없는 차량(대여 이력 및 법인 명의 차량 제외)</i></span></span><span
                                                            class="tip_list tip_43"><button type="button"
                                                                                            class="tip_btn"
                                                                                            onclick="openHotMarkToolTip(this);">브라운시트</button> <span
                                                            class="tip_hot none"><b>브라운시트<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>브라운시트 장착 차량</i></span></span>   </span>
                                                    </li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;">
                                                        <a href="/car/info/car_info_detail.do?i_sCarCd=EC60312297"
                                                           target="_blank"> <span class="markvr">3D VR</span> <span
                                                                class="markwater">K Car 워터마크</span> <img
                                                                src="https://img.kcar.com/3dcarpicture/2019/12/081/60312297_1/main/main780.jpg"
                                                                data-original="https://img.kcar.com/3dcarpicture/2019/12/081/60312297_1/main/main780.jpg"
                                                                class="lazy" width="280" height="187" alt="car"
                                                                style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60312297"
                                                            target="_blank"> <span class="model">폭스바겐 폴로<br>1.6 TDI R-Line</span>
                                                    </a> <span class="year">13년 08월식 &nbsp;&nbsp; 52,710km</span> <span
                                                            class="money">930만원</span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60312297&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  20만원</span></a> <span
                                                            class="mark"><span class="tip_list tip_10"><button
                                                            type="button" class="tip_btn"
                                                            onclick="openHotMarkToolTip(this);">1인소유</button> <span
                                                            class="tip_hot none"><b>1인소유<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>소유자 변경 이력이 없는 차량(대여 이력 및 법인 명의 차량 제외)</i></span></span><span
                                                            class="tip_list tip_19"><button type="button"
                                                                                            class="tip_btn"
                                                                                            onclick="openHotMarkToolTip(this);">짧은Km</button> <span
                                                            class="tip_hot none"><b>짧은Km<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>연 10,000km 이내 주행 차량</i></span></span>   </span>
                                                    </li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;">
                                                        <a href="/car/info/car_info_detail.do?i_sCarCd=EC60311910"
                                                           target="_blank"> <span class="markvr">3D VR</span> <span
                                                                class="markwater">K Car 워터마크</span> <img
                                                                src="https://img.kcar.com/3dcarpicture/2019/12/081/60311910_1/main/main780.jpg"
                                                                data-original="https://img.kcar.com/3dcarpicture/2019/12/081/60311910_1/main/main780.jpg"
                                                                class="lazy" width="280" height="187" alt="car"
                                                                style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60311910"
                                                            target="_blank"> <span class="model">폭스바겐 폴로<br>1.6 TDI R-Line</span>
                                                    </a> <span class="year">13년 10월식 &nbsp;&nbsp; 95,734km</span> <span
                                                            class="money">870만원</span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60311910&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  19만원</span></a> <span
                                                            class="mark"><span class="tip_list tip_41"><button
                                                            type="button" class="tip_btn"
                                                            onclick="openHotMarkToolTip(this);">정비OK</button> <span
                                                            class="tip_hot none"><b>정비OK<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>입고 후 지점에서 수리한 내역이 있는 차량</i></span></span>    </span>
                                                    </li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;">
                                                        <a href="/car/info/car_info_detail.do?i_sCarCd=EC60320579"
                                                           target="_blank"> <img
                                                                src="https://img.kcar.com/carpicture/carpicture02/pic6032/kcar_60320579_001.jpg"
                                                                data-original="https://img.kcar.com/carpicture/carpicture02/pic6032/kcar_60320579_001.jpg"
                                                                class="lazy" width="280" height="187" alt="car"
                                                                style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60320579"
                                                            target="_blank"> <span class="model">BMW 3시리즈 (E90)<br>320i 세단</span>
                                                    </a> <span class="year">09년 07월식 &nbsp;&nbsp; 101,634km</span> <span
                                                            class="money">730만원</span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60320579&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  16만원</span></a> <span
                                                            class="mark"><span class="tip_list tip_19"><button
                                                            type="button" class="tip_btn"
                                                            onclick="openHotMarkToolTip(this);">짧은Km</button> <span
                                                            class="tip_hot none"><b>짧은Km<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>연 10,000km 이내 주행 차량</i></span></span><span
                                                            class="tip_list tip_41"><button type="button"
                                                                                            class="tip_btn"
                                                                                            onclick="openHotMarkToolTip(this);">정비OK</button> <span
                                                            class="tip_hot none"><b>정비OK<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>입고 후 지점에서 수리한 내역이 있는 차량</i></span></span>   </span>
                                                    </li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;">
                                                        <a href="/car/info/car_info_detail.do?i_sCarCd=EC60309070"
                                                           target="_blank"> <img
                                                                src="https://img.kcar.com/carpicture/carpicture10/pic6030/kcar_60309070_001.jpg"
                                                                data-original="https://img.kcar.com/carpicture/carpicture10/pic6030/kcar_60309070_001.jpg"
                                                                class="lazy" width="280" height="187" alt="car"
                                                                style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60309070"
                                                            target="_blank"> <span
                                                            class="model">푸조 308SW<br>1.6 e-HDi</span> </a> <span
                                                            class="year">14년 03월식 &nbsp;&nbsp; 81,528km</span> <span
                                                            class="money">980만원</span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60309070&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  21만원</span></a> <span
                                                            class="mark"><span class="tip_list tip_10"><button
                                                            type="button" class="tip_btn"
                                                            onclick="openHotMarkToolTip(this);">1인소유</button> <span
                                                            class="tip_hot none"><b>1인소유<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>소유자 변경 이력이 없는 차량(대여 이력 및 법인 명의 차량 제외)</i></span></span>    </span>
                                                    </li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;">
                                                        <a href="/car/info/car_info_detail.do?i_sCarCd=EC60298070"
                                                           target="_blank"> <img
                                                                src="https://img.kcar.com/carpicture/carpicture09/pic6029/kcar_60298070_001.jpg"
                                                                data-original="https://img.kcar.com/carpicture/carpicture09/pic6029/kcar_60298070_001.jpg"
                                                                class="lazy" width="280" height="187" alt="car"
                                                                style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60298070"
                                                            target="_blank"> <span class="model">폭스바겐 골프 6세대<br>2.0 TDI</span>
                                                    </a> <span class="year">12년 11월식(13년형) &nbsp;&nbsp; 97,846km</span>
                                                        <span class="money">990만원</span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60298070&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  21만원</span></a> <span
                                                            class="mark"><span class="tip_list tip_10"><button
                                                            type="button" class="tip_btn"
                                                            onclick="openHotMarkToolTip(this);">1인소유</button> <span
                                                            class="tip_hot none"><b>1인소유<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>소유자 변경 이력이 없는 차량(대여 이력 및 법인 명의 차량 제외)</i></span></span>    </span>
                                                    </li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;">
                                                        <a href="/car/info/car_info_detail.do?i_sCarCd=EC60283282"
                                                           target="_blank"> <img
                                                                src="https://img.kcar.com/carpicture/carpicture08/pic6028/kcar_60283282_001.jpg"
                                                                data-original="https://img.kcar.com/carpicture/carpicture08/pic6028/kcar_60283282_001.jpg"
                                                                class="lazy" width="280" height="187" alt="car"
                                                                style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60283282"
                                                            target="_blank"> <span class="model">폭스바겐 골프 6세대<br>2.0 TDI</span>
                                                    </a> <span class="year">12년 01월식 &nbsp;&nbsp; 134,863km</span> <span
                                                            class="money">800만원</span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60283282&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  17만원</span></a> <span
                                                            class="mark">   </span></li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;">
                                                        <a href="/car/info/car_info_detail.do?i_sCarCd=EC60313995"
                                                           target="_blank"> <span class="markvr">3D VR</span> <span
                                                                class="markwater">K Car 워터마크</span> <img
                                                                src="https://img.kcar.com/3dcarpicture/2019/12/140/60313995_1/main/main780.jpg"
                                                                data-original="https://img.kcar.com/3dcarpicture/2019/12/140/60313995_1/main/main780.jpg"
                                                                class="lazy" width="280" height="187" alt="car"
                                                                style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60313995"
                                                            target="_blank"> <span class="model">폭스바겐 골프 6세대<br>1.4 TSI</span>
                                                    </a> <span class="year">12년 08월식 &nbsp;&nbsp; 72,347km</span> <span
                                                            class="money">990만원</span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60313995&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  21만원</span></a> <span
                                                            class="mark">   </span></li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;">
                                                        <a href="/car/info/car_info_detail.do?i_sCarCd=EC60306896"
                                                           target="_blank"> <img
                                                                src="https://img.kcar.com/carpicture/carpicture10/pic6030/kcar_60306896_001.jpg"
                                                                data-original="https://img.kcar.com/carpicture/carpicture10/pic6030/kcar_60306896_001.jpg"
                                                                class="lazy" width="280" height="187" alt="car"
                                                                style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60306896"
                                                            target="_blank"> <span class="model">푸조 208<br>1.4 e-HDi 에코 5도어</span>
                                                    </a> <span class="year">15년 10월식(16년형) &nbsp;&nbsp; 44,431km</span>
                                                        <span class="money">950만원</span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60306896&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  20만원</span></a> <span
                                                            class="mark"><span class="tip_list tip_10"><button
                                                            type="button" class="tip_btn"
                                                            onclick="openHotMarkToolTip(this);">1인소유</button> <span
                                                            class="tip_hot none"><b>1인소유<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>소유자 변경 이력이 없는 차량(대여 이력 및 법인 명의 차량 제외)</i></span></span><span
                                                            class="tip_list tip_19"><button type="button"
                                                                                            class="tip_btn"
                                                                                            onclick="openHotMarkToolTip(this);">짧은Km</button> <span
                                                            class="tip_hot none"><b>짧은Km<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>연 10,000km 이내 주행 차량</i></span></span><span
                                                            class="tip_list tip_30"><button type="button"
                                                                                            class="tip_btn"
                                                                                            onclick="openHotMarkToolTip(this);">보험이력無</button> <span
                                                            class="tip_hot none"><b>보험이력無<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>정보 조회일자 기준 보험이력이 없는 차량</i></span></span>   </span>
                                                    </li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;">
                                                        <a href="/car/info/car_info_detail.do?i_sCarCd=EC60318548"
                                                           target="_blank"> <img
                                                                src="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60318548_001.jpg"
                                                                data-original="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60318548_001.jpg"
                                                                class="lazy" width="280" height="187" alt="car"
                                                                style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60318548"
                                                            target="_blank"> <span class="model">폭스바겐 골프 6세대<br>2.0 TDI</span>
                                                    </a> <span class="year">10년 05월식 &nbsp;&nbsp; 62,238km</span> <span
                                                            class="money">990만원</span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60318548&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  21만원</span></a> <span
                                                            class="mark"><span class="tip_list tip_10"><button
                                                            type="button" class="tip_btn"
                                                            onclick="openHotMarkToolTip(this);">1인소유</button> <span
                                                            class="tip_hot none"><b>1인소유<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>소유자 변경 이력이 없는 차량(대여 이력 및 법인 명의 차량 제외)</i></span></span><span
                                                            class="tip_list tip_19"><button type="button"
                                                                                            class="tip_btn"
                                                                                            onclick="openHotMarkToolTip(this);">짧은Km</button> <span
                                                            class="tip_hot none"><b>짧은Km<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>연 10,000km 이내 주행 차량</i></span></span><span
                                                            class="tip_list tip_22"><button type="button"
                                                                                            class="tip_btn"
                                                                                            onclick="openHotMarkToolTip(this);">세금계산서</button> <span
                                                            class="tip_hot none"><b>세금계산서<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>부가세 환급 대상 차량(경차, 승합차, 화물차)</i></span></span>   </span>
                                                    </li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;">
                                                        <a href="/car/info/car_info_detail.do?i_sCarCd=EC60313520"
                                                           target="_blank"> <img
                                                                src="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60313520_001.jpg"
                                                                data-original="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60313520_001.jpg"
                                                                class="lazy" width="280" height="187" alt="car"
                                                                style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60313520"
                                                            target="_blank"> <span class="model">폭스바겐 폴로<br>1.6 TDI R-Line</span>
                                                    </a> <span class="year">13년 07월식 &nbsp;&nbsp; 82,300km</span> <span
                                                            class="money">890만원</span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60313520&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  19만원</span></a> <span
                                                            class="mark"><span class="tip_list tip_10"><button
                                                            type="button" class="tip_btn"
                                                            onclick="openHotMarkToolTip(this);">1인소유</button> <span
                                                            class="tip_hot none"><b>1인소유<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>소유자 변경 이력이 없는 차량(대여 이력 및 법인 명의 차량 제외)</i></span></span><span
                                                            class="tip_list tip_19"><button type="button"
                                                                                            class="tip_btn"
                                                                                            onclick="openHotMarkToolTip(this);">짧은Km</button> <span
                                                            class="tip_hot none"><b>짧은Km<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>연 10,000km 이내 주행 차량</i></span></span>   </span>
                                                    </li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;">
                                                        <a href="/car/info/car_info_detail.do?i_sCarCd=EC60310068"
                                                           target="_blank"> <img
                                                                src="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60310068_001.jpg"
                                                                data-original="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60310068_001.jpg"
                                                                class="lazy" width="280" height="187" alt="car"
                                                                style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60310068"
                                                            target="_blank"> <span
                                                            class="model">폭스바겐 뉴 제타<br>2.0 TDI</span> </a> <span
                                                            class="year">13년 08월식 &nbsp;&nbsp; 87,737km</span> <span
                                                            class="money">960만원</span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60310068&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  21만원</span></a> <span
                                                            class="mark"><span class="tip_list tip_10"><button
                                                            type="button" class="tip_btn"
                                                            onclick="openHotMarkToolTip(this);">1인소유</button> <span
                                                            class="tip_hot none"><b>1인소유<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>소유자 변경 이력이 없는 차량(대여 이력 및 법인 명의 차량 제외)</i></span></span><span
                                                            class="tip_list tip_19"><button type="button"
                                                                                            class="tip_btn"
                                                                                            onclick="openHotMarkToolTip(this);">짧은Km</button> <span
                                                            class="tip_hot none"><b>짧은Km<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>연 10,000km 이내 주행 차량</i></span></span>   </span>
                                                    </li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;">
                                                        <a href="/car/info/car_info_detail.do?i_sCarCd=EC60317016"
                                                           target="_blank"> <img
                                                                src="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60317016_001.jpg"
                                                                data-original="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60317016_001.jpg"
                                                                class="lazy" width="280" height="187" alt="car"
                                                                style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60317016"
                                                            target="_blank"> <span class="model">시트로엥 DS3<br>1.4 e-HDi 시크</span>
                                                    </a> <span class="year">12년 09월식(13년형) &nbsp;&nbsp; 70,829km</span>
                                                        <span class="money">830만원</span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60317016&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  18만원</span></a> <span
                                                            class="mark"><span class="tip_list tip_19"><button
                                                            type="button" class="tip_btn"
                                                            onclick="openHotMarkToolTip(this);">짧은Km</button> <span
                                                            class="tip_hot none"><b>짧은Km<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>연 10,000km 이내 주행 차량</i></span></span><span
                                                            class="tip_list tip_41"><button type="button"
                                                                                            class="tip_btn"
                                                                                            onclick="openHotMarkToolTip(this);">정비OK</button> <span
                                                            class="tip_hot none"><b>정비OK<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>입고 후 지점에서 수리한 내역이 있는 차량</i></span></span>   </span>
                                                    </li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;">
                                                        <a href="/car/info/car_info_detail.do?i_sCarCd=EC60314040"
                                                           target="_blank"> <img
                                                                src="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60314040_001.jpg"
                                                                data-original="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60314040_001.jpg"
                                                                class="lazy" width="280" height="187" alt="car"
                                                                style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60314040"
                                                            target="_blank"> <span
                                                            class="model">인피니티 G25<br>세단 스마트</span> </a> <span
                                                            class="year">13년 08월식 &nbsp;&nbsp; 111,566km</span> <span
                                                            class="money">980만원</span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60314040&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  21만원</span></a> <span
                                                            class="mark"><span class="tip_list tip_09"><button
                                                            type="button" class="tip_btn"
                                                            onclick="openHotMarkToolTip(this);">특옵션</button> <span
                                                            class="tip_hot none"><b>특옵션<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>추가 선택 옵션 장착 혹은 최상위 등급 차량</i></span></span><span
                                                            class="tip_list tip_29"><button type="button"
                                                                                            class="tip_btn"
                                                                                            onclick="openHotMarkToolTip(this);">신차급</button> <span
                                                            class="tip_hot none"><b>신차급<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>출고 후 1년 이내 차량</i></span></span>    </span>
                                                    </li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;">
                                                        <a href="/car/info/car_info_detail.do?i_sCarCd=EC60295354"
                                                           target="_blank"> <img
                                                                src="https://img.kcar.com/carpicture/carpicture09/pic6029/kcar_60295354_001.jpg"
                                                                data-original="https://img.kcar.com/carpicture/carpicture09/pic6029/kcar_60295354_001.jpg"
                                                                class="lazy" width="280" height="187" alt="car"
                                                                style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60295354"
                                                            target="_blank"> <span class="model">혼다 올뉴어코드<br>2.4</span>
                                                    </a> <span class="year">14년 09월식 &nbsp;&nbsp; 123,077km</span> <span
                                                            class="money">990만원</span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60295354&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  21만원</span></a> <span
                                                            class="mark"><span class="tip_list tip_41"><button
                                                            type="button" class="tip_btn"
                                                            onclick="openHotMarkToolTip(this);">정비OK</button> <span
                                                            class="tip_hot none"><b>정비OK<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>입고 후 지점에서 수리한 내역이 있는 차량</i></span></span>    </span>
                                                    </li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;"
                                                        class="bx-clone"><a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60298267"
                                                            target="_blank"> <img
                                                            src="https://img.kcar.com/carpicture/carpicture09/pic6029/kcar_60298267_001.jpg"
                                                            data-original="https://img.kcar.com/carpicture/carpicture09/pic6029/kcar_60298267_001.jpg"
                                                            class="lazy" width="280" height="187" alt="car"
                                                            style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60298267"
                                                            target="_blank"> <span class="model">폭스바겐 골프 6세대<br>2.0 TDI</span>
                                                    </a> <span class="year">11년 07월식 &nbsp;&nbsp; 83,515km</span> <span
                                                            class="money">940만원</span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60298267&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  20만원</span></a> <span
                                                            class="mark"><span class="tip_list tip_19"><button
                                                            type="button" class="tip_btn"
                                                            onclick="openHotMarkToolTip(this);">짧은Km</button> <span
                                                            class="tip_hot none"><b>짧은Km<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>연 10,000km 이내 주행 차량</i></span></span>    </span>
                                                    </li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;"
                                                        class="bx-clone"><a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60317316"
                                                            target="_blank"> <img
                                                            src="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60317316_001.jpg"
                                                            data-original="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60317316_001.jpg"
                                                            class="lazy" width="280" height="187" alt="car"
                                                            style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60317316"
                                                            target="_blank"> <span class="model">포드 뉴 토러스<br>3.5 Limited</span>
                                                    </a> <span class="year">11년 02월식 &nbsp;&nbsp; 78,642km</span> <span
                                                            class="money">750만원</span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60317316&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  16만원</span></a> <span
                                                            class="mark"><span class="tip_list tip_09"><button
                                                            type="button" class="tip_btn"
                                                            onclick="openHotMarkToolTip(this);">특옵션</button> <span
                                                            class="tip_hot none"><b>특옵션<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>추가 선택 옵션 장착 혹은 최상위 등급 차량</i></span></span><span
                                                            class="tip_list tip_10"><button type="button"
                                                                                            class="tip_btn"
                                                                                            onclick="openHotMarkToolTip(this);">1인소유</button> <span
                                                            class="tip_hot none"><b>1인소유<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>소유자 변경 이력이 없는 차량(대여 이력 및 법인 명의 차량 제외)</i></span></span><span
                                                            class="tip_list tip_22"><button type="button"
                                                                                            class="tip_btn"
                                                                                            onclick="openHotMarkToolTip(this);">세금계산서</button> <span
                                                            class="tip_hot none"><b>세금계산서<a
                                                            href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>부가세 환급 대상 차량(경차, 승합차, 화물차)</i></span></span>    </span>
                                                    </li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;"
                                                        class="bx-clone"><a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60263934"
                                                            target="_blank"> <img
                                                            src="https://img.kcar.com/carpicture/carpicture06/pic6026/kcar_60263934_001.jpg"
                                                            data-original="https://img.kcar.com/carpicture/carpicture06/pic6026/kcar_60263934_001.jpg"
                                                            class="lazy" width="280" height="187" alt="car"
                                                            style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60263934"
                                                            target="_blank"> <span class="model">폭스바겐 폴로<br>1.6 TDI R-Line</span>
                                                    </a> <span class="year">14년 05월식 &nbsp;&nbsp; 92,956km</span> <span
                                                            class="money">890만원 <em>980만원</em></span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60263934&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  21만원</span></a> <span
                                                            class="mark">   </span></li>
                                                    <li style="float: left; list-style: none; position: relative; width: 279.5px; margin-right: 18px;"
                                                        class="bx-clone"><a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60318085"
                                                            target="_blank"> <img
                                                            src="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60318085_001.jpg"
                                                            data-original="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60318085_001.jpg"
                                                            class="lazy" width="280" height="187" alt="car"
                                                            style="display: inline;"> </a> <a
                                                            href="/car/info/car_info_detail.do?i_sCarCd=EC60318085"
                                                            target="_blank"> <span
                                                            class="model">혼다 CR-V<br>2.4 4WD</span> </a> <span
                                                            class="year">07년 04월식 &nbsp;&nbsp; 131,902km</span> <span
                                                            class="money">650만원</span> <a
                                                            href="javascript:mainEvent.fnWindowPop('keep_pop','630','650','installment','yes', 'i_sCarCd=EC60318085&amp;maketing=car_keep_pop1')"><span
                                                            class="monthly">월할부금  14만원</span></a> <span
                                                            class="mark">   </span></li>
                                                </ul>
                                            </div>
                                            <div class="bx-controls bx-has-pager bx-has-controls-direction">
                                                <div class="bx-pager bx-default-pager">
                                                    <div class="bx-pager-item"><a href="" data-slide-index="0"
                                                                                  class="bx-pager-link active">1</a>
                                                    </div>
                                                    <div class="bx-pager-item"><a href="" data-slide-index="1"
                                                                                  class="bx-pager-link">2</a></div>
                                                    <div class="bx-pager-item"><a href="" data-slide-index="2"
                                                                                  class="bx-pager-link">3</a></div>
                                                    <div class="bx-pager-item"><a href="" data-slide-index="3"
                                                                                  class="bx-pager-link">4</a></div>
                                                    <div class="bx-pager-item"><a href="" data-slide-index="4"
                                                                                  class="bx-pager-link">5</a></div>
                                                </div>
                                                <div class="bx-controls-direction"><a class="bx-prev" href="">Prev</a><a
                                                        class="bx-next" href="">Next</a></div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    </div>
</template>
<script>
    export default {
        data(){
            return{
                searchKeyWord : '',
                keyWord1 : '제조사를 선택하세요',
                keyWord2 : '모델을 선택하세요',
                keyWord3 : '세부모델을 선택하세요',
                resultCount : 0,
                minPrice : '최저가격을 선택하세요',
                maxPrice : '최고가격을 선택하세요',
                searchCondition : []
            }
        },
        methods : {
            goSearch(){},
            wantModel(){
                const divTabWant1 = document.getElementById("divTabWant1")
                const divTabWant2 = document.getElementById("divTabWant2")
                const tab1 = document.getElementById("tab1")
                const tab2 = document.getElementById("tab2")
                tab1.className = "on"
                tab2.className = ""
                divTabWant1.style.display = "block"
                divTabWant2.style.display = "none"
                this.korCar(`korCar`,`impCar`)
            },
            haveBudget(){
                const divTabWant1 = document.getElementById("divTabWant1")
                const divTabWant2 = document.getElementById("divTabWant2")
                const tab1 = document.getElementById("tab1")
                const tab2 = document.getElementById("tab2")
                tab1.className = ""
                tab2.className = "on"
                divTabWant1.style.display = "none"
                divTabWant2.style.display = "block"
                this.korCar(`korCar2`,`impCar2`)
            },
            searchBoxOn(){
                const searchBox = document.getElementById("searchBox")
                searchBox.style.display = "block"
            },
            searchBoxOff(BoxID){
                const searchBox = document.getElementById(BoxID)
                searchBox.style.display = "none"
            },
            stringMatchOn(){
                const stringMatch = document.getElementById("stringMatch")
                const searchBox = document.getElementById("searchBox")
                if(this.searchKeyWord != "") {
                    searchBox.style.display = "none"
                    stringMatch.style.display = "block"
                }else{
                    stringMatch.style.display = "none"
                    searchBox.style.display = "block"
                }
            },
            korCar(korCarID, impCarID){
                const korCar = document.getElementById(korCarID)
                const impCar = document.getElementById(impCarID)
                korCar.className = "on"
                impCar.className = ""
                this.$store.dispatch('cmm/getCategory1',{'param':'KOR','column':'CAR_TYPE'})
                this.keyWord1 = '제조사를 선택하세요',
                this.keyWord2 = '모델을 선택하세요'
                this.keyWord3 = '세부모델을 선택하세요'
                this.resultCount = 0
            },
            impCar(korCarID, impCarID, category1ID){
                const korCar = document.getElementById(korCarID)
                const impCar = document.getElementById(impCarID)
                const category1 = document.getElementById(category1ID)
                korCar.className = ""
                impCar.className = "on"
                category1.style.width = "220px"
                category1.style.height = "300px"
                this.$store.dispatch('cmm/getCategory1',{'param':'IMP','column':'CAR_TYPE'})
                this.keyWord1 = '제조사를 선택하세요',
                this.keyWord2 = '모델을 선택하세요'
                this.keyWord3 = '세부모델을 선택하세요'
                this.resultCount = 0
            },
            searchKeyClick(searchKeyID){
                const searchKey = document.getElementById(searchKeyID)
                const cate2 = document.getElementById('category2')
                if(searchKey.className === "selectric-wrapper selectric-selectric selectric-below selectric-hover"){
                    for (let elementsByClassNameElement of document.getElementsByClassName("selectric-wrapper selectric-selectric selectric-below selectric-hover selectric-open selectric-focus")) {
                        elementsByClassNameElement.className = "selectric-wrapper selectric-selectric selectric-below selectric-hover"
                    }
                    searchKey.className = "selectric-wrapper selectric-selectric selectric-below selectric-hover selectric-open selectric-focus"
                }else{
                    searchKey.className = "selectric-wrapper selectric-selectric selectric-below selectric-hover"
                }
                if(this.$store.state.cmm.category2.length>=10) {
                    cate2.style.width = "220px"
                    cate2.style.height = "300px"
                }{
                    cate2.style.width = ""
                    cate2.style.height = ""
                }
            },
            setCategory2(keyWord1, resultCount){
                this.keyWord2 = '모델을 선택하세요'
                this.keyWord3 = '세부모델을 선택하세요'
                this.keyWord1 = keyWord1
                this.resultCount = resultCount
                this.$store.dispatch('cmm/getCategory2',{'param':this.keyWord1,'column':'MAKENM'})
            },
            setCategory3(keyWord2, resultCount){
                this.keyWord3 = '세부모델을 선택하세요'
                this.keyWord2 = keyWord2
                this.resultCount = resultCount
                this.$store.dispatch('cmm/getCategory3',{'param':this.keyWord2,'column':'MODEL_GRP_NM'})
            },
            setKeyWord3(keyWord3, resultCount){
                this.keyWord3 = keyWord3
                this.resultCount = resultCount
            },
            setMinPrice(minPrice){
                this.minPrice = minPrice
            },
            setMaxPrice(maxPrice){
                if(parseInt(this.minPrice)<=parseInt(maxPrice.replace(`만원`,''))){
                    this.maxPrice = maxPrice
                }else{
                    alert(`최저가격보다 높게 선택해주세요.`)
                }

            },
            goSearchWithCondition(){

            }
        },
        computed : {
            prices : function(){
                let list = []
                for(let i=1;i<=100;i++){
                    list.push({index : i, name : `${i*100}만원`})
                }
                return list
            }
        },
        created(){
            this.$store.dispatch('cmm/getCategory1',{'param':'KOR','column':'CAR_TYPE'})
            this.$store.dispatch('cmm/init')
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