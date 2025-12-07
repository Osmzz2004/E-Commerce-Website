

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
		
		
		     .btn{
			margin: 10px;
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
		 
		 <s:form action="viewOthersProfile">
        <s:submit value="View other's profile" />
         </s:form>
		 
		 <s:form action="viewAllUsers">
        <s:submit value="View all users" />
         </s:form>
		 
		 <s:form action="addItemForSale">
        <s:submit value="Add item for sale" />
         </s:form>
		 
		 <s:form action="viewAllItemForSale">
        <s:submit value="View all items for sale" />
         </s:form>
		 
		 <s:form action="makeABid">
        <s:submit value="Make a bid" />
         </s:form>
</div>
    </body>
</html>
