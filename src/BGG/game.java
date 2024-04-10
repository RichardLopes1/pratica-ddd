package BGG;

import java.util.List;

public abstract class game {
    private final double meanRatings;
    private String name;

    private int yearLaunched;
    private int MinPlayers;
    private int maxPlayers;
    private int bestNumPlayers;
    private int meanPlayTime;
    private int AgeMin;
    private double rating;
    private List<Rating> ratings;


    public game(String name, int yearLaunched, int minPlayers, int maxPlayers,
               int bestNumPlayers, int meanPlayTime, int ageMin,
               List<Rating> ratings) {
        this.name = name;
        this.yearLaunched = yearLaunched;
        this.MinPlayers = minPlayers;
        this.maxPlayers = maxPlayers;
        this.bestNumPlayers = bestNumPlayers;
        this.meanPlayTime = meanPlayTime;
        this.AgeMin = ageMin;
        this.ratings = ratings;
        this.meanRatings = calculateMeanRatings();
    }

    public game(double meanRatings) {
        this.meanRatings = meanRatings;
    }

    private double calculateMeanRatings() {
        return ratings.stream()
                .mapToDouble(rating::getRating)
                .average()
                .orElse();
    }
}
