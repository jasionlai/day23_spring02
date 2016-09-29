<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/28
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title></title>
  <script type="text/javascript" src="../js/jquery.min.js"></script>

  <!-- 新 Bootstrap 核心 CSS 文件 -->
  <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">

  <!-- 可选的Bootstrap主题文件（一般不用引入） -->
  <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap-theme.min.css">

  <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
  <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>


  <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
  <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
</head>
<body>
修改页面


  id：<input type="text" name="stuId" id="stuId" value="${tblstudent.stuId}"><br>
  用户名：<input type="text" name="stuName" id="stuName" value="${tblstudent.stuName}"><br>
  年龄：<input type="text" name="stuAge" id="stuAge" value="${tblstudent.stuAge}"><br>
  性别：<input type="text" name="stuSex" id="stuSex" value="${tblstudent.stuSex}"><br>
  密码：<input type="text" name="stuPass" id="stuPass" value="${tblstudent.stuPass}"><br>
  班级：<select name="cid" id="cid">
    <c:forEach items="${glist}" var="g">
      <c:if test="${g.cid==tblstudent.cid}">
      <option selected="selected" value="${g.cid}">${g.cname}</option>
      </c:if>

      <c:if test="${g.cid!=tblstudent.cid}">
        <option  value="${g.cid}">${g.cname}</option>
      </c:if>
    </c:forEach>
  </select>
<br><input type="button" value="提交" id="btn">
<input type="button" value="返回" id="fbtn">
</form>
<script>
  $(function(){
    $("#btn").click(function(){
      $.post("doupdatey",{"stuId":$("#stuId").val(),"stuName":$("#stuName").val(),"stuAge":$("#stuAge").val(),"stuSex":$("#stuSex").val(),"stuPass":$("#stuPass").val(),"cid":$("#cid").val()},function(data){
        if(data==1){
          alert("修改成功")
        }else{
          alert("修改失败")
        }
      })
    });

    $("#fbtn").click(function(){
      
      location.reload();
    });

  })
</script>
</body>
</html>
