public class Computer {
    private final int price;
    private final String brand;
    RAM ram;
    HDD hdd;

    public Computer(int price, String brand, RAM ram, HDD hdd) {
        this.price = price;
        this.brand = brand;
        this.ram = ram;
        this.hdd = hdd;
    }

    public Computer(int price, String brand) {
        this(price, brand, new RAM(), new HDD());
    }

    public String toString() {
        return "Price of computer: " + price + ", brand of computer: " + brand + ", RAM: " + ram + ", HDD: " + hdd;
    }
}
