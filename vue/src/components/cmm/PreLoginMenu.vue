<template>
    <div>
        <Slide noOverlay ableOutsideClick :crossIcon="false">
            <router-link to="/">HOME</router-link>
            <router-link to="/login">로그인</router-link>
            <router-link to="/join">회원가입</router-link>
            <router-link to="/searchmain">검색창</router-link>
            <router-link to="/product">제품</router-link>
            <router-link to="/seencar">최근 본 차량(비교함)</router-link>
            <router-link to="/buycar">자동차구매 </router-link>
            <router-link to="/buycarSelectGoods">자동차구매1 </router-link>
            <router-link to="/buycarInsertContractorInfomation">자동차구매2 </router-link>
            <router-link to="/buycarInsertContractorInfomation">자동차구매3 </router-link>
            <router-link to="/recommendHome">딜러에게 추천받기</router-link>
            <router-link to="/sns">SNS(REVIEW) </router-link>
            <router-link to="/sns">차계부 </router-link>
        </Slide >
    </div>
</template>

<script>
    export default {
    }
</script>

<style scoped>

</style>