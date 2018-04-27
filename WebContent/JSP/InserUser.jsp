<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<html>
	<body>
		<%-- String name = request.getParameter("name"); --%>
	<form action="/wj/inserttest" method="post">
		<table align="center">
			<tr style="margin-top:10px;">
				<td colspan="2" align="center"><h1>添加信息</h1></td>
			</tr>
			<tr>
				<td><table>name:</table> </td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td><table>password:</table></td>
				<td><input type="text" name="password" /></td> 
			</tr>
			<tr>
				<td><table>email:</table></td>
				<td><input type="text" name="email" /></td> 
			</tr>
			<tr>
				<td><table>type:</table></td>
				<td><input type="text" name="type" /></td> 
			</tr>
			<tr>
				<td><table>phone:</table></td>
				<td><input type="text" name="phone" /></td> 
			</tr>
			<tr>
				<td><table>birth:</table></td>
				<td><input type="text" name="birth" /></td> 
			</tr>
			<tr>
				<td><table>age:</table></td>
				<td><input type="text" name="age" /></td> 
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" name="submit" value="提交"></td>
			</tr>
		</table>
	</form>
						
		<%-- shas --%>
		<font color = 'red'></font>
	</body>
</html>