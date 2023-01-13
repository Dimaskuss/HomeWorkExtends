import java.util.Calendar;

public class Car extends Transport {


   private double engineVolume;



    public Car(String brand, String model, double engineVolume, String color, int year, String country, int speedMax) {
        super(brand, model, year, country, color, speedMax);
        this.engineVolume = engineVolume;
        if (Double.compare(engineVolume, 0) == 0) {
            this.engineVolume = 1.5;

        }


    }
    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }
    @Override
    public String toString() {
        return "Car{" +
                "engineVolume=" + engineVolume +
                ", brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", country='" + getCountry() + '\'' +
                ", color='" + getColor()+ '\'' +
                ", speedMax=" + getSpeedMax() +
                '}';
    }
}
