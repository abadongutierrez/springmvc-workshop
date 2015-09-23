<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
   <title>Welcome to Spring @MVC Showcase</title>
</head>
<body>
   <h1>Welcome</h1>
   <p>
      <a href="${pageContext.request.contextPath}/helloWorld">Hello!</a>
   </p>
   <p>
      <a href="${pageContext.request.contextPath}/preferences/new">Set Preferences</a>
   </p>
   <h3>Formatting</h3>
   <p>
      <a href="${pageContext.request.contextPath}/formatting/date/2015-10-10">Formatting Date 2015-10-10</a>
      <br />
      <a href="${pageContext.request.contextPath}/formatting/deposit?amount=35.15">Formatting Money 35.15</a>
   </p>
   <h3>Binding</h3>
   <p>
      <a href="${pageContext.request.contextPath}/binder/preferences?values=My Tooltip-English">Binding</a>
      <br />
   </p>
   <h3>No View</h3>
   <p>
       <a href="${pageContext.request.contextPath}/noview">No view</a>
       <br />
   </p>
   <h3>Redirect View Controller</h3>
   <p>
       <a href="${pageContext.request.contextPath}/old-index">Redirect</a>
       <br />
       <a href="${pageContext.request.contextPath}/old-index?message=Hello">Redirect keeping params/</a>
       <br />
   </p>
</body>
</html>
