

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Dashboard</title>
				<style>
		.topContainer{
            max-width: 1100px;
            margin: 10px auto;
            background: lightgray;
            padding: 15px;
            border-radius: 5px;
        }
		
		     .btnLogOff {
            padding: 8px 30px;
            font-size: 12px;
            cursor: pointer;
            border: none;
            border-radius: 8px;
            background-color: blue;
            color: white;
        }
		</style>
    </head>
    <body style="text-align: center">
          <br/>
		  <div class="topContainer">
		  <h2>
		  Logged in as <s:property value ="#session.currentUser" />
        </h2>
		<button class="btnLogOff">Logoff</button>
		</div>
    </body>
</html>
