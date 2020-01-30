<template>
<div class= "snsDetail">
  <link rel="stylesheet" href="https://blackrockdigital.github.io/startbootstrap-agency/vendor/fontawesome-free/css/all.min.css">

    <div class="col-lg-9">
        <div class="card mt-4">
            <div class="dropbox" >
                <file-pond
                        ref="pond"
                        label-idle="이 곳에 사진 파일을 드래그 해주세요."
                        allow-multiple="false"
                        max-files="1"
                        accepted-file-types="image/jpeg, image/png"
                        server="server"
                        :files="myFiles"
                        @init="handleFilePondInit"/>
            </div>
            <div class="checkbox">
                <h1>모델명</h1>
                <!--<div class="sub_type_list sub_type_tree"  >
                    <div class="scroll-wrapper scrollbar-dynamic" style="position: relative;">
                        <div class="sscrollbar-dynamic scroll-content scroll-sscrolly_visible"
                             style="height: 260px; margin-bottom: 0px; margin-right: 0px; max-height: none;">
                            <ul class="tree">
                                <li class="dep01" v-for=" region of regionList" :key="region.code">
                                    <div class="row">
                                        <span class="txt">
                                            <div class="checker" id="uniform-areaL1">
                                                <span :class="{checked:region.checked}" @click="check(region)">
                                                <input type="checkbox" name="wr_in_v_center_region_code" id="areaL1" class="uniform" value="region.code">
                                                </span>
                                            </div>
                                            <label for="areaL1">{{region.name}}</label>
                                        </span>
                                    </div>
                                </li>
                            </ul>
                        </div>
                        <div class="scroll-element scroll-x">
                            <div class="scroll-element_outer">
                                <div class="scroll-element_size"></div>
                                <div class="scroll-element_track"></div>
                                <div class="scroll-bar"></div>
                            </div>
                        </div>
                        <div class="scroll-element scroll-y">
                            <div class="scroll-element_outer">
                                <div class="scroll-element_size"></div>
                                <div class="scroll-element_track"></div>
                                <div class="scroll-bar"></div>
                            </div>
                        </div>
                    </div>
                </div>-->
            </div>

            <div class="inputbox">
                <p>{{contentTitle}}</p>
                <br/>

                <textarea class="card-text" v-model="content"/>
            </div>
        </div>
        <div class="btnbox">
            <button class="btn btn-primary" v-if="writeBtn" @click="inputContent" data-dismiss="modal" type="button">
                <i class="fas fa-pen"></i> <b>글 입력하기</b></button>
            <button class="btn btn-primary" v-if="updateBtn" @click="cancel" data-dismiss="modal" type="button">
                <i class="fas fa-pen"></i><b> 글 수정하기</b></button>
        </div>
    </div>

</div>
<!--    </div>
  </div>
</div>-->
</template>
<script>
    import vueFilePond from 'vue-filepond';
    import 'filepond/dist/filepond.min.css';
    // Import FilePond plugins
    // Please note that you need to install these plugins separately
    // Import image preview plugin styles
    import 'filepond-plugin-image-preview/dist/filepond-plugin-image-preview.min.css';
    // Import image preview and file type validation plugins
    import FilePondPluginFileValidateType from 'filepond-plugin-file-validate-type';
    import FilePondPluginImagePreview from 'filepond-plugin-image-preview';
    // Create component
    const FilePond = vueFilePond(FilePondPluginFileValidateType, FilePondPluginImagePreview);
    import axios from "axios"
    let url = 'http://localhost:8080'
  export default{
    data(){
      return{
          server: {
              url: `${url}/uploadImg`,
              process: {
                  headers: {
                      Authorization: localStorage.getItem('token')
                  }
              }
          },
          myFiles: [],
          contentTitle:"차량이름",
          userName:"김예지",
          content:"내가요.. 차를 샀는데요... 비쌌어요.",
          writeBtn:true,
          updateBtn:false,
      }
    },
      components: {
          FilePond
      },
      /* 체크박스
      created() {
          if(!this.$store.state.cmm.initFlag)
              this.$store.dispatch('cmm/init')
          /!*        if(this.$store.state.cmm.makerFromMain!=''){

                  }*!/
      },*/
    methods:{
        handleFilePondInit() {
            this.$refs.pond.getFiles()

            let headers = {
                'authorization': 'JWT fefege..',
                'Accept' : 'application/json',
                'Content-Type': 'application/json'
            }
            console.log(`${this.server.process.headers.Authorization}`);
            console.log(`${this.myFiles}`);
            axios.post(this.server.url, '12345', headers)
            .then((res)=>{
                alert(res.data)
            })
            .catch(()=>{})
            // FilePond instance methods are available on `this.$refs.pond`
        },
        inputContent(){

        },
        cancel(){

        },

    }

  }
