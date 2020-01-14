<template>
    <div>

        <!-- 지점 동급 리스트 더보기 -->


        <form name="frm" method="post" action="">


            <!--  content 컨텐츠에 따라 변경 필요 -->
            <div id="content" class="sub_content">
                <div class="car_detail_cont">
                    <div class="head_field">
                        <div class="wrapper">
                            <div class="tit_area">
                                <div class="top_field">
                                    <h3><span>르노삼성 QM3 RE</span></h3>
                                    <p class="desc">
                                        <span><strong>단순사고(접촉)</strong></span>
                                        <span>15년12월식</span>
                                        <span>55,954km</span>
                                        <span>디젤</span>
                                        <span>쥐색</span>
                                        <span>오토</span>
                                        <span>직영</span>
                                        <span>김포</span>
                                    </p>
                                </div>

                                <div class="price">
                                    <a href="" class="int_price fix">월 23만원</a>
                                    <p class="pay"><strong>1,050</strong>만원</p>
                                </div>
                            </div>
                            <!--4015 온라인구매-->
                            <div class="btn_area">
                                <a href="" class="like " id="like"><span class="ico">좋아요</span></a>
                                <a href="/buycar" class="online" id="onlineBuy"><span class="onlinebuy_txt">온라인 구매<span
                                        id="onlinebuy_delivery">내일 도착 예정</span></span></a>
                            </div>
                            <!--//4015 온라인구매-->
                        </div>
                    </div>
                    <div class="view_field">
                        <div class="view_bg">
                            <div class="wrapper">

                                <div class="carImg_imgArea">

                                    <div class="visual_wrap">
                                        <div class="visual_area">
                                            <a href="">


                                                <div class="visual" :style="`display:${image.display}`" v-for="image of imgList" :key="image.imgNum">
                                                    <img :src="`${imgUrl}00${image.imgNum}.jpg`"
                                                         alt="차량이미지">
                                                </div>


                                            </a>
                                        </div>
                                        <div class="arrows">
                                            <span class="prev" @click="prev">이전</span>
                                            <span class="next" @click="next">다음</span>
                                        </div>
                                        <div class="pageNum">
                                            <span class="idx" >{{this.pageNum}}</span>/<span class="total">{{this.imgList.length}}</span>
                                        </div>
                                    </div>
                                    <ul class="thumb_area">


                                        <li class="" v-for="image of imgList" :key="image.imgNum" ><img
                                                :src="`${imgUrl}00${image.imgNum}.jpg`"
                                                alt="https://img.kcar.com/carpicture/carpicture10/pic6030/kcar_60306284_001.jpg">
                                        </li>


                                        <li class="empty"><img src="https://www.kcar.com/resources/images/content/buy/empty_thumb.png"
                                                alt="차량없을때이미지"></li>



                                    </ul>
                                    <div class="until_area">
                                        <ul class="ico_area">
                                            <li><a href="" class="down"><span class="blind">다운</span></a></li>
                                            <li><a href="" class="mail"><span class="blind">메일</span></a></li>
                                            <li><a href="" class="print"><span class="blind">인쇄</span></a></li>
                                        </ul>
                                    </div>
                                </div>
                                <div class="carInfo_area">
                                    <div class="staff_box">
                                        <div class="img">


                                            <img src="https://img.kcar.com//DATA1/carpicture2/emp/pic/3277.jpg"
                                                 alt="직원사진">


                                        </div>
                                        <div class="info">
                                            <p class="store">K Car 김포직영점</p>
                                            <p class="name">원종석 차량평가사<br><span class="num">0504-1369-2784</span>
                                            </p>
                                            <ul class="profile">
                                                <li>
                                                    <span class="type">보유차량</span>
                                                    <span class="txt"><a href="javascript:infoNormal.moreCenter('M');"
                                                                         style="text-decoration: underline;">30대</a></span>
                                                </li>
                                                <li>
                                                    <span class="type">매매사원증</span>
                                                    <span class="txt">GC1901839</span>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>

                                    <div class="info_article">
                                        <ul class="state">
                                            <li class="list01">
                                                <a href="">
                                                    <span class="blank">
                                                        <span class="ico"><img
                                                                src="https://www.kcar.com/resources/images/content/buy/detail_info_ico01.png"
                                                                alt="케이카 상세진단서">
                                                        </span>
                                                        <p>K Car 상세진단서</p>
                                                    </span>
                                                </a>
                                            </li>
                                            <li class="list02">
                                                <a href=""><span class="blank">
                                                    <span class="ico"><img
                                                            src="https://www.kcar.com/resources/images/content/buy/detail_info_ico02.png"
                                                            alt="성능·상태 점검기록부">
                                                    </span>
                                                    <p>성능·상태 점검기록부</p>
                                                </span>
                                                </a>
                                            </li>
                                            <li class="list03">

                                                <a href="">
                                                    <span class="blank">
                                                        <span class="ico"><img
                                                                src="https://www.kcar.com/resources/images/content/buy/detail_info_ico03.png"
                                                                alt="보험 이력">
                                                        </span>
                                                        <p>보험 이력</p>
                                                    </span>
                                                </a>
                                            </li>
                                            <li class="list04">
                                                <a href="javascript:;"
                                                   onclick="try{mobileTasEvent.callTasEvent('car_keep',{'sCarCd': 'EC60306284'});}catch(e){} infoNormal.fnWindowPop('keep_pop','630','650','transfer','yes','i_iInstMonth=36&amp;i_iInstRate=6.5');">
