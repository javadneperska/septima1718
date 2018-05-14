package sk.dneperska.objects;

public class Main {

    public static void main(String[] args) {
        Buffer a = new Buffer();
        a.read();
        for (int i = 0;i<a.readArray.length;i++){
            if (a.readArray[i][0].equals("square")){
                double lol = Double.parseDouble(a.readArray[i][1]);
                Square geometricShape = new Square(lol);
                geometricShape.printData();
            }
            if (a.readArray[i][0].equals("rectangle")){
                double lol = Double.parseDouble(a.readArray[i][1]);
                double lol2 = Double.parseDouble(a.readArray[i][2]);
                Rectangle geometricShape = new Rectangle(lol,lol2);
                geometricShape.printData();
            }
            if (a.readArray[i][0].equals("triangle")){
                double lol = Double.parseDouble(a.readArray[i][1]);
                double lol2 =Double.parseDouble(a.readArray[i][2]);
                double lol3 = Double.parseDouble(a.readArray[i][3]);
                Triangle geometricShape = new Triangle(lol,lol2,lol3);
                geometricShape.printData();
            }
            if (a.readArray[i][0].equals("circle")){
                double lol = Double.parseDouble(a.readArray[i][1]);
                Circle geometricShape = new Circle(lol);
                geometricShape.printData();
            }

        }
    }
}
