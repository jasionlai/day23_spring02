<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/28
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
新增页面
<form action="add" method="post"><br>
  用户id：<input type="text" name="stuId"><br>
  用户名：<input type="text" name="stuName"><br>
  年龄：<input type="text" name="stuAge"><br>
  性别：<input type="text" name="stuSex"><br>
  密码：<input type="password" name="stuPass"><br>
  班级：<select name="cid" id="cid"><br>
<c:forEach items="${glist}" var="g">
  <option value="${g.cid}">${g.cname}</option>
</c:forEach>
</select>
  <br><input type="submit" value="提交">
</form>
</body>
</html>
