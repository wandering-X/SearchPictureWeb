<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="/ChatRoom/static/jquery-1.11.2.js" type="text/javascript"></script>
<script type="text/javascript">
	 function showUser(){
		 $("#myDiv").html("dsdffdsfds")
		$.ajax({
			url:'test/showAllUsers2.do',
			async:true,
			type:"get",
			dataType:"json",
			success:function(data){
				
				// $("#myDiv").html("dsdffdsfds");
				  $.each(data, function(i, item) {
					  $("#myDiv").append("username:"+item.username+"password"+item.password);
				  });
			//	document.getElementById("jsonValue").innerHTML = data.length;
			}
		});
	}
	$(document).ready(function(){
		  $("#b01").click(function(){
		 /*  htmlobj=$.ajax({url:"/jquery/test1.txt",async:false}); */
		  /* $("#myDiv").html("dsdffdsfds"); */
			  showUser();
		  });
		});
</script>
</head>
<body>
学生学籍管理系统

</br>
<a href="${pageContext.request.contextPath}/test/loginPage.do">登录</a>
</br>
<a href="${pageContext.request.contextPath}/test/register.do">注册</a>
</br>
<a href="${pageContext.request.contextPath}/test/showAllUsers.do">显示所有用户</a>
</br>
<p>用户名:<input type="text" id="username"  /><span id="userNameerror" ></span></p> 
	<p>测试JSON传值:<input type="text" id="jsonObject" onblur="showUser()" /><span id="jsonValue" ></span></p>
	</br> 
	<div id="myDiv"><h2>通过 AJAX 改变文本</h2></div>
<button id="b01" type="button">改变内容</button>
</body>
</html>