<template>
    <div>
        <div id='app'>
            <link rel="stylesheet" type="text/css"  href="css/magazine.css">
            <link rel="stylesheet" type="text/css"  href="css/re_import.css">
            <link rel="stylesheet" type="text/css"   href="css/re_trade.css">
           <div ></div>
            <div id="content">
                <div class="main_content">
                    <!--검색-->
                    <div class = "mc_header">
                    <div class="mc_wide_searchbox">
                        <vue-word-cloud
                                :words="wordList"
                                font-family="맑은 고딕"
                                :enter-animation="enterAnimation"
                                :color="([, weight]) => weight > 19 ? colorItems[Math.floor(Math.random()*11+1)] : weight > 16 ? colorItems[Math.floor(Math.random()*11+1)] : weight > 12 ? colorItems[Math.floor(Math.random()*11+1)] : weight > 8 ?  colorItems[Math.floor(Math.random()*11+1)] : weight > 4 ? colorItems[Math.floor(Math.random()*11+1)] : colorItems[Math.floor(Math.random()*11+1)]"
                        >
                            <template slot-scope="{text, weight , word}" >
                                <div :title="word" style="cursor: pointer;" @click="onWordClick(text)">
                                    {{ text }}
                                </div>
                            </template>
                        </vue-word-cloud>

                        <div class="searchbg">
                            <div class="mc_search">

                                <div class="search3box">
                                    <div id="divTabWant1" class="divTabWantGroup">
                                        <div class="searchcont1">
                                            <ul >
                                               <li >
                                                    <span class="tit">
                                                        <strong class="all_car_cnt">{{selectedItem}}{{Math.floor(Math.random()*11+1)}}</strong></span>
                                               </li>
                                            </ul>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="result_list" >
                            <table>
                                <caption>관심차량</caption>
                                <colgroup>
                                    <col style="width: 55px;">
                                    <col style="width: 190px;">
                                    <col style="width: 485px;">
                                    <col style="width: 290px;">
                                    <col>
                                </colgroup>

                                <tbody>
                                <tr v-for="car of this.$store.state.magazine.carsList" :key="car.carcd">
                                    <td class="thumb">
                                        <a href="#" >
                                            <div class="mark_area"></div>
                                            <img :src="car.middleImg" alt="자동차 썸네일">
                                        </a>
                                    </td>
                                    <td class="car_info">
                                        <ul>
                                            <li>
                                                <router-link to="/product" target="_blank"  >
                                                    <a class="name" @click="addHistory(car)">
                                                        {{car.truckName}}
                                                    </a>
                                                </router-link>
                                            </li>
                                            <li>
                                                <span class="price">{{ car.price | thousandFormatter }}만원 <em></em></span>
                                            </li>
                                            <li>
                                                <span class="md_year">{{ car.mfrDate | mfrDateFormatter }} &nbsp; ({{ car.beginYear | beginYearFormatter }}년형)&nbsp;{{ car.milage | thousandFormatter }}km &nbsp;&nbsp;{{car.fuelTypecdName}}</span>
                                            </li>
                                            <li>
                                                <b>열람 시간 : </b><span class="seenTime"> {{ car.seenTime }} </span>
                                            </li>
                                        </ul>
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
                                                <span>{{car.categorynm}}</span><span>&nbsp;</span>
                                            </li>
                                            <li>
                                                <span>{{car.centerRegion}}</span><span>&nbsp;</span>
                                            </li>
                                            <li>
                                                <span>{{car.passCnt}}  인승</span><span>&nbsp;</span>
                                            </li>
                                        </ul>
                                        <span class="online_buy">{{car.simpleComment}}</span>
                                    </td>
                                    <td class="btn_area">
                                        <a id="toastid0" href="" class="oline_btn">온라인 구매</a>
                                    </td>
                                </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                    </div>
                        <div class="area_section">
                            <div class="wrap_section">
                                <ul class="list_tab">
                                    <li class="on"><a href="/abouthyundai" class="link_tab"></a></li>
                                    <li><a href="/abouthyundai?order=view" class="link_tab"></a></li>
                                </ul>
                                <ul class="list_1boon" id="timelinesView" data-order="published">
                                    <li class="fst" v-for="article of  this.$store.state.magazine.articleList " :key="article.aricleId" >
                                        <a :href="article.articleHref" class=" link_1boon">
                                            <span class="thumb_g">
                                                                            <img :src="article.articleImg" data-loaded="true" style="">
                                                                    </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">{{article.subject}}</strong>
                                                <span class="txt_number txt_new"><span class="txt_g">{{article.writer}} | {{article.writeDate}} </span></span>
                                            </div>
                                        </a>
                                    </li>
