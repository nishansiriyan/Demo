package JDBC;

import java.util.*;
public class BooKMain {
	public static void main(String[] args) {
		int bookid;
		int bookprice;
		String bookname;
		String bookauthor;
		int start=0,total=3;
		int page=1;
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int choice;
		Validation v=new Validation();
		BookService bs=new BookService();
		while(true) {
			System.out.println("-----------Book------------");
			System.out.println("1. Insert new book:");
			System.out.println("2.Display books:");
			System.out.println("3.Delete book:");
			System.out.println("4.Search book:");
			System.out.println("5:Update book");
			System.out.println("6.Display next 3 ");
			System.out.println("7.Display previous page");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				   System.out.println("Enter the Book Id:");
			       bookid=sc.nextInt();
			       System.out.println("Enter the Book Name:");
			       bookname=sc.next();
			       System.out.println("Enter the Book Author:");
			       bookauthor=sc.next();
			       System.out.println("Enter the Book Price:");
			       bookprice=sc.nextInt();
			       Book b=new Book();
			       	b.setBookId(bookid);
					b.setBookName(bookname);
					b.setAuthor(bookauthor);
					b.setBookPrice(bookprice);
					if(v.validate(b)) {
			        bs.addBook(b);
					}else {
						System.out.println("Error:");
					}
			       break;
			case 2:bs.displayBooks();
					break;
			case 3:
					System.out.println("Enter the id:");
					bookid=sc.nextInt();
					bs.deleteBook(bookid);
					break;
			case 4:
					System.out.println("Enter the book name::");
					bookname=sc.next();
					bs.searchBook(bookname);
					break;
			case 5:
					System.out.println("Enter the Book Id for update:");
					bookid=sc.nextInt();
					System.out.println("Enter the Book Name:");
					bookname=sc.next();
					System.out.println("Enter the Book Author:");
					bookauthor=sc.next();
					System.out.println("Enter the Book Price:");
					bookprice=sc.nextInt();
					Book b2=new Book();
					b2.setBookId(bookid);
					b2.setBookName(bookname);
					b2.setAuthor(bookauthor);
					b2.setBookPrice(bookprice);
					if(v.validate(b2)) {
						 bs.update(b2);
					}else {
						System.out.println("Error");
					}
					break;
			case 6:
					if(start==1) {
						System.out.println(start+"="+page);
						bs.pagination(start, total,page);
						start=start+total;
						page=page+1;
						
						}
					else {
						System.out.println(start+"="+page);
						bs.pagination(start, total,page);
						start=start+total;
						page=page+1;
						
					}
				  
				  break;
				  
			case 7:
				start=start-total;
				page=page-1;
				if(start<=3) {
				    bs.pagination(start, total,page);
			}else {
				start=start-total;
				page=page-1;
				bs.pagination(start, total,page);
				
			}
			break;	   
			default:System.out.println("End of Serching");
					break;
			}
			
			if(choice>8) {
				System.out.println("Inavlid search");
			}
	}
	}
}
