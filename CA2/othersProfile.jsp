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
<div class="container">
<h1><s:property value="username "/> profile</h1>
<h2><s:property value="user.username"/> Profile</h2>
<p>First Name: <s:property value="user.firstName"/></p>
<p>Last Name: <s:property value="user.lastName"/></p>
<p>Phone Number: <s:property value="user.phoneNumber"/></p>
<a href="dashboard.jsp">
    <button class="btn">Go back to dashboard</button>
</a>

	</div>
</body>
</html>