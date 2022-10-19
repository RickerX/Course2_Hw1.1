public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand,String model,int year,String country,String color,double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }
    public String toString() {
        return brand + " " + model + ", " + year + " года выпуска, сборка в " + country + ", " + color + " цвета, объем двигателя - " + engineVolume;
    }
}
