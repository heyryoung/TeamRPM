<template>
    <div>
    <div class="Chart">
        <h1 style="text-align:center;">월별 판매량</h1>
        <bar-example/>
    </div>
    <div class="miniChart">
        <h1 style="text-align:center;">직원별 판매량</h1>
        <doughnut-example/>
    </div>
    <div class="miniChart">
        <h1 style="text-align:center;">브랜드별 판매량</h1>
        <doughnut-example/>
    </div>
    </div>
</template>

<script>
    import BarExample from "./chartEx/BarExample";
    import DoughnutExample from "./chartEx/DoughnutExample";

    export default {
        name: "month_revenue",
        components: {
            BarExample,DoughnutExample,
        }
    }
</script>

<style scoped>
    h1 {
        font-family: 'Helvetica', Arial;
        color: #464646;
        text-transform: uppercase;
        border-bottom: 1px solid #f1f1f1;
        padding-bottom: 15px;
        font-size: 28px;
        margin-top: 0;
    }

    .Chart {
        padding: 20px;
        box-shadow: 0px 0px 20px 2px rgba(0, 0, 0, .4);
        border-radius: 20px;
        margin: 50px 10px;

    }
    .miniChart {
        padding: 20px;
        box-shadow: 0px 0px 20px 2px rgba(0, 0, 0, .4);
        border-radius: 20px;
        margin: 50px 20px;
        width: 500px;
        float:left;
    }
</style>