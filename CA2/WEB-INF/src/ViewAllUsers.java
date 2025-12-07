import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;;

public class ViewAllUsers {
	ArrayList<User> users = new ArrayList<>();
private User user;
    public ViewAllUsers() {
    	
    }
    public User getUser() {
        return user;
    }
    
    public ArrayList<User> getUsers() {
        return users;
    }

    

    public String allUsers() {

        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/accounts", "root", "root")) {

            PreparedStatement select = connection.prepareStatement("SELECT * FROM users");
            ResultSet rs = select.executeQuery();

            while (rs.next()) {
                User user = new User(
                        rs.getString("firstName"),
                        rs.getString("lastName"),
                        rs.getString("phoneNumber"),
                        rs.getString("username"),
                        rs.getString("password")
                );
                users.add(user);
            }

            return "success";

        } catch (SQLException e) {
            e.printStackTrace();
            return "error";
        }
    }
}
