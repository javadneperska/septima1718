public class RAM {
    private String name, capacity, type;
    private float price;
    public RAM(String name, String capacity, String type, float price) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
        this.price = price;
    }
    public float getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return this.name+"-"+this.capacity+"-"+this.type+"-"+this.price+"E";
    }
}
