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
                            <a href="" id="resetBtn" class="reset">초기화</a>
                        </div>
                        <div class="quick_search">
                            <div class="ip_field">
                                <input type="text" name="quickSearch" id="quickSearch" placeholder="모델명 입력 예시) 아반떼 MD"
                                       autocomplete="off">
                                <label for="quickSearch">검색아이콘</label>
                                <ul class="drop_box"></ul>
                            </div>
                        </div>
                        <div class="sel_field">
                            <a href="" class="on" data-init="true">전체</a>
                            <a href="" class="">국산차</a>
                            <a href="" class="">수입차</a>
                            <input id="carTypeInput" type="hidden" name="v_car_type" value="">
                        </div>
                        <ul class="search_list_wrap">
                            <li class="list_h list_h01 ">
                                <a href="" class="type" data-beusable-tracking="">차종 <small></small></a>
                                <div class="sub_type_list" style="">
                                    <ul class="row_list">
                                        <li v-for="(categorycd, categorycd_i) of wr_in_v_categorycd"
                                            :key="categorycd.value">
                                            <div class="checker" :id="categorycd.div_id"><span><input type="checkbox"
                                                                                                      name="wr_in_v_categorycd"
                                                                                                      :id="categorycd.categorly_id"
                                                                                                      class="uniform"
                                                                                                      :v-bind="categorycd.value"></span>
                                            </div>
                                            <label :for="categorycd.categorly_id">{{categorycd_i}}{{categorycd.text}}</label>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                            <li class="list_h list_h02 on">
                                <a href="" class="type" data-beusable-tracking=""
                                   @click="menu_folding">제조사/모델<small></small></a>
                                <div class="sub_type_list sub_type_tree" style="display:block" data-init="true">
                                    <div class="scroll-wrapper scrollbar-dynamic" style="position: relative;">
                                        <div id="makerFrame"
                                             class="scrollbar-dynamic scroll-content scroll-sscrolly_visible"
                                             style="height: auto; margin-bottom: 0px; margin-right: 0px; max-height: 229px;">
                                            <ul class="tree" style="display: block;">
                                                <li id="false"
                                                    v-for="car_company of makerList" :key="car_company.value">
                                                    <div class="row false">
            <span class="txt"><div class="checker" id="uniform-v_makecd">
            <span :class="{checked:car_company.checked}" @click="check(car_company)" >
                <input type="checkbox" id="v_makecd0" name="v_makecd" class="uniform maker"
                        ></span></div>
            <label for="v_makecd0">{{car_company.company_nm}}</label></span><span class="count">{{car_company.product_count}}
            </span>
                                                    </div>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li class="list_h list_h05 on">
                                <a href="" class="type"
                                   data-beusable-tracking="">연식<small></small></a>
                                <div class="sub_type_list" style="display:block" data-init="true">
                                    <div class="selectric-wrapper selectric-selectric">
                                        <div class="selectric-hide-select"><select name="wr_gt_v_mfr_date"
                                                                                   id="modelYear01" class="selectric"
                                                                                   data-unit="년" data-bro="mfr"
                                                                                   data-beusable-tracking=""
                                                                                   tabindex="-1">
                                            <option value="">최소</option>
                                            <option value="2019">2019년</option>
                                            <option value="2018">2018년</option>
                                            <option value="2017">2017년</option>
                                            <option value="2016">2016년</option>
                                            <option value="2015">2015년</option>
                                            <option value="2014">2014년</option>
                                            <option value="2013">2013년</option>
                                            <option value="2012">2012년</option>
                                            <option value="2011">2011년</option>
                                            <option value="2010">2010년</option>
                                            <option value="2009">2009년</option>
                                            <option value="2008">2008년</option>
                                            <option value="2007">2007년</option>
                                            <option value="2006">2006년</option>
                                            <option value="2005">2005년</option>
                                            <option value="2004">2004년</option>
                                            <option value="2003">2003년</option>
                                            <option value="2002">2002년</option>
                                            <option value="2001">2001년</option>
                                            <option value="2000">2000년</option>
                                            <option value="1999">1999년</option>
                                            <option value="1998">1998년</option>
                                            <option value="1997">1997년</option>
                                            <option value="1996">1996년</option>
                                            <option value="1995">1995년</option>
                                            <option value="1994">1994년</option>
                                            <option value="1993">1993년</option>
                                            <option value="1992">1992년</option>
                                            <option value="1991">1991년</option>
                                            <option value="1990">1990년</option>
                                            <option value="1989">1989년</option>
                                            <option value="1988">1988년</option>
                                            <option value="1987">1987년</option>
                                            <option value="1986">1986년</option>
                                            <option value="1985">1985년</option>
                                            <option value="1984">1984년</option>
                                            <option value="1983">1983년</option>
                                            <option value="1982">1982년</option>
                                            <option value="1981">1981년</option>
                                            <option value="1980">1980년</option>
                                        </select></div>
                                        <div class="selectric"><span class="label" data-beusable-tracking="">최소</span><b
                                                class="button">▾</b></div>
                                        <div class="selectric-items" tabindex="-1">
                                            <div class="selectric-scroll">
                                                <ul>
                                                    <li data-index="0" class="selected">최소</li>
                                                    <li data-index="1" class="">2019년</li>
                                                    <li data-index="2" class="">2018년</li>
                                                    <li data-index="3" class="">2017년</li>
                                                    <li data-index="4" class="">2016년</li>
                                                    <li data-index="5" class="">2015년</li>
                                                    <li data-index="6" class="">2014년</li>
                                                    <li data-index="7" class="">2013년</li>
                                                    <li data-index="8" class="">2012년</li>
                                                    <li data-index="9" class="">2011년</li>
                                                    <li data-index="10" class="">2010년</li>
                                                    <li data-index="11" class="">2009년</li>
                                                    <li data-index="12" class="">2008년</li>
                                                    <li data-index="13" class="">2007년</li>
                                                    <li data-index="14" class="">2006년</li>
                                                    <li data-index="15" class="">2005년</li>
                                                    <li data-index="16" class="">2004년</li>
                                                    <li data-index="17" class="">2003년</li>
                                                    <li data-index="18" class="">2002년</li>
                                                    <li data-index="19" class="">2001년</li>
                                                    <li data-index="20" class="">2000년</li>
                                                    <li data-index="21" class="">1999년</li>
                                                    <li data-index="22" class="">1998년</li>
                                                    <li data-index="23" class="">1997년</li>
                                                    <li data-index="24" class="">1996년</li>
                                                    <li data-index="25" class="">1995년</li>
                                                    <li data-index="26" class="">1994년</li>
                                                    <li data-index="27" class="">1993년</li>
                                                    <li data-index="28" class="">1992년</li>
                                                    <li data-index="29" class="">1991년</li>
                                                    <li data-index="30" class="">1990년</li>
                                                    <li data-index="31" class="">1989년</li>
                                                    <li data-index="32" class="">1988년</li>
                                                    <li data-index="33" class="">1987년</li>
                                                    <li data-index="34" class="">1986년</li>
                                                    <li data-index="35" class="">1985년</li>
                                                    <li data-index="36" class="">1984년</li>
                                                    <li data-index="37" class="">1983년</li>
                                                    <li data-index="38" class="">1982년</li>
                                                    <li data-index="39" class="">1981년</li>
                                                    <li data-index="40" class="last">1980년</li>
                                                </ul>
                                            </div>
                                        </div>
                                        <input class="selectric-input" tabindex="0"></div>
                                    <span class="wave">~</span>
                                    <div class="selectric-wrapper selectric-selectric">
                                        <div class="selectric-hide-select"><select name="wr_lt_v_mfr_date"
                                                                                   id="modelYear02" class="selectric"
                                                                                   data-unit="년" data-bro="mfr"
                                                                                   data-beusable-tracking=""
                                                                                   tabindex="-1">
                                            <option value="">최대</option>
                                            <option value="2019">2019년</option>
                                            <option value="2018">2018년</option>
                                            <option value="2017">2017년</option>
                                            <option value="2016">2016년</option>
                                            <option value="2015">2015년</option>
                                            <option value="2014">2014년</option>
                                            <option value="2013">2013년</option>
                                            <option value="2012">2012년</option>
                                            <option value="2011">2011년</option>
                                            <option value="2010">2010년</option>
                                            <option value="2009">2009년</option>
                                            <option value="2008">2008년</option>
                                            <option value="2007">2007년</option>
                                            <option value="2006">2006년</option>
                                            <option value="2005">2005년</option>
                                            <option value="2004">2004년</option>
                                            <option value="2003">2003년</option>
                                            <option value="2002">2002년</option>
                                            <option value="2001">2001년</option>
                                            <option value="2000">2000년</option>
                                            <option value="1999">1999년</option>
                                            <option value="1998">1998년</option>
                                            <option value="1997">1997년</option>
                                            <option value="1996">1996년</option>
                                            <option value="1995">1995년</option>
                                            <option value="1994">1994년</option>
                                            <option value="1993">1993년</option>
                                            <option value="1992">1992년</option>
                                            <option value="1991">1991년</option>
                                            <option value="1990">1990년</option>
                                            <option value="1989">1989년</option>
                                            <option value="1988">1988년</option>
                                            <option value="1987">1987년</option>
                                            <option value="1986">1986년</option>
                                            <option value="1985">1985년</option>
                                            <option value="1984">1984년</option>
                                            <option value="1983">1983년</option>
                                            <option value="1982">1982년</option>
                                            <option value="1981">1981년</option>
                                            <option value="1980">1980년</option>
                                        </select></div>
                                        <div class="selectric"><span class="label" data-beusable-tracking="">최대</span><b
                                                class="button">▾</b></div>
                                        <div class="selectric-items" tabindex="-1">
                                            <div class="selectric-scroll">
                                                <ul>
                                                    <li data-index="0" class="selected">최대</li>
                                                    <li data-index="1" class="">2019년</li>
                                                    <li data-index="2" class="">2018년</li>
                                                    <li data-index="3" class="">2017년</li>
                                                    <li data-index="4" class="">2016년</li>
                                                    <li data-index="5" class="">2015년</li>
                                                    <li data-index="6" class="">2014년</li>
                                                    <li data-index="7" class="">2013년</li>
                                                    <li data-index="8" class="">2012년</li>
                                                    <li data-index="9" class="">2011년</li>
                                                    <li data-index="10" class="">2010년</li>
                                                    <li data-index="11" class="">2009년</li>
                                                    <li data-index="12" class="">2008년</li>
                                                    <li data-index="13" class="">2007년</li>
                                                    <li data-index="14" class="">2006년</li>
                                                    <li data-index="15" class="">2005년</li>
                                                    <li data-index="16" class="">2004년</li>
                                                    <li data-index="17" class="">2003년</li>
                                                    <li data-index="18" class="">2002년</li>
                                                    <li data-index="19" class="">2001년</li>
                                                    <li data-index="20" class="">2000년</li>
                                                    <li data-index="21" class="">1999년</li>
                                                    <li data-index="22" class="">1998년</li>
                                                    <li data-index="23" class="">1997년</li>
                                                    <li data-index="24" class="">1996년</li>
                                                    <li data-index="25" class="">1995년</li>
                                                    <li data-index="26" class="">1994년</li>
                                                    <li data-index="27" class="">1993년</li>
                                                    <li data-index="28" class="">1992년</li>
                                                    <li data-index="29" class="">1991년</li>
                                                    <li data-index="30" class="">1990년</li>
                                                    <li data-index="31" class="">1989년</li>
                                                    <li data-index="32" class="">1988년</li>
                                                    <li data-index="33" class="">1987년</li>
                                                    <li data-index="34" class="">1986년</li>
                                                    <li data-index="35" class="">1985년</li>
                                                    <li data-index="36" class="">1984년</li>
                                                    <li data-index="37" class="">1983년</li>
                                                    <li data-index="38" class="">1982년</li>
                                                    <li data-index="39" class="">1981년</li>
                                                    <li data-index="40" class="last">1980년</li>
                                                </ul>
                                            </div>
                                        </div>
                                        <input class="selectric-input" tabindex="0"></div>
                                </div>
                            </li>
                            <li class="list_h list_h04 on">
                                <a href="" class="type" data-beusable-tracking="">주행거리<small></small></a>
                                <div class="sub_type_list" style="display:block" data-init="true">
                                    <div class="selectric-wrapper selectric-selectric">
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
                                            <option value="40000">40,000km</option>
                                            <option value="50000">50,000km</option>
                                            <option value="60000">60,000km</option>
                                            <option value="70000">70,000km</option>
                                            <option value="80000">80,000km</option>
                                            <option value="90000">90,000km</option>
                                            <option value="100000">100,000km</option>
                                            <option value="110000">110,000km</option>
                                            <option value="120000">120,000km</option>
                                            <option value="130000">130,000km</option>
                                            <option value="140000">140,000km</option>
                                            <option value="150000">150,000km</option>
                                            <option value="160000">160,000km</option>
                                            <option value="170000">170,000km</option>
                                            <option value="180000">180,000km</option>
                                            <option value="190000">190,000km</option>
                                            <option value="200000">200,000km</option>
                                        </select></div>
                                        <div class="selectric"><span class="label" data-beusable-tracking="">최소</span><b
                                                class="button">▾</b></div>
                                        <div class="selectric-items" tabindex="-1">
                                            <div class="selectric-scroll">
                                                <ul>
                                                    <li data-index="0" class="selected">최소</li>
                                                    <li data-index="1" class="">10,000km</li>
                                                    <li data-index="2" class="">20,000km</li>
                                                    <li data-index="3" class="">30,000km</li>
                                                    <li data-index="4" class="">40,000km</li>
                                                    <li data-index="5" class="">50,000km</li>
                                                    <li data-index="6" class="">60,000km</li>
                                                    <li data-index="7" class="">70,000km</li>
                                                    <li data-index="8" class="">80,000km</li>
                                                    <li data-index="9" class="">90,000km</li>
                                                    <li data-index="10" class="">100,000km</li>
                                                    <li data-index="11" class="">110,000km</li>
                                                    <li data-index="12" class="">120,000km</li>
                                                    <li data-index="13" class="">130,000km</li>
                                                    <li data-index="14" class="">140,000km</li>
                                                    <li data-index="15" class="">150,000km</li>
                                                    <li data-index="16" class="">160,000km</li>
                                                    <li data-index="17" class="">170,000km</li>
                                                    <li data-index="18" class="">180,000km</li>
                                                    <li data-index="19" class="">190,000km</li>
                                                    <li data-index="20" class="last">200,000km</li>
                                                </ul>
                                            </div>
                                        </div>
                                        <input class="selectric-input" tabindex="0"></div>
                                    <span class="wave">~</span>
                                    <div class="selectric-wrapper selectric-selectric">
                                        <div class="selectric-hide-select"><select name="wr_lt_n_mileage"
                                                                                   id="distance02" class="selectric"
                                                                                   data-unit="km" data-bro="mileage"
                                                                                   data-comma="comma"
                                                                                   data-beusable-tracking=""
                                                                                   tabindex="-1">
                                            <option value="">최대</option>
                                            <option value="10000">10,000km</option>
                                            <option value="20000">20,000km</option>
                                            <option value="30000">30,000km</option>
                                            <option value="40000">40,000km</option>
                                            <option value="50000">50,000km</option>
                                            <option value="60000">60,000km</option>
                                            <option value="70000">70,000km</option>
                                            <option value="80000">80,000km</option>
                                            <option value="90000">90,000km</option>
                                            <option value="100000">100,000km</option>
                                            <option value="110000">110,000km</option>
                                            <option value="120000">120,000km</option>
                                            <option value="130000">130,000km</option>
                                            <option value="140000">140,000km</option>
                                            <option value="150000">150,000km</option>
                                            <option value="160000">160,000km</option>
                                            <option value="170000">170,000km</option>
                                            <option value="180000">180,000km</option>
                                            <option value="190000">190,000km</option>
                                            <option value="200000">200,000km</option>
                                        </select></div>
                                        <div class="selectric"><span class="label" data-beusable-tracking="">최대</span><b
                                                class="button">▾</b></div>
                                        <div class="selectric-items" tabindex="-1">
                                            <div class="selectric-scroll">
                                                <ul>
                                                    <li data-index="0" class="selected">최대</li>
                                                    <li data-index="1" class="">10,000km</li>
                                                    <li data-index="2" class="">20,000km</li>
                                                    <li data-index="3" class="">30,000km</li>
                                                    <li data-index="4" class="">40,000km</li>
                                                    <li data-index="5" class="">50,000km</li>
                                                    <li data-index="6" class="">60,000km</li>
                                                    <li data-index="7" class="">70,000km</li>
                                                    <li data-index="8" class="">80,000km</li>
                                                    <li data-index="9" class="">90,000km</li>
                                                    <li data-index="10" class="">100,000km</li>
                                                    <li data-index="11" class="">110,000km</li>
                                                    <li data-index="12" class="">120,000km</li>
                                                    <li data-index="13" class="">130,000km</li>
                                                    <li data-index="14" class="">140,000km</li>
                                                    <li data-index="15" class="">150,000km</li>
                                                    <li data-index="16" class="">160,000km</li>
                                                    <li data-index="17" class="">170,000km</li>
                                                    <li data-index="18" class="">180,000km</li>
                                                    <li data-index="19" class="">190,000km</li>
                                                    <li data-index="20" class="last">200,000km</li>
                                                </ul>
                                            </div>
                                        </div>
                                        <input class="selectric-input" tabindex="0"></div>
                                </div>
                            </li>
                            <!-- 금융 가격/할부 탭 -->
                            <li class="list_h list_h03 on">
                                <a href="" class="type"
                                   data-beusable-tracking="">가격/할부<small></small></a>
                                <div class="sub_type_list" style="display:block" data-init="true">
                                    <div class="list_price_tab">
                                        <a href="#none" class="price_tab">가격</a>
                                        <a href="#none" class="price_tab on">할부</a>
                                        <!-- 할부탬 우선 -->
                                        <input type="hidden" name="price_tab_flag" value="2">
                                    </div>
                                    <div class="list_price_se none">
                                        <div class="selectric-wrapper selectric-selectric">
                                            <div class="selectric-hide-select"><select name="wr_gt_n_price"
                                                                                       id="minPrice" class="selectric"
                                                                                       data-unit="만원" data-show="price"
                                                                                       data-family="price"
                                                                                       data-comma="comma"
                                                                                       data-beusable-tracking=""
                                                                                       tabindex="-1">
                                                <option value="">최소</option>
                                                <option value="100">100만원</option>
                                                <option value="200">200만원</option>
                                                <option value="300">300만원</option>
                                                <option value="400">400만원</option>
                                                <option value="500">500만원</option>
                                                <option value="600">600만원</option>
                                                <option value="700">700만원</option>
                                                <option value="800">800만원</option>
                                                <option value="900">900만원</option>
                                                <option value="1000">1,000만원</option>
                                                <option value="2000">2,000만원</option>
                                                <option value="3000">3,000만원</option>
                                                <option value="4000">4,000만원</option>
                                                <option value="5000">5,000만원</option>
                                                <option value="6000">6,000만원</option>
                                                <option value="7000">7,000만원</option>
                                                <option value="8000">8,000만원</option>
                                                <option value="9000">9,000만원</option>
                                                <option value="10000">10,000만원</option>
                                                <option value="10001">10,000만원 초과</option>
                                            </select></div>
                                            <div class="selectric"><span class="label"
                                                                         data-beusable-tracking="">최소</span><b
                                                    class="button">▾</b></div>
                                            <div class="selectric-items" tabindex="-1">
                                                <div class="selectric-scroll">
                                                    <ul>
                                                        <li data-index="0" class="selected">최소</li>
                                                        <li data-index="1" class="">100만원</li>
                                                        <li data-index="2" class="">200만원</li>
                                                        <li data-index="3" class="">300만원</li>
                                                        <li data-index="4" class="">400만원</li>
                                                        <li data-index="5" class="">500만원</li>
                                                        <li data-index="6" class="">600만원</li>
                                                        <li data-index="7" class="">700만원</li>
                                                        <li data-index="8" class="">800만원</li>
                                                        <li data-index="9" class="">900만원</li>
                                                        <li data-index="10" class="">1,000만원</li>
                                                        <li data-index="11" class="">2,000만원</li>
                                                        <li data-index="12" class="">3,000만원</li>
                                                        <li data-index="13" class="">4,000만원</li>
                                                        <li data-index="14" class="">5,000만원</li>
                                                        <li data-index="15" class="">6,000만원</li>
                                                        <li data-index="16" class="">7,000만원</li>
                                                        <li data-index="17" class="">8,000만원</li>
                                                        <li data-index="18" class="">9,000만원</li>
                                                        <li data-index="19" class="">10,000만원</li>
                                                        <li data-index="20" class="last">10,000만원 초과</li>
                                                    </ul>
                                                </div>
                                            </div>
                                            <input class="selectric-input" tabindex="0"></div>
                                        <span class="wave">~</span>
                                        <div class="selectric-wrapper selectric-selectric">
                                            <div class="selectric-hide-select"><select name="wr_lt_n_price"
                                                                                       id="maxPrice" class="selectric"
                                                                                       data-unit="만원" data-show="price"
                                                                                       data-family="price"
                                                                                       data-comma="comma"
                                                                                       data-beusable-tracking=""
                                                                                       tabindex="-1">
                                                <option value="">최대</option>
                                                <option value="100">100만원</option>
                                                <option value="200">200만원</option>
                                                <option value="300">300만원</option>
                                                <option value="400">400만원</option>
                                                <option value="500">500만원</option>
                                                <option value="600">600만원</option>
                                                <option value="700">700만원</option>
                                                <option value="800">800만원</option>
                                                <option value="900">900만원</option>
                                                <option value="1000">1,000만원</option>
                                                <option value="2000">2,000만원</option>
                                                <option value="3000">3,000만원</option>
                                                <option value="4000">4,000만원</option>
                                                <option value="5000">5,000만원</option>
                                                <option value="6000">6,000만원</option>
                                                <option value="7000">7,000만원</option>
                                                <option value="8000">8,000만원</option>
                                                <option value="9000">9,000만원</option>
                                                <option value="10000">10,000만원</option>
                                                <option value="60000">10,000만원 초과</option>
                                            </select></div>
                                            <div class="selectric"><span class="label"
                                                                         data-beusable-tracking="">최대</span><b
                                                    class="button">▾</b></div>
                                            <div class="selectric-items" tabindex="-1">
                                                <div class="selectric-scroll">
                                                    <ul>
                                                        <li data-index="0" class="selected">최대</li>
                                                        <li data-index="1" class="">100만원</li>
                                                        <li data-index="2" class="">200만원</li>
                                                        <li data-index="3" class="">300만원</li>
                                                        <li data-index="4" class="">400만원</li>
                                                        <li data-index="5" class="">500만원</li>
                                                        <li data-index="6" class="">600만원</li>
                                                        <li data-index="7" class="">700만원</li>
                                                        <li data-index="8" class="">800만원</li>
                                                        <li data-index="9" class="">900만원</li>
                                                        <li data-index="10" class="">1,000만원</li>
                                                        <li data-index="11" class="">2,000만원</li>
                                                        <li data-index="12" class="">3,000만원</li>
                                                        <li data-index="13" class="">4,000만원</li>
                                                        <li data-index="14" class="">5,000만원</li>
                                                        <li data-index="15" class="">6,000만원</li>
                                                        <li data-index="16" class="">7,000만원</li>
                                                        <li data-index="17" class="">8,000만원</li>
                                                        <li data-index="18" class="">9,000만원</li>
                                                        <li data-index="19" class="">10,000만원</li>
                                                        <li data-index="20" class="last">10,000만원 초과</li>
                                                    </ul>
                                                </div>
                                            </div>
                                            <input class="selectric-input" tabindex="0"></div>
                                        <a href="" class="more_btn several" data-popup="price">
                                            <span class="ico"></span>
                                            <span class="txt">가격 직접입력</span>
                                        </a>
                                        <div class="several_area">
