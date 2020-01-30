<template>
    <div>

        <div class="form_area clearFix personal_info" id="formarea">
            <carDetail_left></carDetail_left>
                    <div class="carlist">
                        <div class="mypage_CarList interest">
                        <carDetail_right></carDetail_right>
                        </div>
                    </div>

        </div>
    </div>
</template>
<script>
    import carDetail_right from "./carDetail_right";
    import carDetail_left from "./carDetail_left";
    export default {
        components:{
            carDetail_right,carDetail_left
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