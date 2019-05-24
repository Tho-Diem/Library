package Model;

public class Book extends Item {
	private String isbn;
	private String condition;

	public Book(String title, String authorRef, String isbn, String condition) {
		super(title, authorRef);
		this.isbn = isbn;
		this.condition = condition;

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

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	@Override
	public void updateTitle(String title) {
		super.setTitle(title);

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.getTitle();
	}

}
