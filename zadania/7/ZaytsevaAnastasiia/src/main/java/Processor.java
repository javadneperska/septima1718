public class Processor {
    private String name, cores, speed;
    private float price;
    public Processor(String name, String cores, String speed, float price) {
        this.name = name;
        this.cores = cores;
        this.speed = speed;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.name+"-Cores:"+this.cores+"-Speed:"+this.speed+"GHz"+"-"+this.price+"E";
    }
    public float getPrice() {
        return price;
    }
}
