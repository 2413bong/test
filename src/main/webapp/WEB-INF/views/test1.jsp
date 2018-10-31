<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
<title>Insert title here</title>
</head>
<body>
<form onsubmit="valicheck()">
아이디<input id="id" type="text"><br>
비밀번호<input id="pwd" type="password"><br>
비밀번호체크<input id="pwdchk" type="password"><br>   
나이<input id="age" type="number" value=0><br>     
email<input id="email" type="email"><br> 
<button> 서브밋</button>
</form>
<script>
var id =  document.querySelector('#id');
var pwd =  document.querySelector('#pwd');
var pwdchk =  document.querySelector('#pwdchk');
var age =  document.querySelector('#age');
var email =  document.querySelector('#email');

function valicheck(){
	if(id.value.trim().length<5){
		alert("아이디 5글자이상");
	}
	if(pwd.value.trim().length<8){
		alert("패스워드 8글자이상");
	}
	if(pwdchk.value.trim() != pwd.value.trim()){
		alert("패스워드랑 같게 넣어주세요");
	}
	if(age.value<0 || age.value>130){
		alert("0초과 130 미만으로 넣어주세요");
	}
	if(email.value.indexOf("@")==-1 || email.value.indexOf(".")==-1){
		alert("이메일 규격에 맞지않습니다");
	}
}
</script>
</body>

</html>

