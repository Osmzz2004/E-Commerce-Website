<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title>E-Commerce Website</title>
    <style>
        button {
            padding: 20px 60px;
            font-size: 18px;
            cursor: pointer;
            border: none;
            border-radius: 8px;
            background-color: blue;
            color: white;
        }

        .btn {
            display: flex;
            justify-content: center;
            gap: 50px; 
            margin-top: 80px;
        }
		
		.container{
			max-width: 800;
            margin: 60px auto;
            background: lightgray;
            padding: 100px;
            border-radius: 12px;
			}
    </style>
</head>

<body style="font-family: Arial; text-align: center">

<div class="container">
    <h1>E-Commerce Website</h1>

    <div class="btn">
        <button id="logbtn" >Login</button>
        <button id="regbtn">Register</button>
    </div>
</div>
	
    <script>
        var logbtn = document.getElementById("logbtn");
        var regbtn = document.getElementById("regbtn");

        logbtn.addEventListener("click", function() {
            window.location.href = "login.jsp";
        });

        regbtn.addEventListener("click", function() {
            window.location.href = "registration.jsp";
        });
    </script>

</body>
</html>