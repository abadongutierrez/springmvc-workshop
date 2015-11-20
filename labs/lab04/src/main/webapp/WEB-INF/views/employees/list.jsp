<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
   <title>Employees - List</title>
</head>
<body>

<h2>Employees</h2>

<p><a href="${requestScope.contextPath}/employees/new">New</a></p>

<table>
   <thead>
   <tr>
      <th>Name</th>
      <th>Last Name</th>
      <th>Title</th>
      <th>SSN</th>
      <th></th>
   </tr>
   </thead>
   <tbody>
   <c:forEach var="employee" items="${employeeList}">
      <tr>
         <td>
               ${employee.name}
         </td>
         <td>
               ${employee.lastName}
         </td>
         <td>
               ${employee.title}
         </td>
         <td>
               <spring:eval expression="employee.socialSecurityNumber" />
         </td>
         <td>
               <a href="${requestScope.contextPath}/employees/${employee.id}">View</a>
         </td>
      </tr>
   </c:forEach>
   </tbody>
</table>

</body>
</html>
