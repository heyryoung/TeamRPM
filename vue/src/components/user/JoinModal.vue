<template>
<div class="v--modal-box v--modal" style="width: 600px; height: 300px;">
    <div class="modal-header">
        <slot name="header">
            회원가입을 취소하시겠습니까???
        </slot>
    </div>
    <div class="example-modal-content">
        <button class="btn" @click="cancelCheck">취소할래요</button>
        <button class="btn" @click="$emit('close')">가입할래요</button>
    </div>
    <div class="vue-modal-resizer"></div>
</div>

</template>
<script>
    import {store} from "../../store"
    export default {
        name: "JoinModal",
        data(){
        },
        methods:{
            cancelCheck(){
                store.state.cancel=true
            }
        }
    }
</script>
<style scoped>
    .modal-header{

    }
    .v--modal-box {
        position: relative;
        overflow: hidden;
        box-sizing: border-box;
    }
     .v--modal {
         background-color: white;
         text-align: left;
         border-radius: 3px;
         box-shadow: 0 20px 60px -2px rgba(27, 33, 58, 0.4);
         padding: 0;
     }
    .example-modal-content {
        height: 100%;
        box-sizing: border-box;
        padding: 10px;
        font-size: 13px;
        overflow: auto;
    }
    .vue-modal-resizer {
        display: block;
        overflow: hidden;
        position: absolute;
        width: 12px;
        height: 12px;
        right: 0;
        bottom: 0;
        z-index: 9999999;
        background: transparent;
        cursor: se-resize;
    }
    button.btn {
        outline: none;
        background: #fff;
        border: 0;
        padding: 10px 18px;
        cursor: pointer;
        color: #fff;
        box-shadow: 0 4px 8px rgba(32,160,255,.3);
        background: #4db3ff;
        font-weight: 600;
        border-radius: 3px;
        min-width: 90px;
        margin-bottom: 8px;
        margin-top: 8px;
        margin-right: 8px;
    }
     .vue-modal-resizer {
         display: block;
         overflow: hidden;
         position: absolute;
         width: 12px;
         height: 12px;
         right: 0;
         bottom: 0;
         z-index: 9999999;
         background: transparent;
         cursor: se-resize;
     }
    .midium{
        height:40px;
    }
</style>