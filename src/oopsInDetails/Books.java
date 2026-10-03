package oopsInDetails;

public class Books {
	public static void main(String[] args) {
		Book b1=new Book();
		b1.title="The Kite Runner";
		b1.author="Khaled Hosseini";
		b1.price=274;
		b1.pages=344;
		System.out.println(b1.title+". "+b1.author+" "+b1.price+" "+b1.pages);
		
		Book b2=new Book();
		b2.title="Faith";
		b2.author="OSHO";
		b2.price=184;
		b2.pages=239;
		System.out.println(b2.title+". "+b2.author+" "+b2.price+" "+b2.pages);
	
		Book b3=new Book();
		b3.title="Attitude is  Everything";
		b3.author="Jef Kelar";
		b3.price=203;
		b3.pages=159;
		System.out.println(b3.title+". "+b3.author+" "+b3.price+" "+b3.pages);
	}

}

class Book{
	String title;
	String author;
	int price;
	int pages;
	
}