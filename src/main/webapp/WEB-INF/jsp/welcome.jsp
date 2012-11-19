<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<%@page contentType="text/html" import="java.util.Date"%>
<html>
  <title>Welcome</title>
  <body>
    <div align="center">
      <center>
       <table border="0" cellpadding="0" cellspacing="0" width="460"   bgcolor="#EEFFCA">
        <tr><td width="100%"><font size="6" color="#008000">&nbsp;Date example</font></td></tr>
        <tr><td width="100%"><b>&nbsp;Current Date and time is:&nbsp;<font color="#FF0000"><%=new Date().toString()%> </font></b></td></tr>
     </table>
  </center>
 </div>
 <div>
 <h2><spring:message code="welcome.message"
        text="Welcome to Court Reservation System" /></h2>
 Today is <fmt:formatDate value="${today}" pattern="yyyy-MM-dd" />.
 </div>
 <div>
<form method="post">
<input type="submit" value="Go To Reservation Query" />
</form>
  </div>
 </body>
</html>