<template>
<div class= "snsDetail">
<link rel="stylesheet" href="https://startbootstrap.com/assets/style-theme.css">
<link rel="stylesheet" href="https://blackrockdigital.github.io/startbootstrap-agency/css/agency.min.css">
<link rel="stylesheet" href="https://blackrockdigital.github.io/startbootstrap-agency/vendor/scss/_reboot.scss">
<link rel="stylesheet" href="https://blackrockdigital.github.io/startbootstrap-agency/vendor/fontawesome-free/css/all.min.css">
<link rel="stylesheet" href="https://blackrockdigital.github.io/startbootstrap-agency/vendor/scss/_modal.scss">
<link rel="stylesheet" href="https://blackrockdigital.github.io/startbootstrap-agency/vendor/scss/utilities/_spacing.scss">
<link rel="stylesheet" href="https://blackrockdigital.github.io/startbootstrap-agency/vendor/scss/mixins/_transition.scss">
<link rel="stylesheet" href="https://blackrockdigital.github.io/startbootstrap-agency/vendor/scss/mixins/_grid-framework.scss">
<link rel="stylesheet" href="https://blackrockdigital.github.io/startbootstrap-agency/vendor/scss/mixins/_image.scss">
<link type="application/atom+xml" rel="alternate" href="https://startbootstrap.com/feed.xml" title="startbootstrap">

<section class="bg-light page-section" id="portfolio">
    <div class="container">
      <div class="row">
        <div class="col-lg-12 text-center">
          <h2 class="section-heading text-uppercase">INSTARPM</h2>
          <h3 class="section-subheading text-muted">내 차 자랑하기</h3>
        </div>
        <div class="btn-edit">
        <button class="btn btn-primary" data-dismiss="modal" type="button">
                  <i class="fas fa-edit"></i> 글쓰기</button>
        </div>
      </div>
      <div class="row">
        <div class="col-md-4 col-sm-6 portfolio-item">
          <a class="portfolio-link" data-toggle="modal" href="/snsdetail">
            <div class="portfolio-hover">
              <div class="portfolio-hover-content">
                <i class="fas fa-plus fa-3x"></i>
              </div>
            </div>
            <img class="img-fluid" src="https://blackrockdigital.github.io/startbootstrap-agency/img/portfolio/01-thumbnail.jpg" alt="">
          </a>
          <div class="portfolio-caption">
            <h4>쉐보레(GM대우) 더 넥스트 스파크</h4>
            <p class="text-muted">강성조</p>
              <div>
              <a class="btn-like"><i class="far fa-heart"></i> 2</a> 
              <a class="btn-comment"><i class="far fa-comment"></i> 7</a>
            </div>
          </div>
        </div>
        <div class="col-md-4 col-sm-6 portfolio-item">
          <a class="portfolio-link" data-toggle="modal" href="#portfolioModal2">
            <div class="portfolio-hover">
              <div class="portfolio-hover-content">
                <i class="fas fa-plus fa-3x"></i>
              </div>
            </div>
            <img class="img-fluid" src="https://blackrockdigital.github.io/startbootstrap-agency/img/portfolio/02-thumbnail.jpg" alt="">
          </a>
          <div class="portfolio-caption">
            <h4>기아 K3 노블레스</h4>
            <p class="text-muted">최광진</p>
            <a class="btn-like"><i class="far fa-heart"></i> 107</a> 
            <a class="btn-comment"><i class="far fa-comment"></i>90</a>
          </div>
        </div>
        <div class="col-md-4 col-sm-6 portfolio-item">
          <a class="portfolio-link" data-toggle="modal" href="#portfolioModal3">
            <div class="portfolio-hover">
              <div class="portfolio-hover-content">
                <i class="fas fa-plus fa-3x"></i>
              </div>
            </div>
            <img class="img-fluid" src="https://blackrockdigital.github.io/startbootstrap-agency/img/portfolio/03-thumbnail.jpg" alt="">
          </a>
          <div class="portfolio-caption">
            <h4>쉐보레(GM대우) 더 뉴 트랙스</h4>
            <p class="text-muted">원종석</p>
            <a class="btn-like"><i class="far fa-heart"></i>30</a> 
            <a class="btn-comment"><i class="far fa-comment"></i>101</a>
          </div>
        </div>
        <div class="col-md-4 col-sm-6 portfolio-item">
          <a class="portfolio-link" data-toggle="modal" href="#portfolioModal4">
            <div class="portfolio-hover">
              <div class="portfolio-hover-content">
                <i class="fas fa-plus fa-3x"></i>
              </div>
            </div>
            <img class="img-fluid" src="https://blackrockdigital.github.io/startbootstrap-agency/img/portfolio/04-thumbnail.jpg" alt="">
          </a>
          <div class="portfolio-caption">
            <h4>르노삼성 뉴SM5 플래티넘 LE</h4>
            <p class="text-muted">김예지</p>
            <a class="btn-like"><i class="far fa-heart"></i>1K</a> 
            <a class="btn-comment"><i class="far fa-comment"></i>190</a>
          </div>
        </div>
        <div class="col-md-4 col-sm-6 portfolio-item">
          <a class="portfolio-link" data-toggle="modal" href="#portfolioModal5">
            <div class="portfolio-hover">
              <div class="portfolio-hover-content">
                <i class="fas fa-plus fa-3x"></i>
              </div>
            </div>
            <img class="img-fluid" src="https://blackrockdigital.github.io/startbootstrap-agency/img/portfolio/05-thumbnail.jpg" alt="">
          </a>
          <div class="portfolio-caption">
            <h4>벤츠 E-클래스 W213 E220d 아방가르드</h4>
            <p class="text-muted">박정관</p>
            <a class="btn-like"><i class="far fa-heart"></i>121</a> 
            <a class="btn-comment"><i class="far fa-comment"></i>42</a>
          </div>
        </div>
        <div class="col-md-4 col-sm-6 portfolio-item">
          <a class="portfolio-link" data-toggle="modal" href="#portfolioModal6">
            <div class="portfolio-hover">
              <div class="portfolio-hover-content">
                <i class="fas fa-plus fa-3x"></i>
              </div>
            </div>
            <img class="img-fluid" src="https://blackrockdigital.github.io/startbootstrap-agency/img/portfolio/06-thumbnail.jpg" alt="">
          </a>
          <div class="portfolio-caption">
            <h4>포르쉐 박스터 718 gts</h4>
            <p class="text-muted">권혜령</p>
            <a class="btn-like"><i class="far fa-heart"></i>200</a> 
            <a class="btn-comment"><i class="far fa-comment"></i>109</a>
          </div>
        </div>
      </div>
    </div>
  </section>
</div>
</template>
<script>

</script>
<style scoped>
.btn-edit {
  margin-left: auto;
  margin-bottom: 20px;
}
.btn-like .btn-comment {
  margin: 5px;
  margin-top: 10px;
  color: rgba(33,37,41,.35);
}
</style>