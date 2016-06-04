package minhaihuang.bookstore.service;

import java.util.ArrayList;
import java.util.List;

import minhaihuang.bookstore.dao.BookDaoImplement;
import minhaihuang.bookstore.domain.Book;

/**
 * service层，负责处理数据
 * @author 黄帅哥
 *
 */
public class BookService {
	private BookDaoImplement bookDaoImplement;
	/**
	 *查询数据
	 */
	public List<Book> query(){
		List<Book> books=new ArrayList<Book>();
		books=bookDaoImplement.query();
		return books;
	}
}
