package aimsproject;

public class Store {
	private DigitalVideoDisc[] itemsInStore;
	private int numItems; //So luong dvd hien co trong cua hang
	
	public Store() {
		itemsInStore = new DigitalVideoDisc[100];
		numItems = 0;
	}
	
	//Phuong thuc them DVD vao cua hang
	public void addDVD(DigitalVideoDisc dvd) {
		if (numItems < itemsInStore.length) {
			itemsInStore[numItems] = dvd;
			numItems++;
			System.out.println("DVD added: " + dvd.getTitle());
		} else {
			System.out.println("Store is full, cannot add more DVDs.");
		}
	}
	
	//Phuong thuc xoa DVD khoi cua hang
	public void removeDVD(DigitalVideoDisc dvd) {
		for (int i = 0; i < numItems; i++) {
			if (itemsInStore[i].getId() == dvd.getId()) {
				for (int j = i; j < numItems - 1; j++) {
					itemsInStore[j] = itemsInStore[j + 1];
				}
				itemsInStore[numItems - 1] = null;
				numItems--;
				System.out.println("DVD removed: " + dvd.getTitle());
				return;
			}
		}
		System.out.println("DVD not found in the store.");
	}
	
	
	//Phuong thuc in ra danh sach cac DVD trong cua hang
	public void printStore() {
		System.out.println("*************** Store Inventory ***************");
		for (int i = 0; i < numItems; i++) {
			System.out.println((i + 1) + ". " + itemsInStore[i]);
		}
		System.out.println("***********************************************");
	}
}