<span class="blank">
<span class="ico"><img src="https://www.kcar.com/resources/images/content/buy/detail_info_ico04.png"
                       alt="총 비용 계산기"></span>
<p>총 비용 계산기</p>
</span>
                                                </a>
                                            </li>
                                        </ul>
                                        <ul class="noti">
                                            <li class="list02"><a href="" target="_blank">동일 모델 입고 알림받기</a></li>
                                            <li class="list01"><a href="" target="_blank">찾아 오시는 길</a></li>

                                        </ul>
                                    </div>
                                </div>
                            </div>

                            <!-- //일반차량 -->
                        </div>
                    </div>


                    <div class="buy_cap" id="cap_area">
                        <h3>사고 싶은 이 차, 월 얼마면 될까? <span>목돈은 아껴두고 할부로 구매하세요.</span></h3>
                        <div class="cap_bx">
                            <div class="le">
                                <div class="captab tabcom">
                                    <h4>선수금 <span class="txt">(최초 30%)</span></h4>
                                    <div class="captab_input"><input type="text" class="" id="advancePay" maxlength="5">
                                        &nbsp;만원
                                    </div>
                                </div>
                                <div class="captab tabcom">
                                    <h4>할부기간</h4>
                                    <ul class="captab1">
                                        <li><a href="#none" data-month="12">12개월</a></li>
                                        <li><a href="#none" data-month="24">24개월</a></li>
                                        <li><a href="#none" data-month="36" class="on">36개월</a></li>
                                        <li><a href="#none" data-month="48">48개월</a></li>
                                        <li><a href="#none" data-month="60">60개월</a></li>

                                    </ul>
                                </div>
                                <div class="captab tabcom">
                                    <h4>금리<b class="monfin_info"><b>금리 정보</b><span class="ly_tip">금리는 고객님의 이해를 돕기 위한 예시로 신용등급별 금리를 나타내는 것은 아닙니다.</span></b>
                                    </h4>
                                    <ul class="captab2">
                                        <li><a href="#none" data-index="0" data-inst="6.5" class="on">6.5% 23만원</a></li>
                                        <li><a href="#none" data-index="1" data-inst="8">8% 23만원</a></li>
                                        <li><a href="#none" data-index="2" data-inst="9.5">9.5% 24만원</a></li>
                                        <li><a href="#none" data-index="3" data-inst="11">11% 24만원</a></li>
                                        <li><a href="#none" data-index="4" data-inst="12.5">12.5% 25만원</a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="ri">
                                <div class="cap_month">
                                    <p class="tit">월 납입금<b class="monfin_info"><b>월 납입금 정보</b><span class="ly_tip">월 납입금은 예시이며 이용 조건 및 고객님의 신용등급에 따라 변경될 수 있습니다. </span></b>
                                    </p>
                                    <strong class="cap_money">
                                        <span id="monthPrice">225,270</span>
                                        <span>원</span>
                                    </strong>
                                    <ul class="cap_total">
                                        <li>
                                            <span>1년 할부이자</span>
                                            <span class="ct_mon" id="yearIntertest">253,242원</span>
                                        </li>
                                        <li>
                                            <span>총비용</span>
                                            <span class="ct_mon" id="totalPay">11,259,726원</span>
                                        </li>
                                    </ul>
                                    <a href="javascript:void(0);" class="cap_re" id="reset">다시계산</a>
                                    <a href="#none" class="cap_link">내 한도금액 간편 확인 <span class="ly_tip">rpm 캐피탈에서 고객님의 신용조회 및 한도 산출을 진행합니다. </span></a>
                                </div>

                            </div>
                        </div>
                    </div>

                    <div class="detail_info_body">
                        <div class="wrapper">
                            <div class="acticle acticle04">
                                <div class="row">
                                    <div class="piece piece01">
                                        <div class="article_tit">
                                            <h4>차량기본정보</h4>
                                            <ul>
                                                <li>
                                                    <span class="type">차량번호</span>
                                                    <span class="txt">49보0326</span>
                                                </li>
                                                <li>
                                                    <span class="type">차종</span>
                                                    <span class="txt">경차</span>
                                                </li>
                                                <li>
                                                    <span class="type">도어</span>
                                                    <span class="txt">5</span>
                                                </li>
                                                <li>
                                                    <span class="type">인승</span>
                                                    <span class="txt">

											5

										</span>
                                                </li>
                                                <li>
                                                    <span class="type">배기량</span>
                                                    <span class="txt">



												999cc


										</span>
                                                </li>
                                                <li>
                                                    <span class="type">압류/저당</span>
                                                    <span class="txt">없음</span>
                                                </li>
                                                <li>
                                                    <span class="type">제시신고번호</span>
                                                    <span class="txt">제 2020006295호</span>
                                                </li>
                                            </ul>
                                        </div>
                                    </div>
                                    <div class="piece piece02">
                                        <div class="article_tit">
                                            <h4>보험이력</h4>

                                            <a href=""
                                               class="more right">상세보기</a>


                                        </div>
                                        <ul>
                                            <li>
                                                <span class="type">용도변경 이력</span>
                                                <span class="txt">

										없음



									</span>
                                            </li>
                                            <li>
                                                <span class="type">특수 사고이력</span>
                                                <span class="txt">

										전손(0회), 도난(0회), 침수(0회)


									</span>
                                            </li>
                                            <li>
                                                <span class="type">보험사고 이력(내차피해)</span>
                                                <span class="txt">

										0회


									</span>
                                            </li>
                                            <li>
                                                <span class="type">보험사고 이력(타차가해)</span>
                                                <span class="txt">

										0회


									</span>
                                            </li>
                                        </ul>
                                        <p class="point"><span class="ico">※ 본 보험이력은 보험 개발원에서 제공하는 중고차 품질 확인을 위한 참고 자료입니다.</span>
                                            <span class="ly_tip">보험이력은 차량상태의 결정적 판단 자료는 될 수 없으며 <br>차량의 상태는 성능상태점검기록부를 확인해 주시기 바랍니다. <br>보험이력의 수리내역은 2~3개월이내 반영되므로 <br>최신 정보가 미 반영되어 있을 수 있습니다.</span>
                                        </p>
                                    </div>
                                </div>
                            </div>
                            <div class="list_area">
                                <div class="title">
                                    <h4>비슷한 가격대의 국산차</h4>
                                    <a href="#none" class="plus_more" data-listcd="K">더보기</a>
                                </div>
                                <div class="carList_Area medium">
                                    <ul>

                                        <li>
                                            <a href="/car/info/car_info_detail.do?i_sCarCd=EC60316778">
