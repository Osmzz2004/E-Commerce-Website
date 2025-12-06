import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Registration {
private String username;
private String password;
private String confirmPassword;

public Registration() {
	
}

public String validateRegistration() {
	ResultSet rs = null;
	Connection connection = null;
	try {
		connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/users","root", "root");
		
	    PreparedStatement select = connection.prepareStatement(
	            "SELECT * FROM users WHERE username = ?");
	    select.setString(1, username);
	    rs = select.executeQuery();
	    
	    if (rs.next()) {
	    	return "UserExists";
	    }

	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
    
	if (password == null || confirmPassword == null || !password.equals(confirmPassword)) {
		return "PasswordMismatch";
	}else {
		return "RegistrationSuccess";
	}

	
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getConfirmPassword() {
	return confirmPassword;
}

public void setConfirmPassword(String confirmPassword) {
	this.confirmPassword = confirmPassword;
}
}

