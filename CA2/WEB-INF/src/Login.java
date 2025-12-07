import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import org.apache.struts2.interceptor.SessionAware;

public class Login implements SessionAware{
private String username;
private String password;
private Map<String, Object> session;
ArrayList<User> users = new ArrayList<>();


public Login() {
	
}

public String validateLogin() {
    Connection connection = null;
    ResultSet rs = null;

    try {
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/accounts", "root", "root");

        PreparedStatement select = connection.prepareStatement(
        		"SELECT * FROM users WHERE username = ? AND password = ?");          
        select.setString(1, username);
        select.setString(2, password);
        rs = select.executeQuery();

        if (rs.next()) {
            User user = new User(
                rs.getString("firstName"),
                rs.getString("lastName"),
                rs.getString("phoneNumber"),
                rs.getString("username"),
                rs.getString("password")
            );

            users.add(user);
            session.put("currentUser", user);
            return "LoginSuccess";
        } else {
            return "LoginFailed";
        }

        
        

    } catch (SQLException e) {
    	e.printStackTrace();
    } 
    
    return "LoginFailed";
}

public String logOut() {
	session.clear();
	return "logOutSuccess";
}

public void setSession(Map map) {
session = map;
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
}
