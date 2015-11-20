
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
   <title>New Employee</title>
  <style>
    .error { color: red; }
  </style>
</head>
<body>

<h2>New Employee</h2>

<spring:url value="/employees" var="employeesUrl" />

<form:form action="${employeesUrl}" method="post" modelAttribute="employee">
  <div>
    <label for="name">Name:</label>
    <form:input path="name"/>
    <form:errors cssClass="error" path="name" />
  </div>
  <div>
    <label for="name">Last Name:</label>
    <form:input path="lastName"/>
    <form:errors cssClass="error" path="lastName" />
  </div>
  <div>
    <label for="title">Title:</label>
    <form:input path="title"/>
    <form:errors cssClass="error" path="title" />
  </div>
  <div>
    <label for="socialSecurityNumber">SSN:</label>
    <form:input path="socialSecurityNumber"/>
    <form:errors cssClass="error" path="socialSecurityNumber" />
  </div>
  <div>
    <input type="submit">
  </div>
</form:form>

<p><a href="${requestScope.contextPath}/employees">Cancel</a></p>

</body>
</html>
