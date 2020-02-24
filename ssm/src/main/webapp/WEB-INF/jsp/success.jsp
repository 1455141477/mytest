<%--
  Created by IntelliJ IDEA.
  User: 1455141477
  Date: 2019/11/20
  Time: 23:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>跳转成功</h2>
<c:forEach items="${requestScope.readers}" var="reader">
    ${reader.name}
</c:forEach>
</body>
</html>
