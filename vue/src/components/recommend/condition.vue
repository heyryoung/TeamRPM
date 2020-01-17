<template>
    <div class="helpCar">
    <div class="helpTab">
        <div class="tab1">
            <h3 class="on" onclick="javascript:switchTab('B');">
                <b>문자알림 신청하기</b>
            </h3>
            <div class="tabCont">
                <form name="frmB" id="frmB" action="/help/helpMain.do" method="post" accept-charset="UTF-8">
                    <input type="hidden" name="i_sReturnPars" value="">
                    <input type="hidden" name="i_sReturnUrl" value="/help/helpMain.do">
                    <!-- input type="hidden" name="i_iNowPageNo"		value="1"/-->
                    <input type="hidden" name="i_sActionFlag" id="bTabActionFlag" value="">
                    <input type="hidden" name="i_sMobile" value="">
                    <input type="hidden" name="i_sHelpCd" value="">
                    <input type="hidden" name="i_sMemberId" value="">
                    <input type="hidden" name="i_sMemberNm" value="">
                    <input type="hidden" name="i_sFlow" value="">
                    <input type="hidden" name="i_sHelpType" value="B">
                    <input type="hidden" name="i_sSecretCheck" value="N">
                    <input type="hidden" name="i_sMakeNm" value="">
                    <input type="hidden" name="i_sModelNm" value="">
                    <input type="hidden" name="i_sClassHeadCd" value="">
                    <input type="hidden" name="i_sClassHeadNm" value="">
                    <input type="hidden" name="i_sClassDetailCd" value="">
                    <input type="hidden" name="i_sClassDetailNm" value="">
                    <input type="hidden" name="i_sColorCd" value="">
                    <input type="hidden" name="i_sOptionCd" value="">
                    <input type="hidden" name="i_sRecComment" value="">

                    <input type="hidden" name="i_sMakeType_param" value="">
                    <input type="hidden" name="i_sMakeCd_param" value="">
                    <input type="hidden" name="i_sModelGrpCd_param" value="">
                    <input type="hidden" name="i_sModelCd_param" value="">

                    <div class="tabContBx">


                        <!-- 로그인 전 -->
                        <div class="st1">
                            <strong class="txt">휴대폰 번호</strong>
                            <p class="txt_ph">문자알림을 보내기 위해 필요한 정보입니다. 로그인해주세요.</p>
                            <div class="loginBtn"><a href="/user/user_login.do" class="helpCombtn">로그인하기 &gt;</a></div>
                        </div>


                        <div class="st2">
                            <p class="help_must">필수입력정보*</p>
                            <div class="detail">
                                <div class="le">
                                    <div class="deType01">
                                        <h5>차량정보 <span class="icon_must">*</span></h5>
                                        <ul class="carchoice carTabs">
                                            <li><input type="checkbox" class="domestic" checked=""> <label for="">국산</label></li>
                                            <li><input type="checkbox" class="imported"> <label for="">수입</label></li>
                                        </ul>
                                        <div>
<span class="detail_sel detail_sel_type1 jqtransformdone">
<div class="jq_sel" style="z-index: 20;"><div><span>제조사</span><a href="#" class="jqTransformSelectOpen"></a></div><ul style="display: none; width: 479px; visibility: visible;"><li><a href="#" index="0" class="selected">제조사</a></li><li><a href="#" index="1">현대</a></li><li><a href="#" index="2">제네시스</a></li><li><a href="#" index="3">기아</a></li><li><a href="#" index="4">쉐보레(GM대우)</a></li><li><a href="#" index="5">르노삼성</a></li><li><a href="#"
                                                                                                                                                                                                                                                                                                                                                                                                                                                  index="6">쌍용</a></li><li><a
        href="#" index="7">대우버스</a></li><li><a href="#" index="8">기타 제조사</a></li></ul><select name="i_sMakeCd" onchange="makeCdChange(this.value);" class="jq_sel_hide" style="">
<option value="">제조사</option>

<option value="001">현대</option>

<option value="007">제네시스</option>

<option value="002">기아</option>

<option value="003">쉐보레(GM대우)</option>

<option value="005">르노삼성</option>

<option value="004">쌍용</option>

<option value="088">대우버스</option>

<option value="006">기타 제조사</option>

</select></div>
</span>
                                        </div>
                                    </div>
                                    <div class="deCarType">
<span class="detail_sel detail_sel_type1 jqtransformdone">
<div class="jq_sel" style="z-index: 20;"><div><span>모델</span><a href="#" class="jqTransformSelectOpen"></a></div><ul style="display: none; width: 479px; visibility: visible;"><li><a href="#" index="0" class="selected">모델</a></li></ul><select id="tab1_model" name="i_sModelGrpCd" onchange="modelGrpCdChange(this.value);" class="jq_sel_hide" style="">
<option value="">모델</option>

</select></div>
</span>
                                    </div>
                                    <div class="deCarType">
<span class="detail_sel detail_sel_type1 jqtransformdone">
<div class="jq_sel" style="z-index: 20;"><div><span>세부모델</span><a href="#" class="jqTransformSelectOpen"></a></div><ul style="display: none; width: 479px; visibility: visible;"><li><a href="#" index="0" class="selected">세부모델</a></li></ul><select name="i_sModelCd" onchange="fnGetCarClassHeadList(this.value);" class="jq_sel_hide" style="">
<option value="">세부모델</option>

</select></div>
</span>
                                    </div>

                                    <div class="deCarType">
<span class="deTypeOp">
<!-- <input type="text" onclick="deClassPop();" class="guideText classInclude" value="" placeholder="등급" readonly="readonly"> -->
<div class="classInclude" onclick="deClassPop();">등급</div>
</span>
                                        <div class="deOpPop deClassPop none">
                                            <h6>등급</h6>
                                            <!-- 20171215 관심차량등록알림 3차개선  -->
                                            <a href="javascript:;" onclick="deClassPop();" class="btn_pop_close"><img src="/resources/images/content/help/btn_pop_close.png" alt="닫기"></a>
                                            <!-- 20171215 관심차량등록알림 3차개선 끝 -->
                                            <div class="dePopTabBx">
                                                <ul class="declass_list"></ul>
                                                <div class="helpPopBtn">
                                                    <a href="javascript:;" onclick="deClassPop();" class="popBtnCl">취소</a>
                                                    <a href="javascript:;" onclick="deClassPopConfirm();" class="popBtnOk">확인</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="deCarType">
