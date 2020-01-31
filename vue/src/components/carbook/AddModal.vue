<template>
    <div style ="margin : 0 auto"> <form action="#" class="contact-form">
        <input v-model="rdate" type="text" placeholder="날짜"/>
        <input v-model="servicecode" type="text" placeholder="주유/정비"/>
        <input v-model="detail" type="text" placeholder="상세"/>
        <input v-model="price" type="text" placeholder="금액"/>
        <button @click.prevent="callAddRecord" type="submit" class="site-btn">추가</button>
    </form></div>

</template>

<script>

    export default {
       data(){
           return {
               mycarid : this.$store.state.carbook.mycar.mycarid,
               rdate: '',
               servicecode: '',
               detail: '',
               price : ''


           }
       },
        methods:{
            callAddRecord(){
                this.$store.dispatch('addRecord', {mycarid:this.mycarid,rdate:this.rdate, servicecode: this.servicecode,
                detail: this.detail, price : this.price})



            }

        }

    }
</script>

<style scoped>

</style>