package sk.dneperska.objects;

public class Main {

    public static void main(String[] args) {

        Buffer a = new Buffer();
        a.read();
        double lol = Double.parseDouble(a.myArray[0][1]);
        Square b = new Square(lol);
        b.printData();



    }
}
