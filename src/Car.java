public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int year;
    String country;

    public Car(String brand,String model,int year,String country,String color,double engineVolume) {
        if (brand == null || brand.equals("")) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.equals("")) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume == 0 || engineVolume < 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        if (color == null || color.equals("")) {
            this.color = "белый";
        } else {
            this.color = color;
        }
        if (year == 0 || year < 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }
        if (country == null || country.equals("")) {
            this.country = "default";
        } else {
            this.country = country;
        }
    }
    public String toString() {
        return brand + " " + model + ", " + year + " года выпуска, сборка в " + country + ", " + color + " цвета, объем двигателя - " + engineVolume;
    }
}
