import { Bar } from './BaseCharts'
export default {
  extends: Bar,
  props:['data'],
  mounted(){
      this.renderChart({
        labels: this.data.x,
        datasets: [
          {
            label: '정확도',
            backgroundColor: '#99ccff',
            data: this.data.y
          }
        ]
      }, {responsive: true, maintainAspectRatio: false})
  },


}