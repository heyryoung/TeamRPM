import { Line } from './BaseCharts'

export default {
  extends: Line,
  mounted () {
    this.renderChart({
      labels: ['January' , 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'],
      datasets: [
        {
          label: 'Data One',
          borderColor : '#005276',
          data: [40, 39, 10, 40, 39, 30, 40, 39, 10, 40, 39, 80, 40],
          borderCapStyle : 'butt',
          lineTension : 0.2,
          fill : false
        }
      ]
    }, {responsive: true, maintainAspectRatio: false})
  }
}