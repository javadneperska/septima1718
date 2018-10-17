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
public class graphiccard {
    
    String type;
    String size;
    double price;
    
         public String toString () {
    return "GRAPHIC CARD: "+size+" "+type+" "+price+" eur";
    }
    
    public graphiccard(String type, String size, double price) {
        this.type = type;
        this.size = size;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
