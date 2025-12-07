<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
		<style>
		.container{
            max-width: 400px;
            margin: 60px auto;
            background: white;
            padding: 30px;
            border-radius: 12px;
        }
		
		body{
			text-align: center;
			background: lightgray;
		}

	</style>
    </head>
    <body>
	<h1> Login </h1>
	<div class="container">
        <s:form action="login" >
            <s:textfield name="username" label="User name " />
			<s:password name="password" label="Password " />
            <s:submit />
        </s:form>
		</div>
    </body>
</html>
