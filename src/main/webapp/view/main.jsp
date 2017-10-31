<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en" class="fixed">

<head>
<meta charset="UTF-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<title>Zen frontENd</title>
<link rel="apple-touch-icon" sizes="120x120"
	href="resources/favicon/apple-icon-120x120.png">
<link rel="icon" type="image/png" sizes="192x192"
	href="resources/favicon/android-icon-192x192.png">
<link rel="icon" type="image/png" sizes="32x32"
	href="resources/favicon/favicon-32x32.png">
<link rel="icon" type="image/png" sizes="16x16"
	href="resources/favicon/favicon-16x16.png">
<link rel="stylesheet" type="text/css"
	href="resources/stylesheets/css/bootstrap.css">
<link rel="stylesheet" type="text/css"
	href="resources/stylesheets/css/font-awesome.css">
<link rel="stylesheet" href="resources/vendor/animate.css/animate.css">
<!-- <link rel="stylesheet" href="resources/vendor/toastr/toastr.min.css"> -->
<link rel="stylesheet"
	href="resources/vendor/magnific-popup/magnific-popup.css">
<link rel="stylesheet" href="resources/stylesheets/css/style.css">
</head>

<body ng-app="itemr">
	<div class="wrap">
		<div class="page-header">
			<div class="leftside-header">
				<div class="logo">
					<a href="index.jsp" class="on-click"> <!-- <img alt="logo" src="resources/images/header-logo.png" /> -->
						<h4 class="color-light">精益化评估系统</h4>
					</a>
				</div>
				<div id="menu-toggle" class="visible-xs toggle-left-sidebar"
					data-toggle-class="left-sidebar-open" data-target="html">
					<i class="fa fa-bars" aria-label="Toggle sidebar"></i>
				</div>
			</div>
			<div class="rightside-header">
				<div class="header-middle"></div>
				<div class="header-section" id="search-headerbox">
					<input type="text" name="search" id="search" placeholder="查找通则...">
					<i class="fa fa-search search" id="search-icon" aria-hidden="true"></i>
					<div class="header-separator"></div>
				</div>
				<div class="header-section hidden-xs" id="notice-headerbox">
					<div class="notice" id="checklist-notice">
						<i class="fa fa-check-square-o" aria-hidden="true"></i>
						<div class="dropdown-box basic">
							<div class="drop-header">
								<h3>
									<i class="fa fa-check-square-o" aria-hidden="true"></i> To-Do
									List
								</h3>
							</div>
							<div class="drop-content">
								<div class="widget-list list-to-do">
									<ul>
										<li>
											<div class="checkbox-custom checkbox-primary">
												<input type="checkbox" id="check-s1" value="option1">
												<label for="check-s1">Accusantium eveniet ipsam
													neque</label>
											</div>
										</li>
										<li>
											<div class="checkbox-custom checkbox-primary">
												<input type="checkbox" id="check-s2" value="option1" checked>
												<label for="check-s2">Lorem ipsum dolor sit</label>
											</div>
										</li>
										<li>
											<div class="checkbox-custom checkbox-primary">
												<input type="checkbox" id="check-s3" value="option1">
												<label for="check-s3">Dolor eligendi in ipsum
													sapiente</label>
											</div>
										</li>
										<li>
											<div class="checkbox-custom checkbox-primary">
												<input type="checkbox" id="check-s4" value="option1">
												<label for="check-s4">Natus recusandae vel</label>
											</div>
										</li>
										<li>
											<div class="checkbox-custom checkbox-primary">
												<input type="checkbox" id="check-s5" value="option1">
												<label for="check-s5">Adipisci amet officia tempore
													ut</label>
											</div>
										</li>
									</ul>
								</div>
							</div>
							<div class="drop-footer">
								<a>See all Items</a>
							</div>
						</div>
					</div>
					<div class="notice" id="messages-notice">
						<i class="fa fa-comments-o" aria-hidden="true"></i> <span><i
							class="fa fa-exclamation-circle" aria-hidden="true"></i></span>
						<div class="dropdown-box basic">
							<div class="drop-header ">
								<h3>
									<i class="fa fa-comments-o" aria-hidden="true"></i> Messages
								</h3>
								<span class="number">120</span>
							</div>
							<div class="drop-content">
								<div class="widget-list list-left-element">
									<ul>
										<li><a href="#">
												<div class="left-element">
													<img alt="John Doe" src="resources/images/avatar_1.jpg" />
												</div>
												<div class="text">
													<span class="title">John Doe</span> <span class="subtitle">Lorem
														ipsum dolor sit.</span>
												</div>
										</a></li>
										<li><a href="#">
												<div class="left-element">
													<img alt="Alice Smith" src="resources/images/avatar_2.jpg" />
												</div>
												<div class="text">
													<span class="title">Alice Smith</span> <span
														class="subtitle">Deserunt, mollitia?</span>
												</div>
										</a></li>
										<li><a href="#">
												<div class="left-element">
													<img alt="Klaus Wolf" src="resources/images/avatar_3.jpg" />
												</div>
												<div class="text">
													<span class="title">Klaus Wolf</span> <span
														class="subtitle">Consectetur adipisicing elit.</span>
												</div>
										</a></li>
										<li><a href="#">
												<div class="left-element">
													<img alt="Sun Li" src="resources/images/avatar_4.jpg" />
												</div>
												<div class="text">
													<span class="title">Sun Li</span> <span class="subtitle">Tenetur
														tempora?</span>
												</div>
										</a></li>
										<li><a href="#">
												<div class="left-element">
													<img alt="Sonia Valera" src="resources/images/avatar_5.jpg" />
												</div>
												<div class="text">
													<span class="title">Sonia Valera</span> <span
														class="subtitle">Similique ad maxime.</span>
												</div>
										</a></li>
									</ul>
								</div>
							</div>
							<div class="drop-footer">
								<a>See all messages</a>
							</div>
						</div>
					</div>
					<div class="notice" id="alerts-notice">
						<i class="fa fa-bell-o" aria-hidden="true"></i> <span>4</span>
						<div class="dropdown-box basic">
							<div class="drop-header">
								<h3>
									<i class="fa fa-bell-o" aria-hidden="true"></i> Notifications
								</h3>
								<span class="number">4</span>
							</div>
							<div class="drop-content">
								<div class="widget-list list-left-element list-sm">
									<ul>
										<li><a href="#">
												<div class="left-element">
													<i class="fa fa-warning color-warning"></i>
												</div>
												<div class="text">
													<span class="title">8 Bugs</span> <span class="subtitle">reported
														today</span>
												</div>
										</a></li>
										<li><a href="#">
												<div class="left-element">
													<i class="fa fa-flag color-danger"></i>
												</div>
												<div class="text">
													<span class="title">Error</span> <span class="subtitle">sevidor
														C down</span>
												</div>
										</a></li>
										<li><a href="#">
												<div class="left-element">
													<i class="fa fa-cog color-dark"></i>
												</div>
												<div class="text">
													<span class="title">New Configuration</span> <span
														class="subtitle"></span>
												</div>
										</a></li>
										<li><a href="#">
												<div class="left-element">
													<i class="fa fa-tasks color-success"></i>
												</div>
												<div class="text">
													<span class="title">14 Task</span> <span class="subtitle">completed</span>
												</div>
										</a></li>
										<li><a href="#">
												<div class="left-element">
													<i class="fa fa-envelope color-primary"></i>
												</div>
												<div class="text">
													<span class="title">21 Menssage</span> <span
														class="subtitle"> (see more)</span>
												</div>
										</a></li>
									</ul>
								</div>
							</div>
							<div class="drop-footer">
								<a>See all notifications</a>
							</div>
						</div>
					</div>
					<div class="header-separator"></div>
				</div>
				<div class="header-section" id="user-headerbox">
					<div class="user-header-wrap">
						<div class="user-photo">
							<img src="resources/images/user-avatar.jpg" alt="Jane Doe" />
						</div>
						<div class="user-info">
							<span class="user-name">Jane Doe</span> <span
								class="user-profile">Admin</span>
						</div>
						<i class="fa fa-plus icon-open" aria-hidden="true"></i> <i
							class="fa fa-minus icon-close" aria-hidden="true"></i>
					</div>
					<div class="user-options dropdown-box">
						<div class="drop-content basic">
							<ul>
								<li><a href="pages_user-profile.html"><i
										class="fa fa-user" aria-hidden="true"></i> Profile</a></li>
								<li><a href="pages_lock-screen.html"><i
										class="fa fa-lock" aria-hidden="true"></i> Lock Screen</a></li>
								<li><a href="#"><i class="fa fa-cog" aria-hidden="true"></i>
										Configurations</a></li>
							</ul>
						</div>
					</div>
				</div>
				<div class="header-separator"></div>
				<div class="header-section">
					<a href="pages_sign-in.html"><i class="fa fa-sign-out log-out"
						aria-hidden="true"></i></a>
				</div>
			</div>
		</div>
		<div class="page-body">
			<div class="left-sidebar">
				<div class="left-sidebar-header">
					<div class="left-sidebar-title">评估栏</div>
					<div
						class="left-sidebar-toggle c-hamburger c-hamburger--htla hidden-xs"
						data-toggle-class="left-sidebar-collapsed" data-target="html">
						<span></span>
					</div>
				</div>

				<div id="left-nav" class="nano">
					<div class="nano-content">
						<nav>
						<ul class="nav" id="main-nav">
							<li class="active-item"><a href="index.jsp"><i
									class="fa fa-home" aria-hidden="true"></i><span>返回主页</span></a></li>
									<li><a ui-sref="state2">测试连接</a></li>

							<c:forEach items="${requestScope.alllevitems}" var="item">
								<li class="has-child-item close-item"><a><i
										class="fa fa-info" aria-hidden="true"></i><span>${item.key}</span></a>
									<ul class="nav child-nav level-1">
										<c:forEach items="${item.value}" var="juditem">
										<!-- used code -->
											<%-- <li><a ui-sref="state${juditem.judgeItemId}">${juditem.judgeItemName}</a></li> --%>
										<!-- --------- -->
											<li><a ui-sref="state1({judItemId:${juditem.judgeItemId}})">${juditem.judgeItemName}</a></li>
										</c:forEach>
										
									</ul>
							</c:forEach>
							



						</ul>
						</nav>
					</div>
				</div>

				<!-- ------Angular JS ng-repeat method ------------------>

				<!--             <div id="left-nav" class="nano">
                <div class="nano-content">
						<nav>
						<ul class="nav" id="main-nav" ng-app="">
							<li class="active-item"><a href="index.jsp"><i
									class="fa fa-home" aria-hidden="true"></i><span>返回主页</span></a></li>

							<div ng-repeat="item in {{alllevitems}}">
								<li class="has-child-item close-item"><a><i
										class="fa fa-info" aria-hidden="true"></i><span>{{item.key}}</span></a>
									<ul class="nav child-nav level-1">
										<div ng-repeat="juditem in item.value">
											<li><a href="subjudge/{{juditem.judgeItemId}}.jsp">{{juditem.judgeItemName}}</a></li>

										</div>
									</ul>
							</div>



						</ul>
						</nav>
					</div>
            </div> -->

				<!-- ---------------------------------------------  -->




			</div>
			<div class="content">
			<ui-view></ui-view>
			</div>
			


		</div>
	</div>
	<script src="resources/jQuery/jquery-3.2.1.js"></script>
	<!-- <script src="resources/vendor/bootstrap/js/bootstrap.min.js"></script> -->
	<script src="resources/vendor/bootstrap/js/bootstrap.js"></script>
	<script src="resources/javascripts/angular.min.js"></script>
	<script src="resources/javascripts/angular-ui-router.js"></script>
	<script src="resources/javascripts/itemrouter.js"></script>
	<script src="resources/vendor/nano-scroller/nano-scroller.js"></script>
	<script src="resources/javascripts/template-script.min.js"></script>
	<script src="resources/javascripts/template-init.min.js"></script>
	<script src="resources/vendor/toastr/toastr.min.js"></script>
	<script src="resources/vendor/chart-js/chart.min.js"></script>
	<script
		src="resources/vendor/magnific-popup/jquery.magnific-popup.min.js"></script>
<!-- 	<script src="resources/javascripts/examples/dashboard.js"></script> -->
</body>

</html>