<span class="deTypeOp">
<!-- <div class="classcdInclude" onclick="deClassCdPop();">세부등급</div> -->
    <!-- 등급을 2개 이상 선택 시 세부등급 없음이란 멘트가 보여야 하며 글자색상이 그레이색으로 변해야 함 -->
<div class="classcdInclude" onclick="deClassCdPop();">세부등급</div>
</span>
                                        <div class="deOpPop deClassCdPop none">
                                            <h6>세부등급</h6>
                                            <a href="javascript:deClassCdPop();" class="btn_pop_close"><img src="/resources/images/content/help/btn_pop_close.png" alt="닫기"></a>
                                            <div class="dePopTabBx">
                                                <ul class="declassCd_list"></ul>
                                                <div class="helpPopBtn">
                                                    <a href="javascript:;" onclick="deClassCdPop();" class="popBtnCl">취소</a>
                                                    <a href="javascript:;" onclick="deClassCdPopConfirm()" class="popBtnOk">확인</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="deType02">
                                        <div class="type_le">
                                            <h5>연식 <span class="icon_must">*</span></h5>
                                            <span class="detail_sel detail_sel_type1 jqtransformdone">
<div class="jq_sel" style="z-index: 20;"><div><span>선택</span><a href="#" class="jqTransformSelectOpen"></a></div><ul style="display: none; width: 230px; visibility: visible;"><li><a href="#" index="0" class="selected">선택</a></li><li><a href="#" index="1">2007</a></li><li><a href="#" index="2">2008</a></li><li><a href="#" index="3">2009</a></li><li><a href="#" index="4">2010</a></li><li><a href="#" index="5">2011</a></li><li><a href="#"
                                                                                                                                                                                                                                                                                                                                                                                                                                               index="6">2012</a></li><li><a
        href="#" index="7">2013</a></li><li><a href="#" index="8">2014</a></li><li><a href="#" index="9">2015</a></li><li><a href="#" index="10">2016</a></li><li><a href="#" index="11">2017</a></li><li><a href="#" index="12">2018</a></li><li><a href="#" index="13">2019</a></li><li><a href="#" index="14">2020</a></li></ul><select name="i_sMfrFrom" class="jq_sel_hide" style="">
<option value="">선택</option>

<option value="2007">2007</option>

<option value="2008">2008</option>

<option value="2009">2009</option>

<option value="2010">2010</option>

<option value="2011">2011</option>

<option value="2012">2012</option>

<option value="2013">2013</option>

<option value="2014">2014</option>

<option value="2015">2015</option>

<option value="2016">2016</option>

<option value="2017">2017</option>

<option value="2018">2018</option>

<option value="2019">2019</option>

<option value="2020">2020</option>

</select></div>
</span>
                                        </div>
                                        <div class="type_ri">
<span class="detail_sel detail_sel_type1 jqtransformdone">
<div class="jq_sel" style="z-index: 20;"><div><span>선택</span><a href="#" class="jqTransformSelectOpen"></a></div><ul style="display: none; width: 230px; visibility: visible;"><li><a href="#" index="0" class="selected">선택</a></li><li><a href="#" index="1">2007</a></li><li><a href="#" index="2">2008</a></li><li><a href="#" index="3">2009</a></li><li><a href="#" index="4">2010</a></li><li><a href="#" index="5">2011</a></li><li><a href="#"
                                                                                                                                                                                                                                                                                                                                                                                                                                               index="6">2012</a></li><li><a
        href="#" index="7">2013</a></li><li><a href="#" index="8">2014</a></li><li><a href="#" index="9">2015</a></li><li><a href="#" index="10">2016</a></li><li><a href="#" index="11">2017</a></li><li><a href="#" index="12">2018</a></li><li><a href="#" index="13">2019</a></li><li><a href="#" index="14">2020</a></li></ul><select name="i_sMfrTo" class="jq_sel_hide" style="">
<option value="">선택</option>

<option value="2007">2007</option>

<option value="2008">2008</option>

<option value="2009">2009</option>

<option value="2010">2010</option>

<option value="2011">2011</option>

<option value="2012">2012</option>

<option value="2013">2013</option>

<option value="2014">2014</option>

<option value="2015">2015</option>

<option value="2016">2016</option>

<option value="2017">2017</option>

<option value="2018">2018</option>

<option value="2019">2019</option>

<option value="2020">2020</option>

</select></div>
</span>
                                        </div>
                                    </div>
                                    <div class="deType02">
                                        <div class="type_le">
                                            <h5>주행거리 <span class="icon_must">*</span></h5>
                                            <span class="detail_sel detail_sel_type1 jqtransformdone">
<div class="jq_sel" style="z-index: 20;"><div><span>선택</span><a href="#" class="jqTransformSelectOpen"></a></div><ul style="display: none; width: 230px; visibility: visible;"><li><a href="#" index="0" class="selected">선택</a></li><li><a href="#" index="1">0만km</a></li><li><a href="#" index="2">1만km</a></li><li><a href="#" index="3">2만km</a></li><li><a href="#" index="4">3만km</a></li><li><a href="#" index="5">4만km</a></li><li><a href="#"
                                                                                                                                                                                                                                                                                                                                                                                                                                               index="6">5만km</a></li><li><a
        href="#" index="7">6만km</a></li><li><a href="#" index="8">7만km</a></li><li><a href="#" index="9">8만km</a></li><li><a href="#" index="10">9만km</a></li><li><a href="#" index="11">10만km</a></li><li><a href="#" index="12">11만km</a></li><li><a href="#" index="13">12만km</a></li><li><a href="#" index="14">13만km</a></li><li><a href="#" index="15">14만km</a></li><li><a href="#" index="16">15만km</a></li><li><a href="#"
                                                                                                                                                                                                                                                                                                                                                                                                                           index="17">16만km</a></li><li><a
        href="#" index="18">17만km</a></li><li><a href="#" index="19">18만km</a></li><li><a href="#" index="20">19만km</a></li><li><a href="#" index="21">20만km</a></li></ul><select name="i_sMadeDistance1" class="hcarstreet jq_sel_hide" style="">
