package Model;

import java.util.ArrayList;

abstract public class ItemManager {
	private ArrayList<Item> inventory = new ArrayList<Item>();

	public ArrayList<Item> addItem(Item newItem) {
		inventory.add(newItem);
		return inventory;
	}

	public ArrayList<Item> getItem() {
		return inventory;
	}

}
