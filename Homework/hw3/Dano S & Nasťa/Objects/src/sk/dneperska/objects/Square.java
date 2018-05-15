package sk.dneperska.objects;

public class Square {

    // first size = prvy rozmer
    private double size1;
    protected static double capacity;
    protected static double circuit;

    // constructor
    public Square(double size) {
        this.size1 = size;
    }

    // capacity = obsah
    public double capacity(){
         double result = size1*size1;
         capacity = result;
         return result;
    }

    // circuit = obvod
    public double circuit(){
        double result = 4*size1;
        circuit = result;
        return result;
    }

    public void printData(){
        System.out.println("Circuit of the square with size : " +size1 +"cm is : " +circuit() +"cm and capacity is : " +capacity() + "cm^2");
    }

}
