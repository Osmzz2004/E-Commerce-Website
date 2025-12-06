<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
		<style>
		#div{
            max-width: 420px;
            margin: 60px auto;
            background: white;
            padding: 30px;
            border-radius: 12px;
        }
		
		#body{
			text-align: center;
			background: lightgray;
	</style>
    </head>
    <body>
	<h1> Registration </h1>
	<div>
        <s:form action="storeUser" >
			Enter user name <br/>
            <s:textfield name="username" label="userName: " />
			Enter password <br/>
			<s:password name="password" label="password: " />
		     Confirm password <br/>
			<s:password name="password" label="confirmPassword: " />
            <s:submit />
        </s:form>
		</div>
    </body>
</html>