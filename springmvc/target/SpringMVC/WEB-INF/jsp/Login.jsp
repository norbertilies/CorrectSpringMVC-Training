<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%--
  Created by IntelliJ IDEA.
  User: nilies
  Date: 7/14/2016
  Time: 2:57 PM
  To change this template use File | Settings | File Templates.
--%>

<html>
<form:form  modelAttribute="userForm" method="POST" action="/spring/success">
    <table>
        <tr>
            <td> username</td>
            <td><form:input path="username"/></td>
        </tr>
        <tr>
            <td> password</td>
            <td><form:input path="password"/></td>
        </tr>
        <tr>
            <td>age</td>
            <td><form:input path="age"/></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Submit">
            </td>
        </tr>
    </table>
</form:form>
</html>
