package sk.dneperska.objects;

public class Triangle {
    private double size1;
    private double size2;
    private double size3;
    protected static double circuit;
    protected static double capacity;

    public Triangle(double size1,double size2, double size3) {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;

    }


    public double capacity(){
        double s = (circuit()/2);
        double result = Math.sqrt(s*(s-size2)*(s-size3)*(s-size3));
        capacity = result;
        return result;
    }


    public double circuit(){
        double result = size1+size2+size3;
        circuit = result;
        return result;
    }

    public void printData(){
        System.out.println("Circuit of the triangle with size1 : " +size1 +"cm, size2 : "+size2 + "cm and size3 : " +size3 + "cm  is : " +circuit() +"cm and capacity is : " +capacity() + "cm^2");
    }
}
