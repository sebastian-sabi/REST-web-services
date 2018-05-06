package hello.model;

public class Destination {
    private String country;
    private String place;
    private String hotel;
    private String rating;
    private String pool;
    private String currency;
    private String restaurant;
    
    public Destination(){}
    
    public Destination(String country, String place, String hotel, String rating, String pool, String currency, String restaurant){
        this.country = country;
        this.place = place;
        this.hotel = hotel;
        this.rating = rating;
        this.pool = pool;
        this.currency = currency;
        this.restaurant = restaurant;
    }    

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }
    
}
