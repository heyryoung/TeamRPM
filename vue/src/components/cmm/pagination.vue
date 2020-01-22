<template>
    <div class="cm_pagination">
        <ul class="pagination">
            <li class="move prev" @click="prev()" v-if="pageNums[0].num!=1"> <a @click.prevent href=""></a></li>
            <li :class="{'num on':pageNum.on,'num':!pageNum.on}" v-for="(pageNum,index) of pageNums" :key="pageNum.num" @click="pageSwitch(index)"><a>{{pageNum.num}}</a></li>
            <li class="move next" @click="next()" v-if="pageNums.length==5&& pageNums[4].num<(this.pagination.length/5)+1">
                <a @click.prevent href=""></a> </li>
        </ul>
    </div>
</template>

<script>
    export default {
        name: "pagination",
        props:['pagination'],
        data(){
            return{
                pageNums:[],
            }
        },
        methods:{
            cutPage(i){
                let pageBlock=[]

                for(let j=(i-1)*5;j<(i-1)*5+5;j++) {
                    if(j>=this.pagination.length){
                        break
                    }
                    pageBlock.push(this.pagination[j])
                }
                return pageBlock
            },

            pageSwitch(i){
                this.pageNums[i].on=true
                for(let j=0; j<this.pageNums.length;j++){
                    if(j!=i){
                        this.pageNums[j].on=false
                    }
                }
                this.$emit("movePage",this.cutPage(this.pageNums[i].num))
            },

            prev(){
                this.$emit("movePage",this.cutPage(this.pageNums[0].num-5))
                let temp =this.pageNums[0].num
                this.pageNums=[]
                for(let i=0; i<5;i++){
                    if(i==0){
                        this.pageNums.push({num:temp-5,on:true})
                    }else{
                        this.pageNums.push({num:temp-5+i,on:false})
                    }
                    if(this.pageNums[i].num>=(this.pagination.length/5)){
                        this.pageNums.splice(i,)
                        break
                    }
                }
            },
            next(){
                this.$emit("movePage",this.cutPage(this.pageNums[4].num+1))
                let temp =this.pageNums[0].num
                this.pageNums=[]
                for(let i=0; i<5;i++){
                    if(i==0){
                        this.pageNums.push({num:temp+5,on:true})
                    }else{
                        this.pageNums.push({num:temp+5+i,on:false})
                    }
                    if(this.pageNums[i].num>=(this.pagination.length/5)+1){
                        this.pageNums.splice(i,)
                        break
                    }
                }
            },
            first() {
                let num=0
                if(this.pagination.length/5>=5){
                    num=5
                }else{
                    num=this.pagination.length/5
                }
                for(let i=0; i<num;i++){
                    if(i==0) {
                        this.pageNums.push({num:i+1,on:true})
                    }else{
                        this.pageNums.push({num:i+1,on:false})
                    }
                }
                this.$emit("movePage",this.cutPage(this.pageNums[4].num+1))


            }
        },

    }
</script>

<style scoped>

</style>