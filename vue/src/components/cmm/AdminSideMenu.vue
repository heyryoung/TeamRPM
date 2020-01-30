<template>
    <div>
        <Slide noOverlay ableOutsideClick :crossIcon="false">
            <router-link to="/">HOME</router-link>
            <div v-else @click="logout">로그아웃</div>
            <router-link to="/searchmain">검색창</router-link>
            <router-link to="/product">제품</router-link>
            <router-link to="/mypage">마이페이지</router-link>
            <router-link to="/buycar">자동차구매 </router-link>
            <router-link to="/buycarSelectGoods">자동차구매1 </router-link>
            <router-link to="/buycarInsertContractorInfomation">자동차구매2 </router-link>
            <router-link to="/buycarInsertContractorInfomation">자동차구매3 </router-link>
            <router-link to="/companyHome">ADMIN </router-link>
        </Slide >
    </div>
</template>

<script>
    export default {
        name: "AdminSideMenu",
        methods:{
            logout(){
                this.$store.dispatch('user/logout')

            }
        }
    }
</script>

<style scoped>

</style>