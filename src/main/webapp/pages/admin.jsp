<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/6/12
  Time: 20:25
  To change this template use File | Settings | File Templates.
  教务员页面，统计所有课程、选课、学生信息
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>集成教务系统</title>
</head>
<body>

<h2>你好，教务员</h2>
<a href="<%=request.getContextPath()%>/login">登出</a><br>
<h2>所有课程</h2>
<table border="2">
    <tr>
        <td>课程编号</td>
        <td>课程名称</td>
        <td>课程学分</td>
        <td>任课教师</td>
        <td>上课地点</td>
    </tr>
    <%--这里的变量名用了CourseVO，拟定课程编号Cno，课程名称Cnm，课程学分Cpt，任课教师Tea，上课地点Pla--%>
    <c:forEach items="${courseVO}" var="course">
        <tr>
            <td>${course.cid}</td>
            <td>${course.name}</td>
            <td>${course.point}</td>
            <td>${course.teacher}</td>
            <td>${course.location}</td>
        </tr>
    </c:forEach>
</table>
<h2>所有选课情况</h2>
<table border="2">
    <tr>
        <td>课程编号</td>
        <td>学生学号</td>
    </tr>
    <%--这里的变量名用了ElectiveVO，拟定课程编号Cno，学生编号（学号）Sno。成绩Grd--%>
    <c:forEach items="${ElectiveVO}" var="elective">
        <tr>
            <td>${elective.cid}</td>
            <td>${elective.sid}</td>
        </tr>
    </c:forEach>
</table>
<h2>所有学生信息</h2>
<table border="2">
    <tr>
        <td>学号</td>
        <td>姓名</td>
        <td>性别</td>
        <td>院系</td>
    </tr>
    <%--这里的变量名用了StudentVO，拟定学生编号（学号）Sno。姓名Snm，性别Sex，院系Sde--%>
    <c:forEach items="${StudentVO}" var="student">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.gender}</td>
            <td>${student.major}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
