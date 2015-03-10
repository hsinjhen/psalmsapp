<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ include file="commontags.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="commonheader.jsp"%>
<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body class="skin-blue">
	<div id="mainHeader">
		<div id="header">
			<tiles:insertAttribute name="header" />
		</div>
	</div>
	<div id="mainDiv">
		<div class="menu">
			<tiles:insertAttribute name="leftPane" />
		</div>
		<div id="content">
			<tiles:insertAttribute name="content" />
		</div>
	</div>
	<div id="mainFooter">
		<div id="footer">
			<tiles:insertAttribute name="footer" />
		</div>
	</div>
</body>
</html>