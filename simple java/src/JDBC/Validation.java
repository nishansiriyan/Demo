package JDBC;
public class Validation {
	public boolean checkString(String s) {
		char c=s.charAt(0);
		int ascii=c;
		if(ascii<65 ||ascii>90) {
			return true;
		}
		return false;
	}
	public boolean validate(Book b) {
		if(b.getBookId()<100 ||b.getBookId()>1000) {
			System.out.println("Book id should be greater than 100 less than 1000");
			return false;
		}
		
		if(checkString(b.getBookName())) {
			System.out.println("Book nameFirst character should be capital");
			return false;
		}
		if(checkString(b.getAuthor())) {
			System.out.println("Author First character should be capital");
			return false;
		}
		
		if(b.getBookPrice()<0|| b.getBookPrice()>1000) {
			System.out.println("Enter the proper price");
		}
		return true;
	}

	
}
