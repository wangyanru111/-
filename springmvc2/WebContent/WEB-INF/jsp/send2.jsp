<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/springmvc2/js/jquery-1.4.4.min.js"></script>
<script type="text/javascript">
	function fun() {
		//var name = $("#name").val();//获得页面中的名字
		//创建对象
		var user = {
			username : "zhuangzhuang",
			password : "2299"
		}
		var str = JSON.stringify(user);
		$.ajax({
			type : "post",
			url : "receive2.action",
			contentType : 'application/json;charset=utf-8',
			data : str,
			success : function(data) {
				$("#h").html(data);
			}
		});
	}
</script>
</head>
<body>
	将页面中已有的一个对象传递给控制器，控制器将对象的名字展示出来，不进行页面跳转（局部刷新）
	<button onclick="fun()">点击这里</button>
	<h2 id="h"></h2>
</body>
</html>