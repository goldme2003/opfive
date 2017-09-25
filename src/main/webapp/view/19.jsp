<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en" class="fixed">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <title>Zen frontENd</title>
    <link rel="apple-touch-icon" sizes="120x120" href="resources/favicon/apple-icon-120x120.png">
    <link rel="icon" type="image/png" sizes="192x192" href="resources/favicon/android-icon-192x192.png">
    <link rel="icon" type="image/png" sizes="32x32" href="resources/favicon/favicon-32x32.png">
    <link rel="icon" type="image/png" sizes="16x16" href="resources/favicon/favicon-16x16.png">
    <link rel="stylesheet" type="text/css" href="resources/stylesheets/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="resources/stylesheets/css/font-awesome.css">
    <link rel="stylesheet" href="resources/vendor/animate.css/animate.css">
    <link rel="stylesheet" href="resources/vendor/toastr/toastr.min.css">
    <link rel="stylesheet" href="resources/vendor/magnific-popup/magnific-popup.css">
    <link rel="stylesheet" href="resources/stylesheets/css/style.css">
</head>

<body>

            
            
            
            
     
        <div class="content">
            <div class="content-header">
                <div class="leftside-content-header">
                    <ul class="breadcrumbs">
                        <li><i class="fa fa-home" aria-hidden="true"></i><a href="#">外观</a></li>
                    </ul>
                </div>
            </div>
            <div class="row animated fadeInUp">
                <div class="col-sm-12 col-lg-9">
                    <div class="row">
