package JDBC;
import java.util.*;
public class BookService implements BookReference{
	public int bookid;
	public int bookprice;
	public String bookname;
	public String bookauthor;
	BookDAO dao=new BookDAO();
	@Override
	public void addBook(Book b) {
		if(dao.insertBook(b)) {
			System.out.println("Inserted Sucessfully");
			dao.commit();
			dao.closeConnection();
		}
	}

	@Override
	public void displayBooks() {
		List<Book>books=new ArrayList<Book>();
		books=dao.display();
		dao.closeConnection();
		System.out.println("*************Book Details****************");
		for(Book book:books) {
			System.out.println("Book ID:"+book.getBookId());
			System.out.println("Book Name:"+book.getBookName());
			System.out.println("Book Author:"+book.getAuthor());
			System.out.println("Book Price:"+book.getBookPrice());
			System.out.println("-------------------------------------");
		}
	}

	@Override
	public void deleteBook(int bookid) {
		if(dao.delet(bookid)) {
			System.out.println("Book is sucessfully deleted");
			dao.closeConnection();
		}
	}

	@Override
	public void searchBook(String bookname) {
		List<Book>searchList=new ArrayList<Book>();
		searchList=dao.search(bookname);
		dao.closeConnection();
		System.out.println("*************Book Details****************");
		for(Book book:searchList) {
			System.out.println("Book ID:"+book.getBookId());
			System.out.println("Book Name:"+book.getBookName());
			System.out.println("Book Author:"+book.getAuthor());
			System.out.println("Book Price:"+book.getBookPrice());
			System.out.println("-------------------------------------");
		}
	}

	@Override
	public void update(Book b) {
		b.setBookId(bookid);
		b.setBookName(bookname);
		b.setAuthor(bookauthor);
		b.setBookPrice(bookprice);
		if(dao.updateBook(b)){
			System.out.println("Updated sucessfully");
			dao.commit();
			dao.closeConnection();
		}
		
	}

	@Override
	public void pagination(int start, int total,int page) {
		List<Book>bookList=new ArrayList<Book>();
		bookList=dao.getRecords(start, total);
		dao.closeConnection();
		System.out.println("*************Book Details****************  Page Number:"+page);
		System.out.println("BOOK ID\t\tBOOK NAME\tBOOK AUTHOR\tPRICE");
		for(Book book:bookList) {
			System.out.println(book.getBookId()+"\t\t"+book.getBookName()+"\t\t"+book.getAuthor()+"\t\t"+book.getBookPrice());
		}
	}

}
