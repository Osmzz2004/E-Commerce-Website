import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Registration {
private String firstName;
private String lastName;
private String phoneNumber;
private String username;
private String password;
private String confirmPassword;

public Registration() {
	
}

public String validateRegistration() {
    ResultSet rs = null;
    Connection connection = null;

    if (password == null || confirmPassword == null || !password.equals(confirmPassword)) {
        return "PasswordMismatch"; 
    }

    try {
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/accounts","root", "root");

        PreparedStatement select = connection.prepareStatement(
                "SELECT * FROM users WHERE username = ?");
        select.setString(1, username);
        rs = select.executeQuery();

        if (rs.next()) {
            return "UserExists";
        } else {
            PreparedStatement insert = connection.prepareStatement(
                    "INSERT INTO users (username, password, firstName, lastName, phoneNumber) VALUES (?, ?, ?, ?, ?)");
            insert.setString(1, username);
            insert.setString(2, password);
            insert.setString(3, firstName);
            insert.setString(4, lastName);
            insert.setString(5, phoneNumber);
            int rowUpdated = insert.executeUpdate();
            return "RegistrationSuccess";

        }

    } catch (SQLException e) {
        e.printStackTrace();
        return "RegistrationFailed";
    }
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
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

