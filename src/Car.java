import java.util.Calendar;

public class Car extends Transport {


    double engineVolume;


    public Car() {
        this(null);

    }

    public Car(String brand) {
        this(null, null);

    }

    public Car(String brand, String model) {
        this(null, null, 0.0);

    }

    public Car(String brand, String model, double engineVolume) {
        this(null, null, 0.0, null);

    }

    public Car(String brand, String model, double engineVolume, String color) {
        this(null, null, 0.0, null, 0);
    }

    public Car(String brand, String model, double engineVolume, String color, int year) {
        this(null, null, 0.0, null, 0, null);
    }

    public Car(String brand, String model, double engineVolume, String color, int year , String country) {
        this(null, null, 0.0, null, 0, null, null);
    }


    public Car(String brand, String model, double engineVolume, String color, int year, String country, String speedMax) {
        super(brand, model, year, country, color, speedMax);
        this.engineVolume = engineVolume;
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;

        }


    }

    @Override
    public String toString() {
        return "Car{" +
                "engineVolume=" + engineVolume +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", speedMax=" + speedMax +
                '}';
    }
}
