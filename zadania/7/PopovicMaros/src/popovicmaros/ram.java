/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package popovicmaros;

/**
 *
 * @author Žiak
 */
public class ram {
    
    String size;
    String type;
    String frequency;
    double price;
    
    public ram(String size, String type, String frequency, double price) {
        this.size = size;
        this.type = type;
        this.frequency = frequency;
        this.price = price;
    }
    
     public String toString () {
    return "RAM: "+size+" "+type+" "+frequency+" "+price+" eur";
    }

    public String getsize() {
        return size;
    }

    public void setsize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
