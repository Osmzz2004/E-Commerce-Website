import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;

public class MakeABid implements SessionAware{
	private String category;
	private String description;
	private String currentPrice;
	private String bidAmount;
	private Map<String, Object> session;
	public MakeABid() {
		
	}
	
	public String placeBidOnItem() {
		User currentUser = (User) session.get("currentUser");
		String bidder = currentUser.getUsername();
		Double bid_Amount = Double.parseDouble(bidAmount.trim());
		
        try (Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/accounts", "root", "root")) {

            PreparedStatement select = connection.prepareStatement(
                    "SELECT * FROM items WHERE category = ? AND description = ? AND price = ?");
            select.setString(1, category);
            select.setString(2, description);
            select.setString(3, currentPrice);

            ResultSet rs = select.executeQuery();

            if (rs.next()) {
                int itemId = rs.getInt("item_id");

           
                PreparedStatement insert = connection.prepareStatement(
                        "INSERT INTO bids (item_id, bidder, bid_amount, category, description) VALUES (?, ?, ?, ?, ?)"
                );
                insert.setInt(1, itemId);
                insert.setString(2, bidder);          
                insert.setDouble(3, bid_Amount);
                insert.setString(4, category);
                insert.setString(5, description);
                int rows = insert.executeUpdate();
                return "success";
	    }
            else {
            	return "failure";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "failure";
}

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

	public String getCurrentPrice() {
		return currentPrice;
	}

	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}

	public String getBidAmount() {
		return bidAmount;
	}

	public void setBidAmount(String bidAmount) {
		this.bidAmount = bidAmount;
	}
	
	}
