import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Map;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import org.apache.struts2.interceptor.SessionAware;

public class AddItem implements SessionAware {
private String category;
private String description;
private String price;
private Map<String, Object> session;
ArrayList<Item> items = new ArrayList<>();

	public AddItem() {
		
	}
	
	public String addItemForSale() {
	    if (session == null || session.get("currentUser") == null) {
	        return "login"; // redirect to login
	    }

	    User user = (User) session.get("currentUser"); // safe now
	    String username = user.getUsername();



        double itemPrice;
        try {
            itemPrice = Double.parseDouble(price.trim());
        } catch (NumberFormatException e) {
            return "failure"; // invalid number entered
        }
	    Connection connection = null;
	   

	    try {
	        connection = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/accounts","root", "root");

	        PreparedStatement insert = connection.prepareStatement(
	                "INSERT INTO items (category, description, price, seller) VALUES (?, ?, ?, ?)");
	        insert.setString(1, category);
	        insert.setString(2, description);
	        insert.setDouble(3, itemPrice);
	        insert.setString(4, username);
	        int rowUpdated = insert.executeUpdate();
	        /*
	        Item item = new Item();
	        item.setCategory(category);
	        item.setDescription(description);
	        item.setPrice(itemPrice);
	        item.setSeller(username);
*/
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return "failure";
	    }
	    
	    return "success";
	}

	@Override
	public void setSession(Map map) {
		session = map;
		
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
}
