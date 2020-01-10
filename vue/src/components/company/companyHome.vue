<template>
<div id =tempNav>


  <div id ="headerNew">
  <div class="gnb_area">
    <div class="inner">
      <!-- GNB -->
      <div id="nav" class="nav">
        <ul id="gnb" class="gnb">
          <li class="nth-child1 firstMenuGroup" >
            <div class="wrap_box sub_wrapper">
              <a href="/cmain"><span class="text">main</span></a>
            </div>
          </li>
          <li class="nth-child2 firstMenuGroup" >
            <div class="wrap_box sub_wrapper">
              <a href="/customerList"><span class="text">손님 목록</span></a>
            </div>
          </li>
          <li class="nth-child3  firstMenuGroup" >
            <div class="wrap_box">
              <a href="/carList"><span class="text">보유차량</span></a>
            </div>
          </li>
          <li class="nth-child4 firstMenuGroup" >
            <div class="wrap_box sub_wrapper">
              <a href="/chart"><span class="text">차트 예</span></a>
            </div>
          </li>
          <!--<li class="nth-child5 firstMenuGroup">
            <div class="wrap_box">
              <a href="/rentcar/rentcar_list.do"><span class="text">중고차렌트</span></a>
            </div>
          </li>-->
        </ul>
      </div>

    </div>
  </div>
  </div>
<router-view name="company"></router-view>
</div>
</template>
<style>
    #tempNav{
        padding-top: 50px;

    }
  #gnb{
    padding-left: 250px;

  }
</style>