
public abstract class Media {
	protected String id;
	protected String title;
	protected String category;
	protected float cost;
	
	public Media(String id, String title, String category, float cost) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.cost = cost;
	}
	
	public abstract void displayDetails();

    public abstract void play();
	
	
}
