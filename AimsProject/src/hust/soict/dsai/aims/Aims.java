package hust.soict.dsai.aims;

import hust.soict.dsai.aims.cart.Cart;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart anOrder = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
		//anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
		//anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		//anOrder.addDigitalVideoDisc(dvd3);
		
		DigitalVideoDisc[] dvdList = {dvd1, dvd2, dvd3};
		//anOrder.addDigitalVideoDisc(dvdList);
		anOrder.addDigitalVideoDisc(dvd2,dvd3);
		
		
		//anOrder.removeDigitalVideoDisc(dvd2);
		
		//System.out.print("Total Cost is: ");
		//System.out.println(anOrder.totalCost());
		
		System.out.println("The id of " + dvd1.getTitle() + " is " + dvd1.getId());
		System.out.println("The id of " + dvd2.getTitle() + " is " + dvd2.getId());
		System.out.println("The id of " + dvd3.getTitle() + " is " + dvd3.getId());
		
	}

}
