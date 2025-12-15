import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OtherUserProfiles {

    private String username; 
    private User user;       

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

               
                return "success";
            } else {
                return "error";
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return "error";
        }
    }
}

