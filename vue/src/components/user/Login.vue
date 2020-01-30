<template>
	<div>
		<link rel="stylesheet" type="text/css"   href="css/re_user.css">
		<link rel="stylesheet" type="text/css"   href="css/re_default.css">

		<div class="loginPage">
			<div class="loginBox">
				<h2><a href="https://www.kcar.com/index.do"><img src="https://www.kcar.com/resources/images/common/loginLogo.gif" alt="K Car"></a></h2>
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
							<input v-model="passwd" type="password" name="i_sPassWord" class="input_pass am" id="input_pass" value="" maxlength="20" onkeydown="fnEnterLogIn(event);">&nbsp;&nbsp;
							<span class="idSave">
						<input type="checkbox" class="am" id="id_save" name="id_save" value="Y">
						<label for="id_save" class="id_save">아이디 저장</label>
					</span>
							<a @click.prevent="checkSubmit" href=""><img src="https://www.kcar.com/resources/images/common/loginBtn.gif" alt="로그인" class="am">{{this.$store.state.user.fail}}</a>
						</div>
						<div class="findjoin">
							<a @click.prevent="">아이디 찾기</a> <a href="/user/passInf.do">비밀번호 찾기</a><modals-container />
						</div>
						<div class="snsjoin">
							<div v-if="this.fail==='fail'" class="error" >
								<p>가입하지 않은 아이디이거나, 잘못된 비밀번호입니다. </p>
							</div>


						</div>


						<p class="skjoin">아직 RPM 회원이 아니세요? <router-link to="/join">회원가입</router-link></p>
					</div>
				</div>
			</div>
		</div>
	</div>
</template>
<script>
	import {mapGetters} from 'vuex'
	export default {
		computed:{
			...mapGetters(['getFail']),
			//...mapState(['fail'])

		},
		data(){
			return{
				userid : '',
				passwd : '',
				auth: this.$store.state.user.auth,
				result :'',
				fail : 'success'


			}
		},
		methods:{
			checkSubmit(){
				alert(`wpqkf :${this.fail.toString()}`)
				if(this.userid.length >= 4 && this.passwd.length>=4){
					this.login()

				}

			},
			login(){


				this.$store.dispatch('user/login', {userid:this.userid,passwd:this.passwd})
				alert(this.result.result)

			},





		},
		created() {
			if(this.$store.state.auth === true){
				alert('이미로그인중입니다')
				this.$router.push('/')

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