<span class="thumb">
<img src="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60316778_001.jpg" alt="차량 썸네일">
</span></a>
                                            <span class="desc_area">
<a href="/car/info/car_info_detail.do?i_sCarCd=EC60316778">
<strong class="name">
기아
쏘렌토 R
디젤 2.0 2WD TLX
</strong>
</a>
<span class="opt">
09년01월식
&nbsp;&nbsp; 112,817km
</span>



<span class="price">880만원</span>


<a href="">
<span class="monthly">월 19만원</span>
</a>

<span class="mark" data-mark="10;19" data-lease="3"><span class="tip_list tip_10"><button type="button" class="tip_btn">1인소유</button>
    <span class="tip_hot none"><b>1인소유<a href="" class="tip_cl">닫기</a></b><i>소유자 변경 이력이 없는 차량(대여 이력 및 법인 명의 차량 제외)</i></span></span>
    <span class="tip_list tip_19"><button type="button" class="tip_btn" >짧은Km</button>
        <span class="tip_hot none"><b>짧은Km<a href="" class="tip_cl">닫기</a></b><i>연 10,000km 이내 주행 차량</i></span></span></span>
</span>
                                        </li>
                                        <li>
                                            <a href="">
<span class="thumb">
<img src="https://img.kcar.com/3dcarpicture/2019/12/140/60317935_1/main/main780.jpg" alt="차량 썸네일">


