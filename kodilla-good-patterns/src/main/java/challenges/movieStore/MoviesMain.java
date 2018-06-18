package challenges.movieStore;

import java.util.stream.Collectors;

public class MoviesMain {

    public static void main(String[] args) {

        MovieStory movieStory = new MovieStory();
        String theResultStringOfMovies = movieStory.getMovies().entrySet().stream()
                .flatMap(n -> n.getValue().stream())
                .collect(Collectors.joining(" ! "));

        System.out.println(theResultStringOfMovies);

    }

}