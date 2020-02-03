import { Line } from './BaseCharts'

export default {
  extends: Line,
  methods: {
    hi () {
      console.log('Hi')
    },
    dataInit(data) {
      console.log(data.title+data.lineGraphLabels.length + data.lineGraphRowData.length)
      this.renderChart({
        labels: data.labels,
        datasets: [
          {
            label: data.title,
            borderColor: '#005276',
            data: data.lineGraphRowData,
            borderCapStyle: 'butt',
            lineTension: 0.2,
            fill: false
          }
        ]
      }, {responsive: true, maintainAspectRatio: false})
    }
  }
}