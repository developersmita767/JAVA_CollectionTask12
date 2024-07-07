//In the previous task, write program to find out the total number of movies release from 2015 to 2018.
import java.util.ArrayList;
import java.util.List;

class MovieData {
    private int year;
    private int numMovies;

    public MovieData(int year, int numMovies) {
        this.year = year;
        this.numMovies = numMovies;
    }

    public int getYear() {
        return year;
    }

    public int getNumMovies() {
        return numMovies;
    }
}

public class CollectionTask12 {
    public static void main(String[] args) {
        // Create a list to store movie data
        List<MovieData> movieDataList = new ArrayList<>();

        // Adding movie data for different years
        movieDataList.add(new MovieData(2011, 150));
        movieDataList.add(new MovieData(2012, 180));
        movieDataList.add(new MovieData(2013, 140));
        movieDataList.add(new MovieData(2014, 160));
        movieDataList.add(new MovieData(2015, 130));
        movieDataList.add(new MovieData(2016, 170));
        movieDataList.add(new MovieData(2017, 120));
        movieDataList.add(new MovieData(2018, 190));
        movieDataList.add(new MovieData(2019, 110));
        movieDataList.add(new MovieData(2020, 200));

        // Find the total number of movies released from 2015 to 2018
        int totalMoviesFrom2015To2018 = 0;

        for (MovieData data : movieDataList) {
            int year = data.getYear();
            if (year >= 2015 && year <= 2018) {
                totalMoviesFrom2015To2018 += data.getNumMovies();
            }
        }

        // Print the total number of movies released from 2015 to 2018
        System.out.println("Total number of movies released from 2015 to 2018: " + totalMoviesFrom2015To2018);
    }
}
