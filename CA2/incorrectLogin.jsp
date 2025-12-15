<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
    <head>
        <title>Incorrect Username or Password</title>
    </head>
	    <style>
		div{
            max-width: 500px;
            margin: 60px auto;
            background: white;
            padding: 30px;
            border-radius: 12px;
        }
		
		#btn{
		    padding: 20px 60px;
            font-size: 18px;
            cursor: pointer;
            border: none;
            border-radius: 8px;
            background-color: blue;
            color: white;
			}
		body{
			text-align: center;
			background: lightgray;
    </style>
    <body>
	<div>
        <h1>Incorrect Username or Password</h1>
		<button id="btn"> Go to home page </button>
		</div>
		<script>
		var btn =  document.getElementById("btn");
	  
	    btn.addEventListener("click", function(event) {
		window.location.href = "index.html"
		});
		</script>
    </body>
</html>