<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resources/css/bootstrap.min.css">


<script type="text/javascript" src="resources/js/jquery.min.js"></script>
<script type="text/javascript" src="resources/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/js/angular.min.js"></script>
<script type="text/javascript" src="resources/js/controller.js"></script>
<title>精益化评估系统main</title>
</head>
<body>
<!-- 导航栏 -->
	<div class="container">
		<nav class="navbar navbar-expand-sm navbar-dark bg-dark fix"
			role="navigation">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle" data-toggle="collapse"
				data-target="#nav-toggle">
				<span class="sr-only">Toggle navigation</span> <span
					class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand bg-dark" href="/">精益化评价系统</a>
		</div>

		<div class="collapse navbar-collapse" id="nav-toggle">
			<ul class="nav navbar-nav">
				<li class="active"><a href="/">首页</a></li>
				<li><a href="/add">登录</a></li>
			</ul>
			<form class="navbar-form navbar-right" role="search">
				<input type="text" class="form-control" placeholder="通则查找">
			</form>
		</div>
		</nav>
	</div>
	
	<!-- 边栏 -->
	<div class="container col-md-2">

		<div id="accordion" role="tablist">
			<c:forEach items="${requestScope.alllevitems}" var="item">


				<div class="card">
					<div class="card-header" role="tab" id="heading${item.key}">
						<h5 class="mb-0">
							<a data-toggle="collapse" href="#collapse${item.key}"
								aria-expanded="true" aria-controls="collapseOne">
								${item.key} </a>
						</h5>
					</div>

					<div id="collapse${item.key}" class="collapse" role="tabpanel"
						aria-labelledby="heading${item.key}" data-parent="#accordion">
						<div class="card-body">
						<c:forEach items="${item.value}" var="subitem">
						<h1>${subitem.judgeItemName }</h1>
						
						</c:forEach>
						
						</div>
					</div>
				</div>

			</c:forEach>
		</div>

	</div>
	</div>

</body>
</html>