<template>
<div>
<Tab></Tab>
<router-view />

</div>
</template>
<script>

import Tab from "@/components/recommend/recommendTab.vue"

export default{
	components:{Tab}
}
</script>
<style scoped></style>