<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
   <title>Employee</title>
</head>
<body>

<h2>Employee</h2>

<table>
  <tbody>
    <tr>
      <td>Name:</td>
      <td>${employee.name}</td>
    </tr>
    <tr>
      <td>Last Name:</td>
      <td>${employee.lastName}</td>
    </tr>
    <tr>
      <td>Title:</td>
      <td>${employee.title}</td>
    </tr>
    <tr>
      <td>SSN:</td>
      <td><spring:eval expression="employee.socialSecurityNumber" /></td>
    </tr>
  </tbody>
</table>

<p><a href="${requestScope.contextPath}/employees">List</a></p>

</body>
</html>
