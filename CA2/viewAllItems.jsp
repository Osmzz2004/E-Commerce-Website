<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Items for sale</title>
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
<h1>All items for sale</h1>
<div class="container">
    <table border="1" cellpadding="5" cellspacing="0" style="margin: 0 auto;">
        <tr>
            <th>Seller</th>
            <th>Category</th>
            <th>Description</th>
            <th>Price</th>
        </tr>
        <s:iterator value="items">
            <tr>
                <td><s:property value="seller"/></td>
                <td><s:property value="category"/></td>
                <td><s:property value="description"/></td>
                <td><s:property value="price"/></td>
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