<template>
    <div id="autodanawa_gridC">

        <div class="self_estimate" id="eDiv_1">
            <div class="summary_area">
                <div id="self_summary" class="">
                    <button type="button" class="btn_change_model" id="modelChange" work="brand" brand="303">모델변경
                    </button>
                    <div class="photo" photo="">
                        <img class="eImgBrandLogo brandlogo" alt="현대"
                             src="http://autoimg.danawa.com/photo/brand/303_40.png">
                        <img class="eImgModel" src="http://autoimg.danawa.com/photo/3600/45076/lineup_360.png"
                             onerror="imageError(this,&quot;model_200_100.png&quot;)" alt="아반떼">
                        <div class="estimateModelColor" id="modelColorList" key="45076"></div>
                    </div>
                    <h3 class="name eModelName">아반떼 <span class="year">2019년형</span></h3>
                    <div class="lineup lineupName">가솔린 1.6 (개별소비세 환원)</div>
                    <div class="trim eTrimName">스타일 (M/T)</div>
                    <div class="info">
                        <span id="trimLaunchDate">2020.01 출시</span>
                        <span>준중형</span>
                        <span id="trimFuel">휘발유</span>
                        <span id="trimDisp">1598cc</span>
                        <span id="trimEffm">복합 14.0 ㎞/ℓ</span>
                    </div>
                    <div class="view eBtnLineupInfo">
                        <button type="button" class="" cont="price">가격</button>
                        <button type="button" class="" cont="spec">제원</button>
                        <button type="button" class="" cont="item">사양/옵션</button>
                        <button type="button" class="" cont="catalog">카탈로그</button>
                        <button type="button" class="" cont="shop">종합정보</button>
                    </div>
                    <div class="preview">
                        <ul class="history">
                            <li>
                                <dl class="price">
                                    <dt>기본가격</dt>
                                    <dd><span class="num eTextPriceInfo">14,370,000</span></dd>
                                </dl>
                            </li>
                            <li>
                                <dl class="price">
                                    <dt>옵션가격<a href="#Optn_1" class="anchor">선택</a></dt>
                                    <dd><span class="num eOptionPriceInfo">0</span></dd>
                                </dl>
                                <ul class="detail eSelOptionList"></ul>
                            </li>
                            <li>
                                <dl class="price">
                                    <dt>할인가격<a href="#Term_1" class="anchor">선택</a></dt>
                                    <dd><span class="num eRsltTermSum">0</span></dd>
                                </dl>
                                <ul class="detail eSelDiscountList"></ul>
                            </li>
                            <li>
                                <dl class="price">
                                    <dt>세제혜택 <a href="#info_tax" class="anchor" id="FreeDescFocus" style="">선택</a></dt>
                                    <dd class="eRsltFreeDesc"><span>(없음)</span></dd>
                                </dl>
                                <div class="detail eRsltOldCarFreeDesc"></div>
                            </li>
                            <li>
                                <dl class="price">
                                    <dt>탁송료<a href="#info_consign" class="anchor">선택</a></dt>
                                    <dd><span class="eRsltTrnsDesc">별도</span></dd>
                                </dl>
                            </li>
                        </ul>
                        <ul class="sum">
                            <li>
                                <dl class="price">
                                    <dt>차량가격</dt>
                                    <dd><span class="num eRsltPriceSum">14,370,000</span></dd>
                                </dl>
                            </li>
                            <li>
                                <dl class="price">
                                    <dt>취득세/공채
                                        <button type="button" class="buttonHelp eFincPopup" subject="용어사전"
                                                kind="dictionary" val="459"><span class="screen_behind">도움말</span>
                                        </button>
                                    </dt>
                                    <dd><span class="num eRsltRegiSum">977,840</span></dd>
                                </dl>
                            </li>
                            <li>
                                <dl class="price">
                                    <dt>부대비용
                                        <button type="button" class="buttonHelp eFincPopup" subject="용어사전"
                                                kind="dictionary" val="458"><span class="screen_behind">도움말</span>
                                        </button>
                                    </dt>
                                    <dd><span class="num">40,000</span></dd>
                                </dl>
                            </li>
                            <li>
                                <dl class="price">
                                    <dt>보험료(별도)</dt>
                                    <dd class="adver"><a
                                            href="http://white.contentsfeed.com/RealMedia/ads/click_lx.ads/www.danawa.com/sub_DanawaCar/L28/1361910658/x14/danawa/LH_CPC_32085_1401/LH_CPC_32085_1703.html/61764151704634536968514143366743"
                                            target="_blank"><img
                                            src="http://orange.contentsfeed.com/RealMedia/ads/Creatives/danawa/LH_CPC_32085_1401/self_insure.jpg"
                                            border="0"></a><img
                                            src="http://ad.danawa.com/RealMedia/ads/adstream_lx.ads/www.danawa.com/sub_DanawaCar/L28/1361910658/x14/danawa/LH_CPC_32085_1401/LH_CPC_32085_1703.html/61764151704634536968514143366743?_RM_EMPTY_&amp;"
                                            style="display:none;" alt=""></dd>
                                </dl>
                            </li>
                            <li class="total">
                                <dl class="price">
                                    <dt>가격+비용</dt>
                                    <dd><span class="num eRsltPriceTotalSum">15,387,840</span></dd>
                                </dl>
                            </li>
                        </ul>
                    </div>

                    <div class="estmBtnNext">
                        <button type="button" class="btn_request button" job="simulation" ftab="FincS"
                                onclick="ga('send', 'event', '신차견적', '견적요청', '쉐보레 올 뉴 말리부')"><span>구매상담 요청</span>
                        </button>
                    </div>

                </div>
            </div>
            <div class="info_area" id="info_lineup">
                <h4 class="title" id="Trim_1">세부모델</h4>
                <div class="model_notice">개별소비세 환원 가격은 예상 가격이며, 공식 가격 확인 후 업데이트 할 예정입니다.</div>
                <div class="contents scroll eTrimBox">
                    <dl class="lineup_group eChkTrimList" code="303360045076">
                        <dt>
                            <button type="button" class="lineup ">2019년형 가솔린 1.6 (개별소비세 환원)<span class="state"></span>
                            </button>
                        </dt>
                        <dd code="30336004507663793" class=""><label><input name="eChkTrim_1" checked=""
                                                                            id="trim_163793" title="세부모델 선택" value=""
                                                                            type="radio">
                            <div><span class="name" title="" for="trim_163793">스타일 (M/T)</span><span class="price num"
                                                                                                     for="trim_163793">14,370,000</span>
                            </div>
                        </label></dd>
                        <dd code="30336004507663796" class=""><label><input name="eChkTrim_1" id="trim_163796"
                                                                            title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_163796">스타일 (A/T)</span><span class="price num"
                                                                                                     for="trim_163796">15,870,000</span>
                            </div>
                        </label></dd>
                        <dd code="30336004507663797" class=""><label><input name="eChkTrim_1" id="trim_163797"
                                                                            title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_163797">스마트 초이스 (A/T)</span><span
                                    class="price num" for="trim_163797">17,670,000</span></div>
                        </label></dd>
                        <dd code="30336004507663795" class=""><label><input name="eChkTrim_1" id="trim_163795"
                                                                            title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_163795">스마트 (A/T)</span><span class="price num"
                                                                                                     for="trim_163795">18,370,000</span>
                            </div>
                        </label></dd>
                        <dd code="30336004507663792" class=""><label><input name="eChkTrim_1" id="trim_163792"
                                                                            title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_163792">스마트 베스트 초이스 패키지 (A/T)</span><span
                                    class="price num" for="trim_163792">20,320,000</span></div>
                        </label></dd>
                        <dd code="30336004507663794" class=""><label><input name="eChkTrim_1" id="trim_163794"
                                                                            title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_163794">프리미엄 (A/T)</span><span class="price num"
                                                                                                      for="trim_163794">22,550,000</span>
                            </div>
                        </label></dd>
                    </dl>
                    <dl class="lineup_group eChkTrimList" code="303360045077">
                        <dt>
                            <button type="button" class="lineup  close">2019년형 가솔린 터보 1.6 (Sport) (개별소비세 환원)<span
                                    class="state"></span></button>
                        </dt>
                        <dd code="30336004507763800" class="off"><label><input name="eChkTrim_1" id="trim_163800"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_163800">모던 (M/T)</span><span class="price num"
                                                                                                    for="trim_163800">20,010,000</span>
                            </div>
                        </label></dd>
                        <dd code="30336004507763798" class="off"><label><input name="eChkTrim_1" id="trim_163798"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_163798">모던 (A/T)</span><span class="price num"
                                                                                                    for="trim_163798">22,580,000</span>
                            </div>
                        </label></dd>
                        <dd code="30336004507763799" class="off"><label><input name="eChkTrim_1" id="trim_163799"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_163799">프리미엄 (A/T)</span><span class="price num"
                                                                                                      for="trim_163799">24,090,000</span>
                            </div>
                        </label></dd>
                    </dl>
                    <dl class="lineup_group eChkTrimList" code="303360045078">
                        <dt>
                            <button type="button" class="lineup  close">2019년형 LPG 1.6 (일반인 판매용) (개별소비세 환원)<span
                                    class="state"></span></button>
                        </dt>
                        <dd code="30336004507863803" class="off"><label><input name="eChkTrim_1" id="trim_163803"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_163803">스타일 (A/T)</span><span class="price num"
                                                                                                     for="trim_163803">17,300,000</span>
                            </div>
                        </label></dd>
                        <dd code="30336004507863802" class="off"><label><input name="eChkTrim_1" id="trim_163802"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_163802">스마트 (A/T)</span><span class="price num"
                                                                                                     for="trim_163802">19,890,000</span>
                            </div>
                        </label></dd>
                        <dd code="30336004507863801" class="off"><label><input name="eChkTrim_1" id="trim_163801"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_163801">모던 (A/T)</span><span class="price num"
                                                                                                    for="trim_163801">21,410,000</span>
                            </div>
                        </label></dd>
                    </dl>
                    <dl class="lineup_group eChkTrimList" code="303360045079">
                        <dt>
                            <button type="button" class="lineup  close">2019년형 LPG 1.6 (장애인용/렌터카) (개별소비세 환원)<span
                                    class="state"></span></button>
                        </dt>
                        <dd code="30336004507963804" class="off"><label><input name="eChkTrim_1" id="trim_163804"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_163804">장애인용 모던 왼발장애 (A/T)</span><span
                                    class="price num" for="trim_163804">20,100,000</span></div>
                        </label></dd>
                        <dd code="30336004507963805" class="off"><label><input name="eChkTrim_1" id="trim_163805"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_163805">장애인용 모던 왼손 왼발 장애 (A/T)</span><span
                                    class="price num" for="trim_163805">20,030,000</span></div>
                        </label></dd>
                        <dd code="30336004507963806" class="off"><label><input name="eChkTrim_1" id="trim_163806"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_163806">장애인용 모던 왼손 오른발 장애 (A/T)</span><span
                                    class="price num" for="trim_163806">20,120,000</span></div>
                        </label></dd>
                        <dd code="30336004507963807" class="off"><label><input name="eChkTrim_1" id="trim_163807"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_163807">장애인용 모던 오른손 오른발 장애 (A/T)</span><span
                                    class="price num" for="trim_163807">20,120,000</span></div>
                        </label></dd>
                        <dd code="30336004507963808" class="off"><label><input name="eChkTrim_1" id="trim_163808"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_163808">장애인용 모던 오른발 장애 (A/T)</span><span
                                    class="price num" for="trim_163808">20,190,000</span></div>
                        </label></dd>
                        <dd code="30336004507963809" class="off"><label><input name="eChkTrim_1" id="trim_163809"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_163809">장애인용 모던 양발 장애 (A/T)</span><span
                                    class="price num" for="trim_163809">20,280,000</span></div>
                        </label></dd>
                        <dd code="30336004507963810" class="off"><label><input name="eChkTrim_1" id="trim_163810"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_163810">장애인용 모던 오른손 장애 (A/T)</span><span
                                    class="price num" for="trim_163810">20,030,000</span></div>
                        </label></dd>
                        <dd code="30336004507963811" class="off"><label><input name="eChkTrim_1" id="trim_163811"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_163811">렌터카 스타일 (A/T)</span><span
                                    class="price num" for="trim_163811">16,240,000</span></div>
                        </label></dd>
                        <dd code="30336004507963812" class="off"><label><input name="eChkTrim_1" id="trim_163812"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_163812">렌터카 스마트 (A/T)</span><span
                                    class="price num" for="trim_163812">18,680,000</span></div>
                        </label></dd>
                    </dl>
                    <dl class="lineup_group eChkTrimList" code="303360044364">
                        <dt>
                            <button type="button" class="lineup  close">2019년형 가솔린 1.6<span class="state"></span>
                            </button>
                        </dt>
                        <dd code="30336004436461141" class="off"><label><input name="eChkTrim_1" id="trim_161141"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_161141">스타일 (M/T)</span><span class="price num"
                                                                                                     for="trim_161141">14,110,000</span>
                            </div>
                        </label></dd>
                        <dd code="30336004436461142" class="off"><label><input name="eChkTrim_1" id="trim_161142"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_161142">스타일 (A/T)</span><span class="price num"
                                                                                                     for="trim_161142">15,580,000</span>
                            </div>
                        </label></dd>
                        <dd code="30336004436461143" class="off"><label><input name="eChkTrim_1" id="trim_161143"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_161143">스마트 초이스 (A/T)</span><span
                                    class="price num" for="trim_161143">17,350,000</span></div>
                        </label></dd>
                        <dd code="30336004436461144" class="off"><label><input name="eChkTrim_1" id="trim_161144"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_161144">스마트 (A/T)</span><span class="price num"
                                                                                                     for="trim_161144">18,030,000</span>
                            </div>
                        </label></dd>
                        <dd code="30336004436461161" class="off"><label><input name="eChkTrim_1" id="trim_161161"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_161161">스마트 베스트 초이스 패키지 (A/T)</span><span
                                    class="price num" for="trim_161161">19,950,000</span></div>
                        </label></dd>
                        <dd code="30336004436461145" class="off"><label><input name="eChkTrim_1" id="trim_161145"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_161145">프리미엄 (A/T)</span><span class="price num"
                                                                                                      for="trim_161145">22,140,000</span>
                            </div>
                        </label></dd>
                    </dl>
                    <dl class="lineup_group eChkTrimList" code="303360044365">
                        <dt>
                            <button type="button" class="lineup close">2019년형 가솔린 터보 1.6 (Sport)<span
                                    class="state"></span></button>
                        </dt>
                        <dd code="30336004436561149" class="off"><label><input name="eChkTrim_1" id="trim_161149"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_161149">모던 (M/T)</span><span class="price num"
                                                                                                    for="trim_161149">19,640,000</span>
                            </div>
                        </label></dd>
                        <dd code="30336004436561150" class="off"><label><input name="eChkTrim_1" id="trim_161150"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_161150">모던 (A/T)</span><span class="price num"
                                                                                                    for="trim_161150">22,170,000</span>
                            </div>
                        </label></dd>
                        <dd code="30336004436561151" class="off"><label><input name="eChkTrim_1" id="trim_161151"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_161151">프리미엄 (A/T)</span><span class="price num"
                                                                                                      for="trim_161151">23,650,000</span>
                            </div>
                        </label></dd>
                    </dl>
                    <dl class="lineup_group eChkTrimList" code="303360044371">
                        <dt>
                            <button type="button" class="lineup  close">2019년형 LPG 1.6 (일반인 판매용)<span
                                    class="state"></span></button>
                        </dt>
                        <dd code="30336004437161183" class="off"><label><input name="eChkTrim_1" id="trim_161183"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_161183">스타일 (A/T)</span><span class="price num"
                                                                                                     for="trim_161183">16,980,000</span>
                            </div>
                        </label></dd>
                        <dd code="30336004437161184" class="off"><label><input name="eChkTrim_1" id="trim_161184"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_161184">스마트 (A/T)</span><span class="price num"
                                                                                                     for="trim_161184">19,530,000</span>
                            </div>
                        </label></dd>
                        <dd code="30336004437161185" class="off"><label><input name="eChkTrim_1" id="trim_161185"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_161185">모던 (A/T)</span><span class="price num"
                                                                                                    for="trim_161185">21,020,000</span>
                            </div>
                        </label></dd>
                    </dl>
                    <dl class="lineup_group eChkTrimList" code="303360044367">
                        <dt>
                            <button type="button" class="lineup  close">2019년형 LPG 1.6 (장애인용/렌터카)<span
                                    class="state"></span></button>
                        </dt>
                        <dd code="30336004436761152" class="off"><label><input name="eChkTrim_1" id="trim_161152"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_161152">장애인용 모던 왼발장애 (A/T)</span><span
                                    class="price num" for="trim_161152">20,100,000</span></div>
                        </label></dd>
                        <dd code="30336004436761153" class="off"><label><input name="eChkTrim_1" id="trim_161153"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_161153">장애인용 모던 왼손 왼발 장애 (A/T)</span><span
                                    class="price num" for="trim_161153">20,030,000</span></div>
                        </label></dd>
                        <dd code="30336004436761154" class="off"><label><input name="eChkTrim_1" id="trim_161154"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_161154">장애인용 모던 왼손 오른발 장애 (A/T)</span><span
                                    class="price num" for="trim_161154">20,120,000</span></div>
                        </label></dd>
                        <dd code="30336004436761155" class="off"><label><input name="eChkTrim_1" id="trim_161155"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_161155">장애인용 모던 오른손 오른발 장애 (A/T)</span><span
                                    class="price num" for="trim_161155">20,120,000</span></div>
                        </label></dd>
                        <dd code="30336004436761156" class="off"><label><input name="eChkTrim_1" id="trim_161156"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_161156">장애인용 모던 오른발 장애 (A/T)</span><span
                                    class="price num" for="trim_161156">20,190,000</span></div>
                        </label></dd>
                        <dd code="30336004436761157" class="off"><label><input name="eChkTrim_1" id="trim_161157"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_161157">장애인용 모던 양발 장애 (A/T)</span><span
                                    class="price num" for="trim_161157">20,280,000</span></div>
                        </label></dd>
                        <dd code="30336004436761158" class="off"><label><input name="eChkTrim_1" id="trim_161158"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_161158">장애인용 모던 오른손 장애 (A/T)</span><span
                                    class="price num" for="trim_161158">20,030,000</span></div>
                        </label></dd>
                        <dd code="30336004436761159" class="off"><label><input name="eChkTrim_1" id="trim_161159"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_161159">렌터카 스타일 (A/T)</span><span
                                    class="price num" for="trim_161159">16,240,000</span></div>
                        </label></dd>
                        <dd code="30336004436761160" class="off"><label><input name="eChkTrim_1" id="trim_161160"
                                                                               title="세부모델 선택" value="" type="radio">
                            <div><span class="name" title="" for="trim_161160">렌터카 스마트 (A/T)</span><span
                                    class="price num" for="trim_161160">18,680,000</span></div>
                        </label></dd>
                    </dl>
                </div>
                <button type="button" class="btn_moreview"><span></span></button>
            </div>
            <div class="info_area" id="Optn_1">
                <h4 class="title">옵션선택</h4>
                <div class="contents scroll">
                    <ul class="check_list eChkItemList">
                        <li><label><input name="option" id="item_172792" title="옵션품목"
                                          value="NzI3QTIlNiAyNTAwMDAlNiAlRVMlQVOlOiglRVMlOTElOiAlRVElOiAlQDAlRVMlOTMlOkOlMiAlRVMlQEIlQVMlRVOlQEElOiglMiAoJVUDJTlEJVI4JVUDJVExJVIwJVUBJVIwJTgwJVUDJVEzJVJEJTIwJVUCJThGJTg0JVUDJTk2JVI0JTIwJVUDJTg0JVJDJVUEJTg0JVIwJVUEJThBJVI4JVUCJVE2JVJDJTIwJVUEJThGJVFDJVUEJTk1JVE4KO=="
                                          type="checkbox" data-overlap="" code="72792">
                            <div><span class="name"
                                       title="인조가죽 시트 (인조가죽 도어 센터트림 포함)">인조가죽 시트 (인조가죽 도어 센터트림 포함)</span><span
                                    class="price num">250,000</span></div>
                        </label></li>
                        <li><label><input name="option" id="item_172793" title="옵션품목"
                                          value="NzI3QTMlNiA1MDAwMDAlNiAlRVOlQTglQDOlRVIlQEMlQDAlMiAlRVMlQEElOTOlRVIlOTclQDglRVOlQEElOiglRVMlQDOlOkMlRVMlQEElOTOlMiAlRVOlQEMlOTglRVOlQDIlOTOlRVMlOTclQDAlMiBJ"
                                          type="checkbox" data-overlap="" code="72793">
                            <div><span class="name" title="현대 스마트센스 패키지 I">현대 스마트센스 패키지 I</span>
                                <button type="button" class="buttonHelp optionInfo " kind="option" subject="사양정보"
                                        val="72793"><span class="screen_behind">보기</span></button>
                                <span class="price num">500,000</span></div>
                        </label></li>
                        <div id="optionKey_72793" style="display:none;">
                            <div class="specDetailSection option">
                                <div class="sub"><h3>현대 스마트센스 패키지 I(구성옵션)</h3></div>
                                <div class="content"><h4 class="title">1. 전방 충돌방지 보조(차량)</h4>
                                    <div class="photo"><img src="http://autoimg.danawa.com/photo/3600/items/14808.jpg"
                                                            alt="전방 충돌방지 보조(차량)"
                                                            onerror="imageError(this, &quot;80_80.gif&quot;)"></div>
                                    <div class="explain">전방 감지 센서(전방 카메라 또는 전방 카메라+전방 레이더)를 통하여 전방 차량/보행 거리 및 상대속도를 판단하여
                                        충돌 위험 시 경고문 표시, 경고음 등으로 위험을 운전자에게 알려주고, 필요 시 브레이크를 작동시켜 피해를 경감시킵니다.
                                    </div>
                                </div>
                                <div class="content"><h4 class="title">2. 차로 이탈방지 보조</h4>
                                    <div class="photo"><img src="http://autoimg.danawa.com/photo/3600/items/14810.jpg"
                                                            alt="차로 이탈방지 보조"
                                                            onerror="imageError(this, &quot;80_80.gif&quot;)"></div>
                                    <div class="explain">차선을 인식하고 차로 이탈이 예상되면 차로를 이탈하지 않도록 조향을 보조합니다.</div>
                                </div>
                                <div class="content"><h4 class="title">3. 운전자 주의 경고</h4>
                                    <div class="photo"><img src="http://autoimg.danawa.com/photo/3600/items/14814.jpg"
                                                            alt="운전자 주의 경고"
                                                            onerror="imageError(this, &quot;80_80.gif&quot;)"></div>
                                    <div class="explain">운전자의 부주의 정도를 5단계로 표시하며, 운전자의 피로나 부주의 운전이 판단되면 메시지와 경고음을 통해 휴식을
                                        권유합니다.
                                    </div>
                                </div>
                            </div>
                        </div>
                        <li><label><input name="option" id="item_172794" title="옵션품목"
                                          value="NzI3QTOlNiAzNTAwMDAlNiAxNSUFOyV5RCUCQCUFOyUCQSV5QCVyMCUFOyV5NSV4OyUFOjUBMSV5OyUFOyV5RCUCNCVyMCUFRCV5OyUBMCVyMCVyOjVyMCUFRCV4MyV4MCUFOyV5RCUCNCUFOyV5NjUCNCVyMCVyOjVyMCUFOjUBNjUBOyUFOyV5NjUCNCVyMCUFOjV5NCV5NCUFOyV4OSUBNCUFRCV4MSUBOyVyMCUFOjUCQCV4OyUFOjUBMCV4QCUFOyV5RCUCNCUFRCV4MSUBOw=="
                                          type="checkbox" data-overlap="" code="72794">
                            <div><span class="name" title="15인치 알로이 휠 + 타이어 + 리어 디스크 브레이크">15인치 알로이 휠 + 타이어 + 리어 디스크 브레이크</span>
                                <button type="button" class="buttonHelp optionInfo " kind="option" subject="사양정보"
                                        val="72794"><span class="screen_behind">보기</span></button>
                                <span class="price num">350,000</span></div>
                        </label></li>
                        <div id="optionKey_72794" style="display:none;">
                            <div class="specDetailSection option">
                                <div class="sub"><h3>15인치 알로이 휠 + 타이어 + 리어 디스크 브레이크(구성옵션)</h3></div>
                                <div class="content"><h4 class="title">1. 195/65R15 타이어 &amp; 15인치 알로이 휠</h4>
                                    <div class="photo"><img src="http://autoimg.danawa.com/photo/3600/items/14786.jpg"
                                                            alt="195/65R15 타이어 &amp; 15인치 알로이 휠"
                                                            onerror="imageError(this, &quot;80_80.gif&quot;)"></div>
                                </div>
                            </div>
                        </div>
                        <li><label><input name="option" id="item_172795" title="옵션품목"
                                          value="NzI3QTVlNiA2MiAwMDAlNiAlRVIlQTOlQTOlRVMlQEElOTOlRVOlQTOlQEMlRVIlOTAlQDglRVMlQVOlOiOlMiAlRVMlQTglOTOlRVIlQTOlQTOlRVMlQTglOTOlMiAlRVOlQEMlOTglRVOlQDIlOTOlRVMlOTclQDAlMiAlMkIlMiAlRVMlQTglOTOlRVOlQDYlOTAlRVIlQVOlOkMlRVMlQVOlOiOlRVOlQEElOiglMiAlRVMlOkIlOTglRVOlQEElOiglRVIlOTElOTO="
                                          type="checkbox" data-overlap="" code="72795">
                            <div><span class="name" title="디스플레이 오디오 패키지 + 오토라이트 컨트롤">디스플레이 오디오 패키지 + 오토라이트 컨트롤</span>
                                <button type="button" class="buttonHelp optionInfo " kind="option" subject="사양정보"
                                        val="72795"><span class="screen_behind">보기</span></button>
                                <span class="price num">620,000</span></div>
                        </label></li>
                        <div id="optionKey_72795" style="display:none;">
                            <div class="specDetailSection option">
                                <div class="sub"><h3>디스플레이 오디오 패키지 + 오토라이트 컨트롤(구성옵션)</h3></div>
                                <div class="content"><h4 class="title">1. 7인치 디스플레이 오디오</h4>
                                    <div class="photo"><img src="http://autoimg.danawa.com/photo/3600/items/14770.jpg"
                                                            alt="7인치 디스플레이 오디오"
                                                            onerror="imageError(this, &quot;80_80.gif&quot;)"></div>
                                    <div class="explain">- 고해상도 7인치 터치스크린, 라디오, MP3<br>
                                        - 폰 커넥티비티 기능 적용(구글 안드로이드 오토, 애플 카플레이, 미러링크)<br>
                                        - 스티어링 휠 음성인식 버튼은 구글 안드로이드 오토 및 애플 카플레이 연동용 버튼임
                                    </div>
                                </div>
                                <div class="content"><h4 class="title">2. 후방모니터(조향연동)</h4></div>
                            </div>
                        </div>
                        <li><label><input name="option" id="item_172796" title="옵션품목"
                                          value="NzI3QTYlNiAzMiAwMDAlNiAlNVJVUVlYJTUEJTIwJVUDJVJCJVI0JVUEJThGJVFDJVUEJThBJVI4JTIwJVUEJThDJVE4JVUEJTgyJVE0JVUDJVE3JTgw"
                                          type="checkbox" data-overlap="" code="72796">
                            <div><span class="name" title="[TUIX] 컴포트 패키지">[TUIX] 컴포트 패키지</span>
                                <button type="button" class="buttonHelp optionInfo " kind="option" subject="사양정보"
                                        val="72796"><span class="screen_behind">보기</span></button>
                                <span class="price num">320,000</span></div>
                        </label></li>
                        <div id="optionKey_72796" style="display:none;">
                            <div class="specDetailSection option">
                                <div class="sub"><h3>[TUIX] 컴포트 패키지(구성옵션)</h3></div>
                                <div class="content"><h4 class="title">1. [TUIX] 온장컵홀더</h4>
                                    <div class="photo"><img src="http://autoimg.danawa.com/photo/3600/items/14795.jpg"
                                                            alt="[TUIX] 온장컵홀더"
                                                            onerror="imageError(this, &quot;80_80.gif&quot;)"></div>
                                </div>
                                <div class="content"><h4 class="title">2. [TUIX] 컨버세이션 미러</h4>
                                    <div class="photo"><img src="http://autoimg.danawa.com/photo/3600/items/14796.jpg"
                                                            alt="[TUIX] 컨버세이션 미러"
                                                            onerror="imageError(this, &quot;80_80.gif&quot;)"></div>
                                </div>
                            </div>
                        </div>
                        <li><label><input name="option" id="item_172797" title="옵션품목"
                                          value="NzI3QTclNiAxMiAwMDAlNiAlNVJVUVlYJTUEJTIwJVUCJVE2JVJEJVUEJTgzJTgwJVUDJTlFJTg1JTIwJVUCJVE2JVFDJVUDJTk2JVI0JVUDJThBJVE0JVUEJThGJVFDJVUDJTlEJVJDJVUCJTlGJVFD"
                                          type="checkbox" data-overlap="" code="72797">
                            <div><span class="name" title="[TUIX] 립타입 리어스포일러">[TUIX] 립타입 리어스포일러</span>
                                <button type="button" class="buttonHelp optionInfo " kind="option" subject="사양정보"
                                        val="72797"><span class="screen_behind">보기</span></button>
                                <span class="price num">120,000</span></div>
                        </label></li>
                        <div id="optionKey_72797" style="display:none;">
                            <div class="specDetailSection option">
                                <div class="sub"><h3>[TUIX] 립타입 리어스포일러(구성옵션)</h3></div>
                                <div class="content"><h4 class="title">1. [TUIX] 립타입 리어 스포일러</h4>
                                    <div class="photo"><img src="http://autoimg.danawa.com/photo/3600/items/15232.jpg"
                                                            alt="[TUIX] 립타입 리어 스포일러"
                                                            onerror="imageError(this, &quot;80_80.gif&quot;)"></div>
                                </div>
                            </div>
                        </div>
                    </ul>
                </div>
                <button type="button" class="btn_moreview"><span></span></button>
                <div class="ad_box off">
                    <!--
                    <div class='ad_title'><span class='ad_label'>AD</span>런즈 그랜저IG 전용</div>
                    <div class='ad_contents'>어라운드뷰모니터(AVM)+ 솔라가드전면(front) 틴팅패키지(97만원)</div>
                    <a href='https://goo.gl/kejvbH' class='btn_adlink' target='_blank'><span class='txt'>상품 자세히 보기</span></a>
                    -->
                </div>
            </div>
            <div class="info_area" id="Term_1">
                <h4 class="title">판매조건</h4>
                <div class="contents scroll">
                    <ul class="check_list eOldCar"></ul>
                    <ul class="check_list eChkTermList">
                        <li code="S10">
                            <div class="group"><span class="name" title="재고 할인조건">재고 할인조건</span></div>
                        </li>
                        <li code="S100"><label for="term_1S100"><input type="checkbox"
                                                                       value="NzAwMDAwJTYwJVUDJTlFJVFDJVUBJVIzJVEwJTIwJVUEJTk1JVEwJVUDJTlEJVI4JVUDJVExJVIwJVUBJVIxJVI0KDE5JVUCJTg1JTg0MTAlRVMlQVIlQTOlMiAlRVMlQVOlOiOlRVMlOTAlQDOlMiAlRVMlQDMlQVOlRVMlQDIlOiAq"
                                                                       code="S100" id="term_1S100" name="option">
                            <div><span class="name" title="19년10월 이전 생산">└ 19년10월 이전 생산</span><span class="price num">700,000</span>
                            </div>
                        </label></li>
                        <li code="S101"><label for="term_1S101"><input type="checkbox"
                                                                       value="NTAwMDAwJTYwJVUDJTlFJVFDJVUBJVIzJVEwJTIwJVUEJTk1JVEwJVUDJTlEJVI4JVUDJVExJVIwJVUBJVIxJVI0KDE5JVUCJTg1JTg0MTElRVMlQVIlQTOlMiAlRVMlQDMlQVOlRVMlQDIlOiAq"
                                                                       code="S101" id="term_1S101" name="option">
                            <div><span class="name" title="19년11월 생산">└ 19년11월 생산</span><span
                                    class="price num">500,000</span></div>
                        </label></li>
                        <li code="D100"><label for="term_1D10"><input type="checkbox"
                                                                      value="MiAwMDAwJTYwJVUDJVEwJTg0JVUDJThCJTlDJVUDJVIwJVE4"
                                                                      code="D100" id="term_1D10" name="option">
                            <div><span class="name" title="전시차">전시차</span>
                                <button type="button" class="buttonHelp eFincPopup" subject="판매조건" kind="termInfo"
                                        val="10688"><span class="screen_behind">보기</span></button>
                                <span class="price num">200,000</span></div>
                        </label></li>
                        <li code="C10">
                            <div class="group"><span class="name" title="현대카드 세이브-오토">현대카드 세이브-오토</span>
                                <button type="button" class="buttonHelp eFincPopup" subject="판매조건" kind="termInfo"
                                        val="10683"><span class="screen_behind">보기</span></button>
                            </div>
                        </li>
                        <li code="C100"><label for="term_1C100"><input type="checkbox"
                                                                       value="MzAwMDAwJTYwJVUEJTk4JTg0JVUCJThDJTgwJVUDJVI5JVI0JVUCJTkzJTlDJTIwJVUDJTg0JVI4JVUDJTlEJVI0JVUCJVI4JThDLSUFOyV5QCUBNCUFRCV4NjUBMCgzMCUFOjUBNyV4OyUFRCV4RjUBOyUFOyV5RCUCQCUFRCV4OSUCQCk="
                                                                       code="C100" id="term_1C100" name="option">
                            <div><span class="name" title="30만포인트">└ 30만포인트</span><span class="price num">300,000</span>
                            </div>
                        </label></li>
                        <li code="T150"><label for="term_1T15"><input type="checkbox"
                                                                      value="MiVwMDAwJTYwJVUCJVI4JTk0JVUCJVEzJVE4JVUCJVE5JVE0JVUCJVIyJTg0JVUDJThBJVE0JTIwJVUEJThGJVFDJVUDJTlEJVI4JVUEJThBJVI4JTIwJVUDJTg0JVEwJVUDJTgyJVFDJVUDJTlBJVE5"
                                                                      code="T150" id="term_1T15" name="option">
                            <div><span class="name" title="블루멤버스 포인트 선사용">블루멤버스 포인트 선사용</span>
                                <button type="button" class="buttonHelp eFincPopup" subject="판매조건" kind="termInfo"
                                        val="10686"><span class="screen_behind">보기</span></button>
                                <span class="price num">250,000</span></div>
                        </label></li>
                        <li code="T140"><label for="term_1T14"><input type="checkbox"
                                                                      value="MiAwMDAwJTYwJVUDJVE0JTgwJVUDJVE0JTkxJVUEJTk4JTk1JVUDJTlEJVI0JVUEJTk1JTk4JTIwJVUCJVIzJVI0JVUDJTlDJVEwJVUDJTlBJVIwJVUCJThDJTgwJVUEJTgzJTgwJVUBJVIyJTlG"
                                                                      code="T140" id="term_1T14" name="option">
                            <div><span class="name" title="준중형이하 보유우대타겟">준중형이하 보유우대타겟</span>
                                <button type="button" class="buttonHelp eFincPopup" subject="판매조건" kind="termInfo"
                                        val="10694"><span class="screen_behind">보기</span></button>
                                <span class="price num">200,000</span></div>
                        </label></li>
                        <li code="T120"><label for="term_1T12"><input type="checkbox"
                                                                      value="MzAwMDAwJTYwMTAlRVIlQDVlQDOlRVMlQVOlOiOlRVMlQDMlQDElMiAlRVIlQDVlOiglRVOlQVIlQDOlRVMlOiAlOTglRVMlOTElOiAlRVElOiElOiO="
                                                                      code="T120" id="term_1T12" name="option">
                            <div><span class="name" title="10년이상 노후차조건">10년이상 노후차조건</span>
                                <button type="button" class="buttonHelp eFincPopup" subject="판매조건" kind="termInfo"
                                        val="10693"><span class="screen_behind">보기</span></button>
                                <span class="price num">300,000</span></div>
                        </label></li>
                        <li code="T170"><label for="term_1T17"><input type="checkbox"
                                                                      value="MyV2MCUFRCV5QCV4NCUFOjV4OyV4MCUFOyUCMCUBQCVyMCUFOSUCMCV4MCUFOyUBMSUCMSUFOyV4MjUBOyUFOjV5RSV5MO=="
                                                                      code="T170" id="term_1T17" name="option">
                            <div><span class="name" title="현대차 가족사랑(3%)">현대차 가족사랑(3%)</span>
                                <button type="button" class="buttonHelp eFincPopup" subject="판매조건" kind="termInfo"
                                        val="10695"><span class="screen_behind">보기</span></button>
                                <span class="price num"> <span class="eRsltTermPers" code="T170">431,100</span></span>
                            </div>
                        </label></li>
                        <li code="T20">
                            <div class="group"><span class="name" title="H 패밀리">H 패밀리</span>
                                <button type="button" class="buttonHelp eFincPopup" subject="판매조건" kind="termInfo"
                                        val="10690"><span class="screen_behind">보기</span></button>
                            </div>
                        </li>
                        <li code="T200"><label for="term_1T200"><input type="checkbox"
                                                                       value="MiAwMDAwJTYwSCVyMCUFRCV4OyUBQCUFOjUCMCV4MCUFOjUBNjUBOygyJVUCJThDJTgwJTIwJVUBJVI1JVFDJVUCJVE3JVE0JTIwJVUDJThCJTlDJTIwMyVyNSk="
                                                                       code="T200" id="term_1T200" name="option">
                            <div><span class="name" title="2대 구매 시">└ 2대 구매 시</span><span
                                    class="price num">200,000</span></div>
                        </label></li>
                        <li code="T201"><label for="term_1T201"><input type="checkbox"
                                                                       value="MzAwMDAwJTYwSCVyMCUFRCV4OyUBQCUFOjUCMCV4MCUFOjUBNjUBOygzJVUCJThDJTgwJTIwJVUBJVI1JVFDJVUCJVE3JVE0JTIwJVUDJThCJTlDKO=="
                                                                       code="T201" id="term_1T201" name="option">
                            <div><span class="name" title="3대 구매 시">└ 3대 구매 시</span><span
                                    class="price num">300,000</span></div>
                        </label></li>
                        <li code="T202"><label for="term_1T202"><input type="checkbox"
                                                                       value="NTAwMDAwJTYwSCVyMCUFRCV4OyUBQCUFOjUCMCV4MCUFOjUBNjUBOyg0JVUCJThDJTgwJTIwJVUDJTlEJVI0JVUDJTgzJTgxJTIwJVUBJVI1JVFDJVUCJVE3JVE0JTIwJVUDJThCJTlDKO=="
                                                                       code="T202" id="term_1T202" name="option">
                            <div><span class="name" title="4대 이상 구매 시">└ 4대 이상 구매 시</span><span class="price num">500,000</span>
                            </div>
                        </label></li>
                        <li code="T130"><label for="term_1T13"><input type="checkbox"
                                                                      value="MTAwMDAwJTYwMiAwJVUCJVE3JThDJTIwJVUBJVI1JVJGJTIwJVUEJTk0JTg0JVUCJTlFJTlDJVUCJTkzJTlDJTIwJVUBJVIzJVEwJVUBJVIwJTlE"
                                                                      code="T130" id="term_1T13" name="option">
                            <div><span class="name" title="200만 굿 프랜드 고객">200만 굿 프랜드 고객</span>
                                <button type="button" class="buttonHelp eFincPopup" subject="판매조건" kind="termInfo"
                                        val="10687"><span class="screen_behind">보기</span></button>
                                <span class="price num">100,000</span></div>
                        </label></li>
                    </ul>
                </div>
                <button type="button" class="btn_moreview" style="display: block;"><span></span></button>
            </div>

            <div id="Finc_1">
                <select class="eSelFincGood off">
                    <option value="436">신한카드 신한카드 마이오토 할부</option>
                    <option value="449">삼성카드 삼성카드 카드할부(중도상환수수료X)</option>
                    <option value="104">삼성카드 삼성카드 다이렉트 오토할부</option>
                    <option value="447">KB캐피탈 KB 매직카대출</option>
                    <option value="445">롯데카드 롯데카드 오토 할부</option>
                </select>
                <select class="eSelFincRemn off"></select>
                <select class="eSelFincCash off">
                    <option value="0"> 0 만원</option>
                    <option value="500000"> 50 만원</option>
                    <option value="1000000"> 100 만원</option>
                    <option value="1500000"> 150 만원</option>
                    <option value="2000000"> 200 만원</option>
                    <option value="2500000"> 250 만원</option>
                    <option value="3000000"> 300 만원</option>
                    <option value="3500000"> 350 만원</option>
                    <option value="4000000"> 400 만원</option>
                    <option value="4370000">437 만원</option>
                    <option value="4500000"> 450 만원</option>
                    <option value="5000000"> 500 만원</option>
                    <option value="5500000"> 550 만원</option>
                    <option value="6000000"> 600 만원</option>
                    <option value="6500000"> 650 만원</option>
                    <option value="7000000"> 700 만원</option>
                    <option value="7500000"> 750 만원</option>
                    <option value="8000000"> 800 만원</option>
                    <option value="8500000"> 850 만원</option>
                    <option value="9000000"> 900 만원</option>
                    <option value="9500000"> 950 만원</option>
                    <option value="10000000"> 1,000 만원</option>
                    <option value="10500000"> 1,050 만원</option>
                    <option value="11000000"> 1,100 만원</option>
                    <option value="11500000"> 1,150 만원</option>
                    <option value="12000000"> 1,200 만원</option>
                    <option value="12500000"> 1,250 만원</option>
                    <option value="13000000"> 1,300 만원</option>
                    <option value="13500000"> 1,350 만원</option>
                    <option value="14000000"> 1,400 만원</option>
                </select>
                <span class="eRsltFincName off" fincno="449" finccomp="36:10000000">삼성카드  삼성카드 카드할부(중도상환수수료X)</span>
                <div class="info_area" id="info_finance">
                    <h4 class="title">구매 요약</h4>
                    <ul class="paytype" id="paytype">
                        <li class="on">
                            <button type="button" val="finance">할부 결제</button>
                        </li>
                        <li>
                            <button type="button" val="cash">일시불 결제</button>
                        </li>
                    </ul>

                </div>

                <div class="info_area" id="info_detail">
                    <h4 class="title">선택 금융 상품을 통한 차량구매 예상 총 소요비용<span>(보험료 별도)</span></h4>
                    <div class="result">
                        <div id="resultPriceInfo"><span class="txt">보유자금 </span><span
                                class="num eRsltCashSum">4,370,000</span><span class="num"> + </span><span class="txt">취득세/공채 </span><span
                                class="num eRsltRegiSum">977,840</span><br><span class="num"> + </span><span
                                class="txt">부대비용 </span><span class="num">40,000</span><span class="num"> + </span><span
                                class="txt">할부 소요비용 </span><span class="num eRsltFincGrandSum">10,409,656</span><span
                                class="num"></span></div>
                        <div>
                            <span class="num total"> = </span><span class="num total eRsltTotalSum">15,797,496</span>
                        </div>
                    </div>
                    <span class="notice">* 위의 내용은 실제 금융상품금액과 다를 수 있습니다.</span>
                </div>
                <!--
                <div class='info_area' id='info_banner'>
                <a href=''><img src='http://autoimg.danawa.com/html/images/banner/self_bottom_170213.jpg' alt='' /></a>
                </div>
                -->
            </div>

        </div>
    </div>
</template>
<style>
    #eDiv_1 {
        padding-top: 50px;
    }

    #self_summary {
        padding-top: 50px;
    }
</style>