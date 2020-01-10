<template>
<div id = "wrap">
<link rel="shortcut icon" href="https://www.kcar.com/resources/images/common/favicon.ico" type="image/x-icon">
<link rel="icon" href="https://www.kcar.com/resources/images/common/favicon.ico" type="image/x-icon">
<link rel="apple-touch-icon-precomposed" href="https://www.kcar.com/resources/images/mobile/common/apple-touch-icon.png">
<link rel="stylesheet" href="https://www.kcar.com/resources/css/re_import.css?v=20191223103556">
<link rel="stylesheet" href="https://www.kcar.com/resources/css/plugin/selectric.css?v=20191223103556">
<link rel="stylesheet" type="text/css" href="https://www.kcar.com/resources/css/plugin/ion.rangeSlider.css">
<link rel="stylesheet" type="text/css" href="https://www.kcar.com/resources/css/plugin/ion.rangeSlider.skinHTML5.css">


<link rel="stylesheet" href="https://www.kcar.com/resources/css/plugin/uniform.css">
<link rel="stylesheet" href="https://www.kcar.com/resources/css/plugin/jquery.scrollbar.css">
<div id="headerNew" class="header_new">
</div>
<div id="content" class="sub_content"> 
<!-- 여기부터 -->
<!-- content -->
<form name="frm" id="frm" action="" method="post" accept-charset="UTF-8">
	<input type="hidden" name="i_sReqSeqNo" value="">
	<input type="hidden" name="i_sCarCd" value="EC60319243">
	<input type="hidden" name="i_sPymtMthdCd" value="">
	<input type="hidden" name="i_sCreditcomp" value="">
	<input type="hidden" name="i_sCar_info" value="">

	<div id="content">
		<div class="cont100per">
			<div class="top920pix">
				<p><span class="stit">3일 책임환불, 전국 어디든 당일배송</span><br><span class="btit">내차사기 홈서비스 신청</span></p>
			</div>
		</div>
		<div class="cont100per1">
			<div class="tab920pix">
				<ul>
					<li><a href="javascript:void(0);" onclick="fnGoStep(1)">STEP1. 차량정보 확인</a></li>
					<li><a href="javascript:void(0);" onclick="fnGoStep(2)" class="on">STEP2. 보증상품 선택</a></li>
					<li><a href="javascript:void(0);" onclick="fnGoStep(3)">STEP3. 계약자정보 입력</a></li>
					<li><a href="javascript:void(0);" onclick="fnGoStep(4)">STEP4. 예상결제금액 확인</a></li>
				</ul>
			</div>
		</div>
		<div class="cont100per2">
			<div class="cont920pix">
				<div class="mtit">
					<p>최대 1년! 수리비 걱정 없는<br>KW보증에 가입해 보세요.<br><span>중고차, A/S까지 안심하고 구입하세요.</span></p>
					<span class="smbtn"><a href="javascript:fnGoEwGuide();">보증범위 자세히보기 &gt;</a></span>
				</div>
				<div class="con_box2">
					<ul>
						<li class="fir il EW112" id="WarrantyCd1">
							<p class="radio_style">
								<input type="radio" id="i_sWarrantyCd1" name="i_sWarrantyCd" value="EW112">
								<label for="i_sWarrantyCd1">
								<span class="btit">KW12</span>
								<span class="ctit">12개월/ 20,000km 보증<br>(총 1,000만원 한도)</span><span class="ptit">765,000원</span>
								</label>
							</p>
						</li>
						
						<li class="yee EW106 on" id="WarrantyCd2">
							<p class="radio_style">
								<input type="radio" id="i_sWarrantyCd2" name="i_sWarrantyCd" value="EW106" checked="checked">
								<label for="i_sWarrantyCd2">
									<span class="btit">KW6</span>
									<span class="ctit">6개월/ 10,000km 보증<br>(총 500만원 한도)</span>
									<span class="ptit">465,000원</span><span class="bottit">많은 고객들이 선택한 상품!</span>
								</label>
							</p>
						</li>
						<li class="end sam KW003" id="WarrantyCd3">
							<p class="radio_style">
								<input type="radio" id="i_sWarrantyCd3" name="i_sWarrantyCd" value="KW003">
								<label for="i_sWarrantyCd3">
									<span class="btit">KW3</span>
									<span class="ctit">3개월/ 5,000km 보증<br>(총 300만원 한도)</span>
									<span class="ptit">365,000원</span>
								</label>
							</p>
						</li>
						<li class="sa all0 00000 unselected_area" id="WarrantyCd4">
							<p class="radio_style">
								<input type="radio" id="i_sWarrantyCd4" name="i_sWarrantyCd" value="00000">
								<label for="i_sWarrantyCd4" class="unselected">
									<span class="migat">보증 미가입</span>
									<span class="miga">구매차량의 이전대행 서비스만 가능하며, K Car가 제공하는 어떠한 보증서비스도 제공되지 않습니다. (성능보증 제외)</span>
									<span class="migap"></span>
								</label>
							</p>
						</li>
					</ul>
					<p class="bottxt">
						※ 자동차관리법 시행규칙 제122조 제2항, 제3항에 따라, 등록신청대행수수료와 관리비용이 별도 부과되며 상세 견적은 Step4 단계에서 확인하실 수 있습니다.<br>
						※ 차량 구매방법이 '리스'상품일 경우, 보증상품은 무상지원됩니다. (최대 100만원 한도 내)
					</p>
				</div>
				<div class="btn_ar">
					<a href="javascript:void(0);" onclick="fnGoPrev();" class="btn_gry">이전단계</a> 
					<a href="javascript:void(0);" onclick="fnGoNext();" class="btn_orng">다음단계</a>
				</div>
			</div>
		</div>
		<div class="cont100per2">
			<div class="nation1">
				<span><img src="/resources/images/homeencar/icon/flag_w.png" width="91" height="28" alt="usa, japan, china flag">&nbsp;&nbsp;For foreigner 02-6011-1804</span>
				<span class="banner"><a href="/homeservice/service_main.do" target="_blank"><img src="/resources/images/homeencar/contents/homeencarservice_banner_ws.jpg" width="457" height="68" alt="eventbanner"></a></span>
			</div>
		</div>
	</div>
</form>
<!-- //content -->
			
</div>
</div>
</template>

<style>
#content {width:100%; margin-bottom:30px;font-family:'ngw','ngw2', 'NanumGothic','나눔고딕', sans-serif, Apple SD Gothic Neo;background-color:#fff;}
</style>
