<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale = 1.0">
<link href="<%=request.getContextPath()%>/resources/bootstrap-3.3.7/css/bootstrap.min.css" rel="stylesheet">

<title>登录</title>
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
   </div>
 </nav>
<div class="container" style="margin-top: 65px;">
<form action="<%=request.getContextPath()%>/doLogin" method="post" class="form-inline" role="form">
	<div class="input-group">
		<label class="sr-only" for="account">账号</label>
		<input typ="text" class="form-control" name="account" id="account" placeholder="请输入账号">
	</div>
	<div style="height: 10px;"></div>
	<div class="input-group">
		<label class="sr-only" for="password">密码</label>
		<input type="password" class="form-control" name="password" id="password" placeholder="请输入密码">
	</div>
	<div style="height: 10px;"></div>
	<div class="input-group col-md-3">
		<label class="sr-only" for="verfyCode">验证码</label>
		<input type="text" class="form-control" name="verfyCode" id="verfyCode" 
			placeholder="请输入验证码">
		<span class="input-group-btn" maxlength="4">
			<img src="<%=request.getContextPath()%>/kaptcha" id="kaptchaImage" title="看不清，点击换一张">
		</span>
	</div>
	<div style="height: 10px;"></div>
	<button type="submit" class="btn btn-default">提交</button>
</form>

</div>
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/bootstrap-3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">  
$(function(){         
    $('#kaptchaImage').click(function () {//生成验证码  
     $(this).hide().attr('src', '<%=request.getContextPath()%>/kaptcha?' + Math.floor(Math.random()*100) ).fadeIn();  
     event.cancelBubble=true;  
    });  
});  
</script>
</body>
</html>