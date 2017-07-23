<%@page import="zdfs.model.HospitalT"%>
<%@page import="zdfs.service.IHospitalService"%>
<%@page import="zdfs.model.MetaDepartmentTypeT"%>
<%@page import="zdfs.service.IMetaDepartmentTypeService"%>
<%@page import="zdfs.service.IMetaDoctorTypeService"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.web.context.WebApplicationContext"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@page import="zdfs.service.impl.MetaDoctorTypeService"%>
<%@page import="zdfs.model.MetaDoctorTypeT"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<title>Insert title here</title>
</head>
<body>

	<form action="doctor/register" method="post" enctype="multipart/form-data">
		<label>电话</label><input name="tel"/><p />
		<label>密码</label><input name='pwd'/><p />
		<label>姓名</label><input name="name"/><p />
		<label>邮件</label><input name="mail"/><p />
		<label>出生日期</label><input name='birthday'/><p />
		<label>所属医院</label>
			<select name="hospital_id">
				<c:forEach items="${hList}" var="h" >
					<option value="${h.id}">${h.name}</option>
				</c:forEach>
			</select><p />
		<label>所属科室</label>
		<select name='department_id'>
			<c:forEach items="${dptList}" var='dpt'>
				<option value='${dpt.id}'>${dpt.name}</option>
			</c:forEach>
		</select><p />
		<label>医生类型</label>
		<select name='doctor_type_id'>
			<c:forEach items="${dotList}" var='d'>
				<option value='${d.id}'>${d.name}</option>
			</c:forEach>
		</select><p />
		<label>专长领域</label><input name='good_at'/><p />
		<label>上传头像</label><input name='photo' type="file"/><p />
		<input type="submit" name='提交'/>	
	</form>
	
	
	<script type="text/javascript">
			
		$(function(){
			alert('JS ready!')
			
			$.ajax({
					url:"hospital/listAll",
					type:'GET',
					success:function(data){
						console.log('hospital-size:'+data.data.length);

						for(var i=0;i<data.data.length;i++){
							var d=data.data[i];
							console.log('hospital-name:'+d.name);
							$('select[name=hospital_id]').append($('<option/>').attr('value',d.id).text(d.name))
						}
						
						var selectOption=$('select[name=hospital_id]').children().first();
						console.log('preHID:'+selectOption.text());
						
						$.ajax({
							url:"department/list/hospitalId="+selectOption.val(),
							type:'GET',
							success:function(data){
								for(var j=0;j<data.data.length;j++){
									var d=data.data[j];
									$('select[name=department_id]').append($('<option/>').attr('value',d.id).text(d.name));
								}
							}
						})
					}
					
				})
				
			$.ajax({
				url:'metaData/doctorType/list',
				type:'GET',
				success:function(data){
					console.log('data-length:'+data.data.length);
					for(var i=0;i<data.data.length;i++){
						var d=data.data[i];
						$('select[name=doctor_type_id]').append($('<option/>').attr('value',d.id).text(d.name))
					}
				}
				
				
			})
			
			
			$('select[name=hospital_id]').on('change',function(){
				console.log('change')
				var hid=$(this).val();
				console.log('hid:'+hid);
				
				$.ajax({
					url:'department/list/hospitalId='+hid,
					type:'GET',
					success:function(data){
						
						$('select[name=department_id]').empty();
						
						console.log('department-length:'+data.data.length);
						
						for(var i=0;i<data.data.length;i++){
							var d=data.data[i];
							$('select[name=department_id]').append($('<option/>').attr('value',d.id).text(d.name))
						}
					}
				})
			})
			
		})
	
	</script>
	
</body>
</html>