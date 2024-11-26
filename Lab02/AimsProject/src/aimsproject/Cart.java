package aimsproject;

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
}
