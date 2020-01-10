<template>
<div class="wrap">
<div id="Rnewcontents">
	<h3 class="h3_tit" style="color:#ff0040">회원정보수정</h3>
	<div class="mypage_content" id="mypage_content">
		<div class="user_info">
			<table width="100%" class="t_user01">
				<colgroup>
					<col width="20%">
					<col width="*">
					<col width="12%">
					<col width="30%">
				</colgroup>
				<tbody><tr>
					<th>이름</th>
					<td colspan="3"><b>홍길동</b></td>
				</tr>
				<tr>
					<th><label for="i_sPassWord">변경할 비밀번호입력</label> <span class="org">*</span></th>
					<td colspan="3"><input type="password" name="i_sPassWord" id="i_sPassWord" maxlength="20" class="user_input02 am" tabindex="1" value=""> &nbsp;&nbsp;&nbsp;<span>* 영문 대/소문자, 숫자, 특수문자(`~!@#$%^*+=-_만 허용)를 조합하여 8~20자로 입력해 주세요.</span></td>
					<!-- script type="text/javascript"> addLoadEvent(funLoad);</script-->
				</tr>
				<tr>
					<th><label for="i_sPassWord2">변경할 비밀번호 확인</label><span class="org">*</span></th>
					<td colspan="3"><input type="password" name="i_sPassWord2" id="i_sPassWord2" maxlength="20" class="user_input02" tabindex="2" value=""></td>
				</tr>
				<tr>
					<th>연락처<span class="org">*</span></th>
					<td colspan="3">
						<div class="select open mr"> 
							<select name="i_sMobile1" id="i_sMobile1" style="width:50px">
								
									<option value="010" selected="">010</option> 
								
									<option value="011">011</option> 
								
									<option value="016">016</option> 
								
									<option value="017">017</option> 
								
									<option value="018">018</option> 
								
									<option value="019">019</option> 
								
							</select> 
						</div>
						<input type="text" name="i_sMobile2" id="i_sMobile2" maxlength="4" title="휴대폰 중간자리" class="user_input03" tabindex="3" value="3013"> - <input type="text" name="i_sMobile3" id="i_sMobile3" maxlength="4" title="휴대폰 끝자리" class="user_input03" tabindex="4" value="4643"> <!-- a href="javascript:fnSend();" class="btn_user"><b>인증번호 발송</b></a--> 
						<div class="mt5">
						</div>
					</td>
				</tr>
				<tr>
					<th>이메일 <span class="org">*</span></th>
					<td colspan="3">
						<input type="text" name="i_sEmail1" id="i_sEmail1" title="이메일 아이디" class="user_input02 am" tabindex="5" value="yejee1228"> @ <input type="text" name="i_sEmail2" id="i_sEmail2" title="이메일 도메인" class="user_input03 am" value="naver.com"> 
						<div class="select open mr">
							<select name="domain" id="domain" onchange="userEvent.fnChange();">
								
									<option value="직접입력">직접입력</option> 
								
									<option value="daum.net">daum.net</option> 
								
									<option value="naver.com" selected="">naver.com</option> 
								
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
						<p class="mt5">
							<label>이메일 수신에 동의하시겠습니까?&nbsp;&nbsp;&nbsp;<label><input type="radio" class="radio" name="i_sEmailCheck" value="Y">&nbsp;예</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label><input type="radio" class="radio" name="i_sEmailCheck" value="N" checked="checked">&nbsp;아니요</label><br>
							수신에 동의하시면 이벤트, 중고차할인, 자동차 시승기등 흥미있는 소식들을 이메일로 전해드립니다.</label>
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
					<input type="radio" name="genderCheck" value="1" id="man"> &nbsp;<label for="man">남성</label>   
					<span class="pr30"></span>
					<input type="radio" name="genderCheck" value="2" id="woman"> &nbsp;<label for="woman">여성 </label>  
				</td>
			</tr>
			<tr>
				<th>생년월</th>
				<td colspan="3">
					<input type="text" id="year" maxlength="4" class="user_input02 " value="" onkeyup="userEvent.fnBirth();"> &nbsp;<span>년 </span><span class="pr15"></span>
					<input type="text" id="month" maxlength="2" class="user_input02 am" value="" onkeyup="userEvent.fnBirth();"> &nbsp;<span>월  </span></td>

			</tr>
			<tr>
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
			
		</tbody></table>
		<div class="btn_formbts">
				<a href="javascript:fnValidateForm();" class="btn_form_r"><b><router-link to="/mypage">수정</router-link></b></a>
				<a href="/user/mychangeInfo.do" class="btn_form_g"><b>취소</b></a>
				<a href="https://www.kcar.com/user/mygetLeave.do" class="btn_form_g btn_Leave"><b>회원탈퇴</b></a>
			</div>
		
	</div>
	</div>

	</div>
</div>
</template>
<script></script>
<style scoped>

</style>