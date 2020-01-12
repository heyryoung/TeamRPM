<template>

    <div class="mycarpage">
        <link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://blackrockdigital.github.io/startbootstrap-agency/css/agency.min.css">
        <link type="application/atom+xml" rel="alternate" href="https://startbootstrap.com/feed.xml" title="startbootstrap">
        <div class="mycarInfo">
            <div class="col-md-4 col-sm-6 portfolio-item">
                <figure class="portfolio-link" data-toggle="modal" href="#">
                    <img class="img-fluid" src="https://blackrockdigital.github.io/startbootstrap-agency/img/portfolio/01-thumbnail.jpg" alt="">
                    <figcaption class="portfolio-hover">
                        <div class="portfolio-hover-content">
                            <h3>차종: 쉐보레<br/>연식: 2019년 3월</h3>
                        </div>
                    </figcaption>
                </figure>
            </div>

        </div>
        <div class="row" >
            <div class="changeInfo">
                <h2>주행거리</h2>
                <h2>연비</h2>
                <h2>마지막 정비일</h2>
            </div>
            <div class="col-md-6 col-lg-3">
                <div class="widget-small primary coloured-icon"><i class="icon fa fa-users fa-3x"></i>
                    <div class="info">
                        <h4>Users</h4>
                        <div class="embed-responsive embed-responsive-16by9">
                            <p><b>25</b></p>
                        </div>
                    </div>
                </div>
            </div>
            <div class="col-md-6 col-lg-3">
                <div class="widget-small info coloured-icon"><i class="icon fa fa-thumbs-o-up fa-3x"></i>
                    <div class="info">
                        <h4>Likes</h4>
                        <p><b>25</b></p>
                    </div>
                </div>
            </div>
            <div class="col-md-6 col-lg-3">
                <div class="widget-small warning coloured-icon"><i class="icon fa fa-files-o fa-3x"></i>
                    <div class="info">
                        <h4>Uploades</h4>
                        <p><b>10</b></p>
                    </div>
                </div>
            </div>
            <div class="col-md-6 col-lg-3">
                <div class="widget-small danger coloured-icon"><i class="icon fa fa-star fa-3x"></i>
                    <div class="info">
                        <h4>Stars</h4>
                        <p><b>500</b></p>
                    </div>
                </div>
            </div>
        </div>
        <div class="recordRefuel">
            <div class="col-md-6">
                <div class="tile">
                    <table class="table">
                        <thead>
                        <tr>
                            <th>#</th>
                            <th>First Name</th>
                            <th>Last Name</th>
                            <th>Username</th>
                        </tr>
                        </thead>
                        <tbody>
                        <tr>
                            <td>1</td>
                            <td>Mark</td>
                            <td>Otto</td>
                            <td>@mdo</td>
                        </tr>
                        <tr>
                            <td>2</td>
                            <td>Jacob</td>
                            <td>Thornton</td>
                            <td>@fat</td>
                        </tr>
                        <tr>
                            <td>3</td>
                            <td>Larry</td>
                            <td>the Bird</td>
                            <td>@twitter</td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>

        </div>
       <!-- <div></div>-->
    </div>

</template>

<script>

    export default {
        name: "MyCarPage"
    }
</script>

