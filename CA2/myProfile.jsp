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
<h1>My Profile</h1>
<h3>
	First name: <s:property value ="#session.currentUser.firstName" />
	<br/>
	Last name: <s:property value ="#session.currentUser.lastName" />
	<br/>
	Username: <s:property value ="#session.currentUser.username" />
	<br/>
	Phone number: <s:property value ="#session.currentUser.phoneNumber" />
	</h3>
	</div>
</body>
</html>