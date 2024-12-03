package hust.soict.dsai.aims.store;

import hust.soict.dsai.aims.media.Media;
import java.util.ArrayList;

public class Store {
	private ArrayList<Media> itemsInStore; //Danh sach cAC Media trong cua hang
	
	public Store() {
		itemsInStore = new ArrayList<>();
	}
	// Phuong thuc them Media vao cua hang
    public void addMedia(Media media) {
        if (itemsInStore.contains(media)) {
            System.out.println("Media already exists in the store: " + media.getTitle());
        } else {
            itemsInStore.add(media);
            System.out.println("Media added: " + media.getTitle());
        }
    }

    // Phuong thuc xoa Media khoi cua hang
    public void removeMedia(Media media) {
        if (itemsInStore.remove(media)) {
            System.out.println("Media removed: " + media.getTitle());
        } else {
            System.out.println("Media not found in the store.");
        }
    }

    // Phuong thuc in danh sach cac Media trong cua hang
    public void printStore() {
        System.out.println("*************** Store Inventory ***************");
        for (int i = 0; i < itemsInStore.size(); i++) {
            System.out.println((i + 1) + ". " + itemsInStore.get(i).toString());
        }
        System.out.println("***********************************************");
    }
}