<!--
                                    <li>
                                        <a href="/abouthyundai/5e2ab55382e9837b77c59cdb" class=" link_1boon ">
                                <span class="thumb_g">
                                                                            <img data-src="//img1.daumcdn.nearticlesthumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2Fa26945439b8b4389a25b28e464789b3d.JPG" class="lazyimg img_thumb lazy-loaded" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2Fa26945439b8b4389a25b28e464789b3d.JPG" data-loaded="true" style="">
                                                                    </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">“실제로 세계 1위입니다.” 넥쏘의 놀라운 업적 5가지</strong>
                                                <span class="txt_number"><em class="emph_number">197,301</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>



                                    <li>
                                        <a href="/abouthyundai/5e2985d9bc6d9b20e0b9db7c" class=" link_1boon ">
                                <span class="thumb_g">
                                                                            <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F111077afd3764c2993b5c9e38bfa4c17.JPG" class="lazyimg img_thumb lazy-loaded" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F111077afd3764c2993b5c9e38bfa4c17.JPG" data-loaded="true" style="">
                                                                    </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">"이건 꼭 피해주세요!!"설연휴 장거리 운전, 위험한 음식들?</strong>
                                                <span class="txt_number"><em class="emph_number">11,643</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5e2814d082e9837b77c589be" class=" link_1boon ">
                                <span class="thumb_g">
                                                                            <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F7252e38904ce4bfcb44dcb78f02b6db8.JPG" class="lazyimg img_thumb lazy-loaded" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F7252e38904ce4bfcb44dcb78f02b6db8.JPG" data-loaded="true" style="">
                                                                    </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">"하이브리드, 안 살 이유 있나요?" 현대차 하이브리드 4종, 무엇을 고르시겠습니까?</strong>
                                                <span class="txt_number"><em class="emph_number">120,730</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5e274a33bc6d9b20e0b9b475" class=" link_1boon ">
                                <span class="thumb_g">
                                                                            <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F895d4c2e5383455a872f4ec62abaa8db.JPG" class="lazyimg img_thumb lazy-loaded" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F895d4c2e5383455a872f4ec62abaa8db.JPG" data-loaded="true" style="">
                                                                    </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">"여기선 더 밟아야 돼요!!" 초보운전자가 어려워하는 고속도로 진입로</strong>
                                                <span class="txt_number"><em class="emph_number">42,588</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5e264bb3bc6d9b20e0b999fa" class=" link_1boon ">
                                <span class="thumb_g">
                                                                            <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F283678edd1d345679525950205f26430.JPG" class="lazyimg img_thumb lazy-loaded" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F283678edd1d345679525950205f26430.JPG" data-loaded="true" style="">
                                                                    </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">"아휴, 왜 이래 정말..."설 연휴 귀성길 칭얼대는 아이들, 원인은 이것?</strong>
                                                <span class="txt_number"><em class="emph_number">5,101</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5e22bd50aa21c43d1946e96b" class=" link_1boon ">
                                <span class="thumb_g">
                                                                            <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F6a83eaf7cdfd4482927f427a4008e428.png" class="lazyimg img_thumb lazy-loaded" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F6a83eaf7cdfd4482927f427a4008e428.png" data-loaded="true" style="">
                                                                    </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">대한민국 엔진 기술 독립의 시작, 현대차 4기통 가솔린 엔진 스토리</strong>
                                                <span class="txt_number"><em class="emph_number">67,049</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5e2044feaa21c43d1946d7e4" class=" link_1boon ">
                                <span class="thumb_g">
                                                                            <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F2b9c0fac434941cea9e24a33faed6343.png" class="lazyimg img_thumb lazy-loaded" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F2b9c0fac434941cea9e24a33faed6343.png" data-loaded="true" style="">
                                                                    </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">2020년, 모르면 정말 큰일 나는 교통법규 "꼭 알아두세요!"</strong>
                                                <span class="txt_number"><em class="emph_number">72,800</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5e1eea6825640546962a5716" class=" link_1boon ">
                                <span class="thumb_g">
                                                                            <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F4ede07be19f64b99921e8478516a72fb.png" class="lazyimg img_thumb lazy-loaded" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F4ede07be19f64b99921e8478516a72fb.png" data-loaded="true" style="">
                                                                    </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">매일 아침, 나는 HDA를 켜고 출근한다</strong>
                                                <span class="txt_number"><em class="emph_number">1,201</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5e1daa0b25640546962a3a2d" class=" link_1boon ">
                                <span class="thumb_g">
                                                                            <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2Ffd88c2bad8a346dd90be79b2591948a5.png" class="lazyimg img_thumb lazy-loaded" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2Ffd88c2bad8a346dd90be79b2591948a5.png" data-loaded="true" style="">
                                                                    </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">"가능할 거 같은데..?", 24시간 일하는 자동차 제조 공장</strong>
                                                <span class="txt_number"><em class="emph_number">7,979</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5e1c69b625640546962a299a" class=" link_1boon ">
                                <span class="thumb_g">
                                                                            <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F87909beae0ab44058047a0bd101ca62c.JPG" class="lazyimg img_thumb lazy-loaded" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F87909beae0ab44058047a0bd101ca62c.JPG" data-loaded="true" style="">
                                                                    </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">"포터EV만 있는 줄 알았는데..."다양한 국산 친환경 상용차</strong>
                                                <span class="txt_number"><em class="emph_number">44,787</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5e1880b06b73982dea9604bc" class=" link_1boon ">
                                <span class="thumb_g">
                                                                            <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F2abd921a2255437abfdb8dc8cb37369c.JPG" class="lazyimg img_thumb lazy-loaded" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F2abd921a2255437abfdb8dc8cb37369c.JPG" data-loaded="true" style="">
                                                                    </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">"솔직히 이건 좀 끌리네요" 다양한  i 시리즈, 여러분의 선택은?</strong>
                                                <span class="txt_number"><em class="emph_number">26,935</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5e17001b6b73982dea95f611" class=" link_1boon ">
                                <span class="thumb_g">
                                                                            <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2Fc3dd88a62f874a1b8e0fe853d618105a.JPG" class="lazyimg img_thumb lazy-loaded" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2Fc3dd88a62f874a1b8e0fe853d618105a.JPG" data-loaded="true" style="">
                                                                    </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">장애인 주차구역에서 과태료 120만 원 받는 방법</strong>
                                                <span class="txt_number"><em class="emph_number">21,951</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5e153cd16b73982dea95e0ee" class=" link_1boon ">
                                <span class="thumb_g">
                                                                            <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F851814038f0b485687dfe8905a7499c5.JPG" class="lazyimg img_thumb lazy-loaded" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F851814038f0b485687dfe8905a7499c5.JPG" data-loaded="true" style="">
                                                                    </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">세계 점유율 절반 차지, 친환경 선두주자 넥쏘의 발자취</strong>
                                                <span class="txt_number"><em class="emph_number">698</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5e12ee720f44233ad2f61a22" class=" link_1boon ">
                                <span class="thumb_g">
                                                                            <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F6aadfafbdd5d412dbc9f902fd71bccc3.png" class="lazyimg img_thumb lazy-loaded" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F6aadfafbdd5d412dbc9f902fd71bccc3.png" data-loaded="true" style="">
                                                                    </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">사망 위험 미세먼지, 내 건강을 지켜줄 자동차 기능들</strong>
                                                <span class="txt_number"><em class="emph_number">5,598</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5e0efb4a4714e154a17e5312" class=" link_1boon ">
                                <span class="thumb_g">
                                                                            <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F72e3d9abde7449af8d8f92a760471d72.JPG" class="lazyimg img_thumb lazy-loaded" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F72e3d9abde7449af8d8f92a760471d72.JPG" data-loaded="true" style="">
                                                                    </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">“꼭 필요한 사양으로 업그레이드” 2020 코나 일렉트릭 출시</strong>
                                                <span class="txt_number"><em class="emph_number">254</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5e0daecb094cda79f93ef42e" class=" link_1boon ">
                                <span class="thumb_g">
                                                                            <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2Fe5e239420da54b54a4bd8b410cfccdfe.png" class="lazyimg img_thumb lazy-loaded" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2Fe5e239420da54b54a4bd8b410cfccdfe.png" data-loaded="true" style="">
                                                                    </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">2020년 현대차 1월 구매혜택 &amp; 판매조건 총정리</strong>
                                                <span class="txt_number"><em class="emph_number">45,169</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5e0ae7e7094cda79f93ee478" class=" link_1boon ">
                                <span class="thumb_g">
                                                                            <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F9e4084a54e5d42d2aa256e724b03edfc.JPG" class="lazyimg img_thumb lazy-loaded" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F9e4084a54e5d42d2aa256e724b03edfc.JPG" data-loaded="true" style="">
                                                                    </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">실사로 본 팰리세이드의 다섯 가지 컬러!</strong>
                                                <span class="txt_number"><em class="emph_number">20,152</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5e0ac1b2094cda79f93ee197" class=" link_1boon ">
                                <span class="thumb_g">
                                                                            <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F0ec3350c4c3c4a8f867c00a6048217da.JPG" class="lazyimg img_thumb lazy-loaded" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F0ec3350c4c3c4a8f867c00a6048217da.JPG" data-loaded="true" style="">
                                                                    </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">그랜저의 두 얼굴, 더 뉴 그랜저의 낮과 밤</strong>
                                                <span class="txt_number"><em class="emph_number">80,012</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5e05babceabc156334eeb2f6" class=" link_1boon ">
                                <span class="thumb_g">
                                                                            <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F4834f8904bcb476ebc41594b3836a0c9.JPG" class="lazyimg img_thumb lazy-loaded" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F4834f8904bcb476ebc41594b3836a0c9.JPG" data-loaded="true" style="">
                                                                    </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">2019년, 가장 HOT 했던 현대차 여기 다 있다!</strong>
                                                <span class="txt_number"><em class="emph_number">4,098</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5dfc25cb23b9d7597983a5c3" class=" link_1boon ">
            <span class="thumb_g">
                <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F33ee66189e994a8f98c46bd321deffae.JPG" class="lazyimg img_thumb" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F33ee66189e994a8f98c46bd321deffae.JPG" data-loaded="true" style="">
            </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">

                                                    세차 고수가 겨울철에 세차하는 법

                                                </strong>

                                                <span class="txt_number"><em class="emph_number">148,605</em>읽음</span>

                                            </div>
                                        </a>
                                    </li>

                                    <li>
                                        <a href="/abouthyundai/5dfc6a7423b9d7597983b220" class=" link_1boon ">
            <span class="thumb_g">
                <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F1d3f3eb3a18e44798c96ff80c9097113.JPG" class="lazyimg img_thumb" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F1d3f3eb3a18e44798c96ff80c9097113.JPG" data-loaded="true" style="">
            </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">

                                                    저공해 혜택 받는 플래그십 세단이 있다?

                                                </strong>
                                                <span class="txt_number"><em class="emph_number">4,198</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5dfadf607db39a54b0a47a9a" class=" link_1boon ">
            <span class="thumb_g">
                <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F9b37874b6a2b430188dd098504005a59.JPG" class="lazyimg img_thumb" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F9b37874b6a2b430188dd098504005a59.JPG" data-loaded="true" style="">
            </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">
                                                    더 뉴 그랜저 캘리그래피 트림, 엔진에 상관없이 선택 가능?
                                                </strong>
                                                <span class="txt_number"><em class="emph_number">3,077</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5df8a6998e1e390bb74a10e9" class=" link_1boon ">
            <span class="thumb_g">
                <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2Fe3254cb1c8cb4f3b9c70330a1fa47e70.JPG" class="lazyimg img_thumb" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2Fe3254cb1c8cb4f3b9c70330a1fa47e70.JPG" data-loaded="true" style="">
            </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">
                                                    기름값 걱정 없는 상용차 등장, 포터 II 일렉트릭
                                                </strong>
                                                <span class="txt_number"><em class="emph_number">34,203</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5df1d7d807fc31145c5df178" class=" link_1boon ">
            <span class="thumb_g">
                <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F830e93206f0b4a4cbc248558f9ebad18.JPG" class="lazyimg img_thumb" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F830e93206f0b4a4cbc248558f9ebad18.JPG" data-loaded="true" style="">
            </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">
                                                    현대자동차의 인스퍼레이션 트림을 아시나요?
                                                </strong>
                                                <span class="txt_number"><em class="emph_number">11,916</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5def66d334431474e93a21bf" class=" link_1boon ">
            <span class="thumb_g">
                <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F3e190241b4a2483bad30509b07f14eb8.JPG" class="lazyimg img_thumb" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F3e190241b4a2483bad30509b07f14eb8.JPG" data-loaded="true" style="">
            </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">
                                                    완충 시 211km 주행 가능, 포터 II 일렉트릭 출시
                                                </strong>
                                                <span class="txt_number"><em class="emph_number">14,896</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5def4c0a07fc31145c5dd7a7" class=" link_1boon ">
            <span class="thumb_g">
                <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2Fbb27245d2ef143d8a5b6e2ef7dc53ab9.JPG" class="lazyimg img_thumb" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2Fbb27245d2ef143d8a5b6e2ef7dc53ab9.JPG" data-loaded="true" style="">
            </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">
                                                    가성비 갑, 현대차의 초이스 트림 모르면 손해?
                                                </strong>
                                                <span class="txt_number"><em class="emph_number">5,244</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5de78b9e34431474e939b886" class=" link_1boon ">
            <span class="thumb_g">
                <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F8d2899a421d141b29d2dec4ee6e0af66.JPG" class="lazyimg img_thumb" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F8d2899a421d141b29d2dec4ee6e0af66.JPG" data-loaded="true" style="">
            </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">
                                                    19인치 휠 장착한 쏘나타 센슈어스 매력 포인트 5
                                                </strong>
                                                <span class="txt_number"><em class="emph_number">34,060</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5de4bad634431474e9397720" class=" link_1boon ">
            <span class="thumb_g">
                <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F64ee8d3e5e954731b45feec28231b057.JPG" class="lazyimg img_thumb" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F64ee8d3e5e954731b45feec28231b057.JPG" data-loaded="true" style="">
            </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">
                                                    현대차 SUV가 미국에서 인기 있는 이유는?
                                                </strong>
                                                <span class="txt_number"><em class="emph_number">24,462</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5de4a81134431474e93971be" class=" link_1boon ">
            <span class="thumb_g">
                <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F341d7b4f00234987813eb35610dae3f1.JPG" class="lazyimg img_thumb" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F341d7b4f00234987813eb35610dae3f1.JPG" data-loaded="true" style="">
            </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">
                                                    한 눈에 보는 현대차 12월 이벤트!
                                                </strong>
                                                <span class="txt_number"><em class="emph_number">384</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>
                                    <li>
                                        <a href="/abouthyundai/5de4a79434431474e9397185" class=" link_1boon ">
            <span class="thumb_g">
                <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F480efb9f3fdb4e2fa5876eaffb839f67.JPG" class="lazyimg img_thumb" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2F480efb9f3fdb4e2fa5876eaffb839f67.JPG" data-loaded="true" style="">
            </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">

                                                    현대차 12월 구매혜택 &amp; 판매조건 총정리

                                                </strong>

                                                <span class="txt_number"><em class="emph_number">26,468</em>읽음</span>

                                            </div>
                                        </a>
                                    </li>

                                    <li>
                                        <a href="/abouthyundai/5ddf5802dabc4f7abb52e60c" class=" link_1boon">
            <span class="thumb_g">
                <img data-src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2Fd36475ef53b04b8dbb191b70dee225a4.JPG" class="lazyimg img_thumb" alt="" src="//img1.daumcdn.net/thumb/S600x434/?scode=1boon&amp;fname=https%3A%2F%2Ft1.daumcdn.net%2Fliveboard%2Fabouthyundai%2Fd36475ef53b04b8dbb191b70dee225a4.JPG" data-loaded="true" style="">
            </span>
                                            <div class="detail_sub">
                                                <strong class="tit_thumb">
                                                    6년을 기다린 우승, 현대 월드랠리팀
                                                </strong>
                                                <span class="txt_number"><em class="emph_number">2,446</em>읽음</span>
                                            </div>
                                        </a>
                                    </li>-->
                                </ul>
                            </div>
                        </div>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
    let enterAnimation = {opacity: 0, transform: 'scale3d(0.3,0.3,0.3)'};
    import VueWordCloud from 'vuewordcloud';
    import { mapState } from 'vuex'
    export default {
        components: {
            VueWordCloud: VueWordCloud,
        },
        data() {
            return {
                enterAnimation: enterAnimation,
                selectedItem: '',
                colorItems: ['#ffd077', '#3bc4c7', '#3a9eea', '#ff4e69', '#461e47','#31a50d', '#d1b022', '#74482a','#d99cd1', '#c99cd1', '#b99cd1', '#a99cd1']
            }
        },
        computed : {
            ...mapState( {
                wordList : state => state.magazine.wordList,
                articleList : state => state.articleList,
                carsList : state => state.carsList
            })
        },
        methods: {
            onWordClick(item) {
                    this.selectedItem = item
                    this.$store.dispatch('magazine/aiEditor' , item )
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
            },
        },
        created() {
            this.$store.dispatch('magazine/getExtractWord')
            let vue = document.createElement('script')
            let vue2 = document.createElement('script')
            vue.setAttribute('src', 'https://unpkg.com/vue')
            vue2.setAttribute('src', 'https://unpkg.com/vuewordcloud')
            document.head.appendChild(vue)
            document.head.appendChild(vue2)

        }
    }
</script>
<style scoped>
    .main_content{
        padding-bottom: 50px; text-align: center;
    }
    .mc_header{
        /*background:url( C:/STSWorkspace/TeamRPM/vue/src/assets/image/bg1.jpg) center no-repeat ;*/
        /*padding-top: 100px;*/
        max-height:800px;
    }
    .mc_wide_search{margin-bottom: 57px; }
    .mc_wide_searchbox{  width:1212px; background: #ffffff;height:603px;position:relative;display:inline-block; z-index:2; margin-bottom:27px;}
    .mc_wide_searchbox .searchbg{ margin-top: 50px; width:100%; background:url( https://www.kcar.com/resources/images/index/search_bg.png) center no-repeat; opacity: 0.97; display:inline-block;}
    .mc_wide_searchbox .searchbg .mc_search{margin: 0px auto 0 auto; }
    .mc_search .selectric-items .selectric-scroll {
        overflow-x: hidden;
        overflow-y: auto;
    }
    .fst{
        opacity: 0.97; display:inline-block;
    }
    .wrap_section{max-width:1112px;margin:0 auto}
    .area_section {background-color: aliceblue; margin-top: 150px;}
</style>