<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>Insert title here</title>
</head>
<body>
<form>
아이디<input id="id" type="text"><br>
비밀번호<input id="pwd" type="password"><br>
</form>
<script>
$("#start_ajax").click(function(){
    $.ajax({
        type:"POST",
        url:"/user/login",
        data : {name : "홍길동"},
        dataType : "json",
        success:function(data){
            var str = '';
            for(var name in data){
                str += '<li>'+data[name]+'</li>';
            }},
        error: function(error) {
        	console.log(error);
        }   
    });
});


출처: http://annotations.tistory.com/43 [Annotation]
</script>
</body>
</html>