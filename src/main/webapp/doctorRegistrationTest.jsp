<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%--
register(@RequestParam("tel") String tel
								,@RequestParam("pwd") String pwd
								,@RequestParam("mail") String mail
			,@RequestParam("name") String name
			,@RequestParam("birthday") String birthday_str
			,@RequestParam("hospital_id") Integer hospital_id
			,@RequestParam("department_id") Integer department_id
			,@RequestParam("doctor_type_id") Integer doctor_type_id
			,@RequestParam("good_at") String good_at
 --%>
	<form action="doctor/register" method="post" enctype="multipart/form-data">
		<label>电话</label><input name="tel"/><p />
		<label>密码</label><input name='pwd'/><p />
		<label>姓名</label><input name="name"/><p />
		<label>邮件</label><input name="mail"/><p />
		<label>出生日期</label><input name='birthday'/><p />
		<label>所属医院</label><input name="hospital_id"/><p />
		<label>所属科室</label><input name="department_id"/><p />
		<label>医生类型</label><input name="doctor_type_id"/><p />
		<label>专长领域</label><input name='good_at'/><p />
		<label>上传头像</label><input name='picture' type="file"/><p />
		<input type="submit" name='提交'/>	
	</form>
</body>
</html>