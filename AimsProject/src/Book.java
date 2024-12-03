import java.util.List;

public class Book extends Media {
	private List<String> authors;
    private String content;

    public Book(String id, String title, String category, float cost, List<String> authors, String content) {
        super(id, title, category, cost);
        this.authors = authors;
        this.content = content;
    }

    @Override
    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Category: " + category);
        System.out.println("Authors: " + authors);
        System.out.println("Content Length (tokens): " + content.split("\\s+").length);
    }

    @Override
    public void play() {
        System.out.println("Books cannot be played.");
    }
}
