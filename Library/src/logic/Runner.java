package logic;

import Model.Book;

public class Runner {

	public static void main(String[] args) {

		Book book1 = new Book("Java For Dummies", "BUR", "9781118128312", "Excellent");
		Book book2 = new Book("The Hunger Games", "COL", "9788499303321", "Poor");

		// Library myLibrary = new Library();
		// myLibrary.getInventory().add(book1);

		System.out.println(book1);
		book1.updateTitle("Stuuff");
		System.out.println(book1);

	}

}
