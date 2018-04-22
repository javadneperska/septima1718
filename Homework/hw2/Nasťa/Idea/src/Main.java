import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int addition = 0;
        int multiply = 1;
        int [][][] array3d = new int [3][3][3];
        for (int i = 0; i < array3d.length; i++) {
            for (int j = 0; j < array3d[i].length; j++) {
                for (int k = 0; k < array3d[i][j].length; k++) {
                    array3d[i][j][k]=r.nextInt(10)+1;
                    addition = addition +array3d[i][j][k];
                    multiply = multiply * array3d[i][j][k];
                }

            }

        }
        System.out.println(addition);
        System.out.println(multiply);

    }
}
