<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Employee Detail</title>
</head>
<body>
    <h2>Employee Detail</h2>
    <form:form action="/employees/update/${employee.id}" method="POST" modelAttribute="employee">
        <table>
            <tr>
                <td>First Name:</td>
                <td><form:input path="personalMaster.firstName" /></td>
            </tr>
            <tr>
                <td>Last Name:</td>
                <td><form:input path="personalMaster.lastName" /></td>
            </tr>
            <tr>
                <td>Joining Date:</td>
                <td><form:input path="joiningDate" /></td>
            </tr>
            <tr>
                <td>Birth Date:</td>
                <td>${employee.personalMaster.birthDate}</td>
            </tr>
            <tr>
                <td>Qualification:</td>
                <td>
                    <form:select path="qualificationMaster.id">
                        <form:option value="" label="Select" />
                        <form:options items="${qualifications}" itemValue="id" itemLabel="qualification" />
                    </form:select>
                </td>
            </tr>
            <tr>
                <td>Salary:</td>
                <td><form:input path="salary" /></td>
            </tr>
            <tr>
                <td>Is Fresher Employee:</td>
                <td><form:radiobutton path="isFresherEmployee" value="true" label="Yes" />
                    <form:radiobutton path="isFresherEmployee" value="false" label="No" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="Save" /></td>
                <td><a href="/employees/list">Back</a></td>
            </tr>
        </table>
    </form:form>
</body>
</html>
