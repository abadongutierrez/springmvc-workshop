<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div>
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
      <br/>
      <a href="${pageContext.request.contextPath}/formatting/deposit?amount=35.15">Formatting Money 35.15</a>
   </p>

   <h3>Binding</h3>

   <p>
      <a href="${pageContext.request.contextPath}/binder/preferences?values=My Tooltip-English">Binding</a>
      <br/>
   </p>

   <h3>No View</h3>

   <p>
      <a href="${pageContext.request.contextPath}/noview">No view</a>
      <br/>
   </p>

   <h3>Redirect View Controller</h3>

   <p>
      <a href="${pageContext.request.contextPath}/old-index">Redirect</a>
      <br/>
      <a href="${pageContext.request.contextPath}/old-index?message=Hello">Redirect keeping params/</a>
      <br/>
   </p>

   <h3>Localized Hello World!</h3>

   <p>
      <a href="${pageContext.request.contextPath}/i18n/helloWorld?lang=en">English</a>
      <br/>
      <a href="${pageContext.request.contextPath}/i18n/helloWorld?lang=es">Spanish</a>
      <br/>
      <a href="${pageContext.request.contextPath}/i18n/helloWorld?lang=de">German</a>
      <br/>
   </p>

   <h3>Views with layout using Tiles</h3>

   <p>
      <a href="${pageContext.request.contextPath}/layout/welcome?language=en">Welcome (english)</a>
      <br/>
      <a href="${pageContext.request.contextPath}/layout/welcome?language=es">Welcome (spanish)</a>
      <br/>
      <a href="${pageContext.request.contextPath}/layout/welcome?language=de">Welcome (german)</a>
      <br/>
   </p>

</div>
