package minhaihuang.bookstore.dao;

import java.util.List;

import minhaihuang.bookstore.domain.Book;

/**
 * 这是dao层，直接与数据库进行交互，
 * @author 黄帅哥
 *
 */
public interface BookDao {

	public List<Book> query();
}
