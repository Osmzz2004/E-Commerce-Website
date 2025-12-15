import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ViewAllItems {
    private ArrayList<Item> items = new ArrayList<>();

    public ArrayList<Item> getItems() {
        return items;
    }

    public String viewAllItemsForSale() {
        ResultSet rs = null;
        Connection connection = null;

        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/accounts", "root", "root");

            PreparedStatement select = connection.prepareStatement(
                    "SELECT * FROM items"
            );

            rs = select.executeQuery();

            while (rs.next()) {
                Item item = new Item();
                item.setCategory(rs.getString("category"));
                item.setDescription(rs.getString("description"));
                item.setPrice(rs.getDouble("price"));
                item.setSeller(rs.getString("seller"));
                items.add(item);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return "failure";
        } 

        if (items.isEmpty()) {
            return "noItems"; 
        } else {
            return "success";
        }
    }
}
