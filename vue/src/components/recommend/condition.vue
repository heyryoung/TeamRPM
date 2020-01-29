<template>
    <div class="helpCar">
        <div class="helpTab">
            <!-- B -->
            <div class="tab1">
                <h3 class="on">
                    <b>딜러에게 차 추천 받기</b>
                </h3>
                <div class="tabCont">
                    <form name="frmB" id="frmB" >

                        <div class="tabContBx">


                            <!-- 로그인 전 -->



                            <div class="st2">
                                <p class="help_must">필수입력정보*</p>
                                <div class="detail">
                                    <div class="le">
                                        <div class="deType01">
                                            <h5>차량정보 <span class="icon_must">*</span></h5>

                                            <div>
                                                <!-- -->
                                                <div class="searchr1">
                                                <div id="Key1" @click="searchKeyClick(`Key1`)"
                                                     class="selectric-wrapper selectric-selectric selectric-below selectric-hover">
                                                    <div class="selectric-hide-select">
                                                        <select
                                                                title="제조사를 선택하세요"
                                                                class="selectric"
                                                                data-beusable-tracking=""
                                                                tabindex="-1"
                                                                v-for="category of this.$store.state.contents.category1"
                                                                :key="category.name">
                                                            <option data-type="MAKE_TYPE010"
                                                                    data-cnt="category.count">{{category.name}}</option>
                                                        </select></div>
                                                    <div class="selectric" ><span class="label"
                                                                                  data-beusable-tracking="" >{{keyWord1}}</span></div>
                                                    <div id = "category1" class="selectric-items" tabindex="-1">
                                                        <div class="selectric-scroll">
                                                            <ul v-for="category of this.$store.state.contents.category1" :key="category.name">
                                                                <li data-index="1" @click="setCategory2(category)" class="">{{category.name}}<em>{{category.count}}</em>
                                                                </li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                    <input class="selectric-input" tabindex="0"></div>
                                            </div>


                                                <!-- -->

                                            </div>
                                        </div>
                                        <div class="deCarType">

                                            <div class="searchr2">
                                                <div id="searchKey2"  @click="searchKeyClick(`searchKey2`)"
                                                     class="selectric-wrapper selectric-selectric selectric-below selectric-hover">
                                                    <div class="selectric-hide-select"><select
                                                            id="modelGroupList" title="모델을 선택하세요"
                                                            class="selectric" data-beusable-tracking=""
                                                            tabindex="-1"
                                                            v-for="category of this.$store.state.contents.category2"
                                                            :key="category.name">
                                                        <option data-type="MAKE_TYPE010"
                                                                data-cnt="category.count">{{category.name}}</option>
                                                    </select></div>
                                                    <div class="selectric"><span class="label"
                                                                                 data-beusable-tracking="">{{keyWord2}}</span></div>
                                                    <div id = "category2" class="selectric-items" tabindex="-1" >
                                                        <div class="selectric-scroll">
                                                            <ul v-for="category of this.$store.state.contents.category2" :key="category.name">
                                                                <li data-index="1" @click="setCategory3(category.name, category.count)" class="">{{category.name}}<em>{{category.count}}</em>
                                                                </li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                    <input class="selectric-input" tabindex="0"></div>
                                            </div>
                                        </div>
                                        <div class="deCarType">

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
                                                                v-for="category of this.$store.state.contents.category3"
                                                                :key="category.name">
                                                            <option data-type="MAKE_TYPE010"
                                                                    data-cnt="category.count">{{category.name}}</option>
                                                        </select></div>
                                                    <div class="selectric"><span class="label"
                                                                                 data-beusable-tracking="">{{keyWord3}}</span></div>
                                                    <div class="selectric-items" tabindex="-1">
                                                        <div class="selectric-scroll">
                                                            <ul v-for="category of this.$store.state.contents.category3" :key="category.name">
                                                                <li data-index="1" @click="setKeyWord3(category.name, category.count)" class="">{{category.name}}<em>{{category.count}}</em>
                                                                </li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                    <input class="selectric-input" tabindex="0"></div>
                                            </div>
                                        </div>



                                        <div class="deType02">

                                            <div class="type_le">
                                                <h5>연식 <span class="icon_must">*</span></h5>
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

                                            </div>
                                            <div class="type_ri">
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
                                        </div>
                                        <div class="deType02">
                                            <div class="type_le">
                                                <h5>주행거리 <span class="icon_must">*</span></h5>
                                                <div id="startKM"  class="selectric-wrapper selectric-selectric selectric-below selectric-hover" @click= "searchKeyClick(`startKM`)">
                                                    <div class="selectric-hide-select"><select name="wr_gt_v_mfr_date"
                                                                                               id="modelYear01" class="selectric"
                                                                                               data-unit="년">
                                                        <option value="">최소</option>
                                                        <option value="2019">10000KM</option>
                                                        <option value="2018">20000KM</option>
                                                    </select></div>
                                                    <div class="selectric"><span class="label" >최소</span></div>
                                                    <div class="selectric-items" tabindex="-1">
                                                        <div class="selectric-scroll">
                                                            <ul>
                                                                <li data-index="0" class="selected">최소</li>
                                                                <li data-index="1" class="">10000KM</li>
                                                                <li data-index="2" class="">20000KM</li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                    <input class="selectric-input" tabindex="0"></div>

                                            </div>
                                            <div class="type_ri">
                                                <div class="selectric-wrapper selectric-selectric selectric-hover" id="endKM"  @click= "searchKeyClick(`endKM`)">
                                                    <div class="selectric-hide-select"><select name="wr_lt_v_mfr_date"
                                                                                               id="modelYear02" class="selectric"
                                                                                               data-unit="년"
                                                                                               tabindex="-1">
                                                        <option value="">최대</option>
                                                        <option value="2019">10000KM</option>
                                                        <option value="2018">20000KM</option>
                                                    </select></div>
                                                    <div class="selectric"><span class="label" data-beusable-tracking="">최대</span></div>
                                                    <div class="selectric-items" tabindex="-1">
                                                        <div class="selectric-scroll">
                                                            <ul>
                                                                <li data-index="0" class="selected">최대</li>
                                                                <li data-index="1" class="">10000KM</li>
                                                                <li data-index="2" class="">20000KM</li>
                                                            </ul>
                                                        </div>

                                                    </div>
                                                    <input class="selectric-input" tabindex="0"></div>

                                            </div></div>
                                    </div>
                                    <div class="ri">
                                        <div class="deType01">
                                            <div class="type_ le">
                                                <h5>변속기</h5>
                                                <div id="transMission"  class="selectric-wrapper selectric-selectric selectric-below selectric-hover" @click= "searchKeyClick(`transMission`)">
                                                    <div class="selectric-hide-select"><select name="wr_gt_v_mfr_date"
                                                                                               id="modelYear01" class="selectric"
                                                                                               data-unit="년">
                                                        <option value="">종류</option>
                                                        <option value="2019">2019년</option>
                                                        <option value="2018">2018년</option>
                                                    </select></div>
                                                    <div class="selectric"><span class="label" >종류</span></div>
                                                    <div class="selectric-items" tabindex="-1">
                                                        <div class="selectric-scroll">
                                                            <ul>
                                                                <li data-index="0" class="selected">종류</li>
                                                                <li data-index="1" class="">2019년</li>
                                                                <li data-index="2" class="">2018년</li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                    <input class="selectric-input" tabindex="0"></div>
                                            </div>
                                            <div class="type_ri">
                                                <h5>연료</h5>
                                                <div id="fuel"  class="selectric-wrapper selectric-selectric selectric-below selectric-hover" @click= "searchKeyClick(`fuel`)">
                                                    <div class="selectric-hide-select"><select name="wr_gt_v_mfr_date"
                                                                                               id="modelYear01" class="selectric"
                                                                                               data-unit="년">
                                                        <option value="">종류</option>
                                                        <option value="2019">휘발류</option>
                                                        <option value="2018">경유</option>
                                                    </select></div>
                                                    <div class="selectric"><span class="label" >종류</span></div>
                                                    <div class="selectric-items" tabindex="-1">
                                                        <div class="selectric-scroll">
                                                            <ul>
                                                                <li data-index="0" class="selected">종류</li>
                                                                <li data-index="1" class="">휘발류</li>
                                                                <li data-index="2" class="">경유</li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                    <input class="selectric-input" tabindex="0"></div>
                                            </div>
                                        </div>
                                        <div class="deType02">
                                            <h5>사고유무 <span class="icon_must">*</span></h5>
                                            <ul class="acc_yn">

                                                <li><input type="checkbox" id="recB0" name="recComment" value="001">
                                                    <label for="recB0">무사고</label></li>

                                                <li><input type="checkbox" id="recB1" name="recComment" value="003">
                                                    <label for="recB1">단순교환</label></li>

                                                <li><input type="checkbox" id="recB2" name="recComment" value="002">
                                                    <label for="recB2">단순사고(접촉)</label></li>

                                                <li><input type="checkbox" id="recB3" name="recComment" value="004">
                                                    <label for="recB3">사고</label></li>

                                            </ul>
                                        </div>

                                        <div class="deType03" style="background: none;">
                                            <div class="type_le">
                                                <h5>추천 직영점</h5>
                                                <div id="region"  class="selectric-wrapper selectric-selectric selectric-below selectric-hover" @click= "searchKeyClick(`region`)">
                                                    <div class="selectric-hide-select"><select name="wr_gt_v_mfr_date"
                                                                                               id="modelYear01" class="selectric"
                                                                                               data-unit="년">
                                                        <option value="">지역</option>
                                                        <option value="2019">서울</option>
                                                        <option value="2018">대전</option>
                                                    </select></div>
                                                    <div class="selectric"><span class="label" >지역</span></div>
                                                    <div class="selectric-items" tabindex="-1">
                                                        <div class="selectric-scroll">
                                                            <ul>
                                                                <li data-index="0" class="selected">지역</li>
                                                                <li data-index="1" class="">서울</li>
                                                                <li data-index="2" class="">대전</li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                    <input class="selectric-input" tabindex="0"></div>
                                            </div>

                                            <div class="type_ri">
                                                <div id="centernm"  class="selectric-wrapper selectric-selectric selectric-below selectric-hover" @click= "searchKeyClick(`centernm`)">
                                                    <div class="selectric-hide-select"><select name="wr_gt_v_mfr_date"
                                                                                               id="modelYear01" class="selectric"
                                                                                               data-unit="년">
                                                        <option value="">직영점 이름</option>
                                                        <option value="2019">강서 직영점</option>
                                                        <option value="2018">강남 직영점</option>
                                                    </select></div>
                                                    <div class="selectric"><span class="label" >직영점</span></div>
                                                    <div class="selectric-items" tabindex="-1">
                                                        <div class="selectric-scroll">
                                                            <ul>
                                                                <li data-index="0" class="selected">직영점</li>
                                                                <li data-index="1" class="">강서 직영점</li>
                                                                <li data-index="2" class="">강남 직영점</li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                    <input class="selectric-input" tabindex="0"></div>
                                            </div>
                                        </div>

                                        <div class="deType02">
                                            <div class="type_le">
                                                <h5>구입예산 <span class="icon_must">*</span></h5>
                                                <div id="minPrice"  class="selectric-wrapper selectric-selectric selectric-below selectric-hover" @click= "searchKeyClick(`minPrice`)">
                                                    <div class="selectric-hide-select"><select name="wr_gt_v_mfr_date"
                                                                                               id="modelYear01" class="selectric"
                                                                                               data-unit="년">
                                                        <option value="">최소</option>
                                                        <option value="2019">1000만원</option>
                                                        <option value="2018">2000만원</option>
                                                    </select></div>
                                                    <div class="selectric"><span class="label" >최소</span></div>
                                                    <div class="selectric-items" tabindex="-1">
                                                        <div class="selectric-scroll">
                                                            <ul>
                                                                <li data-index="0" class="selected">최소</li>
                                                                <li data-index="1" class="">1000만원</li>
                                                                <li data-index="2" class="">2000만원</li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                    <input class="selectric-input" tabindex="0"></div>
                                            </div>
                                            <div class="type_ri">
                                                <div id="maxPrice"  class="selectric-wrapper selectric-selectric selectric-below selectric-hover" @click= "searchKeyClick(`maxPrice`)">
                                                    <div class="selectric-hide-select"><select name="wr_gt_v_mfr_date"
                                                                                               id="modelYear01" class="selectric"
                                                                                               data-unit="년">
                                                        <option value="">최대</option>
                                                        <option value="2019">1000만원</option>
                                                        <option value="2018">2000만원</option>
                                                    </select></div>
                                                    <div class="selectric"><span class="label" >최대</span></div>
                                                    <div class="selectric-items" tabindex="-1">
                                                        <div class="selectric-scroll">
                                                            <ul>
                                                                <li data-index="0" class="selected">최대</li>
                                                                <li data-index="1" class="">1000만원</li>
                                                                <li data-index="2" class="">2000만원</li>
                                                            </ul>
                                                        </div>
                                                    </div>
                                                    <input class="selectric-input" tabindex="0"></div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="helpAgr">

                            <div class="helpAgrOpen secretYnTab">
                                신청한 내용을 공개하시겠어요?
                                <label for="bTabAgreeY">
                                        <span class="holds-cbox checked"><input type="radio" id="bTabAgreeY"
                                                                                class="cbox"
                                                                                value="N"
                                                                                onclick="javascript:secretYn(this.value);"
                                                                                checked="checked"></span> <b>공개&nbsp;
                                    &nbsp;</b>
                                </label>
                                <label for="bTabAgreeN">
                                        <span class="holds-cbox"><input type="radio" id="bTabAgreeN" class="cbox"
                                                                        value="Y"
                                                                        onclick="javascript:secretYn(this.value);"></span>
                                    <b>비공개</b>
                                </label>
                            </div>
                            <div class="helpAgrBtn">
                                <a href="javascript:;" onclick="fnHelpReg();" class="agrBtnOk">신청완료</a>
                            </div>
                        </div>
                    </form>
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
                sendRecommend:{},
                minYear:[2003,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020],
                maxYear:[2003,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020],
                minDistance: [90000],
            }
        },
        methods : {

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
                if(this.$store.state.contents.category2.length>=10) {
                    cate2.style.width = "500px"
                    cate2.style.height = "300px"
                }{
                    cate2.style.width = ""
                    cate2.style.height = ""
                }
            },

            setCategory2(param){
                this.keyWord2 = '모델을 선택하세요'
                this.keyWord3 = '세부모델을 선택하세요'
                this.keyWord1 = param.name
                this.resultCount = param.count
                this.$store.dispatch('contents/getCategory2',{'param':this.keyWord1,'column':'MAKENM'})
            },
            setCategory3(keyWord2, resultCount){
                this.keyWord3 = '세부모델을 선택하세요'
                this.keyWord2 = keyWord2
                this.resultCount = resultCount
                this.$store.dispatch('contents/getCategory3',{'param':this.keyWord2,'column':'MODEL_GRP_NM'})
            },
            setKeyWord3(keyWord3, resultCount){
                this.keyWord3 = keyWord3
                this.resultCount = resultCount
            },

            setOption(keyWord, resultCount){
                this.keyWord3 = '세부모델을 선택하세요'
                this.keyWord2 = keyWord
                this.resultCount = resultCount
                this.$store.dispatch('contents/getCategory3',{'param':this.keyWord2,'column':'MODEL_GRP_NM'})
            },


        },
        computed : {

            }

    }

</script>
<style scoped>
    .tabCont {
        width: 1180px;
    }

    .helpCar {
        padding: 150px 0px;
    }
    .mc_wide_searchbox{width:100%;background:#191b1a /*#F1F2F4 url( /resources/images/index/pc_index_visual_1112.jpg) top center no-repeat*/;opacity: 0.97;height:903px;position:relative;display:inline-block; z-index:1; margin-bottom:57px;}
    .mc_wide_searchbox .searchbg{width:100%;background:url( https://www.kcar.com/resources/images/index/search_bg.png) center no-repeat; opacity: 0.97; display:inline-block;}
    .mc_wide_searchbox .searchbg .mc_search{    margin: 0px auto 0 auto; }
    .mc_search .selectric-items .selectric-scroll {
        overflow-x: hidden;
        overflow-y: auto;
    }
</style>