<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<script type="text/javascript" src='js/jquery-3.2.1.js'></script>
<body>
	
	<form id='changePhoto' action="doctor/changePhoto" method="POST" enctype="multipart/form-data">
		<input type='file' name='photo'/>
		<label>医生ID:</label><input id='doctorId' name='doctorId'/>
		<button id='submit'>提交</button>
	</form>
	
	<script type="text/javascript">
		$('#submit').on('click',function(){
			console.log('submit!');
			var doctorId=$('#doctorId').val();
			console.log('doctorId:'+doctorId)
			$('#changePhoto').attr('action','doctor/changePhoto/doctorId='+doctorId);
			
			$('#changePhoto').submit();
		})
	</script>
</body>
</html>