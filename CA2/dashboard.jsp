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
            max-width: 1250px;
            margin: 10px auto;
            background: lightgray;
            padding: 10px;
            border-radius: 5px;
        }
		
		    .bottomContainer{
            max-width: 1100px;
            margin: 10px auto;
            background: black;
            padding:165px;
            border-radius: 5px;
        }
		

		</style>
    </head>
    <body style="text-align: center">
          <br/>
		  <div class="topContainer">
		  <h2>
		  Logged in as <s:property value ="#session.currentUser.username" />
        </h2>
		<s:form action="logOut">
        <s:submit value="Log Out" />
         </s:form>
		</div>
				<div class="bottomContainer">
		  <h2>
		<s:form action="viewMyProfile">
        <s:submit value="View my profile" />
         </s:form>
		 
<a href="searchUser.jsp">
    <button>View other's profile</button>
</a>
<a href="addItem.jsp">
    <button>Add item for sale</button>
</a>
	<a href="placeABid.jsp">
    <button>Place a bid </button>
</a>	 
		 <s:form action="viewAllUsers">
        <s:submit value="View all users" />
         </s:form>
		 
			 <s:form action="viewAllItems">
        <s:submit value="View all items for sale" />
         </s:form>	 
	
</div>
    </body>
</html>
