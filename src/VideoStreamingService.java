abstract class Video {
    private String title;
    private int duration;

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public abstract String getInfo();
}

class TvSeries extends Video {
    private int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return episodes;
    }

    @Override
    public String getInfo() {
        return "TV Series: Title - " + getTitle() + ", Duration - " + getDuration() + " minutes, Episodes - " + episodes;
    }
}

class Movie extends Video {
    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String getInfo() {
        return "Movie: Title - " + getTitle() + ", Duration - " + getDuration() + " minutes, Rating - " + rating;
    }
}

public class VideoStreamingService {
    public static void main(String[] args) {
        TvSeries tvSeries = new TvSeries("Breaking Bad", 45, 62);
        Movie movie = new Movie("Inception", 148, 8.8);

        System.out.println(tvSeries.getInfo());
        System.out.println(movie.getInfo());
    }
}