</script>
<style scoped>

.col-lg-9 {
    margin: 0 auto;
    -ms-flex: 0 0 75%;
    flex: 0 0 75%;
    max-width: 75%;
    position: relative;
    width: 100%;
    padding-right: 15px;
    padding-left: 15px;
    display: table;
}
.inputbox p {
    font-size: 2.5rem;
    position: relative;
    margin: 1rem;
    font-weight: 500;
    line-height: 1.2;
}
.mt-4 {
    margin-top: 1.5rem!important;
}
.card {
    position: relative;
    display: -ms-flexbox;
    display: flex;
    flex-flow: wrap;
    -ms-flex-direction: column;
    -webkit-box-orient: vertical;
    -webkit-box-direction: normal;
    flex-direction: row;
    width: min-content;
    margin: 0 auto;
    word-wrap: break-word;
    background-color: #fff;
    background-clip: border-box;
    border-radius: .25rem;
}
.snsDetail {
   overflow: none;
 }
.dropbox{
  width: 500px;
  height: 400px;
  position: relative;
  margin: 0 auto;
  float: left;
}
.checkbox {
    width: 350px;
    padding: 25px;
    height: 350px;
    float: left;
    border: 1px solid rgba(0,0,0,.125);
    border-radius: 10px 10px;
    margin-left:50px;
}
.inputbox{
    float: left;
    width: 1050px;
    margin: 0 auto;
    inline-size: auto;
}
.btnbox{
    margin: 0 auto;
    margin-top: 50px;
    width: 1050px;
    text-align: center;
}
.dropbox > h3 {
  position: absolute;
  font-size: 2em;
  margin: 100px auto;
  padding-left: 40px;
  z-index: 2;
}

.input-file {
  position: absolute;
  opacity: 0;
  width:100%;
  height:100%;
  top:0;
  left:0;
}
.inputbox textarea {
  resize: none;
  width: 950px;
  height: 300px;
  font-size: 17px;
  margin: 0 auto;
    padding: 10px;
    border-radius: 10px 10px;
    box-shadow: #0a0a0a;
}
.img-fluid d-block mx-auto{
  position: absolute;
  opacity: 0;
  width:100%;
  height:100%;
  top:0;
  left:0;
  z-index: 3;
}
.btn-primary {
	margin: auto 10px;
}
.container {
  max-width: 720px;
}
.container {
  max-width: 540px;
}
.container {
  width: 100%;
  padding-right: 15px;
  padding-left: 15px;
  margin-right: auto;
  margin-left: auto;
}
.row {
  display: -ms-flexbox;
  display: flex;
  -ms-flex-wrap: wrap;
  flex-wrap: wrap;
  margin-right: -15px;
  margin-left: -15px;
}
.modal-body {
  position: relative;
  -ms-flex: 1 1 auto;
  flex: 1 1 auto;
  padding: 1rem;
}
.portfolio-modal .modal-content {
  padding: 20px 0;
  text-align: center;
}
.portfolio-modal .modal-content img {
  margin-bottom: 30px;
}
.mx-auto {
  margin-left: auto!important;
}
.mx-auto {
  margin-right: auto!important;
}
.d-block {
  display: block!important;
}
.img-fluid {
  max-width: 100%;
  height: auto;
}
img {
  vertical-align: middle;
  border-style: none;
}
.portfolio-modal .modal-content p {
  margin-bottom: 30px;
}
.portfolio-modal .modal-content ul.list-inline {
  margin-top: 0;
  margin-bottom: 30px;
}
.list-inline {
  padding-left: 0;
  list-style: none;
}
.portfolio-modal .modal-content button {
  cursor: pointer;
}
@media (prefers-reduced-motion: reduce) {
    .btn {
        transition: none;
    }
}
.btn:hover {
    color: #212529;
    text-decoration: none;
}
.btn-primary {
  margin: auto 10px;
    height: 50px;
    width: 140px;
    border-radius: 10px 10px;
    font-size:1.3em;
    background-color: #212529;
    color: #fff;
}
.btn-primary:hover {
    color: #fff;
    background-color: #fac200;
}
</style>