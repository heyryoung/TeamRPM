<template>
    <div>
        <Slide noOverlay ableOutsideClick :crossIcon="false">
            <router-link to="/">HOME</router-link>
            <div v-else @click="logout">로그아웃</div>
            <router-link to="/searchmain">검색</router-link>
            <router-link to="/product">제품</router-link>
            <router-link to="/mypage">마이페이지</router-link>
            <router-link to="/seencar">최근 본 차량(비교함)</router-link>
            <router-link to="/buycar">자동차구매 </router-link>
            <router-link to="/buycarSelectGoods">자동차구매1 </router-link>
            <router-link to="/buycarInsertContractorInfomation">자동차구매2 </router-link>
            <router-link to="/buycarInsertContractorInfomation">자동차구매3 </router-link>
            <router-link to="/recommendHome">딜러에게 추천받기</router-link>
            <router-link to="/companyHome">ADMIN </router-link>
            <router-link to="/sns">SNS(REVIEW) </router-link>
        </Slide >
    </div>
</template>

<script>
    export default {
        name: "PostLoginMenu",
        methods:{
            logout(){
                this.$store.dispatch('user/logout')

            }
        }
    }
</script>

<style scoped>

</style>