<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale = 1.0">
<link href="<%=request.getContextPath()%>/resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet">

<title>修改</title>
</head>
<body>
<nav class="navbar navbar-inverse navbar-fixed-top">
   <div class="container">
     <div class="navbar-header">
       <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
         <span class="sr-only">Toggle navigation</span>
         <span class="icon-bar"></span>
         <span class="icon-bar"></span>
         <span class="icon-bar"></span>
       </button>
       <a class="navbar-brand" href="#">练习</a>
     </div>
     <div id="navbar" class="collapse navbar-collapse">
       <ul class="nav navbar-nav">
         <li class="active"><a href="<%=request.getContextPath()%>/user/list">列表</a></li>
         <li><a href="<%=request.getContextPath()%>/user/addPage">新增</a></li>
       </ul>
     </div><!--/.nav-collapse -->
   </div>
 </nav>
<div class="container" style="margin-top: 65px;">
<h1>修改-编号[${test.id}]</h1>
<form action="<%=request.getContextPath()%>/user/doEdit" method="post" class="form-inline" role="form">
	<div class="form-group">
		<label class="sr-only" for="id">编号</label>
		<input typ="text" class="form-control sr-only" name="id" id="id" placeholder="请输入编号" value="${test.id}"/>
	</div>
	<div style="height: 10px;"></div>
	<div class="form-group">
		<label class="sr-only" for="name">名称</label>
		<input type="text" class="form-control" name="name" id="name" placeholder="请输入名称" value="${test.name}"/>
	</div>
	<div style="height: 10px;"></div>
	<button type="submit" class="btn btn-default">提交</button>
</form>

</div>
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/bootstrap-3.3.7/js/bootstrap.min.js"></script>
</body>
</html>