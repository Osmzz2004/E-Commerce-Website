<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
				<style>
		.container{
            max-width: 500px;
            margin: 10px auto;
            background: lightgray;
            padding: 100px;
            border-radius: 5px;
        }
		</style>
<body style="text-align: center">
<h1>All users</h1>
<div class="container">
    <table border="1" cellpadding="5" cellspacing="0" style="margin: 0 auto;">
        <tr>
            <th>User Name</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Phone Number</th>
        </tr>
        <s:iterator value="users">
            <tr>
                <td><s:property value="username"/></td>
                <td><s:property value="firstName"/></td>
                <td><s:property value="lastName"/></td>
                <td><s:property value="phoneNumber"/></td>
            </tr>
        </s:iterator>
    </table>

    <br/>
<a href="dashboard.jsp">
    <button class="btn">Go back to dashboard</button>
</a>

	</div>
</body>
</html>