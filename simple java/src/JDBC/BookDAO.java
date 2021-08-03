package JDBC;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;

import org.apache.commons.dbcp2.BasicDataSource;

public class BookDAO {
	Connection con;
	Statement statement;
	
	
	
	
	public BookDAO(){
		
	}
	
	public void createConnection() {
		
		try {
		    con = ConnectionPooling.getDataSource().getConnection();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void commit() {
		try {
			con.setAutoCommit(false);
			con.commit();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void rollback() {
		try {
			con.setAutoCommit(false);
			con.rollback();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void closeConnection() {
		try {
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Boolean insertBook(Book b){
		String insertEmp="insert into BOOKDB.tblBook(book_id,book_name,book_author,book_price)values(?,?,?,?);";
		try {
			createConnection();
			PreparedStatement ps=con.prepareStatement(insertEmp);
			ps.setInt(1, b.getBookId());
			ps.setString(2, b.getBookName());
			ps.setString(3, b.getAuthor());
			//ps.setInt(4, b.getBookPrice());
			return ps.executeUpdate()>0;
		} catch (SQLException e) {
			rollback();
			System.out.println("Transaction cancelled");
			e.printStackTrace();
		}
		return false;
	}
	
	public List<Book> display(){
		List<Book>bookList=new ArrayList<Book>();
		String displayEmo="select * from BOOKDB.tblBook";
		try {
			
			createConnection();
			//PreparedStatement ps=con.prepareStatement(displayEmo);
			statement=con.createStatement();
			ResultSet rs =  statement.executeQuery(displayEmo);
			while(rs.next()) {
				Book b=new Book();
				b.setBookId(rs.getInt("book_id"));
				b.setBookName(rs.getString("book_name"));
				b.setAuthor(rs.getString("book_author"));
				b.setBookPrice(rs.getInt("book_price"));
				bookList.add(b);
				
			}
			return bookList;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean delet(int bookid)  {
		String deletebook="delete from BOOKDB.tblBook where tblBook.book_id=?";
		createConnection();
		try {
			PreparedStatement ps=con.prepareStatement(deletebook);
			ps.setInt(1, bookid);
			return ps.executeUpdate()>0;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	public List<Book>search(String bookname){
		String searchbook="select * from BOOKDB.tblBook where tblBook.book_name LIKE ?";
		List<Book>searchList=new ArrayList<Book>();
		createConnection();
		try {
			PreparedStatement ps=con.prepareStatement(searchbook);
			ps.setString(1, bookname);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Book b=new Book();
				b.setBookId(rs.getInt("book_id"));
				b.setBookName(rs.getString("book_name"));
				b.setAuthor(rs.getString("book_author"));
				b.setBookPrice(rs.getInt("book_price"));
				searchList.add(b);
				}
			return searchList;
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		return null;
	}
	
	public Boolean updateBook(Book b) {
		String updateBook="update BOOKDB.tblBook set tblBook.book_name=?,tblBook.book_author=?,tblBook.book_price=? where tblBook.book_id=?";
		try {
			createConnection();
			PreparedStatement ps=con.prepareStatement(updateBook);
			ps.setString(1, b.getBookName());
			ps.setString(2, b.getAuthor());
			ps.setInt(3, b.getBookPrice());
			ps.setInt(4, b.getBookId());
			return ps.executeUpdate() > 0;
		}catch(Exception e) {
			rollback();
			System.out.println("Transaction cancelled");
			e.printStackTrace();
		}
		return false;
	}
	
	public List<Book>getRecords(int start,int total){
		String querry="select * from BOOKDB.tblBook limit ?,?";
		List<Book>bookList=new ArrayList<Book>();
		createConnection();
		try {
			PreparedStatement ps=con.prepareStatement(querry);
			ps.setInt(1, (start));
			ps.setInt(2, total);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Book b=new Book();
				b.setBookId(rs.getInt("book_id"));
				b.setBookName(rs.getString("book_name"));
				b.setAuthor(rs.getString("book_author"));
				b.setBookPrice(rs.getInt("book_price"));
				bookList.add(b);
				}
			return bookList;
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		return Collections.emptyList();
		
	}
}
