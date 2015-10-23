<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>

<html>
<head>
   <title>
     <fmt:message>
       <tiles:insertAttribute name="title"/>
     </fmt:message>
   </title>
</head>
<body>
   <div id="header" class="clearfix">
      <p><fmt:message key="header.message"/></p>
   </div>
   <div id="content">
     <tiles:insertAttribute name="main" />
   </div>
   <div id="footer" class="clearfix">
     <p><fmt:message key="footer.message"/></p>
   </div>
</body>
</html>
