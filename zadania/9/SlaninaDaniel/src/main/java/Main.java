import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("please write your preferred length of your spiral");
        int length = sc.nextInt();
        System.out.println("please write your preferred width of your spiral");
        int width = sc.nextInt();
        System.out.println("Your spiral: ");
        int a[][] = new int[100][100];
        createMatrix(length, width, a);
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        //btw. cele som to skopiroval bo nebol cas - sry nasťa
    }

    protected static void createMatrix(int m, int n, int[][] a) {

        int val = 1;


        int k = 0, l = 0;
        while (k < m && l < n) {

            for (int i = l; i < n; ++i) {
                a[k][i] = val++;
            }

            k++;


            for (int i = k; i < m; ++i) {
                a[i][n - 1] = val++;
            }
            n--;

            if (k < m) {
                for (int i = n - 1; i >= l; --i) {
                    a[m - 1][i] = val++;
                }
                m--;
            }

            if (l < n) {
                for (int i = m - 1; i >= k; --i) {
                    a[i][l] = val++;
                }
                l++;
            }
        }
    }

}