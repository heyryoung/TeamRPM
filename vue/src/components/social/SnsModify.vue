<template>
<div class= "snsDetail">
<link rel="stylesheet" href="https://blackrockdigital.github.io/startbootstrap-agency/css/agency.min.css">
<link rel="stylesheet" href="https://blackrockdigital.github.io/startbootstrap-agency/vendor/scss/_reboot.scss">
<link rel="stylesheet" href="https://blackrockdigital.github.io/startbootstrap-agency/vendor/fontawesome-free/css/all.min.css">
<link rel="stylesheet" href="https://blackrockdigital.github.io/startbootstrap-agency/vendor/scss/_modal.scss">
<link rel="stylesheet" href="https://blackrockdigital.github.io/startbootstrap-agency/vendor/scss/utilities/_spacing.scss">
<link rel="stylesheet" href="https://blackrockdigital.github.io/startbootstrap-agency/vendor/scss/mixins/_transition.scss">
<link rel="stylesheet" href="https://blackrockdigital.github.io/startbootstrap-agency/vendor/scss/mixins/_grid.scss">
<link rel="stylesheet" href="https://blackrockdigital.github.io/startbootstrap-agency/vendor/scss/mixins/_grid-framework.scss">
<link rel="stylesheet" href="https://blackrockdigital.github.io/startbootstrap-agency/vendor/scss/mixins/_image.scss">
<link type="application/atom+xml" rel="alternate" href="https://startbootstrap.com/feed.xml" title="startbootstrap">

<div class="portfolio-modal modal fade show"  tabindex="-1" role="dialog" style="display: block; padding-right: 16.9962px;" aria-modal="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="close-modal" data-dismiss="modal">
          <div class="lr">
            <div class="rl"></div>
          </div>
        </div>
        <div class="container">
          <div class="row">
            <div class="col-lg-8 mx-auto">
              <div class="modal-body">
                <!-- Project Details Go Here -->
                <h2 class="text-uppercase">{{contentTitle}}</h2>
                <p class="item-intro text-muted">{{userName}}</p>
                <div class="dropbox">
                  <input type="file" ref="photoimage" class="img-fluid d-block mx-auto" @change="upload($event.target.name, $event.target.files)" @drop="upload($event.target.name, $event.target.files)"  alt="">
                  <h3>파일을 드래그 해주세요.</h3>
                </div>
                <input type="text" class="img-fluid d-block mx-auto" v-model="content">
                <p>{{this.content}}</p>
                <ul class="list-inline">
                  <li>작성시간: {{this.contentDate}}</li>
                  <li>작성자: @{{this.contentUserid}}</li>
                </ul>

              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</div>
</template>
<script>
 // import axios from "axios"
  export default{
    name: "SnsModify",
    data(){
      return{
        contentTitle:"",
        userName:"",
        content:"",
        contentDate:"",
        contentUserid:"",
      }
    },
    methods:{
      upload(/*name, files*/) {
        /*const formData = new FormData();
        formData.append(name, files[0], files[0].name);
        const url = "http://127.0.0.1:12010/upload/1";
        axios.post(url, formData).then(response => {
          console.log(response);
        })*/
      },

    }

  }
</script>
<style scoped>
.snsDetail {
   overflow:auto;
 }
.dropbox {
  outline: 2px dashed #aaa;
  width: 300px;
  height: 300px;
  position: relative;
  margin: 0 auto;
}
.dropbox > h3{
/*  position: absolute;*/
  font-size: 2em;
  margin: 50px auto;
  left: 0;
  z-index: 2;
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
</style>