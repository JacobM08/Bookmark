package home.yorku.bookmarks.model;

public class Movie {
    private String title; //movie title

    private String identifier = "Movie"; //identifier for database
    private String overview; //overiew of this movie
    private String releaseDate; //release date of this movie
    private Long id;

    public Movie(Long id, String title, String releaseDate, String overview) { //constructor
        this.title = title;
        this.overview = overview;
        this.releaseDate = releaseDate;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getTitle(){
        return this.title;
    }
    public String getOverview(){
        return this.overview;
    }

    public String getReleaseDate(){return this.releaseDate;}

    public String getIdentifier(){return this.identifier;}

}
