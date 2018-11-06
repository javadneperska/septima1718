public class GraphicCard {
    String name;
    String capacity;
    String ports;
    float price;
    public GraphicCard(String name, String capacity, String ports, float price) {
        this.name = name;
        this.capacity = capacity;
        this.ports = ports;
        this.price = price;
    }
    public float getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return this.name + "-"+this.capacity+"-"+this.ports+"-"+this.price+"E";
    }
}