</span>
                                            </a>
                                            <span class="desc_area">
<a href="/car/info/car_info_detail.do?i_sCarCd=EC60317935">
<strong class="name">
기아
모하비
2WD QV300
</strong>
</a>
<span class="opt">



09년08월식




&nbsp;&nbsp; 158,227km

</span>



<span class="price">970만원</span>


<a href="">
<span class="monthly">월 21만원</span>
</a>

<span class="mark" data-mark="22;31" data-lease="3"><span class="tip_list tip_22"><button type="button" class="tip_btn">세금계산서</button> <span
        class="tip_hot none"><b>세금계산서<a href="" class="tip_cl">닫기</a></b><i>부가세 환급 대상 차량(경차, 승합차, 화물차)</i></span></span><span
        class="tip_list tip_31"><button type="button" class="tip_btn"
                                       >7인승</button> <span class="tip_hot none"><b>7인승<a
        href="" class="tip_cl">닫기</a></b><i>7인승 차량</i></span></span></span>
</span>
                                        </li>

                                        <li>
                                            <a href="">
<span class="thumb">
<img src="https://img.kcar.com/3dcarpicture/2019/12/093/60314495_1/main/main780.jpg" alt="차량 썸네일">
</span>
                                            </a>
                                            <span class="desc_area">
<a href="">
<strong class="name">
르노삼성
뉴QM5
디젤 4WD RE
</strong>
</a>
<span class="opt">



11년09월식



(12년형)


&nbsp;&nbsp; 112,076km

</span>



<span class="price">990만원</span>


<a href="">
<span class="monthly">월 21만원</span>
</a>

<span class="mark" data-mark="09;19" data-lease="3"><span class="tip_list tip_09"><button type="button" class="tip_btn">특옵션</button> <span
        class="tip_hot none"><b>특옵션<a href="" class="tip_cl">닫기</a></b><i>추가 선택 옵션 장착 혹은 최상위 등급 차량</i></span></span><span
        class="tip_list tip_19"><button type="button" class="tip_btn">짧은Km</button> <span
        class="tip_hot none"><b>짧은Km<a href="" class="tip_cl">닫기</a></b><i>연 10,000km 이내 주행 차량</i></span></span></span>
</span>
                                        </li>

                                        <li>
                                            <a href="">
<span class="thumb">
<img src="https://img.kcar.com/3dcarpicture/2019/12/010/60318744_1/main/main780.jpg" alt="차량 썸네일">

</span>
                                            </a>
                                            <span class="desc_area">
<a href="">
<strong class="name">
기아
스포티지 R
가솔린 2WD TLX
</strong>
</a>
<span class="opt">



11년03월식




&nbsp;&nbsp; 56,573km

</span>



<span class="price">1,100만원</span>


<a href="">
<span class="monthly">월 24만원</span>
</a>

<span class="mark" data-mark="19;30" data-lease="3"><span class="tip_list tip_19">
    <button type="button" class="tip_btn">짧은Km</button>
    <span class="tip_hot none"><b>짧은Km<a href="" class="tip_cl">닫기</a></b><i>연 10,000km 이내 주행 차량</i></span></span>
    <span class="tip_list tip_30"><button type="button" class="tip_btn">보험이력無</button>
        <span class="tip_hot none"><b>보험이력無<a href="" class="tip_cl">닫기</a></b><i>정보 조회일자 기준 보험이력이 없는 차량</i></span></span></span>
</span>
                                        </li>

                                        <li>
                                            <a href="">
<span class="thumb">
<img src="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60319170_001.jpg" alt="차량 썸네일">

</span>
                                            </a>
                                            <span class="desc_area">
<a href="">
<strong class="name">
쉐보레(GM대우)
트랙스
1.4 퍼펙트 블랙
</strong>
</a>
<span class="opt">



16년01월식




&nbsp;&nbsp; 58,992km

</span>



<span class="price">1,180만원</span>


<a href="">
<span class="monthly">월 25만원</span>
</a>
                                                <!--



                                                <span class="price">1,180만원</span>


                                                -->
