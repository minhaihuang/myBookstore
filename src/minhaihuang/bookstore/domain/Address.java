package minhaihuang.bookstore.domain;

public class Address {
	// #地址表
	// create table address(
	// id varchar(100) primary key,
	// location varchar(255) not null,
	// phone varchar(11) not null,
	// userId varchar(100) not null,
	// userName varchar(100) not null,
	//		
	// foreign key (userId) references user(id)
	// );

	public static final String MAP_TABLE_NAME = "address";

	private String id;
	private String location;
	private String phone;
	private String userId;
	private String userName;

	public String toString() {
		return location + "   收件人: " + userName + " 手机 : " + phone;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
