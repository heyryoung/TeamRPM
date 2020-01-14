<template>
    <div class="container">
        <div>


            <div id="autodanawa_wrap">
                <header>
                    <div class="compHead">
                        <div id="autodanawa_header_mini">
                            <ul class="right">
                            </ul>
                        </div>
                    </div>
                    <div class="compTop">
                        <div class="cont">

                            <h2 class="logo_compare">
                                <a href="/" target="_blank"><span class="screen_behind">모델비교</span></a>
                            </h2>
                            <!--<div class="tabs" id="tabComp">
                                <ul>
                                    <li>
                                        <button type="button" tab="unitSumy" class="on">요약</button>
                                    </li>
                                    <li>
                                        <button type="button" tab="unitSpec0" class="">제원</button>
                                    </li>
                                    <li>
                                        <button type="button" tab="unitItem0" class="">사양</button>
                                    </li>
                                    <li>
                                        <button type="button" tab="unitOptn0" class="">견적</button>
                                    </li>
                                    <li>
                                        <button type="button" tab="unitMant0">유지</button>
                                    </li>
                                </ul>
                            </div>-->



                        </div>
                    </div>
                </header>
                <main>
                    <div class="compBox">
                        <div class="compLeft">
                            <table class="tableComp left head" cellspacing="0" id="compLeftHead">
                                <tbody>
                                <tr>
                                    <th>모델</th>
                                </tr>
                                </tbody>
                            </table>
                            <table class="tableComp left body" cellspacing="0" id="compLeftBody">
                                <tbody>

                                <tr v-for="col of columns" :key="col">
                                    <td>{{col}}</td>
                                </tr>

                                </tbody>
                            </table>

                        </div>
                        <div class="compRight">
                            <table class="tableComp right head" cellspacing="0" id="compRightHead" style="width: 900px;">
                                <tbody>
                                <tr id="unitPhoto" cont="index">
                                    <td id="Photo_1" v-for="row of rows" :key="row">
                                        <button type="button" id="addBtn" v-if="row.button">추가하기</button>
                                        <!--<img src="https://img.kcar.com/carpicture/carpicture06/pic6026/kcar_60263050_001.jpg" alt="">-->
                                    </td>

                                </tr>
                                </tbody>
                            </table>
                            <table class="tableComp right body" cellspacing="0" id="compRightBody" style="width: 900px;">
                                <tbody>

                                <tr id="unitSumy1" type="gapSpec" v-for="col of columns" :key="col">
                                    <td id="Sumy1_1" v-for="row of rows" :key="row">&nbsp;</td>

                                </tr>


                                </tbody>
                            </table>

                        </div>
                    </div>

                </main>

                <footer>

                </footer>
            </div>
        </div>

    </div>
</template>
<script>
    export default {
        data:function(){
            return {
                    columns:[
                        '가격','연식','주행거리','연료','차종','연비','1','2','3','4','5','6','7','8'
                    ],
                rows:[
                    {rowNum:1,button:true},
                    {rowNum:2,button:true},
                    {rowNum:3,button:true},
                    {rowNum:4,button:true},
                    {rowNum:5,button:true},
                ]

            }
        },props : [
            'a',
        ],methods : {

        }
    }
</script>
<style>

   #addBtn {
        display: inline-block;
       background: #188ff8;
       border-color: #007ae7;
       color: #fff;
        width: 150px;
        height: 45px;
        line-height: 43px;
        margin-left: 2px;
        border: 1px solid #000;
        text-align: center;
        font-size: 13px;
       font-weight: bold;
    }
</style>