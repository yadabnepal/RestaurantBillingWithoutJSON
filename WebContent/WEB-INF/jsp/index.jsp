
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="t" tagdir="/WEB-INF/tags" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<t:form>
<div class="login-page">
  <div class="form">
      <h3>First Kitchen</h3>
      <h5 style="color:green">${user}</h5>
    <form:form>
      <form:input path="username" class="input" placeholder="Username" />
       <form:input path="password" type="password" class="input" placeholder="Password" />
      <button class="button">login</button>
      <p class="message">Not registered? <a href="/RestaurantBilling/userRegistration">Create an account</a></p>
    </form:form>
  </div>
</div>
</t:form>