import { Bar } from './BaseCharts'
export default {
  extends: Bar,
props:['data'],
    methods:{
      dataInit(){
          this.renderChart({
              labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'],
              datasets: [
                  {
                      label: '판매액',
                      backgroundColor: '#99ccff',
                      data: this.data
                  }
              ]
          }, {responsive: true, maintainAspectRatio: false})
      }

    },
  mounted () {



  },

}