<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<base href="<%=basePath%>">
		<meta charset="utf-8" />
		<title></title>
		<meta name="description" content="overview & stats" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link href="/quick4j/assets/plugins/bootstrap/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
		<script src="/quick4j/assets/plugins/jquery-1.10.2.min.js" type="text/javascript"></script>

<script type="text/javascript">
   function click1() {
      //首先验证文件格式
      var fileName = $('#uploadfile').val();
      if (fileName === '') {
          alert('请选择文件');
          return false;
      }
      var fileType = (fileName.substring(fileName
              .lastIndexOf(".") + 1, fileName.length))
              .toLowerCase();
      if (fileType !== 'xls' && fileType !== 'xlsx') {
          alert('文件格式不正确，excel文件！');
          return false;
      }
      $("#file_form").submit();

   }
   

</script>
</head>
<body>
 <div class="container pull-left" style="padding:0px;width:100%">  
        <ul class="breadcrumb">  
            <li><a href="javascript:;"> 订单管理</a></li>  
            <li class="active">订单上传</li>  
        </ul>  
   </div> 
	<form action="<%=basePath%>rest/orderinfo/dealExcel" name="file_form" id="file_form" method="post" enctype="multipart/form-data">
		<input type="file" name="uploadfile" id="uploadfile" /> <br/>
		<button type="button" onclick="click1()">文件上传</button>
	</form>
		
	
</body>
</html>