<option value="">선택</option>

<option value="0">0만km</option>

<option value="1">1만km</option>

<option value="2">2만km</option>

<option value="3">3만km</option>

<option value="4">4만km</option>

<option value="5">5만km</option>

<option value="6">6만km</option>

<option value="7">7만km</option>

<option value="8">8만km</option>

<option value="9">9만km</option>

<option value="10">10만km</option>

<option value="11">11만km</option>

<option value="12">12만km</option>

<option value="13">13만km</option>

<option value="14">14만km</option>

<option value="15">15만km</option>

<option value="16">16만km</option>

<option value="17">17만km</option>

<option value="18">18만km</option>

<option value="19">19만km</option>

<option value="20">20만km</option>

</select></div>
</span>
                                        </div>
                                        <div class="type_ri">
<span class="detail_sel detail_sel_type1 jqtransformdone">
<div class="jq_sel" style="z-index: 20;"><div><span>선택</span><a href="#" class="jqTransformSelectOpen"></a></div><ul style="display: none; width: 230px; visibility: visible;"><li><a href="#" index="0" class="selected">선택</a></li><li><a href="#" index="1">0만km</a></li><li><a href="#" index="2">1만km</a></li><li><a href="#" index="3">2만km</a></li><li><a href="#" index="4">3만km</a></li><li><a href="#" index="5">4만km</a></li><li><a href="#"
                                                                                                                                                                                                                                                                                                                                                                                                                                               index="6">5만km</a></li><li><a
        href="#" index="7">6만km</a></li><li><a href="#" index="8">7만km</a></li><li><a href="#" index="9">8만km</a></li><li><a href="#" index="10">9만km</a></li><li><a href="#" index="11">10만km</a></li><li><a href="#" index="12">11만km</a></li><li><a href="#" index="13">12만km</a></li><li><a href="#" index="14">13만km</a></li><li><a href="#" index="15">14만km</a></li><li><a href="#" index="16">15만km</a></li><li><a href="#"
                                                                                                                                                                                                                                                                                                                                                                                                                           index="17">16만km</a></li><li><a
        href="#" index="18">17만km</a></li><li><a href="#" index="19">18만km</a></li><li><a href="#" index="20">19만km</a></li><li><a href="#" index="21">20만km</a></li></ul><select name="i_sMadeDistance2" class="hcarstreet jq_sel_hide" style="">
<option value="">선택</option>

<option value="0">0만km</option>

<option value="1">1만km</option>

<option value="2">2만km</option>

<option value="3">3만km</option>

<option value="4">4만km</option>

<option value="5">5만km</option>

<option value="6">6만km</option>

<option value="7">7만km</option>

<option value="8">8만km</option>

<option value="9">9만km</option>

<option value="10">10만km</option>

<option value="11">11만km</option>

<option value="12">12만km</option>

<option value="13">13만km</option>

<option value="14">14만km</option>

<option value="15">15만km</option>

<option value="16">16만km</option>

<option value="17">17만km</option>

<option value="18">18만km</option>

<option value="19">19만km</option>

<option value="20">20만km</option>

</select></div>
</span>
                                        </div>
                                    </div>
                                </div>
                                <div class="ri">
                                    <div class="deType01">
                                        <div class="type_le">
                                            <h5>옵션</h5>
                                            <span class="deTypeOp">
<!-- <input type="text" onclick="deOptPop();" class="guideText optionInclude" value="선택" readonly="readonly"/> -->
<div class="optionInclude" onclick="deOptPop();">선택</div>
</span>
                                        </div>
                                        <div class="type_ri">
                                            <h5>색상</h5>
                                            <span class="deTypeOp">
