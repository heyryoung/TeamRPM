<template>
<div id="wrap">
<link rel="shortcut icon" href="https://www.kcar.com/resources/images/common/favicon.ico" type="image/x-icon">
<link rel="icon" href="https://www.kcar.com/resources/images/common/favicon.ico" type="image/x-icon">
<link rel="apple-touch-icon-precomposed" href="https://www.kcar.com/resources/images/mobile/common/apple-touch-icon.png">
<link rel="stylesheet" href="https://www.kcar.com/resources/css/re_import.css?v=20191230094250">
<link rel="stylesheet" href="https://www.kcar.com/resources/css/plugin/selectric.css?v=20191230094250">
<link rel="stylesheet" type="text/css" href="https://www.kcar.com/resources/css/plugin/ion.rangeSlider.css">
<link rel="stylesheet" type="text/css" href="https://www.kcar.com/resources/css/plugin/ion.rangeSlider.skinHTML5.css">
<link rel="stylesheet" href="https://www.kcar.com/resources/css/plugin/uniform.css">
<link rel="stylesheet" href="https://www.kcar.com/resources/css/plugin/jquery.scrollbar.css">
	
		<div id="content" class="content_1180"> 
		
			






<!-- [s] view 화면으로 이동용 -->
<form name="movefrm" method="post" action="">
<input type="hidden" name="i_sViewType" value="CAR_VTYPE010">
<input type="hidden" name="i_sCarCd" value="">
<input type="hidden" name="i_sReturnUrl" value="">
<input type="hidden" name="i_sReturnPars" value="">
</form>
<!-- [e] view 화면으로 이동용 -->
<form name="frm" method="post" action="" autocomplete="off">
<input type="hidden" name="i_sCarCd" value="">
<input type="hidden" name="i_iNowPageNo" value="1">
<input type="hidden" name="i_sReturnUrl" value="">
<input type="hidden" name="i_iAlsunNowPageNo" value="">
<input type="hidden" name="i_sReturnPars" value="">
<input type="hidden" name="i_sMakeType" value="">
<input type="hidden" name="i_sSearchType" value="">
<input type="hidden" name="i_sListType" value="">
<input type="hidden" name="i_sViewType" value="">
<input type="hidden" name="i_sSearchType2" value="">
<input type="hidden" name="i_sDetailPagUrl" value="">
<input type="hidden" name="i_sArrCategoryCd" value="">
<input type="hidden" name="i_sAlsunSearchCd" value="">
<input type="hidden" name="i_sOrderBy" value="C.V_ECC_UPDATE_DTM DESC">
<input type="hidden" name="i_s3dViewFlag" id="i_s3dViewFlag" value="">

<div class="sub_content">
	<div class="mypage_CarList lastView">
		<!-- 180904 신규 배너 추가 -->
		<div class="tit_area">
			<h3>최근 본 차량</h3>
			<p>최근 일주일 동안 고객님이 보신 차량입니다. 최근 본 차량을 계속 보관하려면 로그인 후 관심차량에 담아 주세요.</p>
		</div>

		<div class="align_field">
			<div class="all_check">
				<div class="checker" id="uniform-allCheck"><span><input type="checkbox" name="allCheck" id="allCheck" class="uniform" title="전체체크"></span></div>
			</div>
			<div class="align">
<!-- 3D -->
				<span><a href="javascript:orderbyVrFlag();" class="3dview_flag txt " name="wr_eq_v_3dview_flag"><em class="vr_ordermark"></em> 3D 라이브 뷰 차량</a></span>
<!-- 3D -->
				<span class="basic"><a href="javascript:orderbyChange('');" class="txt">기본정렬</a></span>
				<span><a href="javascript:orderbyChange('C.N_PRICE ASC');" class="txt">가격순</a><a href="javascript:orderbyChange('C.N_PRICE ASC');" class="down ">낮은순</a><a href="javascript:orderbyChange('C.N_PRICE DESC');" class="up ">높은순</a></span>
				<span><a href="javascript:orderbyChange('C.N_MILEAGE ASC');" class="txt">주행거리 순</a><a href="javascript:orderbyChange('C.N_MILEAGE ASC');" class="down ">낮은순</a><a href="javascript:orderbyChange('C.N_MILEAGE DESC');" class="up ">높은순</a></span>
				<span><a href="javascript:orderbyChange('C.V_MFR_DATE ASC');" class="txt">연식 순</a><a href="javascript:orderbyChange('C.V_MFR_DATE ASC');" class="down ">낮은순</a><a href="javascript:orderbyChange('C.V_MFR_DATE DESC');" class="up ">높은순</a></span>
			</div>
		</div>

		<div class="result_list">
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
					
						<tr>
							<td class="check">
								<div class="checker" id="uniform-today_list_check1"><span><input type="checkbox" id="today_list_check1" class="uniform" name="i_arrCarCd" value="EC60316025"></span></div>
							</td>
							<td class="thumb">
								<a href="/car/info/car_info_detail.do?i_sCarCd=EC60316025">								
									
