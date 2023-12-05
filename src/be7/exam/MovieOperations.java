package be7.exam;

public class MovieOperations {
    private MovieDTO[] movies;

    public MovieOperations(MovieDTO[] movies) {
        this.movies = movies;
    }

    public void searchByGenre(String genre) {
        // 장르별 검색 로직 구현
        for (MovieDTO movie : movies) {
            if (movie != null && genre.equalsIgnoreCase(movie.getGenre())) {
                System.out.println(movie);
            }
        }
    }

    public void displayAverageRating() {
        // 평균 평점 계산 로직 구현
        float totalRating = 0;
        int count = 0;
        for (MovieDTO movie : movies) {
            if (movie != null) {
                totalRating += movie.getRating();
                count++;
            }
        }
        float average = count > 0 ? totalRating / count : 0;
        System.out.println("Average Rating: " + average);
    }
}
