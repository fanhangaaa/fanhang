<%@ page language="java"  pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<link rel="stylesheet" href="animate.min.css">
		<link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
<body>
<script src="jquery-1.12.3.min.js" type="text/javascript" charset="utf-8"></script>
		<script src="bootstrap.js" type="text/javascript" charset="utf-8"></script>
		
	<form action="deptSave.action" method="post">
	
	 <div class="form-group">
			  					
		  			
		<div class="col-lg-3">	  			
		ID:<input class="form-control" name="dept.deptno"/>
		名字:<input class="form-control" name="dept.dname"/>
		描述:<input class="form-control" name="dept.loc"/>
		<button>添加</button>
		</div>	  			
			  </div>
	
	
	</form>
</body>
</html>