<!-- <input type="text" onclick="deColPop();" class="guideText colorInclude" value="선택" readonly="readonly"/> -->
<div class="colorInclude" onclick="deColPop();">선택</div>
</span>
                                        </div>
                                        <div class="deOpPop deOptPop none">
                                            <h6>옵션</h6>
                                            <a href="javascript:;" onclick="deOptPop();" class="btn_pop_close"><img src="/resources/images/content/help/btn_pop_close.png" alt="닫기"></a>
                                            <div class="dePopTabBx">
                                                <div class="dePopTab">
                                                    <ul class="tabs">
                                                        <li class="on"><a href="#none"><span>외관 <b>(5)</b></span></a></li>
                                                        <li><a href="#none"><span>내장 <b>(17)</b></span></a></li>
                                                        <li><a href="#none"><span>안전 <b>(17)</b></span></a></li>
                                                        <li><a href="#none"><span>편의 <b>(17)</b></span></a></li>
                                                    </ul>
                                                </div>
                                                <div class="tab_content ">
                                                    <ul>


                                                        <li><input type="checkbox" id="pa01" name="i_arrOptionCd" value="029">
                                                            <label for="pa01">HID / LED 라이트</label></li>


                                                        <li><input type="checkbox" id="pa02" name="i_arrOptionCd" value="024">
                                                            <label for="pa02">전동접이사이드미러</label></li>


                                                        <li><input type="checkbox" id="pa03" name="i_arrOptionCd" value="010">
                                                            <label for="pa03">선루프</label></li>


                                                        <li><input type="checkbox" id="pa04" name="i_arrOptionCd" value="062">
                                                            <label for="pa04">루프랙</label></li>


                                                        <li><input type="checkbox" id="pa05" name="i_arrOptionCd" value="017">
                                                            <label for="pa05">알루미늄 휠</label></li>


                                                    </ul>
                                                </div>
                                                <div class="tab_content none">
                                                    <ul>


                                                        <li><input type="checkbox" id="sa06" name="i_arrOptionCd" value="031">
                                                            <label for="sa06">스티어링 휠 리모컨</label></li>


                                                        <li><input type="checkbox" id="sa07" name="i_arrOptionCd" value="008">
                                                            <label for="sa07">파워스티어링</label></li>


                                                        <li><input type="checkbox" id="sa08" name="i_arrOptionCd" value="030">
                                                            <label for="sa08">룸미러 : ECM</label></li>


                                                        <li><input type="checkbox" id="sa09" name="i_arrOptionCd" value="074">
                                                            <label for="sa09">룸미러 : 하이패스</label></li>


                                                        <li><input type="checkbox" id="sa010" name="i_arrOptionCd" value="014">
                                                            <label for="sa010">가죽시트</label></li>


                                                        <li><input type="checkbox" id="sa011" name="i_arrOptionCd" value="021">
                                                            <label for="sa011">전동시트 : 운전석</label></li>


                                                        <li><input type="checkbox" id="sa012" name="i_arrOptionCd" value="035">
                                                            <label for="sa012">전동시트 : 조수석</label></li>


                                                        <li><input type="checkbox" id="sa013" name="i_arrOptionCd" value="090">
                                                            <label for="sa013">전동시트 : 뒷좌석</label></li>


                                                        <li><input type="checkbox" id="sa014" name="i_arrOptionCd" value="022">
                                                            <label for="sa014">열선시트 : 운전석</label></li>


                                                        <li><input type="checkbox" id="sa015" name="i_arrOptionCd" value="091">
                                                            <label for="sa015">열선시트 : 조수석</label></li>


                                                        <li><input type="checkbox" id="sa016" name="i_arrOptionCd" value="063">
                                                            <label for="sa016">열선시트 : 뒷좌석</label></li>


                                                        <li><input type="checkbox" id="sa017" name="i_arrOptionCd" value="051">
                                                            <label for="sa017">메모리시트 : 운전석</label></li>


                                                        <li><input type="checkbox" id="sa018" name="i_arrOptionCd" value="078">
                                                            <label for="sa018">메모리시트 : 조수석</label></li>


                                                        <li><input type="checkbox" id="sa019" name="i_arrOptionCd" value="034">
                                                            <label for="sa019">통풍시트 : 운전석</label></li>


                                                        <li><input type="checkbox" id="sa020" name="i_arrOptionCd" value="077">
                                                            <label for="sa020">통풍시트 : 조수석</label></li>


                                                        <li><input type="checkbox" id="sa021" name="i_arrOptionCd" value="093">
                                                            <label for="sa021">통풍시트 : 뒷좌석</label></li>


                                                        <li><input type="checkbox" id="sa022" name="i_arrOptionCd" value="085">
                                                            <label for="sa022">안마 시트</label></li>


                                                    </ul>
                                                </div>
                                                <div class="tab_content none">
                                                    <ul>


                                                        <li><input type="checkbox" id="ka023" name="i_arrOptionCd" value="026">
                                                            <label for="ka023">에어백 : 운전석</label></li>


                                                        <li><input type="checkbox" id="ka024" name="i_arrOptionCd" value="027">
                                                            <label for="ka024">에어백 : 조수석</label></li>


                                                        <li><input type="checkbox" id="ka025" name="i_arrOptionCd" value="020">
                                                            <label for="ka025">에어백 : 사이드</label></li>


                                                        <li><input type="checkbox" id="ka026" name="i_arrOptionCd" value="056">
                                                            <label for="ka026">에어백 : 커튼</label></li>


                                                        <li><input type="checkbox" id="ka027" name="i_arrOptionCd" value="082">
                                                            <label for="ka027">감지센서 : 전방</label></li>


                                                        <li><input type="checkbox" id="ka028" name="i_arrOptionCd" value="032">
                                                            <label for="ka028">감지센서 : 후방</label></li>


                                                        <li><input type="checkbox" id="ka029" name="i_arrOptionCd" value="080">
                                                            <label for="ka029">카메라 : 전방</label></li>


                                                        <li><input type="checkbox" id="ka030" name="i_arrOptionCd" value="058">
                                                            <label for="ka030">카메라 : 후방</label></li>


                                                        <li><input type="checkbox" id="ka031" name="i_arrOptionCd" value="081">
                                                            <label for="ka031">360도 어라운드 뷰</label></li>


                                                        <li><input type="checkbox" id="ka032" name="i_arrOptionCd" value="001">
                                                            <label for="ka032">ABS</label></li>


                                                        <li><input type="checkbox" id="ka033" name="i_arrOptionCd" value="019">
                                                            <label for="ka033">TCS : 미끄럼방지</label></li>


                                                        <li><input type="checkbox" id="ka034" name="i_arrOptionCd" value="055">
                                                            <label for="ka034">차체자세 제어장치</label></li>


                                                        <li><input type="checkbox" id="ka035" name="i_arrOptionCd" value="002">
                                                            <label for="ka035">ECS : 전자제어 서스펜션</label></li>


                                                        <li><input type="checkbox" id="ka036" name="i_arrOptionCd" value="033">
                                                            <label for="ka036">TPMS : 타이어공기압감지</label></li>


                                                        <li><input type="checkbox" id="ka037" name="i_arrOptionCd" value="076">
                                                            <label for="ka037">전자식파킹브레이크</label></li>


                                                        <li><input type="checkbox" id="ka038" name="i_arrOptionCd" value="006">
                                                            <label for="ka038">파워도어록</label></li>


                                                        <li><input type="checkbox" id="ka039" name="i_arrOptionCd" value="092">
                                                            <label for="ka039">LDWS:차선이탈경보시스템</label></li>


                                                    </ul>
                                                </div>
                                                <div class="tab_content none">
                                                    <ul>


                                                        <li><input type="checkbox" id="ta040" name="i_arrOptionCd" value="023">
                                                            <label for="ta040">오토 에어컨</label></li>


                                                        <li><input type="checkbox" id="ta041" name="i_arrOptionCd" value="089">
                                                            <label for="ta041">수동에어컨</label></li>


                                                        <li><input type="checkbox" id="ta042" name="i_arrOptionCd" value="015">
                                                            <label for="ta042">리모컨키</label></li>


                                                        <li><input type="checkbox" id="ta043" name="i_arrOptionCd" value="057">
                                                            <label for="ta043">스마트키</label></li>


                                                        <li><input type="checkbox" id="ta044" name="i_arrOptionCd" value="059">
                                                            <label for="ta044">파워 트렁크</label></li>


                                                        <li><input type="checkbox" id="ta045" name="i_arrOptionCd" value="007">
                                                            <label for="ta045">파워 윈도우</label></li>


                                                        <li><input type="checkbox" id="ta046" name="i_arrOptionCd" value="068">
                                                            <label for="ta046">크루즈컨트롤</label></li>


                                                        <li><input type="checkbox" id="ta047" name="i_arrOptionCd" value="003">
                                                            <label for="ta047">CD플레이어</label></li>


                                                        <li><input type="checkbox" id="ta048" name="i_arrOptionCd" value="005">
                                                            <label for="ta048">내비게이션</label></li>


                                                        <li><input type="checkbox" id="ta049" name="i_arrOptionCd" value="054">
                                                            <label for="ta049">뒷좌석 모니터</label></li>


                                                        <li><input type="checkbox" id="ta050" name="i_arrOptionCd" value="071">
                                                            <label for="ta050">AUX 단자</label></li>


                                                        <li><input type="checkbox" id="ta051" name="i_arrOptionCd" value="072">
                                                            <label for="ta051">USB 단자</label></li>


                                                        <li><input type="checkbox" id="ta052" name="i_arrOptionCd" value="088">
                                                            <label for="ta052">블루투스</label></li>


                                                        <li><input type="checkbox" id="ta053" name="i_arrOptionCd" value="084">
                                                            <label for="ta053">핸들 열선</label></li>


                                                        <li><input type="checkbox" id="ta054" name="i_arrOptionCd" value="086">
                                                            <label for="ta054">오토 라이트</label></li>


                                                        <li><input type="checkbox" id="ta055" name="i_arrOptionCd" value="083">
                                                            <label for="ta055">차량 메뉴얼</label></li>


                                                        <li><input type="checkbox" id="ta056" name="i_arrOptionCd" value="094">
                                                            <label for="ta056">헤드업 디스플레이(HUD)</label></li>


                                                    </ul>
                                                </div>
                                                <div class="helpPopBtn">
                                                    <a href="javascript:;" onclick="deOptPop();" class="popBtnCl">취소</a>
                                                    <a href="javascript:;" onclick="deOptPopConfirm();" class="popBtnOk">확인</a>
                                                </div>
                                            </div>
                                        </div>

                                        <div class="deOpPop deColPop none">
                                            <!-- 제목을 섹상선택/제외할 생상선택 -->
                                            <h6 class="colTit none">색상선택</h6>
                                            <a href="javascript:;" onclick="deColPop();" class="btn_pop_close"><img src="/resources/images/content/help/btn_pop_close.png" alt="닫기"></a>
                                            <ul class="colUl">

                                                <li class="colorBlock">
                                                    <label for="color1" class="colLabel">

