package week1.HomeAssignments;

public class Library {
	String addBook(String bookTitle)
	{
		System.out.println("Book Added Successfully");
		return bookTitle;
	}
	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}
	public static void main(String[] args) {
		Library obj=new Library();
		System.out.println(obj.addBook("Dictionary"));
		obj.issueBook();
	}
}
