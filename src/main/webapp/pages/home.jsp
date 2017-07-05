<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/12
  Time: 20:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>集成教务系统</title>
</head>
<body>

<h2>你好，${username}同学</h2>
<a href="<%=request.getContextPath()%>/login">登出</a><br>
<h2>已选课程</h2>
<table border="2">
    <tr>
        <td>课程编号</td>
        <td>课程名称</td>
        <td>课程学分</td>
        <td>任课教师</td>
        <td>上课地点</td>
        <td>课程退选</td>
    </tr>
    <c:forEach items="${courseSelected}" var="course1">
        <tr>
            <td>${course1.cid}</td>
            <td>${course1.name}</td>
            <td>${course1.point}</td>
            <td>${course1.teacher}</td>
            <td>${course1.location}</td>
                <%--需要student变量——学号--%>
            <td><<a href="<%=request.getContextPath()%>/deleteElective/${username}/${course1.cid}">点击退选</a></td>
        </tr>
    </c:forEach>
</table>
<h2>其他课程</h2>
<table border="2">
    <tr>
        <td>课程编号</td>
        <td>课程名称</td>
        <td>课程学分</td>
        <td>任课教师</td>
        <td>上课地点</td>
        <td>课程选择</td>
    </tr>
    <c:forEach items="${courseUnSelected}" var="course2">
        <tr>
            <td>${course2.cid}</td>
            <td>${course2.name}</td>
            <td>${course2.point}</td>
            <td>${course2.teacher}</td>
            <td>${course2.location}</td>
                <%--需要student变量——学号--%>
            <td><<a href="<%=request.getContextPath()%>/elective/${username}/${course2.cid}">点击选课</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
