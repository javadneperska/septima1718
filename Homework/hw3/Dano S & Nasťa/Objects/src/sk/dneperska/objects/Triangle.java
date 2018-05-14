package sk.dneperska.objects;

public class Triangle {
    private double size1;
    private double size2;
    private double size3;
    public Triangle(double size1,double size2, double size3) {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;

    }


    public double capacity(){
        double result = Math.sqrt((circuit()/2)*((circuit()/2)-size2)*((circuit()/2)-size3)*((circuit()/2)-size3));
        return result;
    }


    public double circuit(){
        double result = size1+size2+size3;
        return result;
    }

    public void printData(){
        System.out.println("Circuit of the triangle with size1 : " +size1 +"cm, size2 : "+size2 + "cm and size3 : " + "cm  is : " +circuit() +"cm and capacity is : " +capacity() + "cm^2");
    }
}
