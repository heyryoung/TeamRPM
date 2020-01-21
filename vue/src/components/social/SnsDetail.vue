<template>
<div class= "snsDetail">
  <link rel="stylesheet" href="https://startbootstrap.com/assets/style-theme.css">
  <link rel="stylesheet" href="https://blackrockdigital.github.io/startbootstrap-agency/css/agency.min.css">
  <link rel="stylesheet" href="https://blackrockdigital.github.io/startbootstrap-agency/vendor/fontawesome-free/css/all.min.css">

<div class="modal-open" style="padding-right: 16.9962px;">
<div class="portfolio-modal modal fade show" id="portfolioModal2" tabindex="-1" style="display: block; padding-right: 16.9962px;">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="close-modal" @click="close" data-dismiss="modal">
          <div class="lr">
            <div class="rl"></div>
          </div>
        </div>
        <div class="container">
          <div class="row">
            <div class="col-lg-8 mx-auto">
              <div class="modal-body">
                <!-- Project Details Go Here -->
                <h2 class="text-uppercase">포르쉐 박스터 718 gts</h2>
                <p class="item-intro text-muted">권혜령</p>
                <img class="img-fluid d-block mx-auto" src="http://global-autonews.com/data/file/ct_097/2038852047_Q8TCdrg7_1.JPG" alt="">
                <p>나 이차 넘나 죠하요 헤헤헤헿 Use this area to describe your project. Lorem ipsum dolor sit amet, consectetur adipisicing elit. Est blanditiis dolorem culpa incidunt minus dignissimos deserunt repellat aperiam quasi sunt officia expedita beatae cupiditate, maiores repudiandae, nostrum, reiciendis facere nemo!</p>
                <ul class="list-inline">
                  <li>작성시간: 2020.01.09 19:02</li>
                  <li>작성자: @hyeryeongee_</li>
                </ul>
                <!--나믜글일때-->
                <div>
                  <a class="btn-like" @click="thumbup" ><i class="far fa-heart fa-2x"></i>{{thumb}}</a>
                  <a class="btn-like" @click="thumbdown" ><i class="fas fa-heart fa-2x"></i>{{thumb}}</a>
                </div>

                <!--내 글일 때-->
                <!--<button class="btn btn-primary" data-dismiss="modal" type="button">
                  <i class="fas fa-pen"></i> 글 수정하기</button>
                <button class="btn btn-primary" data-dismiss="modal" type="button">
                  <i class="far fa-trash-alt"></i> 글 삭제하기</button>-->

                <div>
                  <!--댓글창-->
                </div>
              </div>
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
  export default {
    data(){
      return{
        thumb:0 //엑시오스로 이 글에 참조된 thumb 테이블 갯수 알아오기.
      }
    },
    methods:{
      close(){

      },
      thumbup(){
        //+1
      },
      thumbdown(){
        //-1
      }
    }
  }

</script>
<style scoped>
.snsDetail {
}
.btn-primary {
	margin: auto 10px;
}
  .btn-like{
    text-decoration-color : red;
  }
.modal-open .modal {
  overflow-x: hidden;
  overflow-y: -moz-scrollbars-none;
}
</style>