<!--                         <div class="col-sm-12 col-md-4">
                            <div class="panel b-primary bt-md">
                                <div class="panel-content p-none">
                                    <div class="widget-list list-to-do">
                                        <h4 class="list-title">To do List</h4>
                                        <button class="add-item btn btn-o btn-primary btn-xs"><i class="fa fa-plus"></i></button>
                                        <ul>
                                            <li>
                                                <div class="checkbox-custom checkbox-primary">
                                                    <input type="checkbox" id="check-h1" value="option1">
                                                    <label for="check-h1">Accusantium eveniet ipsam neque</label>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="checkbox-custom checkbox-primary">
                                                    <input type="checkbox" id="check-h2" value="option1" checked>
                                                    <label for="check-h2">Lorem ipsum dolor sit</label>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="checkbox-custom checkbox-primary">
                                                    <input type="checkbox" id="check-h3" value="option1">
                                                    <label for="check-h3">Dolor eligendi in ipsum sapiente</label>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="checkbox-custom checkbox-primary">
                                                    <input type="checkbox" id="check-h4" value="option1">
                                                    <label for="check-h4">Natus recusandae vel</label>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="checkbox-custom checkbox-primary">
                                                    <input type="checkbox" id="check-h5" value="option1">
                                                    <label for="check-h5">Adipisci amet officia tempore ut</label>
                                                </div>
                                            </li>
                                            <li>
                                                <div class="checkbox-custom checkbox-primary">
                                                    <input type="checkbox" id="check-h6" value="option1">
                                                    <label for="check-h6">Possimus repellat repellendus</label>
                                                </div>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div> -->
                        <div class="col-sm-12 col-md-12">
                            <div class="tabs mt-none">
                                <ul class="nav nav-tabs nav-justified">
                                    <li class="active"><a href="#home" data-toggle="tab">Employees</a></li>
                                    <li><a href="#profile" data-toggle="tab">Sells</a></li>
                                    <li><a href="#messages" data-toggle="tab">Messages</a></li>
                                    <li><a href="#settings" data-toggle="tab"><i class="fa fa-cog" aria-hidden="true"></i> Settings</a></li>
                                </ul>
                                <div class="tab-content">
                                    <div class="tab-pane fade in active" id="home">
                                        <div class="table-responsive">
                                            <table class="table table-striped table-hover">
                                                <thead>
                                                <tr>
                                                    <th>Name</th>
                                                    <th>Position</th>
                                                    <th>Office</th>
                                                    <th>Age</th>
                                                </tr>
                                                </thead>
                                                <tbody>
                                                <tr>
                                                    <td>Olivia Liang</td>
                                                    <td>Support Engineer</td>
                                                    <td>Singapore</td>
                                                    <td>34</td>
                                                </tr>
                                                <tr>
                                                    <td>Bruno Nash</td>
                                                    <td>Software Engineer</td>
                                                    <td>London</td>
                                                    <td>38</td>
                                                </tr>
                                                <tr>
                                                    <td>Sakura Yamamoto</td>
                                                    <td>Support Engineer</td>
                                                    <td>Tokyo</td>
                                                    <td>37</td>
                                                </tr>
                                                <tr>
                                                    <td>Michael Bruce</td>
                                                    <td>Javascript Developer</td>
                                                    <td>Singapore</td>
                                                    <td>29</td>
                                                </tr>
                                                <tr>
                                                    <td>Donna Snider</td>
                                                    <td>Customer Support</td>
                                                    <td>New York</td>
                                                    <td>27</td>
                                                </tr>
                                                </tbody>
                                            </table>
                                        </div>
                                    </div>
                                    <div class="tab-pane fade" id="profile">
                                        <p><b>Profile</b> content</p>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vitae tellus tincidunt, mattis odio eu, accumsan quam. Duis ultricies, erat nec suscipit mattis, risus est efficitur enim, sed finibus lacus nisi et mauris. Ut sed accumsan ipsum. Aliquam vel nibh et turpis euismod porttitor. In diam odio, cursus eget faucibus quis, efficitur id erat. Aliquam euismod in justo sit amet ornare. Quisque eu fringilla libero. Donec iaculis sit amet nibh non laoreet.
                                        </p>
                                    </div>
                                    <div class="tab-pane fade" id="messages">
                                        <p><b>Message</b> content</p>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vitae tellus tincidunt, mattis odio eu, accumsan quam. Duis ultricies, erat nec suscipit mattis, risus est efficitur enim, sed finibus lacus nisi et mauris. Ut sed accumsan ipsum. Aliquam vel nibh et turpis euismod porttitor. In diam odio, cursus eget faucibus quis, efficitur id erat. Aliquam euismod in justo sit amet ornare. Quisque eu fringilla libero. Donec iaculis sit amet nibh non laoreet.
                                        </p>
                                    </div>
                                    <div class="tab-pane fade" id="settings">
                                        <p><b>Settings</b> content</p>
                                        <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas vitae tellus tincidunt, mattis odio eu, accumsan quam. Duis ultricies, erat nec suscipit mattis, risus est efficitur enim, sed finibus lacus nisi et mauris. Ut sed accumsan ipsum. Aliquam vel nibh et turpis euismod porttitor. In diam odio, cursus eget faucibus quis, efficitur id erat. Aliquam euismod in justo sit amet ornare. Quisque eu fringilla libero. Donec iaculis sit amet nibh non laoreet.
                                        </p>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
  <!--                    <div class="row">
                        <div class="col-sm-12 col-md-4">
                            <div class="panel">
                                <div class="panel-content">
                                    <h5><b>Lorem ipsum dolor sit</b></h5>
                                    <p>Dolor sit amet <span class="highlight">consectetur</span> erte</p>
                                    <canvas id="pie-chart" width="400" height="260"></canvas>
                                </div>
                            </div>
                        </div>
                       <div class="col-sm-12 col-md-8">
                            <div class=" gallery-wrap">
                                <div class="row">
                                    <div class="col-xs-6 col-md-3">
                                        <a href="resources/images/helsinki-lg.jpg" title="By John Doe">
                                            <img alt="first photo" src="resources/images/helsinki.jpg" class="img-responsive">
                                        </a>
                                    </div>
                                    <div class="col-xs-6 col-md-3">
                                        <a href="resources/images/helsinki-lg.jpg" title="By John Doe">
                                            <img alt="second photo" src="resources/images/helsinki.jpg" class="img-responsive">
                                        </a>
                                    </div>
                                    <div class="col-xs-6 col-md-3">
                                        <a href="resources/images/helsinki-lg.jpg" title="By John Doe">
                                            <img alt="third photo" src="resources/images/helsinki.jpg" class="img-responsive">
                                        </a>
                                    </div>
                                    <div class="col-xs-6 col-md-3">
                                        <a href="resources/images/helsinki-lg.jpg" title="By John Doe">
                                            <img alt="fourth photo" src="resources/images/helsinki.jpg" class="img-responsive">
                                        </a>
                                    </div>
                                    <div class="col-xs-6 col-md-3">
                                        <a href="resources/images/helsinki-lg.jpg" title="By John Doe">
                                            <img alt="fifth photo" src="resources/images/helsinki.jpg" class="img-responsive">
                                        </a>
                                    </div>
                                    <div class="col-xs-6 col-md-3">
                                        <a href="resources/images/helsinki-lg.jpg" title="By John Doe">
                                            <img alt="sixth photo" src="resources/images/helsinki.jpg" class="img-responsive">
                                        </a>
                                    </div>
                                    <div class="col-xs-6 col-md-3">
                                        <a href="resources/images/helsinki-lg.jpg" title="By John Doe">
                                            <img alt="seventh photo" src="resources/images/helsinki.jpg" class="img-responsive">
                                        </a>
                                    </div>
                                    <div class="col-xs-6 col-md-3">
                                        <a href="resources/images/helsinki-lg.jpg" title="By John Doe">
                                            <img alt="eighth photo" src="resources/images/helsinki.jpg" class="img-responsive">
                                        </a>
                                    </div>
                                </div>
                            </div>
                        </div> 
                    </div>  -->
                </div>

            </div>
        </div>
        <div class="right-sidebar">
            <div class="right-sidebar-toggle" data-toggle-class="right-sidebar-opened" data-target="html">
                <i class="fa fa-cog fa-spin" aria-hidden="true"></i>
            </div>
