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
	<input type="hidden" id="i_sReturnUrl" name="i_sReturnUrl" value="">
	<input type="hidden" id="i_sReqSeqNo" name="i_sReqSeqNo" value="">
	<input type="hidden" id="i_sCarCd" name="i_sCarCd" value="EC60319243">
	
		<input type="hidden" id="i_sWarrantyCd" name="i_sWarrantyCd" value="EW106">
	
	
	
	
		<input type="hidden" id="i_sPymtMthdCd" name="i_sPymtMthdCd" value="">
	
	
	
		<input type="hidden" id="i_sCreditcomp" name="i_sCreditcomp" value="">
	
	<input type="hidden" id="i_sCar_info" name="i_sCar_info" value="">

	<div id="content">
		<div class="cont100per">
			<div class="top920pix">
				<p><span class="stit">3일 책임환불, 전국 어디든 당일배송</span><br><span class="btit">내차사기 홈서비스 신청</span></p>
			</div>
		</div>
		<div class="cont100per1">
			<div class="tab920pix">
				<ul>
					<li><a href="javascript:void(0);" onclick="fnGoStep(1);">STEP1. 차량정보 확인</a></li>
					<li><a href="javascript:void(0);" onclick="fnGoStep(2);">STEP2. 보증상품 선택</a></li>
					<li><a href="javascript:void(0);" onclick="fnGoStep(3);" class="on">STEP3. 계약자정보 입력</a></li>
					<li><a href="javascript:void(0);" onclick="fnGoStep(4);">STEP4. 예상결제금액 확인</a></li>
				</ul>
			</div>
		</div>
		<div class="cont100per2">
			<div class="cont920pix">
				<div class="mtit">
					<p>정확한 상담을 위해<br>명의자 정보를 알려 주세요.<br><span>개인/사업자 모두 가능합니다.</span></p>
				</div>
				
				<div class="login_box">
					<p>서비스를 더 이용하시려면 로그인 해주세요.</p>
					<div class="loginbtn">
						<a href="javascript:;" onclick="fnJoin();" class="btn_gaib">회원가입</a>
						<a href="javascript:;" onclick="fnLogin();" class="btn_ongline">로그인</a>
					</div>
				</div>
				
				<div class="con_box4 contents_area">
					<ul>
						<li class="fir il i_sPesonalFg100 on" id="PesonalFg100">
							<p class="radio_style">
								<input type="radio" name="i_sPesonalFg" id="i_sPesonalFg100" value="100" checked="checked">
								<label for="i_sPesonalFg100" class="btit">
									개인
									
									<span class="ptit">
										<label for="i_sFlagJoint1" class="">
										<input name="i_sFlagJoint" id="i_sFlagJoint1" type="checkbox" value="100"> 
										공동명의시 체크
										</label>
									</span>
									
								</label>
							</p>
						</li>
						<li class="yee i_sPesonalFg300" id="PesonalFg300">
							<p class="radio_style">
								<input type="radio" id="i_sPesonalFg300" name="i_sPesonalFg" value="300" checked="checked">
								<label for="i_sPesonalFg300" class="btit">
									개인사업자
									
									<span class="ptit">
										<label for="i_sFlagJoint2">
										<input name="i_sFlagJoint" id="i_sFlagJoint2" type="checkbox" value="300" disabled="disabled"> 
										공동명의시 체크</label>
									</span>
									
								</label>
							</p>
						</li>
						<li class="end sam i_sPesonalFg200" id="PesonalFg200">
							<p class="radio_style">
								<input type="radio" id="i_sPesonalFg200" name="i_sPesonalFg" value="200" checked="checked">
								<label for="i_sPesonalFg200" class="btit">
									법인사업자
								</label>
							</p>
						</li>
					</ul>
				</div>
				<div class="btn_ar">
					<a href="javascript:void(0);" class="btn_gry" onclick="fnGoPrev();">이전단계</a>
					<a href="javascript:void(0);" class="btn_orng" onclick="fnGoNext();">다음단계</a>
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

			
</div>
</div>
</template>

			

<style>
#content {width:100%; margin-bottom:30px;font-family:'ngw','ngw2', 'NanumGothic','나눔고딕', sans-serif, Apple SD Gothic Neo;background-color:#fff;}
</style>
