<template>
	<div>
		<link rel="stylesheet" href="https://www.kcar.com/resources/css/re_user.css?ver=6.9">
		<link rel="stylesheet" href="https://www.kcar.com/resources/css/re_default.css?ver=6.9">

		<div class="loginPage">
			<div class="loginBox">

				<p id="txt1" class="txtt none">회원아이디 또는 비밀번호가 일치하지 않습니다. (5회 이상 로그인 오류시 본인 확인 후 로그인 가능합니다.)</p>
				<p id="txt2" class="txtt none">비밀번호 오류가 5회 초과했습니다</p>
				<div class="login">
					<div class="loginForm">
						<h3><img src="https://www.kcar.com/resources/images/common/loginTit.gif" alt="로그인"></h3>
						<div class="idBox">
							<label for="input_id" class="loginLabel"><img src="https://www.kcar.com/resources/images/common/login_id.gif" alt="아이디" class="am"></label>
							<input v-model="userid" type="text" name="i_sMemberId" class="input_id am" id="input_id" value="">&nbsp;&nbsp;
						</div>
						<div class="paddBox">
							<label for="input_pass" class="loginLabel"><img src="https://www.kcar.com/resources/images/common/login_pass.gif" alt="패스워드" class="am"></label>
							<input v-model="passwd" type="password" name="i_sPassWord" class="input_pass am" id="input_pass" value="" maxlength="20" >&nbsp;&nbsp;
							<span class="idSave">
						<input type="checkbox" class="am" id="id_save" name="id_save" value="Y">

						<label for="id_save" class="id_save">아이디 저장</label>
					</span>
							<button  @click.prevent="checkAuth(userid, passwd)" href=""><img src="https://www.kcar.com/resources/images/common/loginBtn.gif" alt="로그인" class="am"></button>
						</div>
						<div class="findjoin">
							<a href="/user/idInf.do">아이디 찾기</a> <a href="/user/passInf.do">비밀번호 찾기</a>
						</div>
						<div><h6 v-show="this.redi===true">가입하지 않은 아이디이거나, 잘못된 비밀번호입니다.</h6></div>
						<div class="snsjoin">

							<a id="custom-login-btn" href="javascript:kakaoLogin()"><img src="https://www.kcar.com/resources/images/social/kakao_login.jpg" width="109" height="28" alt="카카오톡로그인"></a>

						</div>


						<p class="skjoin">아직 RPM 회원이 아니세요? <router-link to="/join">회원가입</router-link>></p>
					</div>
				</div>
			</div>
		</div>
	</div>
</template>
<script>

	export default {



		data() {
			return {
				ctx: this.$store.state.cmm.context,
				redi: false



			}
		},
		methods: {
			checkAuth(userid, passwd){
				if(userid.length >= 4 && passwd.length >= 4){

					this.gologin(userid, passwd)

				}

			},

			gologin(userid, passwd) {
				this.$store.dispatch('logins/login',
						{userid:userid, passwd: passwd , context: this.ctx} )
						.then(()=>{
							alert(`auth = ${this.$store.state.logins.isAuth}`)

							if(this.$store.state.logins.isAuth === true){
								this.$router.push('/')

							}else{
								this.redi = true

							}
						}).catch(()=>{

				})
				//alert(this.$store.state.logins.isAuth)


			}
		}
	}

</script>
<style scoped>

	input[type=text] {
		width: 200px;
		height: 33px;
		padding: 2px 0 0 4px;
		border: 1px solid #bebebe;
	}
</style>