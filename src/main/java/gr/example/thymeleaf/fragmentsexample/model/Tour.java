package gr.example.thymeleaf.fragmentsexample.model;

public class Tour {
    private String title;
    private String subtitle;
    private int days;
    private int reviews;
    private int price;
    private String image;

    /**
     * Empty controller
     */
    public Tour(){
    }

    public Tour(String title, String subtitle, int days, int reviews, int price, String image) {
        this.title = title;
        this.subtitle = subtitle;
        this.days = days;
        this.reviews = reviews;
        this.price = price;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public int getReviews() {
        return reviews;
    }

    public void setReviews(int reviews) {
        this.reviews = reviews;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
