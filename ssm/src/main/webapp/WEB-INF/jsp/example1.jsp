<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 14551
  Date: 2019/12/7
  Time: 18:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${readers}" var="reader">
    ${reader.name}
    ${reader.username}
    ${reader.password}
   <c:forEach items="${reader.borrowBooks}" var="borrowBook">
       ${borrowBook.book}
       ${borrowBook.btime}
       ${borrowBook.rtime}
   </c:forEach>
</c:forEach>
</body>
</html>
