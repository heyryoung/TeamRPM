<template>
    <div class="Chart">
        <bar-example :data="data" ref="bar"/>
    </div>

</template>

<script>
    import BarExample from '@/components/company/chartEx/BarExample'
    export default {
        name: "RecommendChart",
        components : {BarExample},
        data() {
            return {data : []}
        },
        created() {
                this.data = {x : this.$store.state.contents.recommendBySearchWordList.modelList,
                    y : this.$store.state.contents.recommendBySearchWordList.similarities}
        }

    }
</script>

<style scoped>

</style>