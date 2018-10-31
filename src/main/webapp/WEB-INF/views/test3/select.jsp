<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>Insert title here</title>
</head>
<%
String left ="/WEB-INF/views/test3/left.jsp";
String right = "/WEB-INF/views/test3/";
if(request.getParameter("changepage") != null) {
	right += request.getParameter("changepage")+".jsp";
}else{
	right += "r1.jsp";
}
%>
<style>
    #left{
        width:40%;
        height:250px;
        float:left;
        background-color:rgba(110,124,255,0.4);
    }
    #right{
        width:40%;
        height:250px;
        float:right;
        background-color:rgba(255,124,111,0.4);
    }
</style>
<body>
<div id="left">
<jsp:include page="<%=left %>"></jsp:include>
</div>
 <div id="right">
 <jsp:include page="<%=right %>"></jsp:include>
 </div>
</body>
</html>