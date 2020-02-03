import { HorizontalBar } from './BaseCharts'

export default {
  extends: HorizontalBar,
  props:['data'],
  methods: {
    dataInit( revenue ) {
      this.renderChart({
        labels: ['January', 'February', 'March', 'April', 'May', 'June', 'July', 'August', 'September', 'October', 'November', 'December'],
        datasets: [
          {
            label: 'Data One',
            data: revenue,
            backgroundColor: ['#ccd8ff', '#b9d0d6', '#b9d0d6', '#5d7381', '#ccd8ff', '#b9d0d6', '#b9d0d6', '#5d7381', '#ccd8ff', '#b9d0d6', '#b9d0d6', '#5d7381'],
            hoverBorderColor: 'red',
            offset: true
          }
        ]
      }, {responsive: true, maintainAspectRatio: false})
    }
  }
}