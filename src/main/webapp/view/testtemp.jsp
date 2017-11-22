<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html ng-app="itemr">

<body>
<h1>评价导则</h1>
	<!-- <div ng-controller='itemcontroller'> -->
	<div >
		<p ng-repeat='value in post'>{{value.judgeSubitemName}}</p>
		

	</div>
	<div class="tabs mt-none">
		<ul class="nav nav-tabs" id="checkTab" role="tablist">

			<li class="nav-item" ng-repeat='item in post'><a class="nav-link active"
			id="checkitem{{item.judgeSubItemId}}-tab" data-toggle="tab" href="#checkitem1" role="tab"
			aria-controls="home" aria-expanded="true">{{item.judgeSubitemName}}</a></li>

<!-- 			<li class="nav-item"><a class="nav-link active"
				id="checkitem1-tab" data-toggle="tab" href="#checkitem1" role="tab"
				aria-controls="home" aria-expanded="true">采购技术协议或技术规范书</a></li>

			<li class="nav-item"><a class="nav-link" id="checkitem2-tab"
				data-toggle="tab" href="#checkitem2" role="tab"
				aria-controls="profile">出厂试验报告</a></li>

			<li class="nav-item"><a class="nav-link" id="checkitem3-tab"
				data-toggle="tab" href="#checkitem3" role="tab"
				aria-controls="profile">交接试验报告</a></li>

			<li class="nav-item"><a class="nav-link" id="checkitem4-tab"
				data-toggle="tab" href="#checkitem4" role="tab" aria-controls="profile">运输记录</a>
			</li>

			<li class="nav-item"><a class="nav-link" id="checkitem5-tab"
				data-toggle="tab" href="#checkitem5" role="tab" aria-controls="profile">安装时器身检查记录</a>
			</li>

			<li class="nav-item"><a class="nav-link" id="checkitem6-tab"
				data-toggle="tab" href="#checkitem6" role="tab" aria-controls="profile">安装质量检验及评定报告</a>
			</li>

			<li class="nav-item"><a class="nav-link" id="checkitem7-tab"
				data-toggle="tab" href="#checkitem7" role="tab" aria-controls="profile">设备监造报告</a>
			</li> -->

			
			

		</ul>

		<div class="tab-content" id="checkTabContent">
			<div class="tab-pane fade active in" id="checkitem1">
				<b><h1>检查方式</h1></b>
				<p><h3>PMS检查或查阅资料（正式文件扫描版或复印版均可，试验项目按照设备出厂、投运时的相关标准执行）</h3></p>
				<b><h1>检查结果</h1></b>
			</div>


			<div class="tab-pane fade" id="checkitem2">
				<b><h1>检查方式</h1></b>
				<p>
				<h3>PMS检查或查阅资料（正式文件扫描版或复印版均可，试验项目按照设备出厂、投运时的相关标准执行）</h3>
				</p>
				<b><h1>检查结果</h1></b>
			</div>

			<div class="tab-pane fade" id="checkitem3">
				Home3
			</div>

			<div class="tab-pane fade" id="checkitem4">
				Home4
			</div>

			<div class="tab-pane fade" id="checkitem5">
				Home5
			</div>

			<div class="tab-pane fade" id="checkitem6">
				Home6
			</div>

			<div class="tab-pane fade" id="checkitem7">
				Home7
			</div>

		</div>
	</div>

</body>
</html>