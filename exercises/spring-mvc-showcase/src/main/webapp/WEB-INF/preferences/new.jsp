<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div>
   <form action="${pageContext.request.contextPath}/preferences/save" method="POST">
      <div>
         <label for="tooltip">Tooltip:</label><input type="text" id="tooltip" name="tooltip"/>
      </div>
      <div>
         <label for="language">Language:</label><input type="text" id="language" name="language"/>
      </div>
      <div>
         <input type="submit" value="Submit"/>
      </div>
   </form>
</div>
