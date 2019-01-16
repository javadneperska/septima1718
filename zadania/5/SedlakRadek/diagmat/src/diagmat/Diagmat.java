
package diagmat;

import java.util.Arrays;
import java.util.Scanner;


public class Diagmat {
    
   
  public static final int UP = 0;
    public static final int LEFT = 1;
    public static final int RIGHT = 2;
    public static final int DOWN = 3;
    public static void main(String []args){        

        // The input matrix
        int[][] matrix= {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        // The input matrix  dimension
        int matrixLength = matrix.length;

        //The number of elemets of the input matrix
        int numberOfElements = matrixLength * matrixLength;

        // The output is a single dimensional array containing the elements of the input matrix as a spiral
        int[] spiralMatrix = new int[numberOfElements] ;

        // The matrix mask help to decide which is the next direction or the next element to pick from the input matrix
        // All the values of the mask are initialized to zero. 
        int[][] mask = new int[matrixLength][matrixLength];

                //The first element of the output(the spiral) is always the middle element of the input matrix
    int rowIndex = 0;
    int colIndex = 0;

    if(matrixLength%2 == 0){
        rowIndex = matrix.length/2 - 1;
    } else {
        rowIndex = matrix.length/2;
    }
    colIndex = matrix.length/2;

    // Each time an element from the input matrix is added to the output spiral, the corresponding element in the mask is set to 1
    spiralMatrix[0] = matrix[rowIndex][colIndex];
    mask[rowIndex][colIndex] = 1; 

        // The first direction is always to the left
        int nextDirection = LEFT;

        // This is a counter to loop through all the elements of the input matrix only one time
        int i = 0;

        while(i < numberOfElements - 1){    
            i++;

            // Check which direction to go (left, down, right or up)
            switch(nextDirection){

                case LEFT :
                    // From the input matrix, take the number at the left of the current position(which is the middle of the input matrix) and add it to the spiral
                    colIndex -=1;
                    spiralMatrix[i] = matrix[rowIndex][colIndex];

                    //Update the mask
                    mask[rowIndex][colIndex] = 1;

                    // Decide which direction(or element in the input matrix) to take next.
                    // After moving to the left, you only have two choices : keeping the same direction or moving down
                    // To know which direction to take, check the mask
                    if(mask[rowIndex+1][colIndex] == 1){
                        nextDirection = LEFT;
                    }else{
                        nextDirection = DOWN;
                    }
                    break;

                case DOWN : 
                    rowIndex +=1;
                    spiralMatrix[i] = matrix[rowIndex][colIndex];
                    mask[rowIndex][colIndex] = 1;
                    if(mask[rowIndex][colIndex+1] == 1){
                        nextDirection = DOWN;
                    }else{
                        nextDirection = RIGHT;
                    }
                    break;

                case RIGHT : 
                    colIndex +=1;
                    spiralMatrix[i] = matrix[rowIndex][colIndex];
                    mask[rowIndex][colIndex] = 1;
                    if(mask[rowIndex-1][colIndex] == 1){
                        nextDirection = RIGHT;
                    }else{
                        nextDirection = UP;
                    }
                    break;

                case UP : 
                    rowIndex -=1;
                    spiralMatrix[i] = matrix[rowIndex][colIndex];
                    mask[rowIndex][colIndex] = 1;
                    if(mask[rowIndex][colIndex-1] == 1){
                        nextDirection = UP;
                    }else{
                        nextDirection = LEFT;
                    }
                    break;  
            }
         }

         System.out.println(Arrays.deepToString(matrix));
         System.out.println(Arrays.deepToString(mask));
         System.out.println(Arrays.toString(spiralMatrix));
     }
    
}
