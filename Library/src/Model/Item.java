package Model;

abstract public class Item implements Updateable {
	private String title;
	private String authorRef;

	public Item(String title, String authorRef) {
		this.title = title;
		this.authorRef = authorRef;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorRef() {
		return authorRef;
	}

	public void setAuthorRef(String authorRef) {
		this.authorRef = authorRef;
	}

}
