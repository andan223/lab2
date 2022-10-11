public class Movie {
    private String MovieName;
    private String MovieId;
    private String MovieCategory;

    public Movie(String movieName, String movieId, String movieCategory) {
        MovieName = movieName;
        MovieId = movieId;
        MovieCategory = movieCategory;
    }

    public String getId() {
        return MovieId;
    }

    public void setId(String id) {
        this.MovieId = id;
    }

    public String getName() {
        return MovieName;
    }

    public void setName(String name) {
        this.MovieName = name;
    }

    public String getCategory() {
        return MovieCategory;
    }

    public void setCategory(String category) {
        this.MovieCategory = category;
    }
}
