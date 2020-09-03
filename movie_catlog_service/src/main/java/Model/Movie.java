package Model;

public class Movie {
private String movie;
private String name;
public Movie(){

}
    public Movie(String movie, String name) {
        this.movie = movie;
        this.name = name;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString(){
    return movie +" "+ name;
    }
}
