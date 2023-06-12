<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <title>Employee List</title>
</head>
<body>
    <h2>Employee List</h2>
    <table>
        <thead>
            <tr>
                <th>Sr. No.</th>
                <th>Name</th>
                <th>Birth Date</th>
                <th>Joining Date</th>
                <th>Salary</th>
                <th>Is Fresher Employee</th>
                <th>Edit</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${employees}" var="employee" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${employee.personalMaster.firstName} ${employee.personalMaster.lastName}</td>
                    <td>${employee.personalMaster.birthDate}</td>
                    <td>${employee.joiningDate}</td>
                    <td>${employee.salary}</td>
                    <td>${employee.isFresherEmployee ? 'Yes' : 'No'}</td>
                    <td><a href="/employees/detail/${employee.id}">Edit</a></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
