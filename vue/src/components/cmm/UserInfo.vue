<template>
    <div class="wraper" >
        <h6>{{this.user.name}} 님</h6>
        <h6 v-if="this.mycar!=null">내차: {{this.mycar.model}}</h6>

        <div>
            <router-link to="/mypage"> <a href="" style="width:10%; height:20px; padding:7px;color:navy; font-size: 14px; border: 1px solid navy;">마이페이지 </a> </router-link>

            <a href="" style="color: navy; float:right; font-size: 12px; border: 1px solid navy">   로그아웃</a>
        </div>

    </div>
</template>

<script>
    import {mapState} from 'vuex'
    export default {

        data() {
            return {
                name: '',
                mycar: JSON.parse(localStorage.getItem("mycar"))
            }
        },
        computed: {
            ...mapState({
                user: state => state.user.user,

            })

        },
        methods: {
            logout() {
                this.$store.dispatch('user/logout')


            },



        }
    }
</script>

<style scoped>
.wraper{
    border: 1px solid white;
    width: 100%;
    margin: 0 auto;
    background-color: white;
    color: navy;


}

</style>