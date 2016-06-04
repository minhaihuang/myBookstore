package minhaihuang.bookstore.domain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cart {

	private List<CartItem> cartItemList = new ArrayList<CartItem>();

	public List<CartItem> getCartItemList() {
		return cartItemList;
	}

	public void buy(Book book) {
		for (CartItem cartItem : cartItemList) {
			if (cartItem.getBook().equals(book)) {
				cartItem.setBookCount(cartItem.getBookCount() + 1);
				return;
			}
		}
		CartItem cartItem = new CartItem();
		cartItem.setBook(book);
		cartItem.setBookCount(1);

		cartItemList.add(cartItem);
	}

	public void delete(String bookId) {
		Iterator<CartItem> it = cartItemList.iterator();
		while (it.hasNext()) {
			CartItem cartItem = it.next();
			if (cartItem.getBook().getId().equals(bookId)) {
				it.remove();
				return;
			}
		}
	}

	public void updateCount(String bookId, int bookCount) {
		if (bookCount < 1) {
			return;
		}

		Iterator<CartItem> it = cartItemList.iterator();
		while (it.hasNext()) {
			CartItem cartItem = it.next();
			if (cartItem.getBook().getId().equals(bookId)) {
				cartItem.setBookCount(bookCount);
				return;
			}
		}
	}

	public class CartItem {
		private Book book;
		private int bookCount = 1;

		public String toString() {
			return book + "----count:" + bookCount;
		}

		public Book getBook() {
			return book;
		}

		public void setBook(Book book) {
			this.book = book;
		}

		public int getBookCount() {
			return bookCount;
		}

		public void setBookCount(int bookCount) {
			this.bookCount = bookCount;
		}

	}
}
