public class Disk {
    private String name, type, size, capacity;
    private float price;
    public Disk(String name, String type, String size, String capacity, float price) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.capacity = capacity;
        this.price = price;
    }
    @Override
    public String toString() {
        return this.name + "-" + this.type + "-" + this.size + "-" + this.capacity+"-"+this.price+"E";
    }
    public float getPrice() {
        return price;
    }
}
