import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class OtherUserProfiles implements SessionAware {

    private String username; 
    private User user;       
    private Map<String, Object> session;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public User getUser() {
        return user;
    }

    public String viewOtherUsers() {

        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/accounts", "root", "root")) {

            PreparedStatement select = connection.prepareStatement(
                    "SELECT * FROM users WHERE username = ?");
            select.setString(1, username);

            ResultSet rs = select.executeQuery();

            if (rs.next()) {
                user = new User(
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("phoneNumber"),
                        rs.getString("username"),
                        rs.getString("password")
                );

           
                session.put("viewedUser", user);

                return "success";
            } else {
                return "error";
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
