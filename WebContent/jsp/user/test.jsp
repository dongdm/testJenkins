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
     <div id="navbar" class="collapse navbar-collapse">
       <ul class="nav navbar-nav">
         <li class="active"><a href="<%=request.getContextPath()%>/user/list">列表</a></li>
         <li><a href="<%=request.getContextPath()%>/user/addPage">新增</a></li>
       </ul>
     </div><!--/.nav-collapse -->
   </div>
 </nav>
<div class="container" style="margin-top: 50px;">
	<div class="col-md-12">
         <table class="table table-striped">
           <thead>
             <tr>
               <th>编号</th>
               <th>名称</th>
               <th>手机号</th>
               <th>邮箱</th>
               <th>操作</th>
             </tr>
           </thead>
           <tbody  id="example"></tbody>
         </table>
       </div>
</div>
	
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="<%=request.getContextPath()%>/resources/bootstrap-3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/JSXTransformer.js"></script>
<script type="text/javascript" src="<%=request.getContextPath()%>/js/react.js"></script>
<script type="text/jsx">
	var path="<%=request.getContextPath()%>/user/";
	var arr = ${list};
	//var arr = ['Alice','Emily','Kate'];
    React.render(
        <tbody>
			{
				arr.map(function(item){
					var id = item.id;
					var delPath=path+"del?id="+id;
					var editPath=path+"editPage?id="+id;
					return <tr>
							<td>{id}</td>
							<td>{item.name}</td>
							<td>{item.telphone}</td>
							<td>{item.email}</td>
							<td><a href={editPath}><span className="label label-default">修改</span></a>
                                &nbsp;&nbsp;
							    <a href={delPath}><span className="label label-default">删除</span></a>
							</td>
							</tr>
				})
			}
		</tbody>,
        document.getElementById('example')
    );  
</script>
</body>
</html>