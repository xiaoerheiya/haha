<%@page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<html>
	<body>
		<%-- String name = request.getParameter("name"); --%>
		
		<table width="100%" border="10" cellspacing="0" cellpadding="0" height="100%" bordercolor="#000000">
		
			
				<tr>
					<th>操作</th>
					<th>啥也不会</th>
					<th>啥也不会</th>
					<th>啥也不会</th>
					<th>啥也不会</th>
					<th>啥也不会</th>
					<th>啥也不会</th>
					<th>啥也不会</th>
				</tr>
					<c:forEach items="${person}" var = "abc" >
						<tr>
							<td>
							<a href="JSP/InserUser.jsp">
								添加	
							</a>
							</td>
							<td>
							<a href="JSP/chaxun.jsp?name=${abc.name}">
								更新	
							</a>
							</td>
							<td>
								${abc.name}
								
							</td>
							<td>
								${abc.password}
								
							</td>
							<td>
								${abc.email}
								
							</td>
							<td>
								${abc.type}
								
							</td>
							<td>
								${abc.phone}
								
							</td>
							<td>
								${abc.birth}
								
							</td>
							<td>
								${abc.age}
								
							</td>
						</tr>
					</c:forEach>
		</table>
		
		<%-- shas --%>
		<font color = 'red'></font>
	</body>
</html>