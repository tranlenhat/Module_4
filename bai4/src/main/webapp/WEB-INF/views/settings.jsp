<%--
  Created by IntelliJ IDEA.
  User: LE NHAT
  Date: 16/03/2026
  Time: 12:58 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Cấu hình Email</h2>

<form:form method="post" action="/update" modelAttribute="settings">

    Ngôn ngữ:
    <form:select path="language">
        <form:option value="English" label="English"/>
        <form:option value="Vietnamese" label="Vietnamese"/>
        <form:option value="Japanese" label="Japanese"/>
        <form:option value="Chinese" label="Chinese"/>
    </form:select>

    <br><br>

    Kích thước trang:
    Show
    <form:select path="pageSize">
        <form:option value="5"/>
        <form:option value="10"/>
        <form:option value="15"/>
        <form:option value="25"/>
        <form:option value="50"/>
        <form:option value="100"/>
    </form:select>
    emails per page

    <br><br>

    Lọc Spam:
    <form:checkbox path="spamFilter"/> Enable spams filter

    <br><br>

    Chữ ký:

    <br>

    <form:textarea path="signature" rows="4" cols="30"/>

    <br><br>

    <input type="submit" value="Update"/>
    <input type="reset" value="Cancel"/>

</form:form>
</body>
</html>
