package t2.lab6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Planeter
 * @description: TODO
 * @date 2021/5/23 15:10
 * @status dev
 */
public class SortMovie {
    public static void main(String[] args) {
        Movie[] movies = toMovieArr(movieReader());
        ReleaseYearBubbleSort(movies);
        DESCReleaseYearBubbleSort(movies);
        RatingBubbleSort(movies);
        DESCRatingBubbleSort(movies);
        NameBubbleSort(movies);
        DESCNameBubbleSort(movies);
        System.out.println("end");
    }

    public static void NameBubbleSort(Movie[] movies) {
        // initial
        String[] names = new String[movies.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = movies[i].getMovieName();
        }
        // sort
        for (int i = 1; i < names.length; i++) {
            boolean isSorted = true; //isSorted= true if a[] is sorted
            for (int j = 0; j < names.length - i; j++) {
                if (names[j].compareTo(names[j + 1]) > 0) { // the larger item bubbles up
                    String temp = names[j]; // and isSorted is set to false,
                    Movie tempMovie = movies[j];
                    names[j] = names[j + 1]; // i.e. the data was not sorted
                    movies[j] = movies[j+1];
                    names[j + 1] = temp;
                    movies[j + 1] = tempMovie;
                    isSorted = false;
                }
            }
            if (isSorted) return; // Why?
        }
    }
    public static void DESCNameBubbleSort(Movie[] movies) {
        // initial
        String[] names = new String[movies.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = movies[i].getMovieName();
        }
        // sort
        for (int i = 1; i < names.length; i++) {
            boolean isSorted = true; //isSorted= true if a[] is sorted
            for (int j = 0; j < names.length - i; j++) {
                if (names[j].compareTo(names[j + 1]) < 0) { // the larger item bubbles up
                    String temp = names[j]; // and isSorted is set to false,
                    Movie tempMovie = movies[j];
                    names[j] = names[j + 1]; // i.e. the data was not sorted
                    movies[j] = movies[j+1];
                    names[j + 1] = temp;
                    movies[j + 1] = tempMovie;
                    isSorted = false;
                }
            }
            if (isSorted) return; // Why?
        }
    }
    public static void RatingBubbleSort(Movie[] movies) {
        // initial
        double[] ratings = new double[movies.length];
        for (int i = 0; i < ratings.length; i++) {
            ratings[i] = movies[i].getRating();
        }
        // sort
        for (int i = 1; i < ratings.length; i++) {
            boolean isSorted = true; //isSorted= true if a[] is sorted
            for (int j = 0; j < ratings.length - i; j++) {
                if (ratings[j] > ratings[j + 1]) { // the larger item bubbles up
                    double temp = ratings[j]; // and isSorted is set to false,
                    Movie tempMovie = movies[j];
                    ratings[j] = ratings[j + 1]; // i.e. the data was not sorted
                    movies[j] = movies[j+1];
                    ratings[j + 1] = temp;
                    movies[j + 1] = tempMovie;
                    isSorted = false;
                }
            }
            if (isSorted) return; // Why?
        }
    }
    public static void DESCRatingBubbleSort(Movie[] movies) {
        // initial
        double[] ratings = new double[movies.length];
        for (int i = 0; i < ratings.length; i++) {
            ratings[i] = movies[i].getRating();
        }
        // sort
        for (int i = 1; i < ratings.length; i++) {
            boolean isSorted = true; //isSorted= true if a[] is sorted
            for (int j = 0; j < ratings.length - i; j++) {
                if (ratings[j] < ratings[j + 1]) { // the larger item bubbles up
                    double temp = ratings[j]; // and isSorted is set to false,
                    Movie tempMovie = movies[j];
                    ratings[j] = ratings[j + 1]; // i.e. the data was not sorted
                    movies[j] = movies[j+1];
                    ratings[j + 1] = temp;
                    movies[j + 1] = tempMovie;
                    isSorted = false;
                }
            }
            if (isSorted) return; // Why?
        }
    }