<span class="inp_text">
<input type="text" name="wr_gt_n_price_self" id="price01" class="self" maxlength="5" data-unit="만원" data-bro="price"
       data-comma="comma" data-limit="60000">
<span class="unit">만원</span>
</span>
                                            <span class="wave">~</span>
                                            <span class="inp_text">
<input type="text" name="wr_lt_n_price_self" id="price01" class="self" maxlength="5" data-unit="만원" data-bro="price"
       data-comma="comma" data-limit="60000">
<span class="unit">만원</span>
</span>
                                            <a href="javascript:;" class="ok selfBtn" data-popup="price">입력</a>
                                        </div>
                                    </div>
                                    <div class="list_price_se on">
                                        <div class="list_price_area">
                                            <!-- 0405 금융 1추가 -->
                                            <p class="tit">월 납입금<b class="monfin_info"><b>월 납입금 정보</b> <span
                                                    class="ly_tip"> 월 납입금은 예시이며 이용 조건 및 고객님의 신용등급에 따라 변경될 수 있습니다. </span></b>
                                            </p>
                                            <!-- //0405 금융 1추가 -->
                                            <div class="list_fin_area">
<span class="inp_text">
<input type="text" name="wr_gt_n_month_price_self" id="" class="type01 self" maxlength="5" data-unit="만원"
       data-bro="month_price" data-comma="comma" data-limit="">
<span class="unit">만원</span>
</span>
                                                <span class="wave">~</span>
                                                <span class="inp_text">
<input type="text" name="wr_lt_n_month_price_self" id="" class="type01 self" maxlength="5" data-unit="만원"
       data-bro="month_price" data-comma="comma" data-limit="">
