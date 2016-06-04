package minhaihuang.bookstore.domain;

public class Book {

	// #图书表
	// create table books(
	// id varchar(100) primary key,
	// bookName varchar(100) not null,
	// author varchar(50) not null,
	// price float ,
	// imagePath varchar(255),
	// categoryId varchar(100) ,
	//		
	// foreign key (categoryId) references category(id)
	// );

	public static final String MAP_TABLE_NAME = "books";

	private String id;
	private String bookName;
	private String author;
	private double price;
	private String imagePath;
	private String categoryId;

	public String toString() {

		return id + " : " + bookName + " : " + author + " : " + price;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

}
