<%@ page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h4>dispatcher6.jsp</h4>
		
		<%-- How1 --%>
		title: <%=request.getAttribute("title")%> <br/>
		content: <%=request.getAttribute("content")%> <br/>
			
		<%-- How2(Expression Language) --%>
		title: ${title} <br/>
		content: ${content}<br/>		
		
	</body>
</html>