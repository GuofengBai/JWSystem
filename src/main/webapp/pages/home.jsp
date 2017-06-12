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

<h2>你好，同学</h2>
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
    <c:forEach items="${Course1VO}" var="course1">
        <tr>
            <td>${course1.Cno}</td>
            <td>${course1.Cnm}</td>
            <td>${course1.Cpt}</td>
            <td>${course1.Tea}</td>
            <td>${course1.Pla}</td>
                <%--需要student变量——学号--%>
            <td><<a href="<%=request.getContextPath()%>/deleteElective/${userVO.username}/${course1.Cno}">点击退选</a></td>
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
    <c:forEach items="${Course2VO}" var="course2">
        <tr>
            <td>${course2.Cno}</td>
            <td>${course2.Cnm}</td>
            <td>${course2.Cpt}</td>
            <td>${course2.Tea}</td>
            <td>${course2.Pla}</td>
                <%--需要student变量——学号--%>
            <td><<a href="<%=request.getContextPath()%>/elective/${student}/${course2.Cno}">点击选课</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
