<template>
    <div>

        <div class="form_area clearFix personal_info" id="formarea">
            <customerDetail_left></customerDetail_left>
                    <div class="carlist">
                        <div class="mypage_CarList interest">
                        <customerDetail_right></customerDetail_right>
                        </div>
                    </div>

        </div>
    </div>
</template>
<script>
    import customerDetail_right from "./customerDetail_right";
    import customerDetail_left from "./customerDetail_left";
    export default {
        components:{
            customerDetail_right,customerDetail_left
        }
    }
</script>
<style scoped>

    .carlist {
        color: #333;
        font-size: 12px;
        font-family: "돋움", Dotum, "굴림", gulim, AppleGothic, Helvetica, Sans-serif;
        float: left;
        margin: 0px 15px;
        line-height: 180%;
        padding: 10px 500px 50px 10px;
        width: 500px;

        background: #fff;

    }


</style>