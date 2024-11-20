package dont;

public class Book implements Printable{
	private String bookName;
	private int bookId;

	
	Book(int bookId,String bookName){
		this.bookId=bookId;
		this.bookName=bookName;
	}
	
	public void print() {
		System.out.println("-------------The Book details------------");
		System.out.println("The book ID      : " +this.bookId);
		System.out.println("The book printed : "+this.bookName);
		System.out.println();
	}


}

