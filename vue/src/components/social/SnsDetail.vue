<template>
<div class= "snsDetail">
  <link rel="stylesheet" href="https://startbootstrap.com/assets/style-theme.css">
  <link rel="stylesheet" href="https://blackrockdigital.github.io/startbootstrap-agency/css/agency.min.css">
  <link rel="stylesheet" href="https://blackrockdigital.github.io/startbootstrap-agency/vendor/fontawesome-free/css/all.min.css">

<div class="portfolio-modal modal fade show" id="portfolioModal2" tabindex="-1" style="overflow: scroll; display: block; padding-right: 16.9962px;">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="close-modal" @click="gotoList" data-dismiss="modal">
          뒤로가기
        </div>
        <div class="container">
          <div class="row">
            <div class="col-lg-8 mx-auto">
              <div class="modal-body">
                <!-- Project Details Go Here -->
                <h2 class="text-uppercase">{{board.carName}}</h2>
                <p class="item-intro text-muted">{{board.userName}}</p>
                <img class="img-fluid d-block mx-auto" :src="board.boardImg" alt="">
                <p>{{board.boardContent}}</p>
                <ul class="list-inline">
                  <li>작성시간: {{board.boardDate}}</li>
                  <li>작성자: @{{board.userid}}</li>
                </ul>
                <!--thumb-->
              <!--  <div>
                  <a class="btn-like" @click="thumbup" v-if="empty"><i class="far fa-heart fa-2x"></i> {{thumb}}</a>
                  <a class="btn-like" @click="thumbdown" v-if="full"><i class="fas fa-heart fa-2x"></i>{{thumb}}</a>
                </div>-->
                <div v-if="myContent">
                  <button class="btn btn-primary" @click="goModify" data-dismiss="modal" type="button">
                  <i class="fas fa-pen"></i> 글 수정하기</button>
                <button class="btn btn-primary" @click="deleteBoard" data-dismiss="modal" type="button">
                  <i class="far fa-trash-alt"></i> 글 삭제하기</button>
                  </div>
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
</template>
<script>
  import axios from "axios"
  export default {
    data(){
      return{
        board:'',
        boardSeq: ''
        //thumb: "  "+0, //엑시오스로 이 글에 참조된 thumb 테이블 갯수 알아오기.
        /*empty:true,
        full:false,*/
        //writer : {},
      }
    },
    created(){
      this.boardSeq = localStorage.getItem('storedData')
      alert(this.boardSeq)
      axios.get(`http://localhost:8080/loadBoard/${this.boardSeq}`)
      .then(res=>{
        this.board = res.data
        console.log(this.board)
      })
      .catch(()=>{
        alert('axios error')
      })
    },
    computed:{
      myContent(){
        return true
       /* if(this.writer.userid === this.$store.state.user.user.userid){
          return true
        }else{
          return false
        }*/
      }
    },
    methods:{
      gotoList(){
        this.$router.push({path: '/sns'})
      },
      thumbup(){
        //+1
      },
      thumbdown(){
        //-1
      },
      goModify(){
        localStorage.setItem('boardSeq', this.boardSeq)
        this.$router.push({path: '/snsmodify'})
      },
      deleteBoard(){

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
.fa-heart:before{
  color : rgba(232, 25, 25, 0.94);
}
h2 {
  color: #0d124f;
}
</style>