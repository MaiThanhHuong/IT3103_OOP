package hust.soict.dsai.aims.media;


public class DigitalVideoDisc extends Media{
	private String director;
	private int length;
	
	
	
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	

	public void setDirector(String director) {
		this.director = director;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String toString() {
		return "DVD{" +
				"Title= " + getTitle() + 
				", Category= " + getCategory() + 
				", Director= " + director + 
				", Length= " + length + 
				", Price= " + getCost() +
				"}";
	}
	
	
	
	 //@Override
	    public void displayDetails() {
	        System.out.println("DVD Title: " + getTitle());
	        System.out.println("Category: " + getCategory());
	        System.out.println("Director: " + director);
	        System.out.println("Length: " + length + " seconds");
	        System.out.println("Cost: " + getCost() + " USD");
	    }

	    //@Override
	    public void play() {
	        if (length <= 0) {
	            System.out.println("DVD \"" + getTitle() + "\" cannot be played (invalid length).");
	        } else {
	            System.out.println("Playing DVD: " + getTitle() + " (" + length + " seconds)");
	        }
	    }
	
}
