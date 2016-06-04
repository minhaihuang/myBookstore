package minhaihuang.bookstore.web.servlet;
/**
 * 图书相关的方法
 */
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import minhaihuang.bookstore.domain.Book;
import minhaihuang.bookstore.service.BookService;

public class Bookservlet extends HttpServlet {
	private BookService bookService;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//获取请求的方式
		String method=request.getParameter("action");
		
		//查询的方式
		if(method.equals("query")){
			//获取书籍列表
			List<Book> books=bookService.query();
			//设置到web域中
			request.setAttribute("books", books);
			//跳转页面
			request.getRequestDispatcher("bookList.jsp").forward(request, response);
			return;
		}
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

}
