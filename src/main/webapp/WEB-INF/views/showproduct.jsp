<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="/quick4j/assets/scripts/jquery-1.10.1.min.js"></script>
<link rel="stylesheet" type="text/css" href="/quick4j/assets/plugins/bootstrap/css/bootstrap.min.css">
<script type="text/javascript" src="/quick4j/assets/scripts/angular/angular.min.js" ></script>
<script src="/quick4j/assets/plugins/bootstrap/js/bootstrap.min.js"></script>
</head>
<body ng-app="productApp" >
<div  ng-controller="productController">
 	<span>{{val}}</span>
</div>
<script type="text/javascript">
var app1 = angular.module('productApp',[]);
app1.controller('productController', ['$scope','$http', function($scope,$http) {
	$scope.val = 1;
}]);
</script>
</body>
</html>