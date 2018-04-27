<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>无标题文档</title>
<style>
*{ margin:0px auto; padding;}
.c_daKuang{ width:500px; height:300px;}
.c_span{ display:inline-block; width:50px; }
.neiRongKuang{ border:solid 1px; width:260px; height:130px; text-align:center; margin-top:10px;}
</style>
</head>

<body>
<div class="c_daKuang">
	<h2 style="margin-top:10px;">修改信息</h2>
	<form action="/haha/chaxuntest" method="get">
		
		
    	<p class="meiHang">请输入要修改的同学的ID:	<input type="text" name="name" />
		<input type="submit" name="submit" value="查询" /> </p>
        
    </form>
	
</div>
</body>
</html>
