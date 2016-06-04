package minhaihuang.bookstore.domain;

public class User {

	// #用户表
	// create table user(
	// id varchar(100) primary key,
	// userName varchar(20) not null unique,
	// password varchar(100) not null,
	// admin boolean default false
	// );

	public static final String MAP_TABLE_NAME = "user";

	private String id;
	private String userName;
	private String password;
	private boolean admin;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isAdmin() {
		return admin;
	}

	public void setAdmin(boolean admin) {
		this.admin = admin;
	}

}
