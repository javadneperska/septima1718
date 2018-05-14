package sk.dneperska.objects;

public class Circle {
    private double size1;

    public Circle(double size1) {
        this.size1 = size1;

    }


    public double capacity(){
        double result = Math.PI*size1*size1;
        return result;
    }


    public double circuit(){
        double result = 2*Math.PI*size1*size1;
        return result;
    }
    public void printData(){
        System.out.println("Circuit of the circle with size1 : " +size1  + "cm  is : " +circuit() +"cm and capacity is : " +capacity() + "cm^2");
    }
}
