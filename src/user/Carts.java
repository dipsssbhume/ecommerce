package user;


public class Carts {

	int cid;
	int pid;
	String userName;
	String productName;
    int price;
    String categories;
	public Carts(int cid, int pid, String userName, String productName, int price, String catrgories) {
		super();
		this.cid = cid;
		this.pid = pid;
		this.userName = userName;
		this.productName = productName;
		this.price = price;
		this.categories = catrgories;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCatrgories() {
		return categories;
	}
	public void setCatrgories(String catrgories) {
		this.categories = catrgories;
	}
	@Override
	public String toString() {
		return "\n"+"Cart [cid=" + cid + ", productid=" + pid + ", userName=" + userName + ", productName=" + productName
				+ ", price=" + price + ", categories=" + categories + "]";
	}
    
    
}
