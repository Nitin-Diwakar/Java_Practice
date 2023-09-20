
public class Testing {
	public static void main(String[] args) {
		Author rowling = new Author("J K Rowling", "jkrowing@gmail.com",'f');
		
//		System.out.println(rowling.toString());
		Book harryPotter = new Book("Harry Potter", rowling, 10.99, 2000);
	      System.out.println(harryPotter);
	      System.out.println("$" +harryPotter.getPrice());
	      harryPotter.setPrice(25.99);
	      System.out.print("$" +harryPotter.getPrice());
	}
}
