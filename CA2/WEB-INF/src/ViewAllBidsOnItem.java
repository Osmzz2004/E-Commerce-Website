import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ViewAllBidsOnItem {

    private String category;
    private String description;
    private ArrayList<Bid> bids = new ArrayList<>();

    public ViewAllBidsOnItem() {
    }

    public ArrayList<Bid> getBids() {
        return bids;
    }

    public String viewBidsOnItem() {

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/accounts", "root", "root");

            PreparedStatement select = connection.prepareStatement(
                    "SELECT * FROM bids WHERE category = ? AND description = ?");
            select.setString(1, category);
            select.setString(2, description);

            ResultSet rs = select.executeQuery();

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
}
