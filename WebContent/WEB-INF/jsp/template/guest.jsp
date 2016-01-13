<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<html>
    <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <tiles:insertAttribute name="cssFile" />
</head>
<body>
 
        <tiles:insertAttribute name="header" />
            <%-- <tiles:insertAttribute name="menu" /> --%>
         <tiles:insertAttribute name="menu" />
         <tiles:insertAttribute name="body" />
        <tiles:insertAttribute name="footer" />
    	<tiles:insertAttribute name="jsFile" />
</body>
</html>