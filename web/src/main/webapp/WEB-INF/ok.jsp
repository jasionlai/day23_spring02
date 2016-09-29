<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/27
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
<table class="table table-condensed" style="width: 80%; margin: 0px auto">
  <tr>
    <td>id</td>
    <td>名称</td>
    <td>年龄</td>
    <td>性别</td>
    <td>密码</td>
    <td>编辑</td>
    <td>删除</td>
  </tr>
  <c:forEach var="v" items="${lists.content}">
  <tr>
    <td>${v.stuId}</td>
    <td>${v.stuName}</td>
    <td>${v.stuAge}</td>
    <td>${v.stuSex}</td>
    <td>${v.stuPass}</td>
    <td>${v.cid}</td>
    <td><button type="button" class="btn btn-primary btn-sm"><a href="../toupdatey?stuId=${v.stuId}">编辑</a></button></td>
    <td><button type="button" class="btn btn-danger" title="${v.stuId}">删除</button></td>
  </tr>
  </c:forEach>
  <tr>
    <td colspan="7">
      <button type="button" class="btn btn-primary btn-sm">全选</button>
      <button type="button" class="btn btn-primary btn-sm"><a href="../took">新增</a></button>
    </td>
  </tr>
</table>
<nav style="text-align:center">
  <ul class="pagination">
    <li><a href="map?page=${countpage-1}">&raquo;</a></li>
    <c:forEach var="p" begin="0" end="${lists.totalPages-1}">
      <li><a href="map?page=${p}">${p+1}</a></li>
    </c:forEach>
    <li><a href="map?page=${countpage+1}">&raquo;</a></li>
  </ul>
</nav>

<script>
  $(function(){
    $(".btn-danger").click(function(){
      if(confirm("您确定要删除！")){


        var sid=$(this).attr("title");
        $.post("delete",{stuId:sid},function(data){
          if(data==true){
            alert("成功成功");
            location.reload();
          }else{
            alert("删除失败");
          }
        });

      }
    });
  })
</script>
</body>
</html>
