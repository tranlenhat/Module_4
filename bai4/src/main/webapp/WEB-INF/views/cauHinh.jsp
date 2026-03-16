<%--
  Created by IntelliJ IDEA.
  User: LE NHAT
  Date: 16/03/2026
  Time: 12:56 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Cài đặt hộp thư điện tử</h2>

<form:form method="post" action="/cap-nhat" modelAttribute="cauHinh">

    <table>

        <tr>
            <td>Ngôn ngữ:</td>
            <td>
                <form:select path="ngonNgu">
                    <form:option value="English">English</form:option>
                    <form:option value="Vietnamese">Vietnamese</form:option>
                    <form:option value="Japanese">Japanese</form:option>
                    <form:option value="Chinese">Chinese</form:option>
                </form:select>
            </td>
        </tr>

        <tr>
            <td>Kích thước trang:</td>
            <td>
                Hiển thị
                <form:select path="kichThuocTrang">
                    <form:option value="5">5</form:option>
                    <form:option value="10">10</form:option>
                    <form:option value="15">15</form:option>
                    <form:option value="25">25</form:option>
                    <form:option value="50">50</form:option>
                    <form:option value="100">100</form:option>
                </form:select>
                email mỗi trang
            </td>
        </tr>

        <tr>
            <td>Lọc spam:</td>
            <td>
                <form:checkbox path="locSpam"/> Bật bộ lọc spam
            </td>
        </tr>

        <tr>
            <td>Chữ ký:</td>
            <td>
                <form:textarea path="chuKy" rows="4" cols="30"/>
            </td>
        </tr>

        <tr>
            <td></td>
            <td>
                <input type="submit" value="Cập nhật"/>
                <input type="reset" value="Hủy"/>
            </td>
        </tr>

    </table>

</form:form>
</body>
</html>
