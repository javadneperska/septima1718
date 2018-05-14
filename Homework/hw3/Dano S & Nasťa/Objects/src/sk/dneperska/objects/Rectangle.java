package sk.dneperska.objects;

public class Rectangle {
    // first size = prvy rozmer
    private double size1;
    // second size = druhy rozmer
    private double size2;

    // constructor
    public Rectangle(double size,double size2) {
        this.size1 = size;
        this.size2 = size2;
    }

    // capacity = obsah
    public double capacity(){
        double result = size1*size2;
        return result;
    }

    // circuit = obvod
    public double circuit(){
        double result = 2*(size1+size2);
        return result;
    }

    public void printData(){
        System.out.println("Circuit of the rectangle with size1 : " +size1 +"cm and size2 : "+size2 + "cm  is : " +circuit() +"cm and capacity is : " +capacity() + "cm^2");
    }
}
