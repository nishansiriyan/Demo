package JDBC;
public interface BookReference {
	public void addBook(Book b);
	public void displayBooks();
	public void deleteBook(int bookid);
	public void searchBook(String bookname);
	public void update(Book b);
	public void pagination(int start,int total,int page);
}
