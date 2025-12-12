<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
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
	<h1> Add item for sale </h1>
	<div class="container">
        <s:form action="addItem" >
			<s:textfield name="category" label="Item category" />
            <s:textfield name="description" label="Item description " />
			<s:texfield name="price" label="Item price" />
            <s:submit />
        </s:form>
		</div>
    </body>
</html>