<span class="colBx">
<span style="background:#ffffff;"></span>
<span style="background:#ffffff;"></span>
<span class="colCh none"></span>
<input type="hidden" id="color1" name="i_arrColorCd" value="COLOR0280">
</span>


                                                        <span class="colTxt">흰색</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color2" class="colLabel">

<span class="colBx">
<span style="background:#FFFAFA;"></span>
<span style="background:#FFFAFA;"></span>
<span class="colCh none"></span>
<input type="hidden" id="color2" name="i_arrColorCd" value="COLOR0230">
</span>


                                                        <span class="colTxt">진주색</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color3" class="colLabel">

<span class="colBx">
<span style="background:#000000;"></span>
<span style="background:#000000;"></span>
<span class="colCh none"></span>
<input type="hidden" id="color3" name="i_arrColorCd" value="COLOR0040">
</span>


                                                        <span class="colTxt">검정색</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color4" class="colLabel">


<span class="colBx">

<span style="background:#000000;"></span>

<span style="background:#464741;"></span>

<span class="colCh none"></span>
<input type="hidden" id="color4" name="i_arrColorCd" value="COLOR0050">
</span>

                                                        <span class="colTxt">검정투톤</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color5" class="colLabel">

<span class="colBx">
<span style="background:#585A59;"></span>
<span style="background:#585A59;"></span>
<span class="colCh none"></span>
<input type="hidden" id="color5" name="i_arrColorCd" value="COLOR0220">
</span>


                                                        <span class="colTxt">쥐색</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color6" class="colLabel">

<span class="colBx">
<span style="background:#C0C0C0;"></span>
<span style="background:#C0C0C0;"></span>
<span class="colCh none"></span>
<input type="hidden" id="color6" name="i_arrColorCd" value="COLOR0160">
</span>


                                                        <span class="colTxt">은색</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color7" class="colLabel">

<span class="colBx">
<span style="background:#D3D3D3;"></span>
<span style="background:#D3D3D3;"></span>
<span class="colCh none"></span>
<input type="hidden" id="color7" name="i_arrColorCd" value="COLOR0190">
</span>


                                                        <span class="colTxt">은회색</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color8" class="colLabel">


<span class="colBx">

<span style="background:#c0c0c0;"></span>

<span style="background:#464741;"></span>

