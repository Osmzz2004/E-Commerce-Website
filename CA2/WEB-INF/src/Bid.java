
public class Bid {
private int itemId;
private String category;
private String description;
private double bidAmount;

public Bid(int itemId, String category, String description, double bidAmount, String bidder) {
	this.itemId = itemId;
	this.category = category;
	this.description = description;
	this.bidAmount = bidAmount;
	this.bidder = bidder;
}

public int getItemId() {
	return itemId;
}
public void setItemId(int itemId) {
	this.itemId = itemId;
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
public double getBidAmount() {
	return bidAmount;
}
public void setBidAmount(double bidAmount) {
	this.bidAmount = bidAmount;
}
public String getBidder() {
	return bidder;
}
public void setBidder(String bidder) {
	this.bidder = bidder;
}
private String bidder;
}
