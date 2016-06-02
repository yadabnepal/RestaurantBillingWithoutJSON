<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<t:form>

<div class="login-page">
<div class="form">
<form:form method="POST" action="/RestaurantBilling/userRegistration">
  <form:input path="username" class="input" placeholder="Username" />
  <form:input path="password" type="password" class="input" placeholder="Password" />
  <input type="password" class="input" placeholder="Confirm Password" />
            <button class="button">Register</button>
<p class="message">Already registered? <a href="/RestaurantBilling">Sign In</a></p>

</form:form>
</div>
</div>
</t:form>