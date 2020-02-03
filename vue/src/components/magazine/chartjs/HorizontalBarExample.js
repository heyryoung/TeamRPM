import { HorizontalBar } from './BaseCharts'

export default {
  extends: HorizontalBar,
  methods: {
    dataInit(data) {
      this.renderChart({
        labels: data.labels,
        datasets: [
          {
            label: data.title,
            data: data.barGraphRowData,
            backgroundColor: ['#ccd8ff', '#b9d0d6', '#b9d0d6', '#5d7381', '#ccd8ff', '#b9d0d6', '#b9d0d6', '#5d7381', '#ccd8ff', '#b9d0d6', '#b9d0d6', '#5d7381'],
            hoverBorderColor: 'red',
            offset: true
          }
        ]
      }, {responsive: true, maintainAspectRatio: false})
    }
  }
}