package minhaihuang.bookstore.domain;

public class OrderItem {

	// #订单项
	// create table orderItem(
	// id varchar(100) primary key,
	// bookId varchar(100) not null,
	// bookName varchar(50),#为了编程的方便,其实是冗余数据
	// bookCount int,
	// totalPrice double,
	//		
	// orderId varchar(100) not null,
	//		
	// foreign key (bookId) references books(id),
	// foreign key (orderId) references orders(id)
	// );

	public static final String MAP_TABLE_NAME = "orderItem";

	private String id;
	private String bookId;
	private String bookName;
	private int bookCount;
	private double totalPrice;
	private String orderId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookCount() {
		return bookCount;
	}

	public void setBookCount(int bookCount) {
		this.bookCount = bookCount;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

}