    public static void ReleaseYearBubbleSort(Movie[] movies) {
        // initial
        int[] years = new int[movies.length];
        for (int i = 0; i < years.length; i++) {
            years[i] = movies[i].getReleaseYear();
        }
        // sort
        for (int i = 1; i < years.length; i++) {
            boolean isSorted = true; //isSorted= true if a[] is sorted
            for (int j = 0; j < years.length - i; j++) {
                if (years[j] > years[j + 1]) { // the larger item bubbles up
                    int temp = years[j]; // and isSorted is set to false,
                    Movie tempMovie = movies[j];
                    years[j] = years[j + 1]; // i.e. the data was not sorted
                    movies[j] = movies[j+1];
                    years[j + 1] = temp;
                    movies[j + 1] = tempMovie;
                    isSorted = false;
                }
            }
            if (isSorted) return; // Why?
        }
    }
    public static void DESCReleaseYearBubbleSort(Movie[] movies) {
        // initial
        int[] years = new int[movies.length];
        for (int i = 0; i < years.length; i++) {
            years[i] = movies[i].getReleaseYear();
        }
        // sort
        for (int i = 1; i < years.length; i++) {
            boolean isSorted = true; //isSorted= true if a[] is sorted
            for (int j = 0; j < years.length - i; j++) {
                if (years[j] < years[j + 1]) { // the larger item bubbles up
                    int temp = years[j]; // and isSorted is set to false,
                    Movie tempMovie = movies[j];
                    years[j] = years[j + 1]; // i.e. the data was not sorted
                    movies[j] = movies[j+1];
                    years[j + 1] = temp;
                    movies[j + 1] = tempMovie;
                    isSorted = false;
                }
            }
            if (isSorted) return; // Why?
        }
    }
    public static Movie[] toMovieArr(String[] arr) {
        Movie[] movieArr = new Movie[arr.length];
        for (int i = 0; i < arr.length; i++) {
            String[] attributes = arr[i].split(",");
            movieArr[i] = new Movie(attributes[1], Integer.parseInt(attributes[2]), Double.parseDouble(attributes[0]));
        }
        return movieArr;
    }

    public static String[] movieReader() {
        //Path to file to read in
        String myfile = "E:\\Projects\\IDEA\\Lab\\resource\\Movies.txt";
        //Create an ArrayList (a dynamic type of Array)
        ArrayList<String> movies = new ArrayList<String>();
        try {
            // try to read in the File
            BufferedReader abc = new BufferedReader(new FileReader(myfile));

            String line;
            while ((line = abc.readLine()) != null) {
                //If words length greater than 8 keep it otherwise discard it
                if (line.length() > 8) {
                    movies.add(line);
                }
            }
            abc.close();
        } catch (FileNotFoundException ex) {
            //If the File is not found print to screen
            System.out.println(
                    "Unable to open file '" +
                            myfile + "'");
        } catch (IOException ex) {
            //If file is corrupted print to screen
            System.out.println(
                    "Error reading file '"
                            + myfile + "'");
        }
        //Convert from ArrayList to Array
        return movies.toArray(new String[]{});
    }
}

class Movie {

    //Attributes
    private String movieName;
    private int releaseYear;
    private double rating;
    private int movieID;
    private static int lastMovieID = 0;
    private final int CURRENTYEAR = 2019;

    //Default Constructor
    public Movie() {
        this.movieName = "Film";
        this.releaseYear = 2019;
        this.rating = 0.0;
        lastMovieID++;
        movieID = lastMovieID;
    }

    //General Constructor
    public Movie(String movieName, int releaseYear, double rating) {
        this.movieName = movieName;
        if (releaseYear <= CURRENTYEAR) {
            this.releaseYear = releaseYear;
        } else {
            this.releaseYear = CURRENTYEAR;
        }
        this.rating = rating;
        lastMovieID++;
        movieID = lastMovieID;
    }

    //Getter Methods
    public String getMovieName() {
        return movieName;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public double getRating() {
        return rating;
    }

    public int getMovieID() {
        return movieID;
    }

    //Setter Methods
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setReleaseYear(int releaseYear) {
        if (releaseYear <= CURRENTYEAR) {
            this.releaseYear = releaseYear;
        } else {
            this.releaseYear = CURRENTYEAR;
        }
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "movieName='" + movieName + '\'' +
                ", releaseYear=" + releaseYear +
                ", rating=" + rating +
                ", movieID=" + movieID +
                ", CURRENTYEAR=" + CURRENTYEAR +
                '}';
    }

    //Functionality
    public void printMovieDetails() {
        String details = "Movie Name: " + movieName;
        details += "\nRelease Year: " + releaseYear;
        details += "\nRating: " + rating;
        details += "\nMovie ID: " + movieID;
        System.out.println(details);
    }
}
