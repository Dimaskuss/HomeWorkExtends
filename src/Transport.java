public class Transport {


   private String brand;
    private String model;
    private int year;
    private String country;
    private String color;
    private int speedMax;

    public Transport(String brand, String model, int year, String country, String color, int speedMax) {
        this.brand = brand;
        if (this.brand == null || brand.equals("") || brand.isBlank()) {
            this.brand = "default";
        }


        this.model = model;
        if (model == null || model.equals("") || model.isBlank()) {
            this.model = "default";
        }

        this.color = color;
        if (color == null) {
            this.color = "белый";
        }
        this.year = year;
        if (year <= 0) {
            this.year = 2000;
        }
        this.country = country;
        if (country == null || country.equals("") || country.isBlank()) {
            this.country = "СССР";
        }
        this.speedMax = speedMax;
        if (speedMax <= 0) {
            this.speedMax = 40;
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", speedMax='" + speedMax + '\'' +
                '}';
    }

    public String getBrand() {
            return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }


    public String getCountry() {
        return country;
    }



    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSpeedMax() {
        return speedMax;
    }

    public void setSpeedMax(int speedMax) {
        this.speedMax = speedMax;
    }

}