export const checkBox={
    data(){
        return{

        }
    },
    methods:{
        check(checkedItem){
            checkedItem.checked=!checkedItem.checked
        },
        allcheck(checkedItemList){
            this.allchecked=!this.allchecked
            for(let i=0;i<checkedItemList.length;i++){
                checkedItemList[i].checked= this.allchecked
            }
        },
        updateCheckall(){
            let checknum=0
            for(let i=0;i<this.List.length;i++){
                if(this.List[i].checked==true){
                    checknum+=1
                }
                if(checknum==this.List.length){
                    this.allchecked=true
                }else{
                    this.allchecked=false
                }
            }
        },
    }
}