<span class="colCh none"></span>
<input type="hidden" id="color8" name="i_arrColorCd" value="COLOR0170">
</span>

                                                        <span class="colTxt">은색투톤</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color9" class="colLabel">


<span class="colBx">

<span style="background:#ffffff;"></span>

<span style="background:#464741;"></span>

<span class="colCh none"></span>
<input type="hidden" id="color9" name="i_arrColorCd" value="COLOR0290">
</span>

                                                        <span class="colTxt">흰색투톤</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color10" class="colLabel">


<span class="colBx">

<span style="background:#F7F7F5;"></span>

<span style="background:#464741;"></span>

<span class="colCh none"></span>
<input type="hidden" id="color10" name="i_arrColorCd" value="COLOR0240">
</span>

                                                        <span class="colTxt">진주투톤</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color11" class="colLabel">

<span class="colBx">
<span style="background:#A6B2B0;"></span>
<span style="background:#A6B2B0;"></span>
<span class="colCh none"></span>
<input type="hidden" id="color11" name="i_arrColorCd" value="COLOR0180">
</span>


                                                        <span class="colTxt">은하색</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color12" class="colLabel">

<span class="colBx">
<span style="background:#CFD8E7;"></span>
<span style="background:#CFD8E7;"></span>
<span class="colCh none"></span>
<input type="hidden" id="color12" name="i_arrColorCd" value="COLOR0110">
</span>


                                                        <span class="colTxt">명은색</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color13" class="colLabel">

<span class="colBx">
<span style="background:#ff0000;"></span>
<span style="background:#ff0000;"></span>
<span class="colCh none"></span>
<input type="hidden" id="color13" name="i_arrColorCd" value="COLOR0130">
</span>


                                                        <span class="colTxt">빨간색</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color14" class="colLabel">

<span class="colBx">
<span style="background:#A94828;"></span>
<span style="background:#A94828;"></span>
<span class="colCh none"></span>
<input type="hidden" id="color14" name="i_arrColorCd" value="COLOR0210">
</span>


                                                        <span class="colTxt">주황색</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color15" class="colLabel">

<span class="colBx">
<span style="background:#800080;"></span>
<span style="background:#800080;"></span>
<span class="colCh none"></span>
<input type="hidden" id="color15" name="i_arrColorCd" value="COLOR0200">
</span>


                                                        <span class="colTxt">자주색</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color16" class="colLabel">

<span class="colBx">
<span style="background:#46293B;"></span>
<span style="background:#46293B;"></span>
<span class="colCh none"></span>
<input type="hidden" id="color16" name="i_arrColorCd" value="COLOR0120">
</span>


                                                        <span class="colTxt">보라색</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color17" class="colLabel">

<span class="colBx">
<span style="background:#EECACE;"></span>
<span style="background:#EECACE;"></span>
<span class="colCh none"></span>
<input type="hidden" id="color17" name="i_arrColorCd" value="COLOR0300">
</span>


                                                        <span class="colTxt">분홍색</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color18" class="colLabel">

<span class="colBx">
<span style="background:#ffff00;"></span>
<span style="background:#ffff00;"></span>
<span class="colCh none"></span>
<input type="hidden" id="color18" name="i_arrColorCd" value="COLOR0080">
</span>


                                                        <span class="colTxt">노란색</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color19" class="colLabel">

<span class="colBx">
<span style="background:#808275;"></span>
<span style="background:#808275;"></span>
<span class="colCh none"></span>
<input type="hidden" id="color19" name="i_arrColorCd" value="COLOR0010">
</span>


                                                        <span class="colTxt">갈대색</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color20" class="colLabel">

<span class="colBx">
<span style="background:#8E8574;"></span>
<span style="background:#8E8574;"></span>
<span class="colCh none"></span>
<input type="hidden" id="color20" name="i_arrColorCd" value="COLOR0140">
</span>


                                                        <span class="colTxt">연금색</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color21" class="colLabel">

<span class="colBx">
<span style="background:#3D3624;"></span>
<span style="background:#3D3624;"></span>
<span class="colCh none"></span>
<input type="hidden" id="color21" name="i_arrColorCd" value="COLOR0020">
</span>


                                                        <span class="colTxt">갈색</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color22" class="colLabel">


<span class="colBx">

<span style="background:#3D3624;"></span>

<span style="background:#464741;"></span>

<span class="colCh none"></span>
<input type="hidden" id="color22" name="i_arrColorCd" value="COLOR0030">
</span>

                                                        <span class="colTxt">갈색투톤</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color23" class="colLabel">

<span class="colBx">
<span style="background:#837538;"></span>
<span style="background:#837538;"></span>
<span class="colCh none"></span>
<input type="hidden" id="color23" name="i_arrColorCd" value="COLOR0060">
</span>


                                                        <span class="colTxt">금색</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color24" class="colLabel">


<span class="colBx">

<span style="background:#837538;"></span>

<span style="background:#464741;"></span>

<span class="colCh none"></span>
<input type="hidden" id="color24" name="i_arrColorCd" value="COLOR0070">
</span>

                                                        <span class="colTxt">금색투톤</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color25" class="colLabel">

<span class="colBx">
<span style="background:#124280;"></span>
<span style="background:#124280;"></span>
<span class="colCh none"></span>
<input type="hidden" id="color25" name="i_arrColorCd" value="COLOR0250">
</span>


                                                        <span class="colTxt">청색</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color26" class="colLabel">

<span class="colBx">
<span style="background:#75919C;"></span>
<span style="background:#75919C;"></span>
<span class="colCh none"></span>
<input type="hidden" id="color26" name="i_arrColorCd" value="COLOR0270">
</span>


                                                        <span class="colTxt">하늘색</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color27" class="colLabel">

<span class="colBx">
<span style="background:#1D444B;"></span>
<span style="background:#1D444B;"></span>
<span class="colCh none"></span>
<input type="hidden" id="color27" name="i_arrColorCd" value="COLOR0100">
</span>


                                                        <span class="colTxt">담녹색</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color28" class="colLabel">

