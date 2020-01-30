<template>
<div class= "snsDetail">
  <link rel="stylesheet" href="https://blackrockdigital.github.io/startbootstrap-agency/vendor/fontawesome-free/css/all.min.css">
    <link rel="shortcut icon" href="https://www.kcar.com/resources/images/common/favicon.ico" type="image/x-icon">
    <link rel="icon" href="https://www.kcar.com/resources/images/common/favicon.ico" type="image/x-icon">
    <link rel="apple-touch-icon-precomposed"
          href="https://www.kcar.com/resources/images/mobile/common/apple-touch-icon.png">
    <link rel="stylesheet" type="text/css"  href="css/re_import.css">
    <link rel="stylesheet" type="text/css"   href="css/re_trade.css">
    <link rel="stylesheet" type="text/css"   href="css/plugin/selectric.css">

    <div class="col-lg-9">
        <div class="card mt-4">
            <div class="dropbox" >
                <file-pond
                        ref="pond"
                        label-idle="이 곳에 사진 파일을 드래그 해주세요."
                        allow-multiple="false"
                        max-files="1"
                        accepted-file-types="image/jpeg, image/png"
                        :server="server"
                        :file="file"
                        :init="handleFilePondInit"
                        :processfile="handleFilePondProcessfile"
                        :removefile="handleFilePondRemovefile"/>
                <p>*10Mb 이하의 파일을 업로드 해주세요.</p>

            </div>
            <div class="checkbox">
                <h1 style="font-size:1.7em">모델명 선택하기</h1>
                <div id="divTabWant1" class="divTabWantGroup">
                    <!--검색tab1 내용-->
                    <div class="searchcont1">
                        <ul>
                            <li>
                            <span id="spanMakeType" class="btnl">
                              <a @click="korCar(`korCar`,`impCar`)" id="korCar" class="on" data-item="MAKE_TYPE010">국산차</a>
                              <a @click="impCar(`korCar`,`impCar`,`category1`)" id="impCar" data-item="MAKE_TYPE020">수입차</a>
                            </span>
                            </li>
                            <li class="spreset">
                                <div class="searchr1">
                                        <div class="selectric-hide-select">
                                            <select id="makeList"
                                                    title="제조사를 선택하세요"
                                                    class="selectric"
                                                    data-beusable-tracking=""
                                                    tabindex="-1"
                                                    v-for="category of this.$store.state.cmm.category1"
                                                    :key="category.name">
                                                <option data-type="MAKE_TYPE010"
                                                        data-cnt="category.count">{{category.name}}</option>
                                            </select></div>
                                        <div class="selectric" ><span class="label"
                                                                      data-beusable-tracking="" >{{keyWord1}}</span></div>
                                        <div id = "category1" class="selectric-items" tabindex="-1">
                                            <div class="selectric-scroll">
                                                <ul v-for="category of this.$store.state.cmm.category1" :key="category.name">
                                                    <li data-index="1" @click="setCategory2(category)" class="">{{category.name}}
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                        <input class="selectric-input" tabindex="0">
                                </div>
                                <div class="searchr2">
                                    <div id="searchKey2"  @click="searchKeyClick(`searchKey2`)"
                                         class="selectric-wrapper selectric-selectric selectric-below selectric-hover">
                                        <div class="selectric-hide-select"><select
                                                id="modelGroupList" title="모델을 선택하세요"
                                                class="selectric" data-beusable-tracking=""
                                                tabindex="-1"
                                                v-for="category of this.$store.state.cmm.category2"
                                                :key="category.name">
                                            <option data-type="MAKE_TYPE010"
                                                    data-cnt="category.count">{{category.name}}</option>
                                        </select></div>
                                        <div class="selectric"><span class="label"
                                                                     data-beusable-tracking="">{{keyWord2}}</span></div>
                                        <div id = "category2" class="selectric-items" tabindex="-1" >
                                            <div class="selectric-scroll">
                                                <ul v-for="category of this.$store.state.cmm.category2" :key="category.name">
                                                    <li data-index="1" @click="setCategory3(category)" class="">{{category.name}}
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                        <input class="selectric-input" tabindex="0"></div>
                                </div>
                                <div class="searchr3">
                                    <div id="searchKey3" @click="searchKeyClick(`searchKey3`)"

                                         class="selectric-wrapper selectric-selectric selectric-below selectric-hover">
                                        <div class="selectric-hide-select">
                                            <select
                                                    id="modelList"
                                                    title="세부모델을 선택하세요"
                                                    class="selectric"
                                                    data-beusable-tracking=""
                                                    tabindex="-1"
                                                    v-for="category of this.$store.state.cmm.category3"
                                                    :key="category.name">
                                                <option data-type="MAKE_TYPE010"
                                                        data-cnt="category.count">{{category.name}}</option>
                                            </select></div>
                                        <div class="selectric"><span class="label"
                                                                     data-beusable-tracking="">{{keyWord3}}</span></div>
                                        <div class="selectric-items" tabindex="-1">
                                            <div class="selectric-scroll">
                                                <ul v-for="category of this.$store.state.cmm.category3" :key="category.name">
                                                    <li data-index="1" @click="setKeyWord3(category)" class="">{{category.name}}
                                                    </li>
                                                </ul>
                                            </div>
                                        </div>
                                        <input class="selectric-input" tabindex="0"></div>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
               <!-- <div>
                    <div class="select_row .select_maker">
                        <h3 class="maker_title"><label for="maker">제조사</label></h3>
                        <div class="ps_box maker_code">
                            <select id="maker" v-model="selectMaker" class="sel" aria-label="maker">
                                <option value="" selected="">제조사</option>
                                <option v-for="maker of makerList" :key="maker.code" @click="selectedMaker">{{maker.name}}</option>
                            </select>
                        </div>
                    </div>
                    <div class="select_row .select_model">
                        <h3 class="model_title"><label for="model">모델명</label></h3>
                        <div class="ps_box model_code">
                            <select id="model" v-model="selectModel" class="sel" aria-label="model">
                                <option value="" selected="">모델명</option>
                                <option v-for="model of modelList" :key="model.code">{{model.name}}</option>
                            </select>
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
    import { mapState } from 'vuex'
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
          file:[],
          uploadedFiles: [],
          keyWord1 : '제조사를 선택하세요',
          keyWord2 : '모델을 선택하세요',
          keyWord3 : '세부모델을 선택하세요',
          contentTitle:"",
          userName:"김예지",
          content:"내가요.. 차를 샀는데요... 비쌌어요.",
          writeBtn:true,
          updateBtn:false,
      }
    },
      components: {
          FilePond
      },
      computed:{
          ...mapState({
              makerList: state => state.cmm.makerList,
              modelList : state => state.cmm.modelList,
              modelListIsOpen : state => state.cmm.modelListIsOpen,
          })
      },
      created() {
          this.$store.dispatch('cmm/init')
          /*        if(this.$store.state.cmm.makerFromMain!=''){

                  }*/
      },
    methods:{
        handleFilePondInit(){
            this.$refs.pond.getFiles();
        },
        handleFilePondProcessfile(error, file) {
            console.log("FilePond succesfully processed file " + file);
            this.uploadedFiles.push(file.filename);
            this.$nextTick();
        },
        handleFilePondRemovefile(file) {
            console.log("FilePond deleted file " + file.filename);
            var index = this.myFiles.indexOf(file.filename);
            if (index > -1) {
                this.uploadedFiles.splice(index, 1);
                this.$nextTick();
            }
        },
        korCar(korCarID, impCarID){
            const korCar = document.getElementById(korCarID)
            const impCar = document.getElementById(impCarID)
            korCar.className = "on"
            impCar.className = ""
            this.$store.dispatch('cmm/getCategory1',{'param':'KOR','column':'CAR_TYPE'})
            this.keyWord1 = '제조사를 선택하세요'
            this.keyWord2 = '모델을 선택하세요'
            this.keyWord3 = '세부모델을 선택하세요'

        },
        impCar(korCarID, impCarID, category1ID){
            const korCar = document.getElementById(korCarID)
            const impCar = document.getElementById(impCarID)
            const category1 = document.getElementById(category1ID)
            korCar.className = ""
            impCar.className = "on"
            category1.style.width = "220px"
            category1.style.height = "300px"
            this.$store.dispatch('cmm/getCategory1',{'param':'IMP','column':'CAR_TYPE'})
            this.keyWord1 = '제조사를 선택하세요'
            this.keyWord2 = '모델을 선택하세요'
            this.keyWord3 = '세부모델을 선택하세요'

        },
        searchKeyClick(searchKeyID){
            const searchKey = document.getElementById(searchKeyID)
            const cate2 = document.getElementById('category2')
            if(searchKey.className === "selectric-wrapper selectric-selectric selectric-below selectric-hover"){
                for (let elementsByClassNameElement of document.getElementsByClassName("selectric-wrapper selectric-selectric selectric-below selectric-hover selectric-open selectric-focus")) {
                    elementsByClassNameElement.className = "selectric-wrapper selectric-selectric selectric-below selectric-hover"
                }
                searchKey.className = "selectric-wrapper selectric-selectric selectric-below selectric-hover selectric-open selectric-focus"
            }else{
                searchKey.className = "selectric-wrapper selectric-selectric selectric-below selectric-hover"
            }
            if(this.$store.state.cmm.category2.length>=10) {
                cate2.style.width = "220px"
                cate2.style.height = "300px"
            }{
                cate2.style.width = ""
                cate2.style.height = ""
            }
        },

        setCategory2(param){
            this.keyWord2 = '모델을 선택하세요'
            this.keyWord3 = '세부모델을 선택하세요'
            this.keyWord1 = param.name
            this.$store.dispatch('cmm/getCategory2',{'param':this.keyWord1,'column':'MAKENM'})
        },
        setCategory3(param){
            this.keyWord3 = '세부모델을 선택하세요'
            this.keyWord2 = param.name
            this.$store.dispatch('cmm/getCategory3',{'param':this.keyWord2,'column':'MODEL_GRP_NM'})
        },
        setKeyWord3(param){
            this.keyWord3 = param.name
        },
        inputContent() {
            alert(this.$refs.pond.getFile().file)
            let headers = {
                'authorization': 'JWT fefege..',
                'Accept' : 'application/json',
                'Content-Type': 'application/json'
            }
            let data={
                boardImgFile : this.$refs.pond.getFile().file,
                boardImgName: this.$refs.pond.getFile().filename,
                carCode: '0',
                carName : this.carName,
                boardContent : this.content,
                user : this.$store.state.user,
                boardDate: ''
            }
            console.log(`${this.boardImgName}`);
            axios.post(`${url}/writeContent`, data , headers)
                .then((res)=>{
                    alert(res.data)
                })
                .catch(()=>{})
            // FilePond instance methods are available on `this.$refs.pond`
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
  height: 350px;
  position: relative;
  margin: 0 auto;
  float: left;
    text-align: center;
}
.checkbox {
    width: 350px;
    padding: 25px;
    height: 260px;
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
.portfolio-modal .modal-content img {
  margin-bottom: 30px;
}
img {
  vertical-align: middle;
  border-style: none;
}
.portfolio-modal .modal-content p {
  margin-bottom: 30px;
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




.searchcont1 li .btnl {
    margin: 10px;
    float: left;
    background: url(https://www.kcar.com/resources/images/index/bar.jpg) bottom right no-repeat;
    height: 45px;
    display: inline-block;
}
.searchcont1 li span.btnl a {
    text-align: center;
    width: 75px;
    height: 43px;
    display: inline-block;
    line-height: 45px;
    border: 1px #ddd solid;
    font-size: 13px;
    background: #2d2d38;
    color: #fff;
}
.searchcont1 li span.btnl a:hover,
.searchcont1 li .btnl a.on,
.searchcont1 li .btnl a.on:hover {
    background: #2d2d38;
    color: #fff;
}
.searchr1, .searchr2, .searchr3 {
    margin: 10px;
}
.selectric-wrapper {
    position: relative;
    cursor: pointer;
}
.selectric-hide-select {
    position: relative;
    overflow: hidden;
    width: 0;
    height: 0;
}
.selectric {
    width: 100%;
    border: 1px solid #ddd;
    border-radius: 0px;
    background: #F8F8F8;
    position: relative;
    overflow: hidden;
}
.selectric-items {
    display: none;
    position: absolute;
    top: 100%;
    left: 0;
    background: #fff;
    border: 1px solid #c4c4c4;
    z-index: -1;
    box-shadow: 0 0 10px -6px;
}
.selectric-input {
    position: absolute !important;
    top: 0 !important;
    left: 0 !important;
    overflow: hidden !important;
    clip: rect(0, 0, 0, 0) !important;
    margin: 0 !important;
    padding: 0 !important;
    width: 1px !important;
    height: 1px !important;
    outline: none !important;
    border: none !important;
    *font: 0/0 a !important;
    background: none !important;
}
.selectric-hide-select select {
    position: absolute;
    left: -100%;
}
.mc_search .search3box .searchcont1 li span.btnl a:hover,
.mc_search .search3box .searchcont1 li .btnl a.on, .mc_search .search3box .searchcont1 li .btnl a.on:hover {
    background: #2d2d38;
    color: #fff;
}
</style>