package BGG;

public class Rating {
    private String username;
    private int rating;
    private String comment;

    public Rating(){
    }

    public String Rating(String username, int rating, String comment) {
        this.username = username;
        if (rating < 0 || rating > 10)
            throw new IllegalArgumentException("Rating must be between 0 and 10");
        {

        }
        public String getUsername(); {
            return username;
        }
        this.username = username;
        this.rating = rating;
        this.comment = comment;
    }
    public int getRating() {
        if (rating < 0 || rating > 10)
            throw new IllegalArgumentException("Rating must be between 0 and 10");
        else
            this.rating=rating;
        this.comment=comment;

        return 0;
    }
}
