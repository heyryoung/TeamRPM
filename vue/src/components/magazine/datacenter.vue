<template>
    <div>
        <div id='app'>
            <div id="content">
                <div class="mc_search1">
                    <ul >
                        <li>
                            <Graph />

                        </li>

                        <li>
                            <Chart/>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</template>
<script>
    import Graph from '@/components/magazine/datacenterGraph'
    import Chart from '@/components/magazine/datacenterChart'
    export default {
        name: 'app',
        components: {
            Graph,
            Chart
        },
        data: function() {
            return {
                label :[] ,
                modelNM : [],
                Domestic : [],
                Export : [],
                title : '',
                }
        },
        methods : {
        },
    };
</script>
<style>
    .mc_search1 {
        width: 1180px;
        margin: 0px auto 0 auto;
        max-height: 400px;
    }
</style>