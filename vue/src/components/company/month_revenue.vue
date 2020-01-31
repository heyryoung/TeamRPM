<template>
    <div>
    <div class="Chart">
        <button @click="prevYear()">◀</button><button @click="nextYear()" style="float: right">▶</button>
        <h1 style="text-align:center ;">{{year}}년  월판매량</h1>

        <bar-example :data="month_revenue[year]" ref="monthRevenue"/>

    </div>
        <div class="Chart">
            <button @click="prevMonth()">◀</button><button @click="nextMonth()" style="float: right">▶</button>
            <h1 style="text-align:center;">{{em_year}}년 {{month}}월 직원 판매량</h1>
            <horizontal-bar-example :data="em_revenue[em_year][month-1]" ref="emRevenue"/>
        </div>

    </div>
</template>

<script>
    import BarExample from "./chartEx/BarExample";
    import axios from "axios";
    import HorizontalBarExample from './chartEx/HorizontalBarExample'

    export default {
        name: "month_revenue",
        components: {
            BarExample,HorizontalBarExample
        },
        data(){
            return{
                minYear:2018,
                maxYear:0,
                year:0,
                em_year:0,
                month_revenue:{},
                em_revenue:{},
                month:0,
                allRevenue:[]
            }
        },
        created() {
            let d= new Date();
            this.year=Number(d.getFullYear())
            this.em_year=Number(d.getFullYear())
            this.maxYear=Number(d.getFullYear())
            this.month=Number(d.getMonth())+1
            console.log(this.maxYear)
            axios
                .get(`http://localhost:8080/revenue/emRevenue/`+'114')
                .then((res)=>{
                    let month=""
                    this.allRevenue=res.data
                    res.data.forEach(el=>{
                        for(let i=this.minYear;i<=this.maxYear;i++){
                            for(let j=1; j<13;j++) {
                                (j < 10) ? month = '0' + String(j) : month = String(j)
                                if (el.month.substr(0, 6) == String(i) + month){
                                    if (this.month_revenue.hasOwnProperty(i)) {
                                        this.month_revenue[i][j-1]+=el.emRevenue
                                    }else{
                                        this.month_revenue[i]=[0,0,0,0,0,0,0,0,0,0,0,0]
                                    }
                                }

                            }

                        }

                       /* for(let i=1; i<13;i++) {
                            (i < 10) ? month = '0' + String(i) : month = String(i)
                            if (el.month.substr(0, 6) == String(this.year) + month) {
                                this.data[i - 1] += el.emRevenue

                                if (this.em_revenue[2019][i - 1].hasOwnProperty(el.emName)) {
                                    this.em_revenue[2019][i - 1][el.emName] += el.emRevenue
                                } else {
                                    this.em_revenue[2019][i - 1][el.emName] = el.emRevenue
                                }
                            }
                        }
*/

                    })
                    this.$refs.monthRevenue.dataInit()
                    //this.$refs.emRevenue.dataInit()

                })
                .catch((e)=>{
                    alert('차트 pull'+e)
                })

        },
        methods:{
            prevYear(){
                let month=""

                if(this.year>2018){
                    this.data=[0,0,0,0,0,0,0,0,0,0,0,0]
                    this.year-=1
                    this.allRevenue.forEach(el=>{
                            /*월 판매량*/
                            for(let i=1; i<13;i++){
                                (i<10)? month='0'+String(i):month=String(i)
                                if(el.month.substr(0,6)==String(this.year)+month){
                                    this.data[i-1]+=el.emRevenue
                                }

                            }

                    })
                    this.$refs.monthRevenue.dataInit()

                }

            },
            nextYear(){
                let month=""

                if(this.year<2020){
                    this.data=[0,0,0,0,0,0,0,0,0,0,0,0]
                    this.year+=1
                    this.allRevenue.forEach(el=>{
                        /*월 판매량*/
                        for(let i=1; i<13;i++){
                            (i<10)? month='0'+String(i):month=String(i)
                            if(el.month.substr(0,6)==String(this.year)+month){
                                console.log(this.year)
                                this.data[i-1]+=el.emRevenue
                            }

                        }

                    })
                    this.$refs.monthRevenue.dataInit()
                }



            },
            prevMonth(){
                if(this.em_year==2019&&this.month>1) {
                    this.month -= 1
                }else if(this.em_year==2020){
                    this.em_year=2019
                    this.month=12
                }
                this.$refs.emRevenue.dataInit()

            },
            nextMonth(){
                if(this.em_year==2019&&this.month<12){
                    this.month+=1
                }else if(this.month==12){
                    this.em_year=2020
                    this.month=1
                }
                this.$refs.emRevenue.dataInit()

            }
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
        padding: 30px;
        border-radius: 20px;
        margin: 50px 10px;
        height: 300px;

    }
    .miniChart {
        padding: 20px;
        border-radius: 20px;
        margin: 50px 20px;
        width: 500px;
        float:left;
    }
    .rightButton{
        float: right;
        font-size: 15px;
        font-family: 'Helvetica', Arial;
    }
    .leftButton{
        float: left;
        font-size: 15px;
        font-family: 'Helvetica', Arial;
    }
</style>