<style scoped>
    .mycarpage{
        margin: auto;
        width: 1000px;
        height: 100%;
    }
    .mycarInfo{
        height: 500px;

    }
    .row {
        display: -webkit-box;
        display: -ms-flexbox;
        display: flex;
        -ms-flex-wrap: wrap;
        flex-wrap: wrap;
        margin-right: -15px;
        margin-left: -15px;
    }
    .mycarpage{
        height: 100%;
        display: grid;
        grid-template-columns: 50% 50%;
    }
    .row{
        height: 100%;
        display: grid;
        grid-template-columns: 50% 50%;
    }
    .changeInfo, .recordRefuel{
        grid-column-start: 1;
        grid-column-end: 3;
        text-align: right;
    }
    a {
        color: rgba(0, 11, 64, 0.54);
        text-decoration: none;
        background-color: transparent;
        cursor: pointer;
    }
    .portfolio-item {
        right: 0;
        margin: 0 0 15px;
    }
    .portfolio-link {
        position: relative;
        display: block;
        max-width: 400px;
        margin: 0 auto;
        cursor: pointer;
    }
    .portfolio-link img {
        position: absolute;
        height: 500px;
        width: 400px;
    }
    .portfolio-hover {
        position: absolute;
        width: 100%;
        height: 100%;
        transition: all ease .5s;
        background: rgb(198, 223, 255);
    }
    .portfolio-hover-content {
        font-size: 20px;
        position: absolute;
        top: 50%;
        width: 100%;
        height: 20px;
        margin-top: -12px;
        text-align: center;
        color: #fff;
    }
    .portfolio-hover-content h3{
         position: absolute;
         display: block;
         max-width: 400px;
         margin: 0 auto;
         cursor: pointer;
     }

    .col-lg-3, .col-md-4, .col-md-6, .col-sm-6{
        position: relative;
        width: 100%;
        padding-right: 15px;
        padding-left: 15px;
    }
    .widget-small.primary.coloured-icon {
        background-color: #fff;
        color: #2a2a2a;
    }
    .widget-small.primary {
        background-color: #009688;
    }
    .widget-small {
        display: -webkit-box;
        display: -ms-flexbox;
        display: flex;
        border-radius: 4px;
        color: #FFF;
        margin-bottom: 30px;
        -webkit-box-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);
        box-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);
    }
    .widget-small.primary.coloured-icon .icon {
        background-color: #009688;
        color: #fff;
    }
    .widget-small.info.coloured-icon .icon {
        background-color: #17a2b8;
        color: #fff;
    }
    .widget-small.warning.coloured-icon .icon {
        background-color: #ffc107;
        color: #fff;
    }
    .widget-small.danger.coloured-icon .icon {
        background-color: #dc3545;
        color: #fff;
    }
    .widget-small .icon {
        display: -webkit-box;
        display: -ms-flexbox;
        display: flex;
        min-width: 85px;
        -webkit-box-align: center;
        -ms-flex-align: center;
        align-items: center;
        -webkit-box-pack: center;
        -ms-flex-pack: center;
        justify-content: center;
        padding: 20px;
        background-color: rgba(0, 0, 0, 0.2);
        border-radius: 4px 0 0 4px;
        font-size: 2.5rem;
    }
    .fa-3x {
        font-size: 3em;
    }
    .fa {
        display: inline-block;
        font: normal normal normal 14px/1 FontAwesome;
        font-size: inherit;
        text-rendering: auto;
        -webkit-font-smoothing: antialiased;
        -moz-osx-font-smoothing: grayscale;
    }
    .widget-small .info {
        -webkit-box-flex: 1;
        -ms-flex: 1;
        flex: 1;
        padding: 0 20px;
        -ms-flex-item-align: center;
        align-self: center;
    }
    .widget-small.primary.coloured-icon {
        background-color: #fff;
        color: #2a2a2a;
    }
    .widget-small {
        display: -webkit-box;
        display: -ms-flexbox;
        display: flex;
        border-radius: 4px;
        color: #FFF;
        margin-bottom: 30px;
        -webkit-box-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);
        box-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);
    }
    .widget-small .info p {
        margin: 0;
        font-size: 16px;
    }
    .widget-small.primary.coloured-icon {
        background-color: #fff;
        color: #2a2a2a;
    }
    .widget-small {
        display: -webkit-box;
        display: -ms-flexbox;
        display: flex;
        border-radius: 4px;
        color: #FFF;
        margin-bottom: 30px;
        -webkit-box-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);
        box-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);
    }
    .embed-responsive {
        position: relative;
        display: block;
        width: 100%;
        padding: 0;
        overflow: hidden;
    }
     .embed-responsive iframe, .embed-responsive embed, .embed-responsive object, .embed-responsive video {
        position: absolute;
        top: 0;
        bottom: 0;
        left: 0;
        width: 100%;
        height: 100%;
        border: 0;
    }
    .tile {
        position: relative;
        background: #ffffff;
        border-radius: 3px;
        padding: 20px;
        -webkit-box-shadow: 0 2px 2px 0 rgba(0, 0, 0, 0.14), 0 1px 5px 0 rgba(0, 0, 0, 0.12), 0 3px 1px -2px rgba(0, 0, 0, 0.2);
        box-shadow: 0 2px 2px 0 rgba(0, 0, 0, 0.14), 0 1px 5px 0 rgba(0, 0, 0, 0.12), 0 3px 1px -2px rgba(0, 0, 0, 0.2);
        margin-bottom: 30px;
        -webkit-transition: all 0.3s ease-in-out;
        -o-transition: all 0.3s ease-in-out;
        transition: all 0.3s ease-in-out;
    }
    .table {
        width: 100%;
        margin-bottom: 1rem;
        color: #212529;
    }
    table {
        border-collapse: collapse;
    }

</style>