<span class="colBx">
<span style="background:#00cc00;"></span>
<span style="background:#00cc00;"></span>
<span class="colCh none"></span>
<input type="hidden" id="color28" name="i_arrColorCd" value="COLOR0090">
</span>


                                                        <span class="colTxt">녹색</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color29" class="colLabel">

<span class="colBx">
<span style="background:#9AB95C;"></span>
<span style="background:#9AB95C;"></span>
<span class="colCh none"></span>
<input type="hidden" id="color29" name="i_arrColorCd" value="COLOR0150">
</span>


                                                        <span class="colTxt">연두색</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color30" class="colLabel">

<span class="colBx">
<span style="background:#1F7D7C;"></span>
<span style="background:#1F7D7C;"></span>
<span class="colCh none"></span>
<input type="hidden" id="color30" name="i_arrColorCd" value="COLOR0260">
</span>


                                                        <span class="colTxt">청옥색</span>
                                                    </label>
                                                </li>

                                                <li class="colorBlock">
                                                    <label for="color31" class="colLabel">

<span class="colBx">
<span style="background:#ffffff;"></span>
<span style="background:#ffffff;"></span>
<span class="colCh none"></span>
<input type="hidden" id="color31" name="i_arrColorCd" value="COLOR9999">
</span>


                                                        <span class="colTxt">기타</span>
                                                    </label>
                                                </li>

                                            </ul>
                                            <div class="helpPopBtn">
                                                <a href="javascript:;" onclick="deColPop();" class="popBtnCl">취소</a>
                                                <a href="javascript:;" onclick="deColConfirm();" class="popBtnOk">확인</a>
                                            </div>
                                        </div>
                                    </div>

                                    <div class="deType01">
                                        <div class="type_ le">
                                            <h5>변속기</h5>
                                            <span class="detail_sel detail_sel_type1 jqtransformdone">
<div class="jq_sel" style="z-index: 20;"><div><span>전체</span><a href="#" class="jqTransformSelectOpen"></a></div><ul style="display: none; width: 230px; visibility: visible;"><li><a href="#" index="0" class="selected">전체</a></li><li><a href="#" index="1">오토</a></li><li><a href="#" index="2">수동</a></li><li><a href="#" index="3">세미오토</a></li><li><a href="#" index="4">CVT</a></li></ul><select name="i_sTransmissionCd" class="jq_sel_hide"
                                                                                                                                                                                                                                                                                                                                                                                                         style="">
<option value="">전체</option>

<option value="001">오토</option>

<option value="002">수동</option>

<option value="003">세미오토</option>

<option value="004">CVT</option>

</select></div>
</span>
                                        </div>
                                        <div class="type_ri">
                                            <h5>연료</h5>
                                            <span class="detail_sel detail_sel_type1 jqtransformdone">
<div class="jq_sel" style="z-index: 20;"><div><span>전체</span><a href="#" class="jqTransformSelectOpen"></a></div><ul style="display: none; width: 230px; visibility: visible;"><li><a href="#" index="0" class="selected">전체</a></li><li><a href="#" index="1">가솔린</a></li><li><a href="#" index="2">디젤</a></li><li><a href="#" index="3">LPG</a></li><li><a href="#" index="4">가솔린+LPG</a></li><li><a href="#" index="5">가솔린+전기</a></li><li><a href="#"
                                                                                                                                                                                                                                                                                                                                                                                                                                                index="6">디젤+전기</a></li><li><a
        href="#" index="7">LPG+전기</a></li><li><a href="#" index="8">전기</a></li><li><a href="#" index="9">가솔린+CNG</a></li><li><a href="#" index="10">LNG</a></li><li><a href="#" index="11">기타</a></li></ul><select name="i_sFuelTypeCd" class="jq_sel_hide" style="">
<option value="">전체</option>

<option value="001">가솔린</option>

<option value="002">디젤</option>

<option value="003">LPG</option>

<option value="005">가솔린+LPG</option>

<option value="006">가솔린+전기</option>

<option value="007">디젤+전기</option>

<option value="008">LPG+전기</option>

<option value="009">전기</option>

<option value="010">가솔린+CNG</option>

<option value="011">LNG</option>

<option value="999">기타</option>

</select></div>
</span>
                                        </div>
                                    </div>
                                    <div class="deType02">
                                        <h5>사고유무 <span class="icon_must">*</span></h5>
                                        <ul class="acc_yn">

                                            <li><input type="checkbox" id="recB0" name="recComment" value="001"> <label for="recB0">무사고</label></li>

                                            <li><input type="checkbox" id="recB1" name="recComment" value="003"> <label for="recB1">단순교환</label></li>

                                            <li><input type="checkbox" id="recB2" name="recComment" value="002"> <label for="recB2">단순사고(접촉)</label></li>

                                            <li><input type="checkbox" id="recB3" name="recComment" value="004"> <label for="recB3">사고</label></li>

                                        </ul>
                                    </div>

                                    <div class="deType03" style="background: none;">
                                        <div class="type_le">
                                            <h5>추천 직영점</h5>
                                            <span class="detail_sel detail_sel_type1 jqtransformdone">
<div class="jq_sel" style="z-index: 20;"><div><span>전체</span><a href="#" class="jqTransformSelectOpen"></a></div><ul style="display: none; width: 230px; visibility: visible;"><li><a href="#" index="0" class="selected">전체</a></li><li><a href="#" index="1">서울</a></li><li><a href="#" index="2">경기/인천</a></li><li><a href="#" index="3">경남</a></li><li><a href="#" index="4">경북</a></li><li><a href="#" index="5">전남</a></li><li><a href="#" index="6">전북</a></li><li><a
        href="#" index="7">충남</a></li><li><a href="#" index="8">충북</a></li></ul><select name="i_sSidoCode" onchange="regionChange(this.value);" class="jq_sel_hide" style="">
<option value="">전체</option>

<option value="SEOUL">서울</option>

<option value="INCHUN">경기/인천</option>

