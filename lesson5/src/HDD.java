public class HDD {
    int capacity;
    String brand;
    String type;

    public HDD(int capacity, String brand, String type) {
        this.capacity = capacity;
        this.brand = brand;
        this.type = type;
    }

    public HDD(){
        this.capacity = 240;
        this.brand = "Kingston";
        this.type = "external";
    }

    public String toString() {
        return "Brand of HDD: " + this.brand + ", type of HDD: " + this.type + ", capacity of HDD: " + this.capacity;
    }
}
