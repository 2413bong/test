<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>Insert title here</title>
</head>
<body>

<body>
<form id="form1" name="form1"  method="post" enctype="multipart/form-data">
<table>
<tr>
	<td>아이디</td>
	<td><input type='text' id='id' name='id'/></td>
	<td rowspan='2'><button id="login">login</button></td>
</tr>
<tr>
	<td>비밀번호</td>
	<td><input type='password' id='pwd' name='pwd'/></td>
</tr>
</table>
</form>
<div id="message"></div>
<script>
var form = document.querySelector('#form1');
var formData = new FormData(form);
	$("#login").click(function() {
		$.ajax({
			type: "POST",
			url: "/user/login",
			data: formData,
			success: function(response) {
				if(response == 'success') {
					alert("로그인성공")
				}
				else {
					alert("로그인실패")	
				}
			}
		error: function(error) {
        	console.log(error);
        } 
		});
	});
</script>
</body>
</html>