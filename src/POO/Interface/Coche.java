package POO.Interface;

public class Coche {
    String model;
    String cv;
    String brand;

    public Coche() {
    }

    public Coche(String model, String cv, String brand) {
        this.model = model;
        this.cv = cv;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "model='" + model + '\'' +
                ", cv='" + cv + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
