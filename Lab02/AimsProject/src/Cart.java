import java.util.LinkedList;

public class Cart {
	public static final int MAX_ITEM = 20;
	LinkedList<DigitalVideoDisc> digitalVideoDiscs = new LinkedList<>();
	public int discCount = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (discCount < MAX_ITEM) {
			digitalVideoDiscs.add(disc);
			discCount++;
			System.out.println("Disc" + disc.getTitle() + " added to cart");
		} else {
			System.out.println("Cart is already full!");
		}
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if (discCount == 0) {
			System.out.println("Cart is empty!");
		}
		else {
			if (digitalVideoDiscs.remove(disc)) {
				discCount--;
				System.out.println("Disc" + disc.getTitle() + " removed from cart");
			}
			else {
				System.out.println("Disc not found in cart!");
			}
		}
	}
	
	public float calculateTotalCost() {
		float total = 0f;
		for (DigitalVideoDisc disc : digitalVideoDiscs) {
			total += disc.getCost();
		}
		return total;
	}
	
	public void cartDetails() {
		System.out.println("DVDs in cart:");
		for(DigitalVideoDisc disc : digitalVideoDiscs) {
			System.out.println(disc.getTitle());
		}
		System.out.println("Total cost: " + calculateTotalCost());
	}
}
