package task_2;

public class Cars {
    private final double price;
    private final String model;
    private final int year;
    private final String country;
    private final String city;

    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }


    public Cars(double price, String model, int year, String country, String city) {
        this.price = price;
        this.model = model;
        this.year = year;
        this.country = country;
        this.city = city;
    }
}
