package sample;

import java.util.Random;

public class pole {

    static int[][][] mojePole = new int[2][2][2];
    static int sucet = 0;
    static int sucin = 1;

    public static void main(String[] args) {


        for (int i = 0; i < mojePole.length ; i++)
          {
            for (int j = 0; j < mojePole[i].length ; j++)
                for (int p = 0; p < mojePole[i][j].length; p++) {

                    Random objGenerator = new Random();
                    for (int iCount = 0; iCount < mojePole.length; iCount++) {
                        int randomNumber = objGenerator.nextInt(15);
                        mojePole[i][j][p] = randomNumber;
                        System.out.println(mojePole[i][j][p]);
                        sucet += mojePole[i][j][p];
                        sucin = sucet * mojePole[i][j][p];


                    }
                }



}

        System.out.println("Sucet cisel v poli je " + sucet);
        System.out.println("Sucin cisel v poli je " + sucin);


}

}
