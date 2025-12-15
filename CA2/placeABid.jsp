<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
    <head>
        <title>Make a bid</title>
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
	<h1> Place a bid on an item </h1>
	<div class="container">
        <s:form action="placeBid" >
			<s:textfield name="category" label="Item category" />
            <s:textfield name="description" label="Item description " />
			<s:textfield name="currentPrice" label="Current item price" />
			<s:textfield name="bidAmount" label="Bid amount" />
            <s:submit value="Place Bid" />
        </s:form>
		</div>
    </body>
</html>