<span class="unit">만원</span>
</span>
                                                <a href="javascript:;" class="ok selfBtn"
                                                   data-popup="month_price">입력</a>
                                            </div>
                                            <p class="tit">할부기간</p>
                                            <div class="list_fin_area">
                                                <div class="selectric-wrapper selectric-selectric selectric-disabled">
                                                    <div class="selectric-hide-select"><select name="wr_eq_n_inst_month"
                                                                                               id="month_select"
                                                                                               class="selectric"
                                                                                               data-unit="개월"
                                                                                               tabindex="-1"
                                                                                               disabled="disabled">
                                                        <option value="12">12개월</option>
                                                        <option value="24">24개월</option>
                                                        <option value="36" selected="selected">36개월</option>
                                                        <option value="48">48개월</option>
                                                        <option value="60">60개월</option>
                                                    </select></div>
                                                    <div class="selectric"><span class="label">36개월</span><b
                                                            class="button">▾</b></div>
                                                    <div class="selectric-items" tabindex="-1">
                                                        <div class="selectric-scroll">
                                                            <ul>
                                                                <li data-index="0" class="">12개월</li>
                                                                <li data-index="1" class="">24개월</li>
                                                                <li data-index="2" class="selected">36개월</li>
                                                                <li data-index="3" class="">48개월</li>
                                                                <li data-index="4" class="last">60개월</li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                    <input class="selectric-input" tabindex="0" disabled=""></div>
                                            </div>
                                            <!-- 0405 금융 1추가 -->
                                            <p class="fin_point">* 선수율 30% 적용</p>
                                            <!-- //0405 금융 1추가 -->
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <!-- 금융 가격/할부 탭 -->
                            <li class="list_h list_h06">
                                <a href="" class="type" data-beusable-tracking="">색상 <small></small></a>
                                <div class="sub_type_list">
                                    <ul class="row_list">
                                        <li>
                                            <div class="checker" id="uniform-carColor1"><span><input type="checkbox"
                                                                                                     name="wr_in_v_exterior_colorcd"
                                                                                                     id="carColor1"
                                                                                                     class="uniform"
                                                                                                     value="COLOR0280"
                                                                                                     data-show="color"></span>
                                            </div>
                                            <label for="carColor1">흰색</label>
                                        </li>
                                        <li>
                                            <div class="checker" id="uniform-carColor2"><span><input type="checkbox"
                                                                                                     name="wr_in_v_exterior_colorcd"
                                                                                                     id="carColor2"
                                                                                                     class="uniform"
                                                                                                     value="COLOR0230"
                                                                                                     data-show="color"></span>
                                            </div>
                                            <label for="carColor2">진주색</label>
                                        </li>
                                        <li>
                                            <div class="checker" id="uniform-carColor3"><span><input type="checkbox"
                                                                                                     name="wr_in_v_exterior_colorcd"
                                                                                                     id="carColor3"
                                                                                                     class="uniform"
                                                                                                     value="COLOR0040"
                                                                                                     data-show="color"></span>
                                            </div>
                                            <label for="carColor3">검정색</label>
                                        </li>
                                        <li>
                                            <div class="checker" id="uniform-carColor4"><span><input type="checkbox"
                                                                                                     name="wr_in_v_exterior_colorcd"
                                                                                                     id="carColor4"
                                                                                                     class="uniform"
                                                                                                     value="COLOR0050"
                                                                                                     data-show="color"></span>
                                            </div>
                                            <label for="carColor4">검정투톤</label>
                                        </li>
                                        <li>
                                            <div class="checker" id="uniform-carColor5"><span><input type="checkbox"
                                                                                                     name="wr_in_v_exterior_colorcd"
                                                                                                     id="carColor5"
                                                                                                     class="uniform"
                                                                                                     value="COLOR0220"
                                                                                                     data-show="color"></span>
                                            </div>
                                            <label for="carColor5">쥐색</label>
                                        </li>
                                        <li>
                                            <div class="checker" id="uniform-carColor6"><span><input type="checkbox"
                                                                                                     name="wr_in_v_exterior_colorcd"
                                                                                                     id="carColor6"
                                                                                                     class="uniform"
                                                                                                     value="COLOR0160"
                                                                                                     data-show="color"></span>
                                            </div>
                                            <label for="carColor6">은색</label>
                                        </li>
                                    </ul>
                                    <a href="#colorPopup" class="more_btn pop_btn" data-popup="color">
                                        <span class="ico"></span>
                                        <span class="txt">색상 더보기</span>
                                    </a>
                                </div>
                                <div class="morePopup color" id="colorPopup" style="margin-top: -212px;">
                                    <div class="pop_head">
                                        <strong>색상</strong>
                                        <a href="" class="close" data-popup="color">닫기</a>
                                    </div>
                                    <div class="body_inner">
                                        <table class="color_list">
                                            <caption>색상</caption>
                                            <colgroup>
                                                <col style="width: 20%;">
                                                <col style="width: 20%;">
                                                <col style="width: 20%;">
                                                <col style="width: 20%;">
                                                <col style="width: 20%;">
                                            </colgroup>
                                            <tbody>
                                            <tr>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor1"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor1" class="uniform" value="COLOR0280"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor1">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_01.png"
                                                             alt="흰색">
                                                        흰색
                                                    </label>
                                                </td>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor2"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor2" class="uniform" value="COLOR0230"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor2">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_02.png"
                                                             alt="진주색">
                                                        진주색
                                                    </label>
                                                </td>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor3"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor3" class="uniform" value="COLOR0040"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor3">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_03.png"
                                                             alt="검정색">
                                                        검정색
                                                    </label>
                                                </td>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor4"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor4" class="uniform" value="COLOR0050"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor4">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_04.png"
                                                             alt="검정투톤">
                                                        검정투톤
                                                    </label>
                                                </td>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor5"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor5" class="uniform" value="COLOR0220"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor5">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_05.png"
                                                             alt="쥐색">
                                                        쥐색
                                                    </label>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor6"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor6" class="uniform" value="COLOR0160"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor6">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_06.png"
                                                             alt="은색">
                                                        은색
                                                    </label>
                                                </td>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor7"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor7" class="uniform" value="COLOR0190"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor7">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_07.png"
                                                             alt="은회색">
                                                        은회색
                                                    </label>
                                                </td>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor8"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor8" class="uniform" value="COLOR0170"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor8">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_08.png"
                                                             alt="은색투톤">
                                                        은색투톤
                                                    </label>
                                                </td>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor9"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor9" class="uniform" value="COLOR0290"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor9">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_09.png"
                                                             alt="흰색투톤">
                                                        흰색투톤
                                                    </label>
                                                </td>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor10"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor10" class="uniform" value="COLOR0240"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor10">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_10.png"
                                                             alt="진주투톤">
                                                        진주투톤
                                                    </label>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor11"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor11" class="uniform" value="COLOR0180"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor11">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_11.png"
                                                             alt="은하색">
                                                        은하색
                                                    </label>
                                                </td>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor12"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor12" class="uniform" value="COLOR0110"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor12">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_12.png"
                                                             alt="명은색">
                                                        명은색
                                                    </label>
                                                </td>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor13"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor13" class="uniform" value="COLOR0130"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor13">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_13.png"
                                                             alt="빨간색">
                                                        빨간색
                                                    </label>
                                                </td>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor14"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor14" class="uniform" value="COLOR0210"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor14">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_14.png"
                                                             alt="주황색">
                                                        주황색
                                                    </label>
                                                </td>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor15"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor15" class="uniform" value="COLOR0200"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor15">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_15.png"
                                                             alt="자주색">
                                                        자주색
                                                    </label>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor16"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor16" class="uniform" value="COLOR0120"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor16">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_16.png"
                                                             alt="보라색">
                                                        보라색
                                                    </label>
                                                </td>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor17"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor17" class="uniform" value="COLOR0300"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor17">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_17.png"
                                                             alt="분홍색">
                                                        분홍색
                                                    </label>
                                                </td>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor18"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor18" class="uniform" value="COLOR0080"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor18">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_18.png"
                                                             alt="노란색">
                                                        노란색
                                                    </label>
                                                </td>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor19"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor19" class="uniform" value="COLOR0010"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor19">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_19.png"
                                                             alt="갈대색">
                                                        갈대색
                                                    </label>
                                                </td>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor20"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor20" class="uniform" value="COLOR0140"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor20">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_20.png"
                                                             alt="연금색">
                                                        연금색
                                                    </label>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor21"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor21" class="uniform" value="COLOR0020"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor21">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_21.png"
                                                             alt="갈색">
                                                        갈색
                                                    </label>
                                                </td>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor22"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor22" class="uniform" value="COLOR0030"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor22">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_22.png"
                                                             alt="갈색투톤">
                                                        갈색투톤
                                                    </label>
                                                </td>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor23"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor23" class="uniform" value="COLOR0060"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor23">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_23.png"
                                                             alt="금색">
                                                        금색
                                                    </label>
                                                </td>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor24"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor24" class="uniform" value="COLOR0070"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor24">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_24.png"
                                                             alt="금색투톤">
                                                        금색투톤
                                                    </label>
                                                </td>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor25"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor25" class="uniform" value="COLOR0250"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor25">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_25.png"
                                                             alt="청색">
                                                        청색
                                                    </label>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor26"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor26" class="uniform" value="COLOR0270"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor26">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_26.png"
                                                             alt="하늘색">
                                                        하늘색
                                                    </label>
                                                </td>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor27"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor27" class="uniform" value="COLOR0100"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor27">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_27.png"
                                                             alt="담녹색">
                                                        담녹색
                                                    </label>
                                                </td>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor28"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor28" class="uniform" value="COLOR0090"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor28">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_28.png"
                                                             alt="녹색">
                                                        녹색
                                                    </label>
                                                </td>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor29"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor29" class="uniform" value="COLOR0150"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor29">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_29.png"
                                                             alt="연두색">
                                                        연두색
                                                    </label>
                                                </td>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor30"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor30" class="uniform" value="COLOR0260"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor30">
                                                        <img src="https://www.kcar.com/resources/images/content/buy/car_color_30.png"
                                                             alt="청옥색">
                                                        청옥색
                                                    </label>
                                                </td>
                                            </tr>
                                            <tr>
                                                <td>
                                                    <div class="checker" id="uniform-carDetailColor31"><span><input
                                                            type="checkbox" name="wr_in_v_exterior_colorcd"
                                                            id="carDetailColor31" class="uniform" value="COLOR9999"
                                                            data-bro="color"></span></div>
                                                    <label for="carDetailColor31">
                                                        기타
                                                    </label>
                                                </td>
                                            </tr>
                                            </tbody>
                                        </table>
                                        <div class="btn_area">
                                            <a href="" class="ok popupBtn" data-popup="color">확인</a>
                                            <a href="" class="cancel" data-popup="color">취소</a>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li class="list_h list_h07">
                                <a href="" class="type" data-beusable-tracking="">연료 <small></small></a>
                                <div class="sub_type_list">
                                    <ul class="row_list">
                                        <li>
                                            <div class="checker" id="uniform-carFuel1"><span><input type="checkbox"
                                                                                                    name="wr_in_v_fuel_typecd"
                                                                                                    id="carFuel1"
                                                                                                    class="uniform"
                                                                                                    value="001"></span>
                                            </div>
                                            <label for="carFuel1">가솔린</label>
                                        </li>
                                        <li>
                                            <div class="checker" id="uniform-carFuel2"><span><input type="checkbox"
                                                                                                    name="wr_in_v_fuel_typecd"
                                                                                                    id="carFuel2"
                                                                                                    class="uniform"
                                                                                                    value="002"></span>
                                            </div>
                                            <label for="carFuel2">디젤</label>
                                        </li>
                                        <li>
                                            <div class="checker" id="uniform-carFuel3"><span><input type="checkbox"
                                                                                                    name="wr_in_v_fuel_typecd"
                                                                                                    id="carFuel3"
                                                                                                    class="uniform"
                                                                                                    value="003"></span>
                                            </div>
                                            <label for="carFuel3">LPG</label>
                                        </li>
                                        <li>
                                            <div class="checker" id="uniform-carFuel4"><span><input type="checkbox"
                                                                                                    name="wr_in_v_fuel_typecd"
                                                                                                    id="carFuel4"
                                                                                                    class="uniform"
                                                                                                    value="005"></span>
                                            </div>
                                            <label for="carFuel4">가솔린+LPG</label>
                                        </li>
                                        <li>
                                            <div class="checker" id="uniform-carFuel5"><span><input type="checkbox"
                                                                                                    name="wr_in_v_fuel_typecd"
                                                                                                    id="carFuel5"
                                                                                                    class="uniform"
                                                                                                    value="006"></span>
                                            </div>
                                            <label for="carFuel5">가솔린+전기</label>
                                        </li>
                                        <li>
                                            <div class="checker" id="uniform-carFuel6"><span><input type="checkbox"
                                                                                                    name="wr_in_v_fuel_typecd"
                                                                                                    id="carFuel6"
                                                                                                    class="uniform"
                                                                                                    value="007"></span>
                                            </div>
                                            <label for="carFuel6">디젤+전기</label>
                                        </li>
                                        <li>
                                            <div class="checker" id="uniform-carFuel7"><span><input type="checkbox"
                                                                                                    name="wr_in_v_fuel_typecd"
                                                                                                    id="carFuel7"
                                                                                                    class="uniform"
                                                                                                    value="008"></span>
                                            </div>
                                            <label for="carFuel7">LPG+전기</label>
                                        </li>
                                        <li>
                                            <div class="checker" id="uniform-carFuel8"><span><input type="checkbox"
                                                                                                    name="wr_in_v_fuel_typecd"
                                                                                                    id="carFuel8"
                                                                                                    class="uniform"
                                                                                                    value="009"></span>
                                            </div>
                                            <label for="carFuel8">전기</label>
                                        </li>
                                        <li>
                                            <div class="checker" id="uniform-carFuel9"><span><input type="checkbox"
                                                                                                    name="wr_in_v_fuel_typecd"
                                                                                                    id="carFuel9"
                                                                                                    class="uniform"
                                                                                                    value="010"></span>
                                            </div>
                                            <label for="carFuel9">가솔린+CNG</label>
                                        </li>
                                        <li>
                                            <div class="checker" id="uniform-carFuel10"><span><input type="checkbox"
                                                                                                     name="wr_in_v_fuel_typecd"
                                                                                                     id="carFuel10"
                                                                                                     class="uniform"
                                                                                                     value="011"></span>
                                            </div>
                                            <label for="carFuel10">LNG</label>
                                        </li>
                                        <li>
                                            <div class="checker" id="uniform-carFuel11"><span><input type="checkbox"
                                                                                                     name="wr_in_v_fuel_typecd"
                                                                                                     id="carFuel11"
                                                                                                     class="uniform"
                                                                                                     value="999"></span>
                                            </div>
                                            <label for="carFuel11">기타</label>
                                        </li>
                                    </ul>
                                    <!-- <p class="fuel_lpg_tip"><b>* LPG 일반인 구입이란?</b><span class="ly_tip">차량 등록 후 5년이 경과된 LPG 차량 <br />경차, 하이브리드, 7인승 이상 LPG 차량은 등록기관과 <br />상관없이 일반인 구입가능</span></p> -->
                                    <p class="fuel_lpg_tip"><b>LPG정보</b> <span class="ly_tip">LPG 차량 규제완화로 2019년 3월 26일부로 LPG 차량의 일반인 구입이 가능합니다.</span>
                                    </p>
                                </div>
                            </li>
                            <li class="list_h list_h08">
                                <a href="" class="type" data-beusable-tracking="">변속기 <small></small></a>
                                <div class="sub_type_list">
                                    <ul class="row_list">
                                        <li>
                                            <div class="checker" id="uniform-carMission1"><span><input type="checkbox"
                                                                                                       name="wr_in_v_transmissioncd"
                                                                                                       id="carMission1"
                                                                                                       class="uniform"
                                                                                                       value="001"></span>
                                            </div>
                                            <label for="carMission1">오토</label>
                                        </li>
                                        <li>
                                            <div class="checker" id="uniform-carMission2"><span><input type="checkbox"
                                                                                                       name="wr_in_v_transmissioncd"
                                                                                                       id="carMission2"
                                                                                                       class="uniform"
                                                                                                       value="002"></span>
                                            </div>
                                            <label for="carMission2">수동</label>
                                        </li>
                                        <li>
                                            <div class="checker" id="uniform-carMission3"><span><input type="checkbox"
                                                                                                       name="wr_in_v_transmissioncd"
                                                                                                       id="carMission3"
                                                                                                       class="uniform"
                                                                                                       value="003"></span>
                                            </div>
                                            <label for="carMission3">세미오토</label>
                                        </li>
                                        <li>
                                            <div class="checker" id="uniform-carMission4"><span><input type="checkbox"
                                                                                                       name="wr_in_v_transmissioncd"
                                                                                                       id="carMission4"
                                                                                                       class="uniform"
                                                                                                       value="004"></span>
                                            </div>
                                            <label for="carMission4">CVT</label>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                            <li class="list_h list_h09">
                                <a href="" class="type" data-beusable-tracking="">옵션 <small></small></a>
                                <div class="sub_type_list">
                                    <ul class="row_list">
                                        <li>
                                            <div class="checker" id="uniform-carOption01"><span><input type="checkbox"
                                                                                                       name="wr_in_v_optioncd"
                                                                                                       id="carOption01"
                                                                                                       class="uniform"
                                                                                                       value="005"
                                                                                                       data-show="option"></span>
                                            </div>
                                            <label for="carOption01">내비게이션</label>
                                        </li>
                                        <li>
                                            <div class="checker" id="uniform-carOption02"><span><input type="checkbox"
                                                                                                       name="wr_in_v_optioncd"
                                                                                                       id="carOption02"
                                                                                                       class="uniform"
                                                                                                       value="010"
                                                                                                       data-show="option"></span>
                                            </div>
                                            <label for="carOption02">선루프</label>
                                        </li>
                                        <li>
                                            <div class="checker" id="uniform-carOption03"><span><input type="checkbox"
                                                                                                       name="wr_in_v_optioncd"
                                                                                                       id="carOption03"
                                                                                                       class="uniform"
                                                                                                       value="014"
                                                                                                       data-show="option"></span>
                                            </div>
                                            <label for="carOption03">가죽시트</label>
                                        </li>
                                        <li>
                                            <div class="checker" id="uniform-carOption04"><span><input type="checkbox"
                                                                                                       name="wr_in_v_optioncd"
                                                                                                       id="carOption04"
                                                                                                       class="uniform"
                                                                                                       value="022"
                                                                                                       data-show="option"></span>
                                            </div>
                                            <label for="carOption04">열선시트 : 운전석</label>
                                        </li>
                                        <li>
                                            <div class="checker" id="uniform-carOption05"><span><input type="checkbox"
                                                                                                       name="wr_in_v_optioncd"
                                                                                                       id="carOption05"
                                                                                                       class="uniform"
                                                                                                       value="029"
                                                                                                       data-show="option"></span>
                                            </div>
                                            <label for="carOption05">HID / LED 라이트</label>
                                        </li>
                                        <li>
                                            <div class="checker" id="uniform-carOption06"><span><input type="checkbox"
                                                                                                       name="wr_in_v_optioncd"
                                                                                                       id="carOption06"
                                                                                                       class="uniform"
                                                                                                       value="057"
                                                                                                       data-show="option"></span>
                                            </div>
                                            <label for="carOption06">스마트키</label>
                                        </li>
                                    </ul>
                                    <a href="#optPopup" class="more_btn pop_btn" data-popup="option">
                                        <span class="ico"></span>
                                        <span class="txt">더보기</span>
                                    </a>
                                </div>
                                <div class="morePopup opt" id="optPopup" style="margin-top: -412.5px;">
                                    <div class="pop_head">
                                        <strong>옵션</strong>
                                        <a href="" class="close" data-popup="option">닫기</a>
                                    </div>
                                    <div class="body_inner">
                                        <table class="opt_tb">
                                            <caption>옵션</caption>
                                            <colgroup>
                                                <col style="width: 25%;">
                                                <col style="width: 25%;">
                                                <col style="width: 25%;">
                                                <col style="width: 25%;">
                                            </colgroup>
                                            <thead>
                                            <tr>
                                                <th>외관</th>
                                                <th>내장</th>
                                                <th>안전</th>
                                                <th>편의</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            <tr>
                                                <td>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionExterior1">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionExterior1" class="uniform"
                                                                         value="029" data-bro="option"></span></div>
                                                        <label for="carOptionExterior1">HID / LED 라이트</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionExterior2">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionExterior2" class="uniform"
                                                                         value="024" data-bro="option"></span></div>
                                                        <label for="carOptionExterior2">전동접이사이드미러</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionExterior3">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionExterior3" class="uniform"
                                                                         value="010" data-bro="option"></span></div>
                                                        <label for="carOptionExterior3">선루프</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionExterior4">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionExterior4" class="uniform"
                                                                         value="062" data-bro="option"></span></div>
                                                        <label for="carOptionExterior4">루프랙</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionExterior5">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionExterior5" class="uniform"
                                                                         value="017" data-bro="option"></span></div>
                                                        <label for="carOptionExterior5">알루미늄 휠</label>
                                                    </div>
                                                </td>
                                                <td>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionInterior6">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionInterior6" class="uniform"
                                                                         value="031" data-bro="option"></span></div>
                                                        <label for="carOptionInterior6">스티어링 휠 리모컨</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionInterior7">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionInterior7" class="uniform"
                                                                         value="008" data-bro="option"></span></div>
                                                        <label for="carOptionInterior7">파워스티어링</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionInterior8">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionInterior8" class="uniform"
                                                                         value="030" data-bro="option"></span></div>
                                                        <label for="carOptionInterior8">룸미러 : ECM</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionInterior9">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionInterior9" class="uniform"
                                                                         value="074" data-bro="option"></span></div>
                                                        <label for="carOptionInterior9">룸미러 : 하이패스</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionInterior10">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionInterior10" class="uniform"
                                                                         value="014" data-bro="option"></span></div>
                                                        <label for="carOptionInterior10">가죽시트</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionInterior11">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionInterior11" class="uniform"
                                                                         value="021" data-bro="option"></span></div>
                                                        <label for="carOptionInterior11">전동시트 : 운전석</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionInterior12">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionInterior12" class="uniform"
                                                                         value="035" data-bro="option"></span></div>
                                                        <label for="carOptionInterior12">전동시트 : 조수석</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionInterior13">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionInterior13" class="uniform"
                                                                         value="090" data-bro="option"></span></div>
                                                        <label for="carOptionInterior13">전동시트 : 뒷좌석</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionInterior14">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionInterior14" class="uniform"
                                                                         value="022" data-bro="option"></span></div>
                                                        <label for="carOptionInterior14">열선시트 : 운전석</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionInterior15">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionInterior15" class="uniform"
                                                                         value="091" data-bro="option"></span></div>
                                                        <label for="carOptionInterior15">열선시트 : 조수석</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionInterior16">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionInterior16" class="uniform"
                                                                         value="063" data-bro="option"></span></div>
                                                        <label for="carOptionInterior16">열선시트 : 뒷좌석</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionInterior17">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionInterior17" class="uniform"
                                                                         value="051" data-bro="option"></span></div>
                                                        <label for="carOptionInterior17">메모리시트 : 운전석</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionInterior18">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionInterior18" class="uniform"
                                                                         value="078" data-bro="option"></span></div>
                                                        <label for="carOptionInterior18">메모리시트 : 조수석</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionInterior19">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionInterior19" class="uniform"
                                                                         value="034" data-bro="option"></span></div>
                                                        <label for="carOptionInterior19">통풍시트 : 운전석</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionInterior20">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionInterior20" class="uniform"
                                                                         value="077" data-bro="option"></span></div>
                                                        <label for="carOptionInterior20">통풍시트 : 조수석</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionInterior21">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionInterior21" class="uniform"
                                                                         value="093" data-bro="option"></span></div>
                                                        <label for="carOptionInterior21">통풍시트 : 뒷좌석</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionInterior22">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionInterior22" class="uniform"
                                                                         value="085" data-bro="option"></span></div>
                                                        <label for="carOptionInterior22">안마 시트</label>
                                                    </div>
                                                </td>
                                                <td>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionSafety23"><span><input
                                                                type="checkbox" name="wr_in_v_optioncd"
                                                                id="carOptionSafety23" class="uniform" value="026"
                                                                data-bro="option"></span></div>
                                                        <label for="carOptionSafety23">에어백 : 운전석</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionSafety24"><span><input
                                                                type="checkbox" name="wr_in_v_optioncd"
                                                                id="carOptionSafety24" class="uniform" value="027"
                                                                data-bro="option"></span></div>
                                                        <label for="carOptionSafety24">에어백 : 조수석</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionSafety25"><span><input
                                                                type="checkbox" name="wr_in_v_optioncd"
                                                                id="carOptionSafety25" class="uniform" value="020"
                                                                data-bro="option"></span></div>
                                                        <label for="carOptionSafety25">에어백 : 사이드</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionSafety26"><span><input
                                                                type="checkbox" name="wr_in_v_optioncd"
                                                                id="carOptionSafety26" class="uniform" value="056"
                                                                data-bro="option"></span></div>
                                                        <label for="carOptionSafety26">에어백 : 커튼</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionSafety27"><span><input
                                                                type="checkbox" name="wr_in_v_optioncd"
                                                                id="carOptionSafety27" class="uniform" value="082"
                                                                data-bro="option"></span></div>
                                                        <label for="carOptionSafety27">감지센서 : 전방</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionSafety28"><span><input
                                                                type="checkbox" name="wr_in_v_optioncd"
                                                                id="carOptionSafety28" class="uniform" value="032"
                                                                data-bro="option"></span></div>
                                                        <label for="carOptionSafety28">감지센서 : 후방</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionSafety29"><span><input
                                                                type="checkbox" name="wr_in_v_optioncd"
                                                                id="carOptionSafety29" class="uniform" value="080"
                                                                data-bro="option"></span></div>
                                                        <label for="carOptionSafety29">카메라 : 전방</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionSafety30"><span><input
                                                                type="checkbox" name="wr_in_v_optioncd"
                                                                id="carOptionSafety30" class="uniform" value="058"
                                                                data-bro="option"></span></div>
                                                        <label for="carOptionSafety30">카메라 : 후방</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionSafety31"><span><input
                                                                type="checkbox" name="wr_in_v_optioncd"
                                                                id="carOptionSafety31" class="uniform" value="081"
                                                                data-bro="option"></span></div>
                                                        <label for="carOptionSafety31">360도 어라운드 뷰</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionSafety32"><span><input
                                                                type="checkbox" name="wr_in_v_optioncd"
                                                                id="carOptionSafety32" class="uniform" value="001"
                                                                data-bro="option"></span></div>
                                                        <label for="carOptionSafety32">ABS</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionSafety33"><span><input
                                                                type="checkbox" name="wr_in_v_optioncd"
                                                                id="carOptionSafety33" class="uniform" value="019"
                                                                data-bro="option"></span></div>
                                                        <label for="carOptionSafety33">TCS : 미끄럼방지</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionSafety34"><span><input
                                                                type="checkbox" name="wr_in_v_optioncd"
                                                                id="carOptionSafety34" class="uniform" value="055"
                                                                data-bro="option"></span></div>
                                                        <label for="carOptionSafety34">차체자세 제어장치</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionSafety35"><span><input
                                                                type="checkbox" name="wr_in_v_optioncd"
                                                                id="carOptionSafety35" class="uniform" value="002"
                                                                data-bro="option"></span></div>
                                                        <label for="carOptionSafety35">ECS : 전자제어 서스펜션</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionSafety36"><span><input
                                                                type="checkbox" name="wr_in_v_optioncd"
                                                                id="carOptionSafety36" class="uniform" value="033"
                                                                data-bro="option"></span></div>
                                                        <label for="carOptionSafety36">TPMS : 타이어공기압감지</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionSafety37"><span><input
                                                                type="checkbox" name="wr_in_v_optioncd"
                                                                id="carOptionSafety37" class="uniform" value="076"
                                                                data-bro="option"></span></div>
                                                        <label for="carOptionSafety37">전자식파킹브레이크</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionSafety38"><span><input
                                                                type="checkbox" name="wr_in_v_optioncd"
                                                                id="carOptionSafety38" class="uniform" value="006"
                                                                data-bro="option"></span></div>
                                                        <label for="carOptionSafety38">파워도어록</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionSafety39"><span><input
                                                                type="checkbox" name="wr_in_v_optioncd"
                                                                id="carOptionSafety39" class="uniform" value="092"
                                                                data-bro="option"></span></div>
                                                        <label for="carOptionSafety39">LDWS:차선이탈경보시스템</label>
                                                    </div>
                                                </td>
                                                <td>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionConvenience40">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionConvenience40" class="uniform"
                                                                         value="023" data-bro="option"></span></div>
                                                        <label for="carOptionConvenience40">오토 에어컨</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionConvenience41">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionConvenience41" class="uniform"
                                                                         value="089" data-bro="option"></span></div>
                                                        <label for="carOptionConvenience41">수동에어컨</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionConvenience42">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionConvenience42" class="uniform"
                                                                         value="015" data-bro="option"></span></div>
                                                        <label for="carOptionConvenience42">리모컨키</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionConvenience43">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionConvenience43" class="uniform"
                                                                         value="057" data-bro="option"></span></div>
                                                        <label for="carOptionConvenience43">스마트키</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionConvenience44">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionConvenience44" class="uniform"
                                                                         value="059" data-bro="option"></span></div>
                                                        <label for="carOptionConvenience44">파워 트렁크</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionConvenience45">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionConvenience45" class="uniform"
                                                                         value="007" data-bro="option"></span></div>
                                                        <label for="carOptionConvenience45">파워 윈도우</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionConvenience46">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionConvenience46" class="uniform"
                                                                         value="068" data-bro="option"></span></div>
                                                        <label for="carOptionConvenience46">크루즈컨트롤</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionConvenience47">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionConvenience47" class="uniform"
                                                                         value="003" data-bro="option"></span></div>
                                                        <label for="carOptionConvenience47">CD플레이어</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionConvenience48">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionConvenience48" class="uniform"
                                                                         value="005" data-bro="option"></span></div>
                                                        <label for="carOptionConvenience48">내비게이션</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionConvenience49">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionConvenience49" class="uniform"
                                                                         value="054" data-bro="option"></span></div>
                                                        <label for="carOptionConvenience49">뒷좌석 모니터</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionConvenience50">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionConvenience50" class="uniform"
                                                                         value="071" data-bro="option"></span></div>
                                                        <label for="carOptionConvenience50">AUX 단자</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionConvenience51">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionConvenience51" class="uniform"
                                                                         value="072" data-bro="option"></span></div>
                                                        <label for="carOptionConvenience51">USB 단자</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionConvenience52">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionConvenience52" class="uniform"
                                                                         value="088" data-bro="option"></span></div>
                                                        <label for="carOptionConvenience52">블루투스</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionConvenience53">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionConvenience53" class="uniform"
                                                                         value="084" data-bro="option"></span></div>
                                                        <label for="carOptionConvenience53">핸들 열선</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionConvenience54">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionConvenience54" class="uniform"
                                                                         value="086" data-bro="option"></span></div>
                                                        <label for="carOptionConvenience54">오토 라이트</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionConvenience55">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionConvenience55" class="uniform"
                                                                         value="083" data-bro="option"></span></div>
                                                        <label for="carOptionConvenience55">차량 메뉴얼</label>
                                                    </div>
                                                    <div class="list">
                                                        <div class="checker" id="uniform-carOptionConvenience56">
                                                            <span><input type="checkbox" name="wr_in_v_optioncd"
                                                                         id="carOptionConvenience56" class="uniform"
                                                                         value="094" data-bro="option"></span></div>
                                                        <label for="carOptionConvenience56">헤드업 디스플레이(HUD)</label>
                                                    </div>
                                                </td>
                                            </tr>
                                            </tbody>
                                        </table>
                                        <div class="btn_area">
                                            <a href="" class="ok popupBtn" data-popup="option">확인</a>
                                            <a href="" class="cancel" data-popup="option">취소</a>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li class="list_h list_h10">
                                <a href="" class="type" data-beusable-tracking="">사고유무
                                    <small></small></a>
                                <div class="sub_type_list">
                                    <ul class="row_list">
                                        <li>
                                            <div class="checker" id="uniform-carAccident1"><span><input type="checkbox"
                                                                                                        name="wr_in_v_rec_comment_cd"
                                                                                                        id="carAccident1"
                                                                                                        class="uniform"
                                                                                                        value="001"></span>
                                            </div>
                                            <label for="carAccident1">무사고</label>
                                        </li>
                                        <li>
                                            <div class="checker" id="uniform-carAccident2"><span><input type="checkbox"
                                                                                                        name="wr_in_v_rec_comment_cd"
                                                                                                        id="carAccident2"
                                                                                                        class="uniform"
                                                                                                        value="003"></span>
                                            </div>
                                            <label for="carAccident2">단순교환</label>
                                        </li>
                                        <li>
                                            <div class="checker" id="uniform-carAccident3"><span><input type="checkbox"
                                                                                                        name="wr_in_v_rec_comment_cd"
                                                                                                        id="carAccident3"
                                                                                                        class="uniform"
                                                                                                        value="002"></span>
                                            </div>
                                            <label for="carAccident3">단순사고(접촉)</label>
                                        </li>
                                        <li>
                                            <div class="checker" id="uniform-carAccident4"><span><input type="checkbox"
                                                                                                        name="wr_in_v_rec_comment_cd"
                                                                                                        id="carAccident4"
                                                                                                        class="uniform"
                                                                                                        value="004"></span>
                                            </div>
                                            <label for="carAccident4">사고</label>
                                        </li>
                                    </ul>
                                </div>
                            </li>
                            <li class="list_h list_h11">
                                <a href="" class="type" data-beusable-tracking="">인승 <small></small></a>
                                <div class="sub_type_list">
                                    <div>
                                        <ul class="row_list">
                                            <li>
                                                <div class="checker" id="uniform-carSeveral01"><span><input
                                                        type="checkbox" name="wr_in_n_pass_cnt" id="carSeveral01"
                                                        class="uniform" value="4" data-show="pass"></span></div>
                                                <label for="carSeveral01">4인승</label>
                                            </li>
                                            <li>
                                                <div class="checker" id="uniform-carSeveral02"><span><input
                                                        type="checkbox" name="wr_in_n_pass_cnt" id="carSeveral02"
                                                        class="uniform" value="5" data-show="pass"></span></div>
                                                <label for="carSeveral02">5인승</label>
                                            </li>
                                            <li>
                                                <div class="checker" id="uniform-carSeveral03"><span><input
                                                        type="checkbox" name="wr_in_n_pass_cnt" id="carSeveral03"
                                                        class="uniform" value="7" data-show="pass"></span></div>
                                                <label for="carSeveral03">7인승</label>
                                            </li>
                                            <li>
                                                <div class="checker" id="uniform-carSeveral04"><span><input
                                                        type="checkbox" name="wr_in_n_pass_cnt" id="carSeveral04"
                                                        class="uniform" value="9" data-show="pass"></span></div>
                                                <label for="carSeveral04">9인승</label>
                                            </li>
                                            <li>
                                                <div class="checker" id="uniform-carSeveral05"><span><input
                                                        type="checkbox" name="wr_in_n_pass_cnt" id="carSeveral05"
                                                        class="uniform" value="11" data-show="pass"></span></div>
                                                <label for="carSeveral05">11인승</label>
                                            </li>
                                            <li>
                                                <div class="checker" id="uniform-carSeveral06"><span><input
                                                        type="checkbox" name="wr_in_n_pass_cnt" id="carSeveral06"
                                                        class="uniform" value="15" data-show="pass"></span></div>
                                                <label for="carSeveral06">15인승</label>
                                            </li>
                                        </ul>
                                        <a href="" class="more_btn several" data-popup="pass">
                                            <span class="ico"></span>
                                            <span class="txt">인승 직접입력</span>
                                        </a>
                                        <div class="several_area">
                                            <input type="text" name="wr_gt_n_pass_cnt" id="severalIp01" class="self"
                                                   placeholder="입력" maxlength="2" data-unit="인승" data-bro="pass">
                                            <span class="wave">~</span>
                                            <input type="text" name="wr_lt_n_pass_cnt" id="severalIp02" class="self"
                                                   placeholder="입력" maxlength="2" data-unit="인승" data-bro="pass">
                                            <a href="javascript:;" class="ok selfBtn" data-popup="pass">입력</a>
                                        </div>
                                    </div>
                                </div>
                            </li>
                            <li class="list_h list_h12">
                                <a href="" class="type" data-beusable-tracking="">지역 <small></small></a>
                                <div class="sub_type_list sub_type_tree">
                                    <div class="scroll-wrapper scrollbar-dynamic" style="position: relative;">
                                        <div class="scrollbar-dynamic scroll-content"
                                             style="height: 100px; margin-bottom: 0px; margin-right: 0px; max-height: none;">
                                            <ul class="tree">
                                                <li class="dep01">
                                                    <div class="row">
