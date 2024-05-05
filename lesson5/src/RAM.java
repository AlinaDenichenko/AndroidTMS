public class RAM {
    int capacity;
    String brand;

    public RAM(int capacity, String brand) {
        this.capacity = capacity;
        this.brand = brand;
    }

    public RAM() {
        this.capacity = 8;
        this.brand = "Samsung";
    }

    public String toString() {
        return "Brand of RAM: " + this.brand + ", capacity of RAM: " + this.capacity;
    }
}
