<template>
<div class="wrap">
<div id="Rnewcontents">
	<div class="layer_edit" id="layer_edit">
		<div class="editnew">
			<div class="login_user">
				<h3><img src="https://www.kcar.com/resources/images/common/pass_input.gif" alt="비밀번호입력"></h3>
				<div class="id_pass_bx">
					<div class="id_pass">
						<strong><label for="input_id"><img src="https://www.kcar.com/resources/images/common/login_id.gif" alt="아이디"></label></strong>
						<p>yejee1228</p>
					</div>
					<div class="id_pass">
						<strong><label for="input_pass"><img src="https://www.kcar.com/resources/images/common/login_pass.gif" alt="패스워드"></label></strong>
						<p><input type="password" name="loginPass" id="loginPass" class="input_pass" value="" maxlength="20" onkeydown="fnEnterLogIn();"></p>
					</div>
				</div>
				<div class="login_bt">
					<a href="javascript:fnLogIn2();" class="btn_form_r"><b><router-link to="/mypageModify">확인</router-link></b></a>
				</div>
			</div>
		</div>
	</div>
</div>
</div>
</template>
<script></script>
<style scoped>

</style>