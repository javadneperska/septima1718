package sk.dneperska.septima1718.daniel.slanina;

public class Main {

    public static void main(String[] args) {
        int[][] firstMatrix = { {2, 1, 1, 1, 1}, {2, 3, 2, 2, 2},{3,3,4,3,3},{4,4,4,5,4},{5,5,5,5,6} };

        // Adding matrix
        int sum = 0;
        int j = 0;
        for(int i = 0; i < firstMatrix.length; i++) {
                sum += firstMatrix[i][j];
                j++;
        }

        // Displaying the result
        System.out.println("Sum of  matrix is: " + sum);

    }

}
