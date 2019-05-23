package Model;

public class Book extends Item implements Printable, Crud {
	private String isbn;

	public Book(String title, String authorRef, String isbn) {
		super(title, authorRef);
		this.isbn = isbn;

	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void print() {
		System.out.println("I am printing");
	}

	@Override
	public void read() {
		// TODO Auto-generated method stub

	}

	@Override
	public void update() {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub

	}
}