<!--             <div id="right-nav" class="nano">
                <div class="nano-content">
                    <div class="template-settings">
                        <h4 class="text-center">Template Settings</h4>
                        <ul class="toggle-settings pv-xlg">
                            <li>
                                <h6 class="text">Header fixed</h6>
                                <label class="switch">
                                    <input id="header-fixed" type="checkbox" checked>
                                    <span class="slider round"></span>
                                </label>
                            </li>
                            <li>
                                <h6 class="text">Left sidebar fixed</h6>
                                <label class="switch">
                                    <input id="left-sidebar-fixed" type="checkbox" checked>
                                    <span class="slider round"></span>
                                </label>
                            </li>
                            <li>
                                <h6 class="text">Left sidebar collapsed</h6>
                                <label class="switch">
                                    <input id="left-sidebar-collapsed" type="checkbox">
                                    <span class="slider round"></span>
                                </label>
                            </li>
                            <li>
                                <h6 class="text">Content header fixed</h6>
                                <label class="switch">
                                    <input id="content-header-fixed" type="checkbox" checked>
                                    <span class="slider round"></span>
                                </label>
                            </li>
                        </ul>
                        <h4 class="text-center">Template Colors</h4>
                        <ul class="toggle-colors">
                            <li>
                                <a href="index.html" class="on-click"> <img alt="Helsinki-green" src="resources/images/helsinki-green.png" /></a>
                            </li>
                            <li>
                                <a href="../helsinki-light/index.html" class="on-click"> <img alt="Helsinki-light" src="resources/images/helsinki-light.png" /></a>
                            </li>
                            <li>
                                <a href="../helsinki-blue/index.html" class="on-click"> <img alt="Helsinki-blue" src="resources/images/helsinki-blue.png" /></a>
                            </li>
                            <li>
                                <a href="../helsinki-red/index.html" class="on-click"> <img alt="Helsinki-red" src="resources/images/helsinki-red.png" /></a>
                            </li>
                        </ul>
                    </div>
                </div>
            </div> -->
        </div>
        <!-- <a href="#" class="scroll-to-top"><i class="fa fa-angle-double-up"></i></a> -->
    </div>
</div>
<script src="resources/jQuery/jquery-3.2.1.js"></script>
<script src="resources/vendor/bootstrap/js/bootstrap.min.js"></script>
<script src="resources/javascripts/angular.min.js"></script>
<script src="resources/vendor/nano-scroller/nano-scroller.js"></script>
<script src="resources/javascripts/template-script.min.js"></script>
<script src="resources/javascripts/template-init.min.js"></script>
<!-- <script src="resources/vendor/toastr/toastr.min.js"></script> -->
<script src="resources/vendor/chart-js/chart.min.js"></script>
<script src="resources/vendor/magnific-popup/jquery.magnific-popup.min.js"></script>
<!-- <script src="resources/javascripts/examples/dashboard.js"></script> -->
</body>

</html>
