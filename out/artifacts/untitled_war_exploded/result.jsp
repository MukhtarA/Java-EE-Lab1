<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: mukhtar
  Date: 01.02.2021
  Time: 11:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>
    Available Groups
</h1>
<%
    List result= (List) request.getAttribute("group");
    Iterator it = result.iterator();
    out.println("<br>We have <br><br>");
    while(it.hasNext()){
        out.println(it.next()+"<br>");
    }
%>
</body>
</html>