<span class="txt">
<div class="checker" id="uniform-areaL1"><span><input type="checkbox" name="wr_in_v_center_region_code" id="areaL1"
                                                      class="uniform" value="SEOUL"></span></div>
<label for="areaL1">서울</label>
</span>
                                                    </div>
                                                    <ul class="tree">
                                                        <li class="dep02">
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S1"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S1"
                                                        class="uniform" value="SEOUL,147"></span></div>
<label for="areaL1S1">강남직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S2"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S2"
                                                        class="uniform" value="SEOUL,104"></span></div>
<label for="areaL1S2">목동직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S3"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S3"
                                                        class="uniform" value="SEOUL,136"></span></div>
<label for="areaL1S3">서서울직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S4"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S4"
                                                        class="uniform" value="SEOUL,033"></span></div>
<label for="areaL1S4">서초직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S5"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S5"
                                                        class="uniform" value="SEOUL,128"></span></div>
<label for="areaL1S5">성동직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S6"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S6"
                                                        class="uniform" value="SEOUL,010"></span></div>
<label for="areaL1S6">영등포직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S7"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S7"
                                                        class="uniform" value="SEOUL,095"></span></div>
<label for="areaL1S7">장한평직영점</label>
	</span>
                                                            </div>
                                                        </li>
                                                    </ul>
                                                </li>
                                                <li class="dep01">
                                                    <div class="row">
<span class="txt">
<div class="checker" id="uniform-areaL2"><span><input type="checkbox" name="wr_in_v_center_region_code" id="areaL2"
                                                      class="uniform" value="INCHUN"></span></div>
<label for="areaL2">경기/인천</label>
</span>
                                                    </div>
                                                    <ul class="tree">
                                                        <li class="dep02">
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S8"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S8"
                                                        class="uniform" value="INCHUN,014"></span></div>
<label for="areaL1S8">강서직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S9"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S9"
                                                        class="uniform" value="INCHUN,142"></span></div>
<label for="areaL1S9">경인직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S10"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S10"
                                                         class="uniform" value="INCHUN,139"></span></div>
<label for="areaL1S10">김포공항직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S11"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S11"
                                                         class="uniform" value="INCHUN,087"></span></div>
<label for="areaL1S11">김포직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S12"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S12"
                                                         class="uniform" value="INCHUN,143"></span></div>
<label for="areaL1S12">부천상동직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S13"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S13"
                                                         class="uniform" value="INCHUN,109"></span></div>
<label for="areaL1S13">분당용인직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S14"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S14"
                                                         class="uniform" value="INCHUN,144"></span></div>
<label for="areaL1S14">수원신갈직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S15"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S15"
                                                         class="uniform" value="INCHUN,034"></span></div>
<label for="areaL1S15">수원직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S16"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S16"
                                                         class="uniform" value="INCHUN,121"></span></div>
<label for="areaL1S16">안양직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S17"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S17"
                                                         class="uniform" value="INCHUN,093"></span></div>
<label for="areaL1S17">오산동탄직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S18"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S18"
                                                         class="uniform" value="INCHUN,140"></span></div>
<label for="areaL1S18">용인기흥직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S19"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S19"
                                                         class="uniform" value="INCHUN,105"></span></div>
<label for="areaL1S19">의정부직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S20"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S20"
                                                         class="uniform" value="INCHUN,120"></span></div>
<label for="areaL1S20">인천직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S21"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S21"
                                                         class="uniform" value="INCHUN,083"></span></div>
<label for="areaL1S21">일산직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S22"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S22"
                                                         class="uniform" value="INCHUN,145"></span></div>
<label for="areaL1S22">포천직영점</label>
	</span>
                                                            </div>
                                                        </li>
                                                    </ul>
                                                </li>
                                                <li class="dep01">
                                                    <div class="row">
<span class="txt">
<div class="checker" id="uniform-areaL3"><span><input type="checkbox" name="wr_in_v_center_region_code" id="areaL3"
                                                      class="uniform" value="BUSAN"></span></div>
<label for="areaL3">경남</label>
</span>
                                                    </div>
                                                    <ul class="tree">
                                                        <li class="dep02">
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S23"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S23"
                                                         class="uniform" value="BUSAN,068"></span></div>
<label for="areaL1S23">부산직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S24"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S24"
                                                         class="uniform" value="BUSAN,116"></span></div>
<label for="areaL1S24">서부산직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S25"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S25"
                                                         class="uniform" value="BUSAN,094"></span></div>
<label for="areaL1S25">양산직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S26"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S26"
                                                         class="uniform" value="BUSAN,149"></span></div>
<label for="areaL1S26">울산직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S27"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S27"
                                                         class="uniform" value="BUSAN,146"></span></div>
<label for="areaL1S27">창원마산직영점</label>
	</span>
                                                            </div>
                                                        </li>
                                                    </ul>
                                                </li>
                                                <li class="dep01">
                                                    <div class="row">
<span class="txt">
<div class="checker" id="uniform-areaL4"><span><input type="checkbox" name="wr_in_v_center_region_code" id="areaL4"
                                                      class="uniform" value="DEGUE"></span></div>
<label for="areaL4">경북</label>
</span>
                                                    </div>
                                                    <ul class="tree">
                                                        <li class="dep02">
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S28"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S28"
                                                         class="uniform" value="DEGUE,075"></span></div>
<label for="areaL1S28">구미직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S29"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S29"
                                                         class="uniform" value="DEGUE,088"></span></div>
<label for="areaL1S29">대구반야월직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S30"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S30"
                                                         class="uniform" value="DEGUE,060"></span></div>
<label for="areaL1S30">대구직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S31"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S31"
                                                         class="uniform" value="DEGUE,141"></span></div>
<label for="areaL1S31">서대구직영점</label>
	</span>
                                                            </div>
                                                        </li>
                                                    </ul>
                                                </li>
                                                <li class="dep01">
                                                    <div class="row">
<span class="txt">
<div class="checker" id="uniform-areaL5"><span><input type="checkbox" name="wr_in_v_center_region_code" id="areaL5"
                                                      class="uniform" value="GANGJU"></span></div>
<label for="areaL5">전남</label>
</span>
                                                    </div>
                                                    <ul class="tree">
                                                        <li class="dep02">
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S32"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S32"
                                                         class="uniform" value="GANGJU,081"></span></div>
<label for="areaL1S32">광주송암직영점</label>
	</span>
                                                            </div>
                                                        </li>
                                                    </ul>
                                                </li>
                                                <li class="dep01">
                                                    <div class="row">
<span class="txt">
<div class="checker" id="uniform-areaL6"><span><input type="checkbox" name="wr_in_v_center_region_code" id="areaL6"
                                                      class="uniform" value="JUNJU"></span></div>
<label for="areaL6">전북</label>
</span>
                                                    </div>
                                                    <ul class="tree">
                                                        <li class="dep02">
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S33"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S33"
                                                         class="uniform" value="JUNJU,129"></span></div>
<label for="areaL1S33">전주직영점</label>
	</span>
                                                            </div>
                                                        </li>
                                                    </ul>
                                                </li>
                                                <li class="dep01">
                                                    <div class="row">
<span class="txt">
<div class="checker" id="uniform-areaL7"><span><input type="checkbox" name="wr_in_v_center_region_code" id="areaL7"
                                                      class="uniform" value="DEJUN"></span></div>
<label for="areaL7">충남</label>
</span>
                                                    </div>
                                                    <ul class="tree">
                                                        <li class="dep02">
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S34"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S34"
                                                         class="uniform" value="DEJUN,148"></span></div>
