package oopsdemo4;

/**
 * Author : Kopparapu.Sruthi
 * Date   : 30 Oct 2024
 * Time   : 12:44:11 pm
 * Email  : Kopparapu.Sruthi@coforge.com
 */

public class Book implements IItem{

	private String title;
	private String author;
	private boolean  available;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.available = true;
	}

	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return title;
	}

	@Override
	public String getAuthor() {
		// TODO Auto-generated method stub
		return author;
	}

	@Override
	public String getCategory() {
		// TODO Auto-generated method stub
		return "Book";
	}

	@Override
	public boolean isAvailable() {
		// TODO Auto-generated method stub
		return available;
	}

	@Override
	public void borrowItem() {
		if (available) {
			available = false;
			System.out.println(title + " has been borrowed.");
		} else {
			System.out.println(title + " is not available.");
		}

	}

	@Override
	public void returnItem() {
		available = true;
        System.out.println(title + " has been returned.");

	}



}
