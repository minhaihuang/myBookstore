<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- 查询区域 -->
		<div style="float: left; margin-left: 10%;">
			<form action="${pageContext.request.contextPath}/BookServlet">
				<input type="hidden" name="action" value="pageQuery" />
				<table>
					<caption> 查询图书 </caption>
					<tr>
						<td> 图书名称 </td>
						<td> <input name="bookName" value="${bookName}"/> </td>
					</tr>
					<tr> 
						<td> 图书类别 </td>
						<td> <select name="categoryId">
								<option value="">
									- -- -
								</option>
								<c:forEach items="${categoryList}" var="category">
									<option value="${category.id }"   ${(category.id == categoryId) ?'selected="selected"':''  }>
										${category.categoryName }
									</option>
								</c:forEach>
							</select>
						</td>
					</tr>
					<tr>
						<td> 作者 </td>
						<td> <input  name="author"  value="${author}"/> </td>
					</tr>
					<tr> <td></td>
						<td> <input type="submit" value="查询" /> </td>
					</tr>
				</table>
			</form>
		</div>

	<div style="float: left; margin-left: 10%;">
			<c:forEach items="${bookList}" var="book">
				<div style="margin-top: 30px;">
				
					<div style="float: left; margint: 10px;">
						<img style="width: 90px;"   src=" ${pageContext.request.contextPath}${book.imagePath }"  />
					</div>
					
					<div style="float: left; ">
						书名 : ${book.bookName }<br />
						作者 : ${book.author }<br />
						价格 : ${book.price }<br />
						
						<a target="" href="${pageContext.request.contextPath}/CartServlet?action=add&bookId=${book.id }">点击购买</a>
					</div>
				</div>
				<div style="clear: left;"></div>
			</c:forEach>
</body>
</html>