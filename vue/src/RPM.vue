<template>
    <div id="main_grid">
        <link rel="stylesheet" href="https://www.kcar.com/resources/css/re_import.css?v=20191230094250">
        <link rel="stylesheet" href="https://www.kcar.com/resources/css/plugin/selectric.css?v=20191230094250">
        <link rel="stylesheet" type="text/css" href="https://www.kcar.com/resources/css/plugin/ion.rangeSlider.css">
        <link rel="stylesheet" type="text/css" href="https://www.kcar.com/resources/css/plugin/ion.rangeSlider.skinHTML5.css">
        <link rel="stylesheet" href="https://www.kcar.com/resources/css/plugin/uniform.css">
        <link rel="stylesheet" href="https://www.kcar.com/resources/css/plugin/jquery.scrollbar.css">
        <link rel="stylesheet" type="text/css" href="http://static.danawa.com/new/recss/auto/common.css?v=200108090126">
        <link rel="stylesheet" type="text/css" href="http://static.danawa.com/new/recss/auto/home.css?v=200108090126">
        <link rel="stylesheet" type="text/css" href="http://static.danawa.com/new/recss/auto/theme.css?v=200108090126">
        <link rel="stylesheet" type="text/css" href="http://static.danawa.com/new/recss/auto/auto.css?v=200108090126">
        <link rel="stylesheet" type="text/css" href="http://static.danawa.com/new/recss/auto/window.css?v=200108090126">
        <link rel="stylesheet" type="text/css" href="http://static.danawa.com/new/recss/auto/compare.css?v=200103163154">
        <div id="main_image" style="width: 100%; height: 100px; line-height: 100px; text-align: center">
            <img style="width: 100%; max-width: 760px; vertical-align: middle" src="@/assets/image/rpmlogoblack.png" alt="">
        </div>
                <nav>
                    <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse justify-content-start" id="navbarSupportedContent">
                        <ul class="navbar-nav">
                            <li class="nav-item">
                              <Slide noOverlay ableOutsideClick :crossIcon="false">
                                <router-link to="/">HOME</router-link>
                                <router-link to="/login">로그인</router-link>
                                <router-link to="/join">회원가입</router-link>
                                <router-link to="/searchmain">검색창</router-link>
                                <router-link to="/product">제품</router-link>
                                <router-link to="/mypage">마이페이지</router-link>
                                <router-link to="/seencar">최근 본 차량(비교함)</router-link>
                                <router-link to="/mapList">주유소 지도</router-link>
                                <router-link to="/buycar">자동차구매 </router-link>
                                <router-link to="/buycarSelectGoods">자동차구매1 </router-link>
                                <router-link to="/buycarInsertContractorInfomation">자동차구매2 </router-link>
                                <router-link to="/buycarInsertContractorInfomation">자동차구매3 </router-link>
                                <router-link to="/recommendHome">딜러에게 추천받기</router-link>
                                <router-link to="/companyHome">ADMIN </router-link>
                                <router-link to="/sns">SNS(REVIEW) </router-link>
                                <router-link to="/sns">차계부 </router-link>


                              </Slide >
                            </li>
<!--                             <li class="nav-item">
                                <a class="nav-link" href="#section1">Section 1</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#section2">Section 2</a>
                            </li>
                            <li class="nav-item">
                                <a class="nav-link" href="#section3">Section 3</a>
                            </li> -->
                        </ul>
                    </div>
                </nav>
        <div id = "main_layout">
            <router-view></router-view>
        </div>
    </div>
</template>

<script>
import {Slide} from 'vue-burger-menu'
export default {
  name: 'app',
  components: {
    Slide
  }
}
</script>
<style>

.main_grid{
    display: grid;
    grid-template-rows: 5% 95%;
}
.bm-burger-button {
    position: fixed !important;
    width: 36px;
    height: 30px;
    left: 36px;
    top: 36px;
    cursor: pointer;
}
.bm-burger-bars {
    background-color: #373a47;
}
.line-style {
    position: absolute;
    height: 20%;
    left: 0;
    right: 0;
}
.cross-style {
    position: absolute;
    top: 12px;
    right: 2px;
    cursor: pointer;
}
.bm-cross {
    background: #bdc3c7;
}
.bm-cross-button {
    height: 24px;
    width: 24px;
}
.bm-menu {
    height: 100%; /* 100% Full-height */
    width: 0; /* 0 width - change this with JavaScript */
    position: fixed; /* Stay in place */
    z-index: 1000; /* Stay on top */
    top: 0;
    left: 0;
    background-color: rgb(0, 31, 65); /* Black*/
    overflow-x: hidden; /* Disable horizontal scroll */
    /*padding-top: 60px; !* Place content 60px from the top *!*/
    font-family:"sans-serif";


}

.bm-menu a{
    color : #abb3bb;
    text-decoration:none !important;

}
.bm-menu a:hover{ color: #cccccc !important;}

.bm-overlay {
    background: rgba(0, 0, 0, 0.3);
}
.bm-item-list {
    color: #b8b7ad;
    margin-left: 10%;
    font-size: 20px;
}
.bm-item-list > * {
    display: flex;
    text-decoration: none;
    padding: 0.7em;
}
.bm-item-list > * > span {
    margin-left: 10px;
    font-weight: 700;
    color: white;
}

.about{
  margin : 0px auto;
}

 html, body {
   height : 100% !important;
}

 #main_layout{
     padding-top: 50px;
 }

#about{
  margin-top:50px;
}
.text-light{
  margin-top:50px;
}
nav {
  min-height: 5rem;
}

nav.fixed-top {
  padding: 0.5rem;
}
nav.bg-primary li a {
  color: #fff !important;
}
nav li a.active {
  padding: .2rem .4rem;
  color: #0275d8 !important;
  background-color: #fff;
  border-radius: .2rem;
  margin: .3rem 0.6rem;
}
nav .navbar-collapse.collapsing ul,
nav .navbar-collapse.show ul {
  margin-top: 3rem;
}
nav .navbar-collapse.collapsing li a,
nav .navbar-collapse.show li a  {
  padding: 0.5rem;
}
nav .navbar-collapse.show li a.active  {
  margin: 0;
}
.navbar-toggler {
  border: 0;
}
.bg-primary {
    color: #fff;
    background-color: black !important;
}
.container{
        margin: 0 200px;
    }


    
</style>