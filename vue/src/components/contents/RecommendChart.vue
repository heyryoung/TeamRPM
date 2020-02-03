<template>
    <div class="Chart">
        <bar-chart :data="data" ref="bar"/>
    </div>

</template>

<script>
    import BarChart from '@/components/contents/contentsJs/BarChart'
    export default {
        name: "RecommendChart",
        components : {BarChart},
        data() {
            return {data : []}
        },
        created() {
            alert(this.$store.state.contents.recommendBySearchWordList.modelList)
                this.data = {x : this.$store.state.contents.recommendBySearchWordList.modelList,
                    y : this.$store.state.contents.recommendBySearchWordList.similarities}
        }

    }
</script>

<style scoped>

</style>