<template>
<div id="wrap">
<link rel="shortcut icon" href="https://www.kcar.com/resources/images/common/favicon.ico" type="image/x-icon">
<link rel="icon" href="https://www.kcar.com/resources/images/common/favicon.ico" type="image/x-icon">
<link rel="apple-touch-icon-precomposed" href="https://www.kcar.com/resources/images/mobile/common/apple-touch-icon.png">
<link rel="stylesheet" type="text/css"  href="css/re_import.css">
<link rel="stylesheet" type="text/css"  href="css/plugin/selectric.css">
<link rel="stylesheet" type="text/css" href="css/plugin/ion.rangeSlider.css">
<link rel="stylesheet" type="text/css"  href="css/plugin/ion.rangeSlider.skinHTML5.css">
<link rel="stylesheet" type="text/css"  href="css/plugin/uniform.css">
<link rel="stylesheet" type="text/css"  href="css/plugin/jquery.scrollbar.css">
	
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
		<div class="tit_area">
			<h3>최근 본 차량</h3>
			<p>최근 일주일 동안 고객님이 보신 차량입니다. 최근 본 차량을 계속 보관하려면 로그인 후 관심차량에 담아 주세요.</p>
		</div>
		<div class="align_field">
			<div class="all_check">
				<div class="checker" id="uniform-allCheck"><span><input type="checkbox" name="allCheck" id="allCheck" class="uniform" title="전체체크"></span></div>
			</div>
			<div class="align">
				<span><a href="javascript:orderbyVrFlag();" class="3dview_flag txt " name="wr_eq_v_3dview_flag"><em class="vr_ordermark"></em> </a></span>
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
				<tr v-for="seenHistory of seenHistoryList" :key="seenHistory.carcd">
					<td class="check">
						<div class="checker" ><span><input type="checkbox" class="uniform" name="i_arrCarCd" value=""></span></div>
					</td>
					<td class="thumb">
						<a :href="seenHistory.carUrl" target="_blank">
							<div class="mark_area"></div>
							<img :src="seenHistory.middleImg" alt="자동차 썸네일">
						</a>
					</td>
					<td class="car_info">
						<router-link to="/product">
							<a href="" target="_blank" class="name" @click="addHistory(seenHistory)"></a>
							{{seenHistory.truckName}}
						</router-link>
						<span class="md_year">{{seenHistory.mfrDate}}({{seenHistory.beginYear}}년형)  &nbsp;&nbsp; {{seenHistory.mileage}}km &nbsp;&nbsp;{{seenHistory.fuelTypecdName}}</span>
						<span class="price">{{seenHistory.price}}만원 <em></em></span>
						<a href=""><span class="monthly"></span></a>
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
								<span></span><span>SUV</span>
							</li>
							<li>
								<span>{{ seenHistory.count }}</span><span></span>
							</li>
							<li>
								<span>5인승</span><span>&nbsp;</span>
							</li>
						</ul>
						<!--<span class="online_buy">{{seenHistory.simpleComment}}</span>-->
						<span class="online_buy">{{seenHistory.seenTime}}</span>
					</td>
					<td class="btn_area">
						<a id="toastid0"  href="#" class="oline_btn">온라인 구매</a>
					</td>
				</tr>
				</tbody>
			</table>
		</div>

		
		
	</div>
</div>
</form>
		</div>
	</div>
</template>
<script>
	import { mapState } from 'vuex'
	export default {
		name: 'seenCar',
		data() {
			return {}
		},
		computed: mapState({
			seenHistoryList : state => state.cmm.seenHistoryList
		})
	}
</script>