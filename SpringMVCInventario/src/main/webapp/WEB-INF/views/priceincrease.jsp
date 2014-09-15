<%@ include file="/WEB-INF/views/include.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
  <title><fmt:message key="title"/></title>
  <style>
    .error { color: red; }
    .increasetable {
    	width: 95%;
    	background: #f8f8ff;
    	border: 0;
    	border-spacing: 0;
    }
    .increasetable td { padding: 5px; }
    .increasetable #col-label {
    	width: 20%;
    	text-align: right;
    }
    .increasetable #col-field { width: 20%; }
    .increasetable #col-error { width: 60%; }
  </style>  
</head>
<body>
<h1><fmt:message key="priceincrease.heading"/></h1>
<form:form method="post" commandName="priceIncrease">
  <table class="increasetable">
    <tr>
      <td id="col-label">Increase (%):</td>
      <td id="col-field">
      	<form:input path="percentage"/>
      </td>
      <td id="col-error">
      	<form:errors path="percentage" cssClass="error"/>
      </td>
    </tr>
  </table>
  <br>
  <input type="submit" value="Execute">
</form:form>
<a href="<c:url value="hello.htm"/>">Home</a>
</body>
</html>