<label for="areaL1S34">대전유성직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S35"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S35"
                                                         class="uniform" value="DEJUN,067"></span></div>
<label for="areaL1S35">대전직영점</label>
	</span>
                                                            </div>
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S36"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S36"
                                                         class="uniform" value="DEJUN,071"></span></div>
<label for="areaL1S36">천안직영점</label>
	</span>
                                                            </div>
                                                        </li>
                                                    </ul>
                                                </li>
                                                <li class="dep01">
                                                    <div class="row">
<span class="txt">
<div class="checker" id="uniform-areaL8"><span><input type="checkbox" name="wr_in_v_center_region_code" id="areaL8"
                                                      class="uniform" value="CHEONGJU"></span></div>
<label for="areaL8">충북</label>
</span>
                                                    </div>
                                                    <ul class="tree">
                                                        <li class="dep02">
                                                            <div class="row">
	<span class="txt">
<div class="checker" id="uniform-areaL1S37"><span><input type="checkbox" name="wr_in_multi_values" id="areaL1S37"
                                                         class="uniform" value="CHEONGJU,114"></span></div>
<label for="areaL1S37">청주직영점</label>
	</span>
                                                            </div>
                                                        </li>
                                                    </ul>
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
                        <ul class="choice_area"></ul> <!-- 검색 선택 항목 javascript -->
                        <div class="until_box">
                            <div class="top_field">
                                <div id="totalCount" class="total">총 <strong>7,976</strong>대</div>
                                <!-- 검색 결과 카운트 ajax -->
                                <div class="hit"></div>
                                <div class="search_area">
                                    <input type="text" placeholder="차량번호/판매담당자">
                                    <button type="button">검색</button>
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
                                        <div class="selectric-wrapper selectric-selectric">
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
                                                                         data-beusable-tracking="">15개</span><b
                                                    class="button">▾</b></div>
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
                                <tr v-for="car_search_result of car_search_results" :key="car_search_result.carcd">
                                    <td class="thumb">
                                        <a :href="car_search_result.car_url" target="_blank">
                                            <div class="mark_area"></div>
                                            <img :src="car_search_result.middle_img" alt="자동차 썸네일">
                                        </a>
                                    </td>
                                    <td class="car_info">
                                        <router-link to="/product">
                                            <!-- <a :href="car_search_result.v_car_url" target="_blank" class="name"></a> -->
                                            {{car_search_result.truck_name}}
                                        </router-link>
                                        <span class="md_year">{{car_search_result.mfr_date}}({{car_search_result.begin_year}}년형)  &nbsp;&nbsp; {{car_search_result.mileage}}km &nbsp;&nbsp;{{car_search_result.fuel_typecd_name}}</span>
                                        <span class="price">{{car_search_result.price}}만원 <em>5,850만원</em></span>
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
                                        <span class="online_buy">{{car_search_result.simple_comment}}</span>
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
import {checkBox} from "../mixins/checkBox";
import axios from 'axios'

