package sk.dneperska.objects;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        Buffer a = new Buffer();
        a.read();
        for (int i = 0;i<a.readArray.length;i++){
            if (a.readArray[i][0].equals("square")){
                double lol = Double.parseDouble(a.readArray[i][1]);
                Square geometricShape = new Square(lol);
                geometricShape.printData();
                    a.write(i,Square.circuit,Square.capacity);
            }
            if (a.readArray[i][0].equals("rectangle")){
                double lol = Double.parseDouble(a.readArray[i][1]);
                double lol2 = Double.parseDouble(a.readArray[i][2]);
                Rectangle geometricShape = new Rectangle(lol,lol2);
                geometricShape.printData();
                a.write(i,Rectangle.circuit,Rectangle.capacity);

            }
            if (a.readArray[i][0].equals("triangle")){
                double lol = Double.parseDouble(a.readArray[i][1]);
                double lol2 =Double.parseDouble(a.readArray[i][2]);
                double lol3 = Double.parseDouble(a.readArray[i][3]);
                Triangle geometricShape = new Triangle(lol,lol2,lol3);
                geometricShape.printData();
                a.write(i,Triangle.circuit,Triangle.capacity);
            }
            if (a.readArray[i][0].equals("circle")){
                double lol = Double.parseDouble(a.readArray[i][1]);
                Circle geometricShape = new Circle(lol);
                geometricShape.printData();
                a.write(i,Circle.circuit,Circle.capacity);
            }

        }
    }
}
