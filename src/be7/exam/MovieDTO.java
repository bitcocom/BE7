package be7.exam;

public class MovieDTO {
    private String title;
    private String mainCharacter;
    private int runningTime; // in minutes
    private float rating;
    private String genre;

    // Constructor
    public MovieDTO(String title, String mainCharacter, int runningTime, float rating, String genre) {
        this.title = title;
        this.mainCharacter = mainCharacter;
        this.runningTime = runningTime;
        this.rating = rating;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMainCharacter() {
        return mainCharacter;
    }

    public void setMainCharacter(String mainCharacter) {
        this.mainCharacter = mainCharacter;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(int runningTime) {
        this.runningTime = runningTime;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
// Getters and Setters
    // ... (methods for getting and setting each field)

    @Override
    public String toString() {
        return "MovieDTO{" +
                "title='" + title + '\'' +
                ", mainCharacter='" + mainCharacter + '\'' +
                ", runningTime=" + runningTime +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                '}';
    }

}
