<template>
    <div>
        <h1 style="text-align:center;">Linechart</h1>
        <line-example  ref="monthRevenue" v-if="isLineGraph === true"/>
        <horizontal-bar-example  ref="modelRevenue" v-if="isLineGraph === false"/>
    </div>
</template>

<script>
    import LineExample from './chartjs/LineExample'
    import HorizontalBarExample from './chartjs/HorizontalBarExample'
    import { mapState } from 'vuex';
    export default {
        name: 'datacenterGraph',
        components: {
            'line-example' : LineExample,
            'horizontal-bar-example': HorizontalBarExample
        },
        computed: {
            ...mapState({
                labels: state => state.decenter.labels,
                rowData : state => state.decenter.rowData ,
                title: state => state.decenter.title,
                Domestic: state => state.decenter.Domestic,
                Export: state => state.decenter.Export,
                mainCategoryItem: state => state.decenter.mainCategoryItem,
                subCategoryItem: state => state.decenter.subCategoryItem,
                GrandTotal: state => state.decenter.GrandTotals,
                isLineGraph : state => state.decenter.isLineGraph,
                GraphItem : state => state.decenter.GraphItem
            })

        },
        data: function() {
            return {
                dataPoints: null,
                height    : 20,
                datacollection: {
                    labels: ['January' , 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December', 'Total' ] ,
                    datasets: [
                        {
                            label: '',
                            backgroundColor: '#44b0f8',
                            pointBackgroundColor: 'white',
                            borderWidth: 1,
                            pointBorderColor: '#249EBF',
                            data: []//[ this.GrandTotal.Jan, this.GrandTotal.Feb , this.GrandTotal.Mar , this.GrandTotal.Apr , this.GrandTotal.May , this.GrandTotal.Jun , this.GrandTotal.Jul , this.GrandTotal.Aug , this.GrandTotal.Sep , this.GrandTotal.Oct , this.GrandTotal.Nov , this.GrandTotal.Dec , this.GrandTotal.Total]
                        }
                    ]
                },
                options: {
                    scales: {
                        yAxes: [{
                            ticks: {
                                beginAtZero: true
                            },
                            gridLines: {
                                display: true
                            }
                        }],
                        xAxes: [ {
                            gridLines: {
                                display: false
                            }
                        }]
                    },
                    legend: {
                        display: true
                    },
                    responsive: true,
                    maintainAspectRatio: false
                }
            }
        },
        methods : {
          fillData() {
              this.$refs.monthRevenue.dataInit(this.month_revenue[this.year])
          }
        },
        created() {

            this.$refs.monthRevenue.dataInit([40, 20, 12, 39, 10, 40, 39, 50, 40, 20, 12, 11])
        }
    }
</script>

<style scoped>

</style>