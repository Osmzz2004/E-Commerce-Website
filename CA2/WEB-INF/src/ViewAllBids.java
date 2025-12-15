import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ViewAllBids {
	 private ArrayList<Bid> bids = new ArrayList<>();

	    public ArrayList<Bid> getBids() {
	        return bids;
	    }

	    public String viewAllBids() {
	        ResultSet rs = null;
	        Connection connection = null;

	        try {
	            connection = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/accounts", "root", "root");

	            PreparedStatement select = connection.prepareStatement(
	                    "SELECT * FROM bids"
	            );

	            rs = select.executeQuery();

	            while (rs.next()) {
	                Bid bid = new Bid();
	                bid.setItemId(rs.getInt("item_id"));
	                bid.setCategory(rs.getString("category"));
	                bid.setDescription(rs.getString("description"));
	                bid.setBidAmount(rs.getDouble("bid_amount"));
	                bid.setBidder(rs.getString("bidder"));
	                bids.add(bid);
	            }

	        } catch (SQLException e) {
	            e.printStackTrace();
	            return "failure";
	        } 

	        if (bids.isEmpty()) {
	            return "noItems"; 
	        } else {
	            return "success";
	        }
	    }
	}