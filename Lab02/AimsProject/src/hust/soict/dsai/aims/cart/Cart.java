package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_ITEM = 20;
	private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_ITEM];
	private int discCount = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (discCount < MAX_ITEM) {
			itemsOrdered[discCount] = disc;
			discCount++;
			System.out.println("Disc " + disc.getTitle() + " has been added.");
		} else {
			System.out.println("The cart is almost full.");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc... dvdList) {
		for (int i = 0; i < dvdList.length; i++) {
			if (discCount < MAX_ITEM) {
				itemsOrdered[discCount] = dvdList[i];
				discCount++;
				System.out.println("The disc has been added.");
			} else {
				System.out.println("The cart is almost full.");
			}
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int check = MAX_ITEM + 1;
		for (int i = 0; i < discCount; i++) {
			if (itemsOrdered[i].getTitle().equals(disc.getTitle()))
				check = i;
		}
		if (check != MAX_ITEM + 1) {
			for (int i = check; i < discCount; i++) {
				itemsOrdered[i] = itemsOrdered[i + 1];
			}
			System.out.println("Disc " + disc.getTitle() + " has been removed.");
			discCount--;
		}
	}
	
	public float totalCost() {
		float totalCost = 0;
		for (int i = 0; i < discCount; i++) {
			totalCost += itemsOrdered[i].getCost();
		}
		
		return totalCost;
	}
	
	public void printCart() {
		System.out.println("*************************CART*************************");
		System.out.println("Ordered Items:");
		for (int i = 0; i < discCount; i++) {
			System.out.println((i + 1) + ". " + itemsOrdered[i].toString());
		}
		System.out.println("Total cost: " + totalCost() + "$");
		System.out.println("******************************************************");
	}
	
	public boolean search(int id) {
		for (DigitalVideoDisc disc : itemsOrdered) {
			if (disc != null && disc.getId() == id) {
				return true;
			}
		}
		return false;
	}
	
	public DigitalVideoDisc getDiscById(int id) {
		for (DigitalVideoDisc disc : itemsOrdered) {
			if (disc != null && disc.getId() == id) {
				return disc;
			}
		}
		return null;
	}
	
	public boolean search(String title) {
		for (DigitalVideoDisc disc : itemsOrdered) {
			if (disc != null && disc.isMatch(title)) {
				return true;
			}
		}
		return false;
	}
	
	public DigitalVideoDisc getDiscByTitle(String title) {
		for (DigitalVideoDisc disc : itemsOrdered) {
			if (disc != null && disc.isMatch(title)) {
				return disc;
			}
		}
		return null;
	}
	
	
}