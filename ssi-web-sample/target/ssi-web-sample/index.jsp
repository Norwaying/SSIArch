<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>list test</title>
</head>
<body>
<h1>评论</h1>
<s:form action="/comment/commentAction" method="post">
    <s:textfield name="title" label="题目"/>
    <s:textfield name="content" label="内容"/>
    <s:submit/>
</s:form>
</body>
</html>