<span class="mark" data-mark="09;10;19" data-lease="2"><span class="tip_list tip_09"><button type="button"
                                                                                             class="tip_btn"
                                                                                            >특옵션</button> <span
        class="tip_hot none"><b>특옵션<a href="" class="tip_cl">닫기</a></b><i>추가 선택 옵션 장착 혹은 최상위 등급 차량</i></span></span><span
        class="tip_list tip_10"><button type="button" class="tip_btn" >1인소유</button> <span
        class="tip_hot none"><b>1인소유<a href="" class="tip_cl">닫기</a></b><i>소유자 변경 이력이 없는 차량(대여 이력 및 법인 명의 차량 제외)</i></span></span><span
        class="tip_list tip_19"><button type="button" class="tip_btn">짧은Km</button> <span
        class="tip_hot none"><b>짧은Km<a href="" class="tip_cl">닫기</a></b><i>연 10,000km 이내 주행 차량</i></span></span></span>
</span>
                                        </li>

                                    </ul>
                                </div>
                            </div>


                            <div class="list_area">
                                <div class="title">
                                    <h4>비슷한 가격대의 수입차</h4>
                                    <a href="#none" class="plus_more" data-listcd="F">더보기</a>
                                </div>
                                <div class="carList_Area medium">
                                    <ul>

                                        <li>
                                            <a href="">
<span class="thumb">
<img src="https://img.kcar.com/3dcarpicture/2019/12/140/60316533_2/main/main780.jpg" alt="차량 썸네일">

</span>
                                            </a>
                                            <span class="desc_area">
<a href="">
<strong class="name">
푸조
3008
1.6 e-HDi
</strong>
</a>
<span class="opt">



2015년10월식




&nbsp;&nbsp; 128,363km

</span>



<span class="price">1,050만원</span>


<a href="">
<span class="monthly">월 23만원</span>
</a>

<span class="mark" data-mark="22;30" data-lease="3"><span class="tip_list tip_22"><button type="button" class="tip_btn"
                                                                                       >세금계산서</button> <span
        class="tip_hot none"><b>세금계산서<a href="" class="tip_cl">닫기</a></b><i>부가세 환급 대상 차량(경차, 승합차, 화물차)</i></span></span><span
        class="tip_list tip_30"><button type="button" class="tip_btn" >보험이력無</button> <span
        class="tip_hot none"><b>보험이력無<a href="" class="tip_cl">닫기</a></b><i>정보 조회일자 기준 보험이력이 없는 차량</i></span></span></span>
</span>
                                        </li>

                                        <li>
                                            <a href="">
<span class="thumb">
<img src="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60318157_001.jpg" alt="차량 썸네일">

</span>
                                            </a>
                                            <span class="desc_area">
<a href="">
<strong class="name">
푸조
2008
1.6 e-HDi 펠린 L
</strong>
</a>
<span class="opt">



2015년12월식




&nbsp;&nbsp; 96,449km

</span>



<span class="price">1,050만원</span>


<a href="">
<span class="monthly">월 23만원</span>
</a>

<span class="mark" data-mark="41" data-lease="3"><span class="tip_list tip_41"><button type="button" class="tip_btn">정비OK</button> <span
        class="tip_hot none"><b>정비OK<a href="" class="tip_cl">닫기</a></b><i>입고 후 지점에서 수리한 내역이 있는 차량</i></span></span></span>
</span>
                                        </li>

                                        <li>
                                            <a href="">
<span class="thumb">
<img src="https://img.kcar.com/carpicture/carpicture02/pic6032/kcar_60320280_001.jpg" alt="차량 썸네일">
</span>
                                            </a>
                                            <span class="desc_area">
<a href="">
<strong class="name">
푸조
2008
1.6 e-HDi 펠린 L
</strong>
</a>
<span class="opt">



2015년11월식




&nbsp;&nbsp; 39,979km

</span>



<span class="price">1,180만원</span>


<a href="">
<span class="monthly">월 25만원</span>
</a>

<span class="mark" data-mark="09;19;29" data-lease="3"><span class="tip_list tip_09"><button type="button"
                                                                                             class="tip_btn"
                                                                                           >특옵션</button> <span
        class="tip_hot none"><b>특옵션<a href="" class="tip_cl">닫기</a></b><i>추가 선택 옵션 장착 혹은 최상위 등급 차량</i></span></span><span
        class="tip_list tip_19"><button type="button" class="tip_btn" >짧은Km</button> <span
        class="tip_hot none"><b>짧은Km<a href="" class="tip_cl">닫기</a></b><i>연 10,000km 이내 주행 차량</i></span></span><span
        class="tip_list tip_29"><button type="button" class="tip_btn"
                                        >신차급</button> <span class="tip_hot none"><b>신차급<a
        href="" class="tip_cl">닫기</a></b><i>출고 후 1년 이내 차량</i></span></span></span>
