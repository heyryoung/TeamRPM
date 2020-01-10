<template>
<div id="contents">
				<div class="user_content">
					<h3 class="policy_tit">기본정보 입력</h3>
					<!-- 20190705회원가입정보입력추가  -->
					<div class="user_info">
						<h4></h4>
						<table width="100%" class="t_user01">
							<colgroup>
								<col width="18%">
								<col width="*">
								<col width="13%">
								<col width="30%">
							</colgroup>
							<tbody><tr>
								<th><span class="org">*</span> <label for="i_sMemberId">아이디</label></th>
								<td colspan="3"><input type="text" name="i_sMemberId" id="i_sMemberId" class="user_input02" value=""> <a href="javascript:;" onclick="userEvent.fnIdCheck();" class="btn_user" id=""><b>중복확인</b></a> <b class="user_num_check mt5" id="id_result"></b>
								<p class="mt5">* 4~12이내  영문, 숫자 혼합</p>
								</td>
							</tr>
							<tr>
								<th><span class="org">*</span> <label for="i_sPassWord">비밀번호입력</label></th>
								<td colspan="3"><input type="password" name="i_sPassWord" id="i_sPassWord" maxlength="20" class="user_input02 am" value=""> &nbsp;&nbsp;&nbsp;<span>* 영문 대/소문자, 숫자, 특수문자(`~!@#$%^*+=-_만 허용)를 조합하여 8~20자로 입력해 주세요.</span></td>
								<!-- script type="text/javascript"> addLoadEvent(funLoad);</script-->
							</tr>
							<tr>
								<th><span class="org">*</span> <label for="i_sPassWord2">비밀번호 확인</label></th>
								<td colspan="3"><input type="password" name="i_sPassWord2" id="i_sPassWord2" maxlength="20" class="user_input02" value=""></td>
							</tr>
							
							<tr>
								<th><span class="org">*</span> 이메일 </th>
								<td colspan="3">
									<input type="text" name="i_sEmail1" id="i_sEmail1" title="이메일 아이디" class="user_input05 am" value=""> @ <input type="text" name="i_sEmail2" id="i_sEmail2" title="이메일 도메인" class="user_input05 am" value=""> 
									<div class="select open mr"> 
										<select name="domain" id="domain" onchange="userEvent.fnChange();">
											
												<option value="직접입력">직접입력</option> 
											
												<option value="daum.net">daum.net</option> 
											
												<option value="naver.com">naver.com</option> 
											
												<option value="nate.com">nate.com</option> 
											
												<option value="chol.com">chol.com</option> 
											
												<option value="dreamwiz.com">dreamwiz.com</option> 
											
												<option value="empal.com">empal.com</option> 
											
												<option value="freechal.com">freechal.com</option> 
											
												<option value="gmail.com">gmail.com</option> 
											
												<option value="hanafos.com">hanafos.com</option> 
											
												<option value="hanmir.com">hanmir.com</option> 
											
												<option value="hitel.net">hitel.net</option> 
											
												<option value="hotmail.com">hotmail.com</option> 
											
												<option value="korea.com">korea.com</option> 
											
												<option value="lycos.co.kr">lycos.co.kr</option> 
											
												<option value="netian.com">netian.com</option> 
											
												<option value="paran.com">paran.com</option> 
											
												<option value="yahoo.co.kr">yahoo.co.kr</option> 
											
												<option value="chollian.net">chollian.net</option> 
											
												<option value="hanmail.net">hanmail.net</option> 
											
												<option value="kebi.com">kebi.com</option> 
											
										</select> 
									</div>
									<p class="mt5"><input type="checkbox" class="check am" name="tmpEmailCheck" id="tmpEmailCheck" value="Y"> 
										<label for="tmpEmailCheck">이메일 수신에 동의하시겠습니까? <br>&nbsp;&nbsp;&nbsp;&nbsp;수신에 동의하시면 이벤트, 중고차할인,자동차 시승기등 흥미있는  소식들을 이메일로 전해드립니다.</label>
									</p>
								</td>
							</tr>
						</tbody></table>
						
					</div>
					
					
					<div class="user_info">
						<h4>추가 정보 입력 (선택)</h4>
						<table width="100%" class="t_user01">
							<colgroup>
								<col width="18%">
								<col width="*">
								<col width="13%">
								<col width="30%">
							</colgroup>
							<tbody><tr>
								<th>성별 </th>
								<td colspan="3" style="">
									<input type="radio" name="genderCheck" id="man" value="1"> &nbsp;<label for="man">남성</label>   
									<span class="pr30"></span>
									<input type="radio" name="genderCheck" id="woman" value="2"> &nbsp;<label for="woman">여성 </label>  
								</td>
							</tr>
							<tr>
								<th>생년월</th>
								<td colspan="3">
									<input type="text" name="" id="year" maxlength="4" class="user_input02 " value="" placeholder="예시) 1997" onkeyup="userEvent.fnBirth();"> &nbsp;<span>년 </span><span class="pr15"></span>
									<input type="text" name="" id="month" maxlength="2" class="user_input02 am" value="" placeholder="예시) 12" onkeyup="userEvent.fnBirth();"> &nbsp;<span>월  </span>
								</td>
	
							</tr>
							<tr>
								<!-- ecc_subcode.cf_ct_area_cd 쓸거임 -->
								<th>지역 </th>
								<td colspan="3">
									<select style="width:130px" name="i_sUserRegion" id="i_sUserRegion">
										<option value="">지역을 선택하세요  </option>
										
											<option value="010">서울</option>
										
											<option value="020">인천</option>
										
											<option value="030">대전</option>
										
											<option value="040">대구</option>
										
											<option value="050">광주</option>
										
											<option value="060">부산</option>
										
											<option value="070">울산</option>
										
											<option value="080">세종</option>
										
											<option value="090">경기</option>
										
											<option value="100">강원</option>
										
											<option value="110">경남</option>
										
											<option value="120">경북</option>
										
											<option value="130">전남</option>
										
											<option value="140">전북</option>
										
											<option value="150">충남</option>
										
											<option value="160">충북</option>
										
											<option value="170">제주</option>
										
									</select>
								</td>
							</tr>
							<!-- <tr>
								<th>가입경로 </th>
								<td colspan="3">
									<input type="radio" name="regRootCheck" value="root1" id="root1"> &nbsp;<label for="root1">네이버검색 </label> <span class="pr15"></span>
									<input type="radio" name="regRootCheck" value="root2" id="root2"> &nbsp;<label for="root2">온라인 배너광고 </label> <span class="pr15"></span>
									<input type="radio" name="regRootCheck" value="root3" id="root3"> &nbsp;<label for="root3">앱스토어/플레이스토어 </label> <span class="pr15"></span>
									<input type="radio" name="regRootCheck" value="root4" id="root4"> &nbsp;<label for="root4">TV/라디오 광고 </label> <span class="pr15"></span>
									<p class="mt10 spot">
									<input type="radio" name="regRootCheck" value="root5" id="root5"> &nbsp;<label for="root5">디지털 영상광고(유튜브 등) </label> <span class="pr15"></span>
									<input type="radio" name="regRootCheck" value="root6" id="root6"> &nbsp;<label for="root6">블로그/카페/포스트 </label> <span class="pr15"></span>
									<input type="radio" name="regRootCheck" value="root7" id="root7"> &nbsp;<label for="root7">페이스북/인스타그램 </label> <span class="pr15"></span>
									</p><p class="mt10 spot">
									</p><p class="mt10 spot">
									<input type="radio" name="regRootCheck" value="root8" id="root8"> &nbsp;<label for="root8">지도검색/옥외광고/지점 홍보물 광고 </label> <span class="pr15"></span>
									<input type="radio" name="regRootCheck" value="root9" id="root9"> &nbsp;<label for="root9">지인 추천 </label> <span class="pr15"></span>
									<input type="radio" name="regRootCheck" value="root10" id="root10"> &nbsp;<label for="root10">기타 </label> <span class="pr15"></span>
									<input type="text" name="" id="rootEtc" style="display:none" maxlength="20" class="user_input02" value=""></p>
								</td>
							</tr> -->
						</tbody></table>
						
					</div>
					<!-- //20190705회원가입정보입력추가  -->
					<div class="btn_formbts">
						<a href="javascript:;" onclick="userEvent.fnValidateForm();" class="btn_form_r"><b>회원가입신청</b></a>
						<a href="/index.do" class="btn_form_g"><b>취소</b></a>
					</div>
				</div>
			</div>
</template>
<script></script>
<style scoped>
#contents {
    margin: auto;
    width: 100%;
    padding: 0 0 70px 20px;
    border-left: 1px solid #dfdddc;
    min-height: 600px;
}
form, ul, ol, dl, table, div, h1, h2, h3, h4, h5, h6 {
    margin: 0;
    padding: 0;
}
body {
    font-family: 'Noto Sans Korean','Dotum','돋음','굴림';
    font-size: 12px;
    color: #575757;
    line-height: 1.3;
}
.user_content {
    padding: 0 0 0 40px;
}
.policy_tit {
    padding: 30px 0 0 0;
}
h1, h2, h3, h4, h5, h6 {
    font-size: 12px;
    text-decoration: none;
    font-weight: normal;
}
.user_info {
    position: relative;
    padding: 0 0 15px 0;
}
.btn_formbts {
    padding: 10px;
    text-align: center;
}
.t_user01 {
    border-top: 2px solid #bca99d;
    text-align: left;
    color: #666;
}
table {
    margin: auto;
    border-collapse: collapse;
    border-spacing: 0;
    empty-cells: show;
}
.t_user01 th span.org {
    color: #ff0040 !important;
}

.org {
    color: #f05200!important;
}
.t_user01 td {
    vertical-align: middle;
    padding: 12px 0;
    border-bottom: 1px solid #e1e1e1;
}
.user_input02 {
    height: 17px;
    width: 120px;
    padding: 2px 5px 0 5px;
    border: 1px solid #bebebe;
    font-size: 14px;
    color: #999;
    vertical-align: middle;
}
.btn_user {
    display: inline-block;
    height: 21px;
    padding: 0px 0 0 0;
    margin-top: 0px;
    cursor: pointer;
}

a {
    color: #666;
    text-decoration: none;
}
.mt5 {
    margin-top: 5px;
}
body {
    font-family: 'Noto Sans Korean','Dotum','돋음','굴림';
    font-size: 12px;
    color: #575757;
    line-height: 1.3;
}
h4 {
    display: block;
    margin-block-start: 1.33em;
    margin-block-end: 1.33em;
    margin-inline-start: 0px;
    margin-inline-end: 0px;
    font-weight: bold;
}
h3 {
    display: block;
    font-size: 1.17em;
    margin-block-start: 1em;
    margin-block-end: 1em;
    margin-inline-start: 0px;
    margin-inline-end: 0px;
    font-weight: bold;
}
.btn_formbts {
    padding: 10px;
    text-align: center;
}
.btn_form_r {
    display: inline-block;
    height: 20px;
    margin-top: 0px;
    font-size: 13px;
    cursor: pointer;
}
a {
    color: #666;
    text-decoration: none;
}
.btn_form_g {
    display: inline-block;
    height: 20px;
    margin-top: 0px;
    font-size: 13px;
    cursor: pointer;
}
.btn_formbts {
    padding: 10px;
    text-align: center;
}
.btn_form_r b {
    height: 20px;
    padding: 4px 16px 1px 17px;
    background: #da2727;
    border: 1px solid #bebebe;
    color: #fff;
}
.btn_form_g b {
    height: 20px;
    padding: 4px 16px 1px 17px;
    border: 1px solid #bebebe;
}
.t_user01 select {
    background: url(/resources/images/content/user/select_down_arrow.png) no-repeat right center;
}
select {
    border: 1px solid #e8e8e8;
    height: 21px;
    color: #575757;
    font-family: Arial;
}

select, input, li, img {
    vertical-align: top;
}
.t_user01 select {
    appearance: none;
    -webkit-appearance: none;
    border-radius: 0px !important;
    padding: 0 5px;
    border: 1px #ccc solid !important;
}
.user_input02 {
    height: 17px;
    width: 120px;
    padding: 2px 5px 0 5px;
    border: 1px solid #bebebe;
    font-size: 14px;
    color: #999;
    vertical-align: middle;
}
.btn_user b {
    height: 17px;
    padding: 3px 10px 0 10px;
    border: 1px solid #bebebe;
    font-size: 11px;
}
.user_num_check {
    padding: 1px 0 0 26px;
    color: #ff0040;
}

</style>