package minhaihuang.bookstore.domain;

public class Order {
	// #订单
	// create table orders(
	// id varchar(100) primary key,
	// orderNumber varchar(50) not null unique,#订单号
	// totalPrice double ,
	// status varchar(10),
	// userId varchar(100) not null,
	// addressId varchar(100) not null,
	//		
	// foreign key (userId) references user(id),
	// foreign key (addressId) references address(id)
	// );

	public static final String MAP_TABLE_NAME = "orders";

	private String id;
	private String orderNumber;
	private double totalPrice;
	private String status;
	private String userId;
	private String addressId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getAddressId() {
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

}
