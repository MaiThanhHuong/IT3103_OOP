import java.util.ArrayList;
import java.util.List;

public class CompactDisc extends Media {
	private String artist;
    private String director;
    private List<Track> tracks;

    public CompactDisc(String id, String title, String category, float cost, String artist, String director) {
        super(id, title, category, cost);
        this.artist = artist;
        this.director = director;
        this.tracks = new ArrayList<>();
    }

    public void addTrack(Track track) {
        tracks.add(track);
    }

    public int getLength() {
        return tracks.stream().mapToInt(Track::getLength).sum();
    }

    @Override
    public void displayDetails() {
        System.out.println("CD Title: " + title);
        System.out.println("Category: " + category);
        System.out.println("Artist: " + artist);
        System.out.println("Director: " + director);
        System.out.println("Length: " + getLength() + " seconds");
        System.out.println("Cost: " + cost + " USD");
        System.out.println("Tracks:");
        for (Track track : tracks) {
            System.out.println(" - " + track.getTitle() + " (" + track.getLength() + " seconds)");
        }
    }

    @Override
    public void play() {
        if (getLength() <= 0) {
            System.out.println("CD \"" + title + "\" cannot be played (invalid length).");
        } else {
            System.out.println("Playing CD: " + title + " (" + getLength() + " seconds)");
            for (Track track : tracks) {
                track.play();
            }
        }
    }
}