export default {
        name: 'searchMain',
        data() {
            return {
                wr_in_v_categorycd: [
                    {
                        value: '001',
                        div_id: 'uniform-category_1',
                        category_id: 'category_1',
                        uniform: 'uniform',
                        text: '경차'
                    },
                    {
                        value: '002',
                        div_id: 'uniform-category_2',
                        category_id: 'category_2',
                        uniform: 'uniform',
                        text: '소형차'
                    },
                    {
                        value: '003',
                        div_id: 'uniform-category_3',
                        category_id: 'category_3',
                        uniform: 'uniform',
                        text: '준중형차'
                    },
                    {
                        value: '004',
                        div_id: 'uniform-category_4',
                        category_id: 'category_4',
                        uniform: 'uniform',
                        text: '중형차'
                    },
                    {
                        value: '005',
                        div_id: 'uniform-category_5',
                        category_id: 'category_5',
                        uniform: 'uniform',
                        text: '대형차'
                    },
                    {
                        value: '006',
                        div_id: 'uniform-category_6',
                        category_id: 'category_6',
                        uniform: 'uniform',
                        text: '스포츠카'
                    },
                    {
                        value: '007',
                        div_id: 'uniform-category_7',
                        category_id: 'category_7',
                        uniform: 'uniform',
                        text: 'SUV'
                    },
                    {
                        value: '008',
                        div_id: 'uniform-category_8',
                        category_id: 'category_8',
                        uniform: 'uniform',
                        text: 'RV'
                    },
                    {
                        value: '009',
                        div_id: 'uniform-category_9',
                        category_id: 'category_9',
                        uniform: 'uniform',
                        text: '경승합차'
                    },
                    {
                        value: '010',
                        div_id: 'uniform-category_10',
                        category_id: 'category_10',
                        uniform: 'uniform',
                        text: '승합차'
                    },
                    {
                        value: '011',
                        div_id: 'uniform-category_11',
                        category_id: 'category_11',
                        uniform: 'uniform',
                        text: '화물차'
                    },
                    {
                        value: '012',
                        div_id: 'uniform-category_12',
                        category_id: 'category_12',
                        uniform: 'uniform',
                        text: '버스'
                    }
                ],
                makerList: [/*
                    {
                       checked: false, product_count:2009, company_cd: "001", company_nm: "현대"
                    }, {
                       checked: false, product_count:160,
                        company_cd: "007",
                        company_nm: "제네시스"
                    }, {checked: false, product_count:1905, company_cd: "002", company_nm: "기아"}, {
                       checked: false, product_count:907,
                        company_cd: "003",
                        company_nm: "쉐보레(GM대우)"
                    }, {checked: false, product_count:963, company_cd: "005", company_nm: "르노삼성"}, {
                        checked: false, product_count:478,
                        company_cd: "004",
                        company_nm: "쌍용"
                    }, {checked: false, product_count:0, company_cd: "088", company_nm: "대우버스"}, {
                        checked: false, product_count:397,
                        company_cd: "013",
                        company_nm: "벤츠"
                    }, {checked: false, product_count:222, company_cd: "012", company_nm: "BMW"}, {
                        checked: false, product_count:176,
                        company_cd: "011",
                        company_nm: "아우디"
                    }, {checked: false, product_count:145, company_cd: "014", company_nm: "폭스바겐"}, {
                        checked: false, product_count:38,
                        company_cd: "031",
                        company_nm: "도요타"
                    }, {checked: false, product_count:44, company_cd: "035", company_nm: "렉서스"}, {
                        checked: false, product_count:35,
                        company_cd: "027",
                        company_nm: "혼다"
                    }, {checked: false, product_count:84, company_cd: "054", company_nm: "미니"}, {
                        checked: false, product_count:71,
                        company_cd: "024",
                        company_nm: "포드"
                    }, {checked: false, product_count:54, company_cd: "021", company_nm: "푸조"}, {
                        checked: false, product_count:29,
                        company_cd: "017",
                        company_nm: "볼보"
                    }, {checked: false, product_count:7, company_cd: "015", company_nm: "포르쉐"}, {
                        checked: false, product_count:21,
                        company_cd: "043",
                        company_nm: "캐딜락"
                    }, {checked: false, product_count:31, company_cd: "083", company_nm: "지프"}, {
                        checked: false, product_count:17,
                        company_cd: "044",
                        company_nm: "링컨"
                    }, {checked: false, product_count:2, company_cd: "023", company_nm: "크라이슬러"}, {
                        checked: false, product_count:0,
                        company_cd: "081",
                        company_nm: "스마트"
                    }, {checked: false, product_count:29, company_cd: "033", company_nm: "닛산"}, {
                        checked: false, product_count:31,
                        company_cd: "058",
                        company_nm: "인피니티"
                    }, {checked: false, product_count:24, company_cd: "019", company_nm: "재규어"}, {
                        checked: false, product_count:41,
                        company_cd: "020",
                        company_nm: "랜드로버"
                    }, {checked: false, product_count:0, company_cd: "029", company_nm: "마쯔다"}, {
                        checked: false, product_count:0,
                        company_cd: "084",
                        company_nm: "맥라렌"
                    }, {checked: false, product_count:1, company_cd: "030", company_nm: "미쯔비시"}, {
                        checked: false, product_count:1,
                        company_cd: "050",
                        company_nm: "벤틀리"
                    }, {checked: false, product_count:0, company_cd: "086", company_nm: "북기은상"}, {
                        checked: false, product_count:0,
                        company_cd: "016",
                        company_nm: "사브"
                    }, {checked: false, product_count:0, company_cd: "052", company_nm: "스바루"}, {
                        checked: false, product_count:0,
                        company_cd: "037",
                        company_nm: "스즈키"
                    }, {checked: false, product_count:19, company_cd: "022", company_nm: "시트로엥"}, {
                        checked: false, product_count:0,
                        company_cd: "070",
                        company_nm: "애스턴마틴"
                    }, {checked: false, product_count:0, company_cd: "041", company_nm: "페라리"}, {
                        checked: false, product_count:5,
                        company_cd: "018",
                        company_nm: "피아트"
                    }, {checked: false, product_count:0, company_cd: "048", company_nm: "험머"}, {
                        checked: false, product_count:2,
                        company_cd: "087",
                        company_nm: "테슬라"
                    }, {checked: false, product_count:0, company_cd: "034", company_nm: "닷지"}, {
                        checked: false, product_count:1,
                        company_cd: "038",
                        company_nm: "쉐보레"
                    }, {checked: false, product_count:0, company_cd: "056", company_nm: "GMC"}, {
                        checked: false, product_count:0,
                        company_cd: "049",
                        company_nm: "람보르기니"
                    }, {checked: false, product_count:0, company_cd: "047", company_nm: "롤스로이스"}, {
                        checked: false, product_count:6,
                        company_cd: "053",
                        company_nm: "마세라티"
                    }, {checked: false, product_count:0, company_cd: "080", company_nm: "마이바흐"}, {
                        checked: false, product_count:0,
                        company_cd: "057",
                        company_nm: "어큐라"
                    }
                */],
                car_search_results: [/*
                    {
                        v_carcd: "EC60314783",
                        n_real_mile: "0",
                        n_auth_mile: "0",
                        v_truck_flag: "N",
                        v_optioncd: "001|005|006|007|008|014|017|020|021|022|023|024|026|027|029|030|031|032|033|034|035|055|056|057|058|059|062|063|068|071|072|074|076|077|082|084|086|088|091|092",
                        v_categorycd: "007",
                        v_center_code: "139",
                        v_middle_img: "https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60314783_011.jpg",
                        v_elan_path: "https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60314783_001.jpg",
                        v_exterior_colorcd: "COLOR0040",
                        v_center_region: "경기/인천",
                        v_ecc_reg_dtm: "20191212165308",
                        v_begin_year: "2019",
                        n_inst_month: "0",
                        dbLinkValue: "@encarDBLink_real",
                        n_order: "9997",
                        v_makecd: "002",
                        v_class_headnm: "디젤 2.2 2WD",
                        n_month_price: "62",
                        v_class_detailcd: "003",
                        n_month_price_self: "0",
                        v_small_img: "https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60314783_013.jpg",
                        v_modelnm: "더 뉴 쏘렌토",
                        v_optioncd_name: "ABS|내비게이션|파워도어록|파워 윈도우|파워스티어링|가죽시트|알루미늄 휠|에어백 : 사이드|전동시트 : 운전석|열선시트 : 운전석|오토 에어컨|전동접이사이드미러|에어백 : 운전석|에어백 : 조수석|HID / LED 라이트|룸미러 : ECM|스티어링 휠 리모컨|감지센서 : 후방|TPMS : 타이어공기압감지|통풍시트 : 운전석|전동시트 : 조수석|차체자세 제어장치|에어백 : 커튼|스마트키|카메라 : 후방|파워 트렁크|루프랙|열선시트 : 뒷좌석|크루즈컨트롤|AUX 단자|USB 단자|룸미러 : 하이패스|전자식파킹브레이크|통풍시트 : 조수석|감지센서 : 전방|핸들 열선|오토 라이트|블루투스|열선시트 : 조수석|LDWS:차선이탈경보시스템",
                        v_car_type: "KOR",
                        v_youtube_flag: "N",
                        v_pn_mobile: "0504-3187-9129",
                        v_rec_comment: "무사고",
                        v_usernm: "이정현",
                        n_mileage: "11534",
                        v_simple_comment: "#신차급#드라이브와이즈#UVO순정내비#스타일2#1인신조#무사고#",
                        v_car_mobile_url: "/mobile/carinfo/car_detail.do?i_sCarCd=EC60314783",
                        v_trust_flag: "N",
                        v_modelnm_text: "더 뉴 쏘렌토",
                        v_transmissioncd: "001",
                        v_car_number: "56서2885",
                        n_tmp_num_idx2: "0",
                        req_sts_cd: "00",
                        n_price: "2870",
                        n_interest_rate: "0",
                        v_fuel_typecd_name: "디젤",
                        v_car_url: "https://www.kcar.com/car/info/car_info_detail.do?i_sCarCd=EC60314783",
                        v_class_headcd: "003",
                        v_tmp_list_idx1: "",
                        v_buy_flag: "Y",
                        v_fuel_typecd: "002",
                        v_tmp_list_idx2: "",
                        v_center_region_code: "INCHUN",
                        v_truck_name: "기아 더 뉴 쏘렌토 디젤 2.2 2WD 노블레스",
                        v_categorynm: "SUV",
                        v_class_detailnm: "노블레스",
                        v_exterior_colornm: "검정색",
                        v_hot_markcd: "09;10;29",
                        v_transmissioncd_name: "오토",
                        v_sell_empid: "3304",
                        v_ew_flag: "",
                        n_pass_cnt: "5",
                        v_del_flag: "",
                        v_3dview_flag: "2D",
                        v_discountcd: "",
                        v_modelcd: "133",
                        v_rent_status: "N",
                        v_rec_comment_cd: "001",
                        v_lease_type: "2",
                        v_makenm: "기아",
                        v_pn: "0504-1369-6489",
                        v_mfr_date: "201807",
                        v_tmp_str_idx1: "",
                        v_model_grp_cd: "027",
                        v_center_name: "김포공항직영점",
                        v_discount_flag: "N",
                        v_tmp_str_idx2: "",
                        v_ecc_update_dtm: "20191212165308",
                        v_model_grp_nm: "쏘렌토"
                    },
                    {
                        v_carcd: "EC60306079",
                        n_real_mile: "0",
                        n_auth_mile: "13.9",
                        v_truck_flag: "N",
                        v_optioncd: "001|003|005|006|007|008|010|014|015|017|021|022|023|024|026|027|031|032|055|058|062|071|076|082|083|086|088|091",
                        v_categorycd: "007",
                        v_center_code: "120",
                        v_middle_img: "https://img.kcar.com/carpicture/carpicture10/pic6030/kcar_60306079_011.jpg",
                        v_elan_path: "https://img.kcar.com/carpicture/carpicture10/pic6030/kcar_60306079_001.jpg",
                        v_exterior_colorcd: "COLOR0220",
                        v_center_region: "경기/인천",
                        v_ecc_reg_dtm: "20191121132939",
                        v_begin_year: "2011",
                        n_inst_month: "0",
                        dbLinkValue: "@encarDBLink_real",
                        n_order: "9996",
                        v_makecd: "003",
                        v_class_headnm: "2WD LT",
                        n_month_price: "17",
                        v_class_detailcd: "",
                        n_month_price_self: "0",
                        v_small_img: "https://img.kcar.com/carpicture/carpicture10/pic6030/kcar_60306079_013.jpg",
                        v_modelnm: "캡티바",
                        v_optioncd_name: "ABS|CD플레이어|내비게이션|파워도어록|파워 윈도우|파워스티어링|선루프|가죽시트|리모컨키|알루미늄 휠|전동시트 : 운전석|열선시트 : 운전석|오토 에어컨|전동접이사이드미러|에어백 : 운전석|에어백 : 조수석|스티어링 휠 리모컨|감지센서 : 후방|차체자세 제어장치|카메라 : 후방|루프랙|AUX 단자|전자식파킹브레이크|감지센서 : 전방|차량 메뉴얼|오토 라이트|블루투스|열선시트 : 조수석",
                        v_car_type: "KOR",
                        v_youtube_flag: "N",
                        v_pn_mobile: "0504-3187-4150",
                        v_rec_comment: "무사고",
                        v_usernm: "김선중",
                        n_mileage: "118107",
                        v_simple_comment: "★내비게이션+후방카메라★가성비 SUV★컨디션 굿★",
                        v_car_mobile_url: "/mobile/carinfo/car_detail.do?i_sCarCd=EC60306079",
                        v_trust_flag: "N",
                        v_modelnm_text: "캡티바",
                        v_transmissioncd: "001",
                        v_car_number: "68누5157",
                        n_tmp_num_idx2: "0",
                        req_sts_cd: "00",
                        n_price: "790",
                        n_interest_rate: "0",
                        v_fuel_typecd_name: "디젤",
                        v_car_url: "https://www.kcar.com/car/info/car_info_detail.do?i_sCarCd=EC60306079",
                        v_class_headcd: "002",
                        v_tmp_list_idx1: "",
                        v_buy_flag: "Y",
                        v_fuel_typecd: "002",
                        v_tmp_list_idx2: "",
                        v_center_region_code: "INCHUN",
                        v_truck_name: "쉐보레(GM대우) 캡티바 2WD LT",
                        v_categorynm: "SUV",
                        v_class_detailnm: "",
                        v_exterior_colornm: "쥐색",
                        v_hot_markcd: "19;22",
                        v_transmissioncd_name: "오토",
                        v_sell_empid: "3284",
                        v_ew_flag: "",
                        n_pass_cnt: "5",
                        v_del_flag: "",
                        v_3dview_flag: "2D",
                        v_discountcd: "",
                        v_modelcd: "077",
                        v_rent_status: "N",
                        v_rec_comment_cd: "001",
                        v_lease_type: "3",
                        v_makenm: "쉐보레(GM대우)",
                        v_pn: "0504-1369-1519",
                        v_mfr_date: "201107",
                        v_tmp_str_idx1: "",
                        v_model_grp_cd: "045",
                        v_center_name: "인천직영점",
                        v_discount_flag: "N",
                        v_tmp_str_idx2: "",
                        v_ecc_update_dtm: "20191217001410",
                        v_model_grp_nm: "캡티바"
                    },
                    {
                        v_carcd: "EC60305340",
                        n_real_mile: "0",
                        n_auth_mile: "0",
                        v_truck_flag: "N",
                        v_optioncd: "001|005|006|007|008|014|017|020|022|024|026|027|029|030|032|033|055|056|057|058|071|072|088|091",
                        v_categorycd: "002",
                        v_center_code: "075",
                        v_middle_img: "https://img.kcar.com/carpicture/carpicture10/pic6030/kcar_60305340_011.jpg",
                        v_elan_path: "https://img.kcar.com/carpicture/carpicture10/pic6030/kcar_60305340_001.jpg",
                        v_exterior_colorcd: "COLOR0220",
                        v_center_region: "경북",
                        v_ecc_reg_dtm: "20191112164644",
                        v_begin_year: "2018",
                        n_inst_month: "0",
                        dbLinkValue: "@encarDBLink_real",
                        n_order: "9999",
                        v_makecd: "054",
                        v_class_headnm: "기본형",
                        n_month_price: "51",
                        v_class_detailcd: "",
                        n_month_price_self: "0",
                        v_small_img: "https://img.kcar.com/carpicture/carpicture10/pic6030/kcar_60305340_013.jpg",
                        v_modelnm: "쿠퍼 (3세대) 5도어",
                        v_optioncd_name: "ABS|내비게이션|파워도어록|파워 윈도우|파워스티어링|가죽시트|알루미늄 휠|에어백 : 사이드|열선시트 : 운전석|전동접이사이드미러|에어백 : 운전석|에어백 : 조수석|HID / LED 라이트|룸미러 : ECM|감지센서 : 후방|TPMS : 타이어공기압감지|차체자세 제어장치|에어백 : 커튼|스마트키|카메라 : 후방|AUX 단자|USB 단자|블루투스|열선시트 : 조수석",
                        v_car_type: "IMP",
                        v_youtube_flag: "N",
                        v_pn_mobile: "0504-3187-2055",
                        v_rec_comment: "무사고",
                        v_usernm: "이준석",
                        n_mileage: "16968",
                        v_simple_comment: "#신차보증잔존 #짧은주행거리 #실내매우깔끔",
                        v_car_mobile_url: "/mobile/carinfo/car_detail.do?i_sCarCd=EC60305340",
                        v_trust_flag: "N",
                        v_modelnm_text: "쿠퍼 (3세대) 5도어",
                        v_transmissioncd: "001",
                        v_car_number: "60저9785",
                        n_tmp_num_idx2: "0",
                        req_sts_cd: "00",
                        n_price: "2390",
                        n_interest_rate: "0",
                        v_fuel_typecd_name: "가솔린",
                        v_car_url: "https://www.kcar.com/car/info/car_info_imported_detail.do?i_sCarCd=EC60305340",
                        v_class_headcd: "001",
                        v_tmp_list_idx1: "",
                        v_buy_flag: "Y",
                        v_fuel_typecd: "001",
                        v_tmp_list_idx2: "",
                        v_center_region_code: "DEGUE",
                        v_truck_name: "미니 쿠퍼 (3세대) 5도어 기본형",
                        v_categorynm: "소형차",
                        v_class_detailnm: "",
                        v_exterior_colornm: "쥐색",
                        v_hot_markcd: "19;26",
                        v_transmissioncd_name: "오토",
                        v_sell_empid: "3305",
                        v_ew_flag: "",
                        n_pass_cnt: "5",
                        v_del_flag: "",
                        v_3dview_flag: "2D",
                        v_discountcd: "",
                        v_modelcd: "138",
                        v_rent_status: "N",
                        v_rec_comment_cd: "001",
                        v_lease_type: "2",
                        v_makenm: "미니",
                        v_pn: "0504-1368-9420",
                        v_mfr_date: "201803",
                        v_tmp_str_idx1: "",
                        v_model_grp_cd: "001",
                        v_center_name: "구미직영점",
                        v_discount_flag: "N",
                        v_tmp_str_idx2: "",
                        v_ecc_update_dtm: "20191121155717",
                        v_model_grp_nm: "쿠퍼"
                    },
                    {
                        v_carcd: "EC60304578",
                        n_real_mile: "0",
                        n_auth_mile: "10.8",
                        v_truck_flag: "N",
                        v_optioncd: "001|005|006|007|008|010|014|015|017|019|020|021|022|023|024|026|027|029|030|031|032|033|034|035|051|055|056|057|058|059|063|068|076|077|078|080|081|082|086|088|091|094",
                        v_categorycd: "004",
                        v_center_code: "033",
                        v_middle_img: "https://img.kcar.com/carpicture/carpicture10/pic6030/kcar_60304578_011.jpg",
                        v_elan_path: "https://img.kcar.com/carpicture/carpicture10/pic6030/kcar_60304578_001.jpg",
                        v_exterior_colorcd: "COLOR0160",
                        v_center_region: "서울",
                        v_ecc_reg_dtm: "20191111152317",
                        v_begin_year: "2017",
                        n_inst_month: "0",
                        dbLinkValue: "@encarDBLink_real",
                        n_order: "9999",
                        v_makecd: "013",
                        v_class_headnm: "E300 아방가르드",
                        n_month_price: "89",
                        v_class_detailcd: "",
                        n_month_price_self: "0",
                        v_small_img: "https://img.kcar.com/carpicture/carpicture10/pic6030/kcar_60304578_013.jpg",
                        v_modelnm: "E-클래스 W213",
                        v_optioncd_name: "ABS|내비게이션|파워도어록|파워 윈도우|파워스티어링|선루프|가죽시트|리모컨키|알루미늄 휠|TCS : 미끄럼방지|에어백 : 사이드|전동시트 : 운전석|열선시트 : 운전석|오토 에어컨|전동접이사이드미러|에어백 : 운전석|에어백 : 조수석|HID / LED 라이트|룸미러 : ECM|스티어링 휠 리모컨|감지센서 : 후방|TPMS : 타이어공기압감지|통풍시트 : 운전석|전동시트 : 조수석|메모리시트 : 운전석|차체자세 제어장치|에어백 : 커튼|스마트키|카메라 : 후방|파워 트렁크|열선시트 : 뒷좌석|크루즈컨트롤|전자식파킹브레이크|통풍시트 : 조수석|메모리시트 : 조수석|카메라 : 전방|360도 어라운드 뷰|감지센서 : 전방|오토 라이트|블루투스|열선시트 : 조수석|헤드업 디스플레이(HUD)",
                        v_car_type: "IMP",
                        v_youtube_flag: "N",
                        v_pn_mobile: "0504-3187-1656",
                        v_rec_comment: "단순교환",
                        v_usernm: "최승호",
                        n_mileage: "64008",
                        v_simple_comment: "[서초]#저렴한 가격 #가성비 왕 #성능기록부상 무사고",
                        v_car_mobile_url: "/mobile/carinfo/car_detail.do?i_sCarCd=EC60304578",
                        v_trust_flag: "N",
                        v_modelnm_text: "E-클래스 W213",
                        v_transmissioncd: "001",
                        v_car_number: "15고0698",
                        n_tmp_num_idx2: "0",
                        req_sts_cd: "00",
                        n_price: "4140",
                        n_interest_rate: "0",
                        v_fuel_typecd_name: "가솔린",
                        v_car_url: "https://www.kcar.com/car/info/car_info_imported_detail.do?i_sCarCd=EC60304578",
                        v_class_headcd: "001",
                        v_tmp_list_idx1: "",
                        v_buy_flag: "Y",
                        v_fuel_typecd: "001",
                        v_tmp_list_idx2: "",
                        v_center_region_code: "SEOUL",
                        v_truck_name: "벤츠 E-클래스 W213 E300 아방가르드",
                        v_categorynm: "중형차",
                        v_class_detailnm: "",
                        v_exterior_colornm: "은색",
                        v_hot_markcd: "22;41",
                        v_transmissioncd_name: "오토",
                        v_sell_empid: "2584",
                        v_ew_flag: "",
                        n_pass_cnt: "5",
                        v_del_flag: "",
                        v_3dview_flag: "2D",
                        v_discountcd: "",
                        v_modelcd: "072",
                        v_rent_status: "N",
                        v_rec_comment_cd: "003",
                        v_lease_type: "3",
                        v_makenm: "벤츠",
                        v_pn: "0504-1368-9017",
                        v_mfr_date: "201607",
                        v_tmp_str_idx1: "",
                        v_model_grp_cd: "004",
                        v_center_name: "서초직영점",
                        v_discount_flag: "N",
                        v_tmp_str_idx2: "",
                        v_ecc_update_dtm: "20191214001133",
                        v_model_grp_nm: "E-클래스"
                    },
                    {
                        v_carcd: "EC60318102",
                        n_real_mile: "0",
                        n_auth_mile: "10.2",
                        v_truck_flag: "N",
                        v_optioncd: "001|003|005|006|007|008|010|014|017|020|022|023|024|026|027|030|031|032|054|055|057|058|062|	068|071|072|074|083|086|091",
                        v_categorycd: "008",
                        v_center_code: "105",
                        v_middle_img: "https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60318102_011.jpg",
                        v_elan_path: "https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60318102_001.jpg",
                        v_exterior_colorcd: "COLOR0230",
                        v_center_region: "경기/인천",
                        v_ecc_reg_dtm: "20191230145314",
                        v_begin_year: "2013",
                        n_inst_month: "0",
                        dbLinkValue: "@encarDBLink_real",
                        n_order: "9998",
                        v_makecd: "002",
                        v_class_headnm: "그랜드 카니발 GLX",
                        n_month_price: "24",
                        v_class_detailcd: "006",
                        n_month_price_self: "0",
                        v_small_img: "https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60318102_013.jpg",
                        v_modelnm: "카니발 R",
                        v_optioncd_name: "ABS|CD플레이어|내비게이션|파워도어록|파워 윈도우|파워스티어링|선루프|가죽시트|알루미늄 휠|에어백 : 사이드|열선시트 : 운전석|오토 에어컨|전동접이사이드미러|에어백 : 운전석|에어백 : 조수석|룸미러 : ECM|스티어링 휠 리모컨|감지센서 : 후방|뒷좌석 모니터|차체자세 제어장치|스마트키|카메라 : 	후방|루프랙|크루즈컨트롤|AUX 단자|USB 단자|룸미러 : 하이패스|차량 메뉴얼|오토 라이트|열선시트 : 조수석",
                        v_car_type: "KOR",
                        v_youtube_flag: "N",
                        v_pn_mobile: "0504-3188-2969",
                        v_rec_comment: "무사고",
                        v_usernm: "박승규",
                        n_mileage: "149614",
                        v_simple_comment: "★깔끔한 차량상태 ★속도제한無 ★썬루프&내비",
                        v_car_mobile_url: "/mobile/carinfo/car_detail.do?i_sCarCd=EC60318102",
                        v_trust_flag: "N",
                        v_modelnm_text: "카니발 R",
                        v_transmissioncd: "001",
                        v_car_number: "70주5275",
                        n_tmp_num_idx2: "0",
                        req_sts_cd: "00",
                        n_price: "1100",
                        n_interest_rate: "0",
                        v_fuel_typecd_name: "디젤",
                        v_car_url: "https://www.kcar.com/car/info/car_info_detail.do?i_sCarCd=EC60318102",
                        v_class_headcd: "002",
                        v_tmp_list_idx1: "",
                        v_buy_flag: "Y",
                        v_fuel_typecd: "002",
                        v_tmp_list_idx2: "",
                        v_center_region_code: "INCHUN",
                        v_truck_name: "기아 카니발 R 그랜드 카니발 GLX 프리미엄",
                        v_categorynm: "RV",
                        v_class_detailnm: "프리미엄",
                        v_exterior_colornm: "진주색",
                        v_hot_markcd: "10",
                        v_transmissioncd_name: "오토",
                        v_sell_empid: "3290",
                        v_ew_flag: "",
                        n_pass_cnt: "11",
                        v_del_flag: "",
                        v_3dview_flag: "2D",
                        v_discountcd: "",
                        v_modelcd: "090",
                        v_rent_status: "N",
                        v_rec_comment_cd: "001",
                        v_lease_type: "3",
                        v_makenm: "기아",
                        v_pn: "0504-1370-0317",
                        v_mfr_date: "201302",
                        v_tmp_str_idx1: "",
                        v_model_grp_cd: "036",
                        v_center_name: "의정부직영점",
                        v_discount_flag: "N",
                        v_tmp_str_idx2: "",
                        v_ecc_update_dtm: "20191230175627",
                        v_model_grp_nm: "카니발"
                    },
                    {
                        v_carcd: "EC60319028",
                        n_real_mile: "0",
                        n_auth_mile: "0",
                        v_truck_flag: "N",
                        v_optioncd: "001|003|006|007|008|015|017|020|023|026|027|030|031|032|033|055|058|068|071|072|083|086|088",
                        v_categorycd: "007",
                        v_center_code: "109",
                        v_middle_img: "https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60319028_011.jpg",
                        v_elan_path: "https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60319028_001.jpg",
                        v_exterior_colorcd: "COLOR0040",
                        v_center_region: "경기/인천",
                        v_ecc_reg_dtm: "20191230173934",
                        v_begin_year: "2017",
                        n_inst_month: "0",
                        dbLinkValue: "@encarDBLink_real",
                        n_order: "9997",
                        v_makecd: "083",
                        v_class_headnm: "3.6 루비콘 4도어",
                        n_month_price: "71",
                        v_class_detailcd: "",
                        n_month_price_self: "0",
                        v_small_img: "https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60319028_013.jpg",
                        v_modelnm: "랭글러 (JK)",
                        v_optioncd_name: "ABS|CD플레이어|파워도어록|파워 윈도우|파워스티어링|리모컨키|알루미늄 휠|에어백 : 사이드|오토 에어컨|에어백 : 운전석|에어백 : 조수석|룸미러 : ECM|스티어링 휠 리모컨|감지센서 : 후방|TPMS : 타이어공기압감지|차체자세 제어장치|카메라 : 후방|크루즈컨트롤|AUX 단자|USB 단자|차량 메뉴얼|오토 라이트|블루투스",
                        v_car_type: "IMP",
                        v_youtube_flag: "N",
                        v_pn_mobile: "0504-3188-3098",
                        v_rec_comment: "무사고",
                        v_usernm: "백인호",
                        n_mileage: "25472",
                        v_simple_comment: "#따끈따끈#1인신조#제조사보증잔존#짧은주행거리",
                        v_car_mobile_url: "/mobile/carinfo/car_detail.do?i_sCarCd=EC60319028",
                        v_trust_flag: "N",
                        v_modelnm_text: "랭글러 (JK)",
                        v_transmissioncd: "001",
                        v_car_number: "52서6612",
                        n_tmp_num_idx2: "0",
                        req_sts_cd: "00",
                        n_price: "3290",
                        n_interest_rate: "0",
                        v_fuel_typecd_name: "가솔린",
                        v_car_url: "https://www.kcar.com/car/info/car_info_imported_detail.do?i_sCarCd=EC60319028",
                        v_class_headcd: "017",
                        v_tmp_list_idx1: "",
                        v_buy_flag: "Y",
                        v_fuel_typecd: "001",
                        v_tmp_list_idx2: "",
                        v_center_region_code: "INCHUN",
                        v_truck_name: "지프 랭글러 (JK) 3.6 루비콘 4도어",
                        v_categorynm: "SUV",
                        v_class_detailnm: "",
                        v_exterior_colornm: "검정색",
                        v_hot_markcd: "10;19;30",
                        v_transmissioncd_name: "오토",
                        v_sell_empid: "3293",
                        v_ew_flag: "",
                        n_pass_cnt: "5",
                        v_del_flag: "",
                        v_3dview_flag: "2D",
                        v_discountcd: "",
                        v_modelcd: "011",
                        v_rent_status: "N",
                        v_rec_comment_cd: "001",
                        v_lease_type: "2",
                        v_makenm: "지프",
                        v_pn: "0504-1370-0448",
                        v_mfr_date: "201712",
                        v_tmp_str_idx1: "",
                        v_model_grp_cd: "001",
                        v_center_name: "분당용인직영점",
                        v_discount_flag: "N",
                        v_tmp_str_idx2: "",
                        v_ecc_update_dtm: "20191230173934",
                        v_model_grp_nm: "랭글러"
                    },
                    {
                        v_carcd: "EC60315506",
                        n_real_mile: "0",
                        n_auth_mile: "17.7",
                        v_truck_flag: "N",
                        v_optioncd: "001|005|006|007|017|020|022|023|024|026|027|031|032|033|055|057|058|068|083|086|088|091",
                        v_categorycd: "007",
                        v_center_code: "034",
                        v_middle_img: "https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60315506_011.jpg",
                        v_elan_path: "https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60315506_001.jpg",
                        v_exterior_colorcd: "COLOR0040",
                        v_center_region: "경기/인천",
                        v_ecc_reg_dtm: "20191219132111",
                        v_begin_year: "2016",
                        n_inst_month: "0",
                        dbLinkValue: "@encarDBLink_real",
                        n_order: "9996",
                        v_makecd: "005",
                        v_class_headnm: "LE",
                        n_month_price: "23",
                        v_class_detailcd: "%",
                        n_month_price_self: "0",
                        v_small_img: "https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60315506_013.jpg",
                        v_modelnm: "QM3",
                        v_optioncd_name: "ABS|내비게이션|파워도어록|파워 윈도우|알루미늄 휠|에어백 : 사이드|열선시트 : 운전석|오토 에어컨|전동접이사이드미러|에어백 : 운전석|에어백 : 조수석|스티어링 휠 리모컨|감지센서 : 후방|TPMS : 타이어공기압감지|차체자세 제어장치|스마트키|카메라 : 후방|크루즈컨트롤|차량 메뉴얼|오토 라이트|블루투스|열선시트 : 조수석",
                        v_car_type: "KOR",
                        v_youtube_flag: "N",
                        v_pn_mobile: "0504-3188-0709",
                        v_rec_comment: "단순사고(접촉)",
                        v_usernm: "심재강",
                        n_mileage: "56149",
                        v_simple_comment: "☆ 17.7km/L의 우수한 등록증상 연비 ☆ T2C 네비게이션 ☆",
                        v_car_mobile_url: "/mobile/carinfo/car_detail.do?i_sCarCd=EC60315506",
                        v_trust_flag: "N",
                        v_modelnm_text: "QM3",
                        v_transmissioncd: "001",
                        v_car_number: "235라1204",
                        n_tmp_num_idx2: "0",
                        req_sts_cd: "00",
                        n_price: "1080",
                        n_interest_rate: "0",
                        v_fuel_typecd_name: "디젤",
                        v_car_url: "https://www.kcar.com/car/info/car_info_detail.do?i_sCarCd=EC60315506",
                        v_class_headcd: "001",
                        v_tmp_list_idx1: "",
                        v_buy_flag: "Y",
                        v_fuel_typecd: "002",
                        v_tmp_list_idx2: "",
                        v_center_region_code: "INCHUN",
                        v_truck_name: "르노삼성 QM3 LE",
                        v_categorynm: "SUV",
                        v_class_detailnm: "",
                        v_exterior_colornm: "검정색",
                        v_hot_markcd: "",
                        v_transmissioncd_name: "오토",
                        v_sell_empid: "3379",
                        v_ew_flag: "",
                        n_pass_cnt: "5",
                        v_del_flag: "",
                        v_3dview_flag: "2D",
                        v_discountcd: "",
                        v_modelcd: "059",
                        v_rent_status: "N",
                        v_rec_comment_cd: "002",
                        v_lease_type: "3",
                        v_makenm: "르노삼성",
                        v_pn: "0504-1369-8062",
                        v_mfr_date: "201607",
                        v_tmp_str_idx1: "",
                        v_model_grp_cd: "009",
                        v_center_name: "수원직영점",
                        v_discount_flag: "N",
                        v_tmp_str_idx2: "",
                        v_ecc_update_dtm: "20191223122655",
                        v_model_grp_nm: "QM3"
                    },
                    {
                        v_carcd: "EC60280436",
                        n_real_mile: "0",
                        n_auth_mile: "13.1",
                        v_truck_flag: "N",
                        v_optioncd: "001|005|006|007|008|014|015|017|019|020|022|023|024|026|027|031|032|033|055|056|058|071|072|086|088|091",
                        v_categorycd: "003",
                        v_center_code: "136",
                        v_middle_img: "https://img.kcar.com/carpicture/carpicture08/pic6028/kcar_60280436_011.jpg",
                        v_elan_path: "https://img.kcar.com/carpicture/carpicture08/pic6028/kcar_60280436_001.jpg",
                        v_exterior_colorcd: "COLOR0250",
                        v_center_region: "서울",
                        v_ecc_reg_dtm: "20190830181617",
                        v_begin_year: "2017",
                        n_inst_month: "0",
                        dbLinkValue: "@encarDBLink_real",
                        n_order: "9996",
                        v_makecd: "001",
                        v_class_headnm: "1.6 GDI 스마트",
                        n_month_price: "19",
                        v_class_detailcd: "001",
                        n_month_price_self: "0",
                        v_small_img: "https://img.kcar.com/carpicture/carpicture08/pic6028/kcar_60280436_013.jpg",
                        v_modelnm: "아반떼 AD",
                        v_optioncd_name: "ABS|내비게이션|파워도어록|파워 윈도우|파워스티어링|가죽시트|리모컨키|알루미늄 휠|TCS : 미끄럼방지|에어백 : 사이드|열선시트 : 운전석|오토 에어컨|전동접이사이드미러|에어백 : 운전석|에어백 : 조수석|스티어링 휠 리모컨|감지센서 : 후방|TPMS : 타이어공기압감지|차체자세 제어장치|에어백 : 커튼|카메라 : 후방|AUX 단자|USB 단자|오토 라이트|블루투스|열선시트 : 조수석",
                        v_car_type: "KOR",
                        v_youtube_flag: "N",
                        v_pn_mobile: "0504-3185-5875",
                        v_rec_comment: "사고",
                        v_usernm: "오진식",
                        n_mileage: "36176",
                        v_simple_comment: "[저렴한 준중형 세단][가성비 갑!!!][준신차급 차량상태]",
                        v_car_mobile_url: "/mobile/carinfo/car_detail.do?i_sCarCd=EC60280436",
                        v_trust_flag: "N",
                        v_modelnm_text: "아반떼 AD",
                        v_transmissioncd: "001",
                        v_car_number: "55어7044",
                        n_tmp_num_idx2: "0",
                        req_sts_cd: "00",
                        n_price: "890",
                        n_interest_rate: "0",
                        v_fuel_typecd_name: "가솔린",
                        v_car_url: "https://www.kcar.com/car/info/car_info_detail.do?i_sCarCd=EC60280436",
                        v_class_headcd: "002",
                        v_tmp_list_idx1: "",
                        v_buy_flag: "Y",
                        v_fuel_typecd: "001",
                        v_tmp_list_idx2: "",
                        v_center_region_code: "SEOUL",
                        v_truck_name: "현대 아반떼 AD 1.6 GDI 스마트 세부등급 없음",
                        v_categorynm: "준중형차",
                        v_class_detailnm: "세부등급 없음",
                        v_exterior_colornm: "청색",
                        v_hot_markcd: "09;19;29",
                        v_transmissioncd_name: "오토",
                        v_sell_empid: "3175",
                        v_ew_flag: "",
                        n_pass_cnt: "5",
                        v_del_flag: "",
                        v_3dview_flag: "2D",
                        v_discountcd: "",
                        v_modelcd: "136",
                        v_rent_status: "N",
                        v_rec_comment_cd: "004",
                        v_lease_type: "3",
                        v_makenm: "현대",
                        v_pn: "0504-1367-3265",
                        v_mfr_date: "201610",
                        v_tmp_str_idx1: "",
                        v_model_grp_cd: "019",
                        v_center_name: "서서울직영점",
                        v_discount_flag: "N",
                        v_tmp_str_idx2: "",
                        v_ecc_update_dtm: "20200101100150",
                        v_model_grp_nm: "아반떼"
                    },
                    {
                        v_carcd: "EC60319492",
                        n_real_mile: "0",
                        n_auth_mile: "16.1",
                        v_truck_flag: "N",
                        v_optioncd: "001|005|006|007|008|010|015|017|020|022|023|024|026|027|029|030|031|032|033|055|056|058|071|072|076|082|086|088|091",
                        v_categorycd: "003",
                        v_center_code: "129",
                        v_middle_img: "https://img.kcar.com/3dcarpicture/2019/12/129/60319492_1/main/main780.jpg",
                        v_elan_path: "https://img.kcar.com/3dcarpicture/2019/12/129/60319492_1/main/main780.jpg",
                        v_exterior_colorcd: "COLOR0190",
                        v_center_region: "전북",
                        v_ecc_reg_dtm: "20191230091919",
                        v_begin_year: "2016",
                        n_inst_month: "0",
                        dbLinkValue: "@encarDBLink_real",
                        n_order: "9992",
                        v_makecd: "014",
                        v_class_headnm: "2.0 TDI",
                        n_month_price: "37",
                        v_class_detailcd: "",
                        n_month_price_self: "0",
                        v_small_img: "https://img.kcar.com/3dcarpicture/2019/12/129/60319492_1/main/main780.jpg",
                        v_modelnm: "골프 7세대",
                        v_optioncd_name: "ABS|내비게이션|파워도어록|파워 윈도우|파워스티어링|선루프|리모컨키|알루미늄 휠|에어백 : 사이드|열선시트 : 운전석|오토 에어컨|전동접이사이드미러|에어백 : 운전석|에어백 : 조수석|HID / LED 라이트|룸미러 : ECM|스티어링 휠 리모컨|감지센서 : 후방|TPMS : 타이어공기압감지|차체자세 제어장치|에어백 : 커튼|카메라 : 후방|AUX 단자|USB 단자|전자식파킹브레이크|감지센서 : 전방|오토 라이트|블루투스|열선시트 : 조수석",
                        v_car_type: "IMP",
                        v_youtube_flag: "N",
                        v_pn_mobile: "0504-3188-2856",
                        v_rec_comment: "단순교환",
                        v_usernm: "심금로",
                        n_mileage: "55039",
                        v_simple_comment: "짧은 주행거리/네비게이션 장착/코일매트",
                        v_car_mobile_url: "/mobile/carinfo/car_detail.do?i_sCarCd=EC60319492",
                        v_trust_flag: "N",
                        v_modelnm_text: "골프 7세대",
                        v_transmissioncd: "001",
                        v_car_number: "04가0221",
                        n_tmp_num_idx2: "0",
                        req_sts_cd: "00",
                        n_price: "1720",
                        n_interest_rate: "0",
                        v_fuel_typecd_name: "디젤",
                        v_car_url: "https://www.kcar.com/car/info/car_info_imported_detail.do?i_sCarCd=EC60319492",
                        v_class_headcd: "002",
                        v_tmp_list_idx1: "",
                        v_buy_flag: "Y",
                        v_fuel_typecd: "002",
                        v_tmp_list_idx2: "",
                        v_center_region_code: "JUNJU",
                        v_truck_name: "폭스바겐 골프 7세대 2.0 TDI",
                        v_categorynm: "준중형차",
                        v_class_detailnm: "",
                        v_exterior_colornm: "은회색",
                        v_hot_markcd: "19",
                        v_transmissioncd_name: "오토",
                        v_sell_empid: "2877",
                        v_ew_flag: "",
                        n_pass_cnt: "5",
                        v_del_flag: "",
                        v_3dview_flag: "3D",
                        v_discountcd: "",
                        v_modelcd: "031",
                        v_rent_status: "N",
                        v_rec_comment_cd: "003",
                        v_lease_type: "3",
                        v_makenm: "폭스바겐",
                        v_pn: "0504-1370-0204",
                        v_mfr_date: "201603",
                        v_tmp_str_idx1: "",
                        v_model_grp_cd: "007",
                        v_center_name: "전주직영점",
                        v_discount_flag: "N",
                        v_tmp_str_idx2: "",
                        v_ecc_update_dtm: "20191231132929",
                        v_model_grp_nm: "골프"
                    },
                    {
                        v_carcd: "EC60293015",
                        n_real_mile: "0",
                        n_auth_mile: "0",
                        v_truck_flag: "N",
                        v_optioncd: "001|003|005|006|007|008|014|017|020|021|022|023|024|026|027|029|030|031|032|033|034|035|055|056|057|058|063|068|071|072|074|076|077|082|083|084|086|088|091|094",
                        v_categorycd: "005",
                        v_center_code: "068",
                        v_middle_img: "https://img.kcar.com/carpicture/carpicture09/pic6029/kcar_60293015_011.jpg",
                        v_elan_path: "https://img.kcar.com/carpicture/carpicture09/pic6029/kcar_60293015_001.jpg",
                        v_exterior_colorcd: "COLOR0040",
                        v_center_region: "경남",
                        v_ecc_reg_dtm: "20191010130540",
                        v_begin_year: "2016",
                        n_inst_month: "0",
                        dbLinkValue: "@encarDBLink_real",
                        n_order: "9992",
                        v_makecd: "001",
                        v_class_headnm: "G300 모던 스페셜",
                        n_month_price: "41",
                        v_class_detailcd: "%",
                        n_month_price_self: "0",
                        v_small_img: "https://img.kcar.com/carpicture/carpicture09/pic6029/kcar_60293015_013.jpg",
                        v_modelnm: "아슬란",
                        v_optioncd_name: "ABS|CD플레이어|내비게이션|파워도어록|파워 윈도우|파워스티어링|가죽시트|알루미늄 휠|에어백 : 사이드|전동시트 : 운전석|열선시트 : 운전석|오토 에어컨|전동접이사이드미러|에어백 : 운전석|에어백 : 조수석|HID / LED 라이트|룸미러 : ECM|스티어링 휠 리모컨|감지센서 : 후방|TPMS : 타이어공기압감지|통풍시트 : 운전석|전동시트 : 조수석|차체자세 제어장치|에어백 : 커튼|스마트키|카메라 : 후방|열선시트 : 뒷좌석|크루즈컨트롤|AUX 단자|USB 단자|룸미러 : 하이패스|전자식파킹브레이크|통풍시트 : 조수석|감지센서 : 전방|차량 메뉴얼|핸들 열선|오토 라이트|블루투스|열선시트 : 조수석|헤드업 디스플레이(HUD)",
                        v_car_type: "KOR",
                        v_youtube_flag: "N",
                        v_pn_mobile: "0504-3186-3819",
                        v_rec_comment: "무사고",
                        v_usernm: "이정표",
                        n_mileage: "60525",
                        v_simple_comment: "◆ 무사고! 보험이력0건! 짧은 키로수! 신형번호판! ◆",
                        v_car_mobile_url: "/mobile/carinfo/car_detail.do?i_sCarCd=EC60293015",
                        v_trust_flag: "N",
                        v_modelnm_text: "아슬란",
                        v_transmissioncd: "001",
                        v_car_number: "282어6344",
                        n_tmp_num_idx2: "0",
                        req_sts_cd: "00",
                        n_price: "1920",
                        n_interest_rate: "0",
                        v_fuel_typecd_name: "가솔린",
                        v_car_url: "https://www.kcar.com/car/info/car_info_detail.do?i_sCarCd=EC60293015",
                        v_class_headcd: "005",
                        v_tmp_list_idx1: "",
                        v_buy_flag: "Y",
                        v_fuel_typecd: "001",
                        v_tmp_list_idx2: "",
                        v_center_region_code: "BUSAN",
                        v_truck_name: "현대 아슬란 G300 모던 스페셜",
                        v_categorynm: "대형차",
                        v_class_detailnm: "",
                        v_exterior_colornm: "검정색",
                        v_hot_markcd: "19;22;30",
                        v_transmissioncd_name: "오토",
                        v_sell_empid: "3439",
                        v_ew_flag: "",
                        n_pass_cnt: "5",
                        v_del_flag: "",
                        v_3dview_flag: "2D",
                        v_discountcd: "",
                        v_modelcd: "127",
                        v_rent_status: "N",
                        v_rec_comment_cd: "001",
                        v_lease_type: "2",
                        v_makenm: "현대",
                        v_pn: "0504-1368-1194",
                        v_mfr_date: "201509",
                        v_tmp_str_idx1: "",
                        v_model_grp_cd: "051",
                        v_center_name: "부산직영점",
                        v_discount_flag: "N",
                        v_tmp_str_idx2: "",
                        v_ecc_update_dtm: "20191220131205",
                        v_model_grp_nm: "아슬란"
                    },
                    {
                        v_carcd: "EC60309846",
                        n_real_mile: "0",
                        n_auth_mile: "15",
                        v_truck_flag: "N",
                        v_optioncd: "001|003|006|007|008|010|014|015|017|022|023|024|026|027|030|031|032|057|062|071|072|074|088|091",
                        v_categorycd: "003",
                        v_center_code: "140",
                        v_middle_img: "https://img.kcar.com/3dcarpicture/2019/12/140/60309846_1/main/main780.jpg",
                        v_elan_path: "https://img.kcar.com/3dcarpicture/2019/12/140/60309846_1/main/main780.jpg",
                        v_exterior_colorcd: "COLOR0220",
                        v_center_region: "경기/인천",
                        v_ecc_reg_dtm: "20191203151043",
                        v_begin_year: "2011",
                        n_inst_month: "0",
                        dbLinkValue: "@encarDBLink_real",
                        n_order: "9991",
                        v_makecd: "002",
                        v_class_headnm: "1.6 2U",
                        n_month_price: "12",
                        v_class_detailcd: "003",
                        n_month_price_self: "0",
                        v_small_img: "https://img.kcar.com/3dcarpicture/2019/12/140/60309846_1/main/main780.jpg",
                        v_modelnm: "쏘울",
                        v_optioncd_name: "ABS|CD플레이어|파워도어록|파워 윈도우|파워스티어링|선루프|가죽시트|리모컨키|알루미늄 휠|열선시트 : 운전석|오토 에어컨|전동접이사이드미러|에어백 : 운전석|에어백 : 조수석|룸미러 : ECM|스티어링 휠 리모컨|감지센서 : 후방|스마트키|루프랙|AUX 단자|USB 단자|룸미러 : 하이패스|블루투스|열선시트 : 조수석",
                        v_car_type: "KOR",
                        v_youtube_flag: "N",
                        v_pn_mobile: "0504-3187-6773",
                        v_rec_comment: "사고",
                        v_usernm: "이승민",
                        n_mileage: "39682",
                        v_simple_comment: "1인소유 선루프 타이어상태굿!!",
                        v_car_mobile_url: "/mobile/carinfo/car_detail.do?i_sCarCd=EC60309846",
                        v_trust_flag: "N",
                        v_modelnm_text: "쏘울",
                        v_transmissioncd: "001",
                        v_car_number: "61머7657",
                        n_tmp_num_idx2: "0",
                        req_sts_cd: "00",
                        n_price: "540",
                        n_interest_rate: "0",
                        v_fuel_typecd_name: "가솔린",
                        v_car_url: "https://www.kcar.com/car/info/car_info_detail.do?i_sCarCd=EC60309846",
                        v_class_headcd: "003",
                        v_tmp_list_idx1: "",
                        v_buy_flag: "Y",
                        v_fuel_typecd: "001",
                        v_tmp_list_idx2: "",
                        v_center_region_code: "INCHUN",
                        v_truck_name: "기아 쏘울 1.6 2U 쿨",
                        v_categorynm: "준중형차",
                        v_class_detailnm: "쿨",
                        v_exterior_colornm: "쥐색",
                        v_hot_markcd: "10;19",
                        v_transmissioncd_name: "오토",
                        v_sell_empid: "2511",
                        v_ew_flag: "",
                        n_pass_cnt: "5",
                        v_del_flag: "",
                        v_3dview_flag: "3D",
                        v_discountcd: "",
                        v_modelcd: "086",
                        v_rent_status: "N",
                        v_rec_comment_cd: "004",
                        v_lease_type: "3",
                        v_makenm: "기아",
                        v_pn: "0504-1369-4136",
                        v_mfr_date: "201107",
                        v_tmp_str_idx1: "",
                        v_model_grp_cd: "028",
                        v_center_name: "용인기흥직영점",
                        v_discount_flag: "N",
                        v_tmp_str_idx2: "",
                        v_ecc_update_dtm: "20191228001210",
                        v_model_grp_nm: "쏘울"
                    },
                    {
                        v_carcd: "EC60311317",
                        n_real_mile: "0",
                        n_auth_mile: "15.3",
                        v_truck_flag: "N",
                        v_optioncd: "001|006|007|008|014|015|017|019|020|022|024|026|027|031|032|033|055|056|068|071|072|088|091|092",
                        v_categorycd: "001",
                        v_center_code: "144",
                        v_middle_img: "https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60311317_011.jpg",
                        v_elan_path: "https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60311317_001.jpg",
                        v_exterior_colorcd: "COLOR0230",
                        v_center_region: "경기/인천",
                        v_ecc_reg_dtm: "20191210134514",
                        v_begin_year: "2016",
                        n_inst_month: "0",
                        dbLinkValue: "@encarDBLink_real",
                        n_order: "9990",
                        v_makecd: "003",
                        v_class_headnm: "LTZ",
                        n_month_price: "13",
                        v_class_detailcd: "%",
                        n_month_price_self: "0",
                        v_small_img: "https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60311317_013.jpg",
                        v_modelnm: "더 넥스트 스파크",
                        v_optioncd_name: "ABS|파워도어록|파워 윈도우|파워스티어링|가죽시트|리모컨키|알루미늄 휠|TCS : 미끄럼방지|에어백 : 사이드|열선시트 : 운전석|전동접이사이드미러|에어백 : 운전석|에어백 : 조수석|스티어링 휠 리모컨|감지센서 : 후방|TPMS : 타이어공기압감지|차체자세 제어장치|에어백 : 커튼|크루즈컨트롤|AUX 단자|USB 단자|블루투스|열선시트 : 조수석|LDWS:차선이탈경보시스템",
                        v_car_type: "KOR",
                        v_youtube_flag: "N",
                        v_pn_mobile: "0504-3187-8396",
                        v_rec_comment: "사고",
                        v_usernm: "정용진",
                        n_mileage: "77480",
                        v_simple_comment: "★ 차선이탈 보조 시스템!! / 후측방 경보 시스템!! / 경차혜택!",
                        v_car_mobile_url: "/mobile/carinfo/car_detail.do?i_sCarCd=EC60311317",
                        v_trust_flag: "N",
                        v_modelnm_text: "더 넥스트 스파크",
                        v_transmissioncd: "001",
                        v_car_number: "358오6208",
                        n_tmp_num_idx2: "0",
                        req_sts_cd: "00",
                        n_price: "590",
                        n_interest_rate: "0",
                        v_fuel_typecd_name: "가솔린",
                        v_car_url: "https://www.kcar.com/car/info/car_info_detail.do?i_sCarCd=EC60311317",
                        v_class_headcd: "004",
                        v_tmp_list_idx1: "",
                        v_buy_flag: "Y",
                        v_fuel_typecd: "001",
                        v_tmp_list_idx2: "",
                        v_center_region_code: "INCHUN",
                        v_truck_name: "쉐보레(GM대우) 더 넥스트 스파크 LTZ",
                        v_categorynm: "경차",
                        v_class_detailnm: "",
                        v_exterior_colornm: "진주색",
                        v_hot_markcd: "22",
                        v_transmissioncd_name: "오토",
                        v_sell_empid: "3396",
                        v_ew_flag: "",
                        n_pass_cnt: "5",
                        v_del_flag: "",
                        v_3dview_flag: "2D",
                        v_discountcd: "",
                        v_modelcd: "086",
                        v_rent_status: "N",
                        v_rec_comment_cd: "004",
                        v_lease_type: "3",
                        v_makenm: "쉐보레(GM대우)",
                        v_pn: "0504-1369-5758",
                        v_mfr_date: "201609",
                        v_tmp_str_idx1: "",
                        v_model_grp_cd: "043",
                        v_center_name: "수원신갈직영점",
                        v_discount_flag: "N",
                        v_tmp_str_idx2: "",
                        v_ecc_update_dtm: "20191210162902",
                        v_model_grp_nm: "스파크"
                    }, {
                        v_carcd: "EC60317229",
                        n_real_mile: "0",
                        n_auth_mile: "13.3",
                        v_truck_flag: "N",
                        v_optioncd: "001|003|005|006|007|008|014|015|020|022|024|026|027|031|032|056|058|071|072|074|083|088|091",
                        v_categorycd: "002",
                        v_center_code: "071",
                        v_middle_img: "https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60317229_011.jpg",
                        v_elan_path: "https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60317229_001.jpg",
                        v_exterior_colorcd: "COLOR0130",
                        v_center_region: "충남",
                        v_ecc_reg_dtm: "20191218141459",
                        v_begin_year: "2012",
                        n_inst_month: "0",
                        dbLinkValue: "@encarDBLink_real",
                        n_order: "9990",
                        v_makecd: "002",
                        v_class_headnm: "1.4 MPI 해치백",
                        n_month_price: "13",
                        v_class_detailcd: "003",
                        n_month_price_self: "0",
                        v_small_img: "https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60317229_013.jpg",
                        v_modelnm: "올 뉴 프라이드",
                        v_optioncd_name: "ABS|CD플레이어|내비게이션|파워도어록|파워 윈도우|파워스티어링|가죽시트|리모컨키|에어백 : 사이드|열선시트 : 운전석|전동접이사이드미러|에어백 : 운전석|에어백 : 조수석|스티어링 휠 리모컨|감지센서 : 후방|에어백 : 커튼|카메라 : 후방|AUX 단자|USB 단자|룸미러 : 하이패스|차량 메뉴얼|블루투스|열선시트 : 조수석",
                        v_car_type: "KOR",
                        v_youtube_flag: "N",
                        v_pn_mobile: "0504-3188-0363",
                        v_rec_comment: "단순교환",
                        v_usernm: "오남수",
                        n_mileage: "55956",
                        v_simple_comment: "네비,후방,저렴한소형차량,연비좋은차량 ★",
                        v_car_mobile_url: "/mobile/carinfo/car_detail.do?i_sCarCd=EC60317229",
                        v_trust_flag: "N",
                        v_modelnm_text: "올 뉴 프라이드",
                        v_transmissioncd: "001",
                        v_car_number: "37러3929",
                        n_tmp_num_idx2: "0",
                        req_sts_cd: "00",
                        n_price: "590",
                        n_interest_rate: "0",
                        v_fuel_typecd_name: "가솔린",
                        v_car_url: "https://www.kcar.com/car/info/car_info_detail.do?i_sCarCd=EC60317229",
                        v_class_headcd: "003",
                        v_tmp_list_idx1: "",
                        v_buy_flag: "Y",
                        v_fuel_typecd: "001",
                        v_tmp_list_idx2: "",
                        v_center_region_code: "DEJUN",
                        v_truck_name: "기아 올 뉴 프라이드 1.4 MPI 해치백 디럭스",
                        v_categorynm: "소형차",
                        v_class_detailnm: "디럭스",
                        v_exterior_colornm: "빨간색",
                        v_hot_markcd: "09;19",
                        v_transmissioncd_name: "오토",
                        v_sell_empid: "3174",
                        v_ew_flag: "",
                        n_pass_cnt: "5",
                        v_del_flag: "",
                        v_3dview_flag: "2D",
                        v_discountcd: "",
                        v_modelcd: "098",
                        v_rent_status: "N",
                        v_rec_comment_cd: "003",
                        v_lease_type: "3",
                        v_makenm: "기아",
                        v_pn: "0504-1369-7717",
                        v_mfr_date: "201209",
                        v_tmp_str_idx1: "",
                        v_model_grp_cd: "053",
                        v_center_name: "천안직영점",
                        v_discount_flag: "N",
                        v_tmp_str_idx2: "",
                        v_ecc_update_dtm: "20191219105319",
                        v_model_grp_nm: "프라이드"
                    }, {
                        v_carcd: "EC60311089",
                        n_real_mile: "0",
                        n_auth_mile: "19",
                        v_truck_flag: "N",
                        v_optioncd: "001|006|007|008|020|026|027|056|071|072",
                        v_categorycd: "001",
                        v_center_code: "148",
                        v_middle_img: "https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60311089_011.jpg",
                        v_elan_path: "https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60311089_001.jpg",
                        v_exterior_colorcd: "COLOR0220",
                        v_center_region: "충남",
                        v_ecc_reg_dtm: "20191129141835",
                        v_begin_year: "2015",
                        n_inst_month: "0",
                        dbLinkValue: "@encarDBLink_real",
                        n_order: "9989",
                        v_makecd: "002",
                        v_class_headnm: "스마트",
                        n_month_price: "9",
                        v_class_detailcd: "",
                        n_month_price_self: "0",
                        v_small_img: "https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60311089_013.jpg",
                        v_modelnm: "올 뉴 모닝",
                        v_optioncd_name: "ABS|파워도어록|파워 윈도우|파워스티어링|에어백 : 사이드|에어백 : 운전석|에어백 : 조수석|에어백 : 커튼|AUX 단자|USB 단자",
                        v_car_type: "KOR",
                        v_youtube_flag: "N",
                        v_pn_mobile: "0504-3187-6010",
                        v_rec_comment: "단순교환",
                        v_usernm: "민병길",
                        n_mileage: "82245",
                        v_simple_comment: "＊가성비출중!! 평가사 강력추천 차량＊",
                        v_car_mobile_url: "/mobile/carinfo/car_detail.do?i_sCarCd=EC60311089",
                        v_trust_flag: "N",
                        v_modelnm_text: "올 뉴 모닝",
                        v_transmissioncd: "001",
                        v_car_number: "08로8173",
                        n_tmp_num_idx2: "0",
                        req_sts_cd: "00",
                        n_price: "430",
                        n_interest_rate: "0",
                        v_fuel_typecd_name: "가솔린",
                        v_car_url: "https://www.kcar.com/car/info/car_info_detail.do?i_sCarCd=EC60311089",
                        v_class_headcd: "001",
                        v_tmp_list_idx1: "",
                        v_buy_flag: "Y",
                        v_fuel_typecd: "001",
                        v_tmp_list_idx2: "",
                        v_center_region_code: "DEJUN",
                        v_truck_name: "기아 올 뉴 모닝 스마트",
                        v_categorynm: "경차",
                        v_class_detailnm: "",
                        v_exterior_colornm: "쥐색",
                        v_hot_markcd: "",
                        v_transmissioncd_name: "오토",
                        v_sell_empid: "2822",
                        v_ew_flag: "",
                        n_pass_cnt: "5",
                        v_del_flag: "",
                        v_3dview_flag: "2D",
                        v_discountcd: "",
                        v_modelcd: "095",
                        v_rent_status: "N",
                        v_rec_comment_cd: "003",
                        v_lease_type: "3",
                        v_makenm: "기아",
                        v_pn: "0504-1369-3368",
                        v_mfr_date: "201403",
                        v_tmp_str_idx1: "",
                        v_model_grp_cd: "013",
                        v_center_name: "대전유성직영점",
                        v_discount_flag: "N",
                        v_tmp_str_idx2: "",
                        v_ecc_update_dtm: "20191209182510",
                        v_model_grp_nm: "모닝"
                    },
                    {
                        v_carcd: "EC60318473",
                        n_real_mile: "0",
                        n_auth_mile: "13.9",
                        v_truck_flag: "N",
                        v_optioncd: "001|003|005|006|007|008|014|015|017|020|022|023|024|026|027|031|032|033|055|056|058|071|072|084|086|088|091",
                        v_categorycd: "003",
                        v_center_code: "109",
                        v_middle_img: "https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60318473_011.jpg",
                        v_elan_path: "https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60318473_001.jpg",
                        v_exterior_colorcd: "COLOR0280",
                        v_center_region: "경기/인천",
                        v_ecc_reg_dtm: "20191227131543",
                        v_begin_year: "2016",
                        n_inst_month: "0",
                        dbLinkValue: "@encarDBLink_real",
                        n_order: "9989",
                        v_makecd: "001",
                        v_class_headnm: "1.6 GDi 스마트",
                        n_month_price: "19",
                        v_class_detailcd: "001",
                        n_month_price_self: "0",
                        v_small_img: "https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60318473_013.jpg",
                        v_modelnm: "더 뉴 아반떼",
                        v_optioncd_name: "ABS|CD플레이어|내비게이션|파워도어록|파워 윈도우|파워스티어링|가죽시트|리모컨키|알루미늄 휠|에어백 : 사이드|열선시트 : 운전석|오토 에어컨|전동접이사이드미러|에어백 : 운전석|에어백 : 조수석|스티어링 휠 리모컨|감지센서 : 후방|TPMS : 타이어공기압감지|차체자세 제어장치|에어백 : 커튼|카메라 : 후방|AUX 단자|USB 단자|핸들 열선|오토 라이트|블루투스|열선시트 : 조수석",
                        v_car_type: "KOR",
                        v_youtube_flag: "N",
                        v_pn_mobile: "0504-3188-2472",
                        v_rec_comment: "단순교환",
                        v_usernm: "김영우",
                        n_mileage: "86632",
                        v_simple_comment: "#철저하게 관리된 차량 #내비&후방카메라 탑재 #가성비 좋은",
                        v_car_mobile_url: "/mobile/carinfo/car_detail.do?i_sCarCd=EC60318473",
                        v_trust_flag: "N",
                        v_modelnm_text: "더 뉴 아반떼",
                        v_transmissioncd: "001",
                        v_car_number: "11조8135",
                        n_tmp_num_idx2: "0",
                        req_sts_cd: "00",
                        n_price: "870",
                        n_interest_rate: "0",
                        v_fuel_typecd_name: "가솔린",
                        v_car_url: "https://www.kcar.com/car/info/car_info_detail.do?i_sCarCd=EC60318473",
                        v_class_headcd: "002",
                        v_tmp_list_idx1: "",
                        v_buy_flag: "Y",
                        v_fuel_typecd: "001",
                        v_tmp_list_idx2: "",
                        v_center_region_code: "INCHUN",
                        v_truck_name: "현대 더 뉴 아반떼 1.6 GDi 스마트 기본형",
                        v_categorynm: "준중형차",
                        v_class_detailnm: "기본형",
                        v_exterior_colornm: "흰색",
                        v_hot_markcd: "10",
                        v_transmissioncd_name: "오토",
                        v_sell_empid: "2899",
                        v_ew_flag: "",
                        n_pass_cnt: "5",
                        v_del_flag: "",
                        v_3dview_flag: "2D",
                        v_discountcd: "",
                        v_modelcd: "123",
                        v_rent_status: "N",
                        v_rec_comment_cd: "003",
                        v_lease_type: "3",
                        v_makenm: "현대",
                        v_pn: "0504-1369-9818",
                        v_mfr_date: "201507",
                        v_tmp_str_idx1: "",
                        v_model_grp_cd: "019",
                        v_center_name: "분당용인직영점",
                        v_discount_flag: "N",
                        v_tmp_str_idx2: "",
                        v_ecc_update_dtm: "20191227131543",
                        v_model_grp_nm: "아반떼"
                    }*/
                ]
            }sbdyr0610

        },
        computed:{
        },
        methods: {
        },
        created() {
                let url = `http://localhost:8080/sch`
                let headers = {
                    'authorization': 'JWT fefege..',
                    'Accept' : 'application/json',
                    'Content-Type': 'application/json'
                }
                axios
                    .post(url, headers)
                    .then(res =>
                    {
                        alert("들어옴")
                        alert(res.data.car_search_results[0].categorycd)
                        this.car_search_results = res.data.car_search_results
                        alert(this.car_search_results[0].categorycd)
/*                        for(let i = 0; i < res.date.length ; i++ ) {
                            this.wr_in_v_categorycd.push({
                                checked: false,
                                categorycd: res.data[i].code,
                                categorynm: res.data[i].name
                            })
                        }*/
                    })
                    .catch(()=>{
                        console.log("들어옴 실패")
                        alert("들어옴 실패")
                    })
            },
    mixins:[checkBox]
    }

</script>
<style scoped>


</style>
