<template>
    <div class="condition">
        <h4 class="title">xxx 고객님의 요구사항</h4>
        <div class="compBox">
        <div class="compLeft">
        <table class="tableComp left body" cellspacing="0" >
            <tbody>

            <tr v-for="col of columns" :key="col">
                <td>{{col}}</td>
            </tr>

            </tbody>
        </table>
        </div>
        <div class="compRight">
        <table class="tableComp right body" cellspacing="0" id="compRightBody" style="width: 300px;">
            <tbody>

            <tr id="unitSumy1" type="gapSpec" v-for="col of optoions" :key="col">
                <td id="Sumy1_1" >{{col}}</td>

            </tr>


            </tbody>
        </table>
        </div>
        </div>
    </div>
</template>

<script>
    export default {
        name: "carDetail_left",
        data(){
            return{
                optoions:
                    {price:'2000만원~8000만원',carYear:'2012~2019',distance:'100000km~10000000km',fuel:'휘발유',carType:'suv',fuelPrice:'123',a:'1',b:'2',c:'3',d:'4',f:'5'}
                ,
                columns:[
                    '가격','연식','주행거리','연료','차종','연비','1','2','3','4','5'
                ],

            }

        }
    }
</script>

<style scoped>
    .condition {
        color: #333;
        font-size: 12px;
        font-family: "돋움", Dotum, "굴림", gulim, AppleGothic, Helvetica, Sans-serif;
        float: left;
        margin-top: 50px ;
        line-height: 180%;
        padding: 50px 80px;
        width: 400px;
        background: #fff;
        border: 1px solid #666666;
        margin-left: 100px;

    }

    .title {
        color: #333;
        text-align: left;
        margin: 20px 30px;
        padding: 0;
        line-height: 180%;
        padding-top: 5px;
        font-size: 30px;
        font-weight: bold;
        font-family: 맑은고딕, 'Malgun Gothic';
        width: 500px;
        align-content: center;
    }

    table.tableComp.left.body{
        margin: 0px;

    }
    .tableComp.left.body td {
        padding: 7px 0;
        border-right: 1px solid whitesmoke;
        border-bottom: 1px solid whitesmoke;
        background: #ffffff;
        text-align: center;
        position: relative;
        height: 21px;
        font-weight: bold;
    }
    .tableComp.right.body td {
        padding: 7px 0;
        border-right: 1px solid whitesmoke;
        border-bottom: 1px solid whitesmoke;
        background: #ffffff;
        text-align: center;
        position: relative;
        height: 21px;

    }


</style>