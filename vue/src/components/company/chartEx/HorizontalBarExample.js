import { HorizontalBar } from './BaseCharts'

export default {
  extends: HorizontalBar,
  props:['data'],
  data(){
    return{
      name:[],
      revenue:[]
    }
  },
  methods:{
    dataInit(){
      this.renderChart({
        labels: Object.keys(this.data),
        datasets: [
          {
            label: '판매량',
            backgroundColor: '#33ccff',
            data: Object.values(this.data)
          }
        ]
      }, {responsive: true, maintainAspectRatio: false})

    },

  },
  mounted () {
  }
}