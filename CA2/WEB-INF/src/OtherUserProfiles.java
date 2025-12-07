import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class OtherUserProfiles implements SessionAware {

    private String username; // the username to search
    private User user;       // the user object to display
    private Map<String, Object> session;

    // Getter and Setter for username (from form)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter for user (for JSP)
    public User getUser() {
        return user;
    }


    // Action method
    public String viewOtherUsers() {

        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/accounts", "root", "root")) {

            PreparedStatement select = connection.prepareStatement(
                    "SELECT * FROM users WHERE username = ?");
            select.setString(1, username);

            ResultSet rs = select.executeQuery();

            if (rs.next()) {
                // Create user object using parameterized constructor
                user = new User(
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("phoneNumber"),
                        rs.getString("username"),
                        rs.getString("password")
                );

                // Optionally, store in session if needed
                session.put("viewedUser", user);

                return "success";
            } else {
                return "error"; // username not found
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return "error";
        }
    }
    
    public void setSession(Map map) {
    	session = map;
    	}
}
