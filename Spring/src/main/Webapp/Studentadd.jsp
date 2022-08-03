<%--
  Created by IntelliJ IDEA.
  User: Le'novo
  Date: 2022/7/10
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生信息表</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <form action="student/add" method="post">
        <p>学生学号：<label>
            <input type="text" name="stuNum">
        </label></p>
        <p>学生姓名：<label>
            <input type="text" name="stuName">
        </label></p>
        <p>学生性别：<label>
            <input type="text" name="stuGender">
        </label></p>
        <p>学生年龄：<label>
            <input type="text" name="stuAge">
        </label></p>
        <p>入学时间：<label>
            <input type="text" name="stuTime">
        </label></p>
        <p><input type="submit" value="提交"></p>
    </form>
</body>
</html>