</span>
                                        </li>

                                        <li>
                                            <a href="">
<span class="thumb">
<img src="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60319146_001.jpg" alt="차량 썸네일">
</span>
                                            </a>
                                            <span class="desc_area">
<a href="">
<strong class="name">
푸조
2008
1.6 e-HDi 펠린 L
</strong>
</a>
<span class="opt">



2015년09월식




&nbsp;&nbsp; 64,610km

</span>



<span class="price">1,220만원</span>


<a href="">
<span class="monthly">월 26만원</span>
</a>

<span class="mark" data-mark="19;30" data-lease="3"><span class="tip_list tip_19"><button type="button" class="tip_btn"
                                                                                         >짧은Km</button> <span
        class="tip_hot none"><b>짧은Km<a href="" class="tip_cl">닫기</a></b><i>연 10,000km 이내 주행 차량</i></span></span><span
        class="tip_list tip_30"><button type="button" class="tip_btn" >보험이력無</button> <span
        class="tip_hot none"><b>보험이력無<a href="" class="tip_cl">닫기</a></b><i>정보 조회일자 기준 보험이력이 없는 차량</i></span></span></span>
</span>
                                        </li>

                                        <li>
                                            <a href="">
<span class="thumb">
<img src="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60318831_" alt="차량 썸네일">
</span>
                                            </a>
                                            <span class="desc_area">
<a href="1">
<strong class="name">
푸조
2008
1.6 e-HDi 펠린 L
</strong>
</a>
<span class="opt">



2015년07월식




&nbsp;&nbsp; 42,788km

</span>



<span class="price">1,250만원</span>


<a href="">
<span class="monthly">월 27만원</span>
</a>

<span class="mark" data-mark="10;19" data-lease="3"><span class="tip_list tip_10"><button type="button" class="tip_btn">1인소유</button> <span
        class="tip_hot none"><b>1인소유<a href="" class="tip_cl">닫기</a></b><i>소유자 변경 이력이 없는 차량(대여 이력 및 법인 명의 차량 제외)</i></span></span><span
        class="tip_list tip_19"><button type="button" class="tip_btn">짧은Km</button> <span
        class="tip_hot none"><b>짧은Km<a href="" class="tip_cl">닫기</a></b><i>연 10,000km 이내 주행 차량</i></span></span></span>
</span>
                                        </li>

                                    </ul>
                                </div>
                            </div>

                        </div>
                    </div>

                </div>
            </div>

        </form>



    </div>

</template>
<script>
    export default{
        data(){
            return{
                imgUrl:"https://img.kcar.com/carpicture/carpicture10/pic6030/kcar_60306284_",
                imgList:[
                    {imgNum:1,display:"block"},
                    {imgNum:2,display:"none"},
                    {imgNum:3,display:"none"},
                    {imgNum:4,display:"none"},
                    {imgNum:5,display:"none"}
                    ],
                pageNum:1

            }
        },
        methods: {
            prev() {
                for (let i = 0; i < this.imgList.length; i++) {
                    if (i != 0 && this.imgList[i].display == "block") {
                        this.imgList[i].display = "none"
                        this.imgList[i - 1].display = "block"
                        this.pageNum-=1
                        break
                    }else if(i == 0 && this.imgList[i].display == "block"){
                        this.imgList[i].display = "none"
                        this.imgList[this.imgList.length-1].display = "block"
                        this.pageNum=this.imgList[this.imgList.length-1].imgNum
                        break
                    }
                }
            },
            next() {
                for (let i = 0; i < this.imgList.length; i++) {
                    if (i != this.imgList.length-1&& this.imgList[i].display == "block") {
                        this.imgList[i].display = "none"
                        this.imgList[i + 1].display = "block"
                        this.pageNum+=1
                        break
                    }else if(i ==this.imgList.length-1 && this.imgList[i].display == "block"){
                        this.imgList[i].display = "none"
                        this.imgList[1].display = "block"
                        this.pageNum=1
                        break
                    }
                }
            },
            goImg(a){
                for (let i = 0; i < this.imgList.length; i++) {
                    if (this.imgList[i].display=="block") {
                        this.imgList[i].display="none"
                        this.imgList[a].display="block"
                    }
                }
            }
        },
        computed:{

        }
    }
</script>
<style scoped>
    #content {
        padding-top: 10px;
    }
</style>