<!-- 20181217 VR차량 -->
									
<!-- //20181217 VR차량 -->
									<img src="https://img.kcar.com/carpicture/carpicture01/pic6031/kcar_60316025_001.jpg" alt="자동차 썸네일">
								</a>
							</td>
							<td class="car_info">
								<a href="/car/info/car_info_detail.do?i_sCarCd=EC60316025" class="name">기아 스포티지 4세대<br> 디젤 2.0 2WD 노블레스 플러스</a>
								<span class="md_year">18년 06월식 &nbsp; 14,828km</span>								
								
									
										<span class="price">2,200만원 </span>
									
									
									
								
								<span class="mark" data-mark="09;19;26" data-lease="2"><span class="tip_list tip_09"><button type="button" class="tip_btn" onclick="openHotMarkToolTip(this);">특옵션</button> <span class="tip_hot none"><b>특옵션<a href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>추가 선택 옵션 장착 혹은 최상위 등급 차량</i></span></span><span class="tip_list tip_19"><button type="button" class="tip_btn" onclick="openHotMarkToolTip(this);">짧은Km</button> <span class="tip_hot none"><b>짧은Km<a href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>연 10,000km 이내 주행 차량</i></span></span><span class="tip_list tip_26"><button type="button" class="tip_btn" onclick="openHotMarkToolTip(this);">제조사AS</button> <span class="tip_hot none"><b>제조사AS<a href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>제조사 A/S 잔존 차량</i></span></span></span>
							</td>
							<td class="car_opt">
								<ul class="opt_list">
									<li>
										<span class="pt">
											
												
												
												
												무사고
											
										</span>
										<span>디젤</span>
									</li>
									<li>
										<span>흰색</span>
										<span>SUV</span>
									</li>
									<li>
										<span>경남</span>
										<span>5인승</span>
									</li>
								</ul>
								
								<span class="online_buy">♥보험이력無♥정말깨끗한 실내 . 외관 상태♥준신차급♥무사고</span>
							</td>
							
							<td class="btn_area">
								<a href="javascript:fnOnlineBuy('EC60316025','0');" class="online" id="onlineBuy0">온라인 구매 </a>
							</td>
						</tr>
					
						<tr>
							<td class="check">
								<div class="checker" id="uniform-today_list_check2"><span><input type="checkbox" id="today_list_check2" class="uniform" name="i_arrCarCd" value="EC60305865"></span></div>
							</td>
							<td class="thumb">
								<a href="/car/info/car_info_detail.do?i_sCarCd=EC60305865">								
									
<!-- 20181217 VR차량 -->
									
<!-- //20181217 VR차량 -->
									<img src="https://img.kcar.com/carpicture/carpicture10/pic6030/kcar_60305865_001.jpg" alt="자동차 썸네일">
								</a>
							</td>
							<td class="car_info">
								<a href="/car/info/car_info_detail.do?i_sCarCd=EC60305865" class="name">기아 모하비<br> 4WD QV300 고급형</a>
								<span class="md_year">09년 06월식 &nbsp; 94,530km</span>								
								
									
									
									
										<span class="price weekly">1,500만원</span>
										<span class="sale">위클리특가 1,430만원</span>
									
								
								<span class="mark" data-mark="10;30;31" data-lease="3"><span class="tip_list tip_10"><button type="button" class="tip_btn" onclick="openHotMarkToolTip(this);">1인소유</button> <span class="tip_hot none"><b>1인소유<a href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>소유자 변경 이력이 없는 차량(대여 이력 및 법인 명의 차량 제외)</i></span></span><span class="tip_list tip_30"><button type="button" class="tip_btn" onclick="openHotMarkToolTip(this);">보험이력無</button> <span class="tip_hot none"><b>보험이력無<a href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>정보 조회일자 기준 보험이력이 없는 차량</i></span></span><span class="tip_list tip_31"><button type="button" class="tip_btn" onclick="openHotMarkToolTip(this);">7인승</button> <span class="tip_hot none"><b>7인승<a href="javascript:closeHotMarkToolTip(this);" class="tip_cl">닫기</a></b><i>7인승 차량</i></span></span></span>
							</td>
							<td class="car_opt">
								<ul class="opt_list">
									<li>
										<span class="pt">
											
												
												
												
												단순교환
											
										</span>
										<span>디젤</span>
									</li>
									<li>
										<span>은색</span>
										<span>SUV</span>
									</li>
									<li>
										<span>경기/인천</span>
										<span>7인승</span>
									</li>
								</ul>
								
								<span class="online_buy"># 1인신조 # 4륜차량 # 네비 및 썬루프 # 타이어 상태 Good !!</span>
							</td>
							
							<td class="btn_area">
								<a href="javascript:fnOnlineBuy('EC60305865','1');" class="off_btn" id="onlineBuy1">온라인 구매 </a>
							</td>
						</tr>
					
				</tbody>
			</table>
		</div>

		
		
	</div>
</div>
<!-- // content -->

</form>


			
		</div>
		








	</div>
</template>