<option value="BUSAN">경남</option>

<option value="DEGUE">경북</option>

<option value="GANGJU">전남</option>

<option value="JUNJU">전북</option>

<option value="DEJUN">충남</option>

<option value="CHEONGJU">충북</option>

</select></div>
</span>
                                        </div>

                                        <div class="type_ri">
<span class="detail_sel detail_sel_type1 jqtransformdone">
<div class="jq_sel" style="z-index: 20;"><div><span>전체</span><a href="#" class="jqTransformSelectOpen"></a></div><ul style="display: none; width: 230px; visibility: visible;"><li><a href="#" index="0" class="selected">전체</a></li></ul><select name="i_sGugunCode" class="jq_sel_hide" style="">
<option value="">전체</option>

</select></div>
</span>
                                        </div>
                                    </div>
                                    <div class="deType02">
                                        <h5>구입예정시기</h5>
                                        <span class="detail_sel detail_sel_type1 jqtransformdone">
<div class="jq_sel" style="z-index: 20;"><div><span>구입시기</span><a href="#" class="jqTransformSelectOpen"></a></div><ul style="display: none; width: 479px; visibility: visible;"><li><a href="#" index="0" class="selected">구입시기</a></li><li><a href="#" index="1">1개월이내</a></li><li><a href="#" index="2">2개월이내</a></li><li><a href="#" index="3">3개월이내</a></li></ul><select name="i_sHelpDate" class="jq_sel_hide" style="">
<option value="">구입시기</option>
<option value="C010">1개월이내</option>
<option value="C020">2개월이내</option>
<option value="C030">3개월이내</option>
</select></div>
</span>
                                    </div>
                                    <div class="deType02">
                                        <div class="type_le">
                                            <h5>구입예산 <span class="icon_must">*</span></h5>
                                            <div class="budBox">
                                                <span class="budPut"><input type="" class="" name="i_iHopePriceFrom" maxlength="6" isplaceholderinited="true"> <span>만원</span></span>
                                                <!-- <p class="budWord"></p> -->
                                            </div>
                                        </div>
                                        <div class="type_ri">
                                            <div class="budBox">
                                                <span class="budPut"><input type="" class="" name="i_iHopePrice" maxlength="6" isplaceholderinited="true"> <span>만원</span></span>
                                                <!-- <p class="budWord"></p> -->
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="helpAgr">
                        <div class="helpAgrBx">
                            신청한 모델이 신규로 등록되면 알림을 받아 보시겠어요?
                            <label for="agreeY">
                                <span class="holds-cbox"><input type="checkbox" id="mobileCheck" name="i_sMobileCheck" value="Y" onclick="javascript:showHelpAlram(this);" class="cbox"></span> <b>동의</b>
                            </label>

                        </div>
                        <div class="deOpPop helpAgree none">
                            <h6>개인정보 수집/이용 동의</h6>
                            <a href="javascript:;" onclick="helpAgree();" class="btn_pop_close"><img src="/resources/images/content/help/btn_pop_close.png" alt="닫기"></a>
                            <div class="dePopTabBx">
                                <table class="helpAgrTable" width="100%">
                                    <colgroup>
                                        <col width="30%">
                                        <col width="33%">
                                        <col width="37%">
                                    </colgroup>
                                    <colgroup>
                                    </colgroup>
                                    <tbody>
                                    <tr>
                                        <th>항목</th>
                                        <th>목적</th>
                                        <th>보유기간</th>
                                    </tr>
                                    <tr>
                                        <td>휴대전화번호</td>
                                        <td>관심차량등록알림 신청으로 인한 신청모델 입고 시 <br>핸드폰 알림 문자 발송</td>
                                        <td>목적달성 시 즉시 파기 또는 이용 목적과 관련된 <br>사고조사, 분쟁해결, 민원처리, 법령상 의무이행을<br>위한 필요한 범위 내에서만 보유/이용</td>
                                    </tr>
                                    </tbody>
                                </table>
                                <div class="helpPopBtn">
                                    <a href="javascript:;" onclick="helpAgree();" class="popBtnCl">취소</a>
                                    <a href="javascript:;" onclick="helpAgree();" class="popBtnOk">확인</a>
                                </div>
                            </div>
                        </div>
                        <p class="alramEx">해당 서비스 제공을 위해서 필요한 최소한의 개인정보이므로 동의를 해 주셔야 서비스 이용이 가능합니다. <a href="javascript:;" onclick="helpAgree();" class="helpCombtn">내용보기</a></p>
                        <div class="helpAlram" hidden="hidden">
                            <p>알림 서비스 기간 설정</p>
                            <div class="helpAlramSe">
<span class="comm_sels comm_sels_type3 jqtransformdone">
<div class="jq_sel" style="z-index: 20;"><div><span>20일</span><a href="#" class="jqTransformSelectOpen"></a></div><ul style="display: none; width: 0px; visibility: visible;"><li><a href="#" index="0">10일</a></li><li><a href="#" index="1" class="selected">20일</a></li><li><a href="#" index="2">60일</a></li></ul><select name="i_sDate" class="jq_sel_hide" style="">
<option value="C010">10일</option>
<option value="C020" selected="selected">20일</option>
<option value="C030">60일</option>
</select></div>
</span>
                            </div>
                        </div>
                        <div class="helpAgrOpen secretYnTab">
                            신청한 내용을 공개하시겠어요?
                            <label for="bTabAgreeY">
                                <span class="holds-cbox checked"><input type="radio" id="bTabAgreeY" class="cbox" value="N" onclick="javascript:secretYn(this.value);" checked="checked"></span> <b>공개&nbsp; &nbsp;</b>
                            </label>
                            <label for="bTabAgreeN">
                                <span class="holds-cbox"><input type="radio" id="bTabAgreeN" class="cbox" value="Y" onclick="javascript:secretYn(this.value);"></span> <b>비공개</b>
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
<style scoped>
    .tabCont{
        width: 1180px;
    }
</style>