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
		var name = $("#name").val();//获得页面中的名字
		$.ajax({
			type : "post",
			url : "receive.action",
			contentType : 'application/json;charset=utf-8',
			data : name,
			success : function(data) {
				$("#h").html(data);
			}
		});
	}
</script>
</head>
<body>

	<input type="text" id="name">
	<button onclick="fun()">点击这里</button>
	<h2 id="h"></h2>
</body>
</html>