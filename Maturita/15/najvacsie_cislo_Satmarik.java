import java.util.Scanner;

class najvacsie_cislo_Satmarik {

public static void main(String[] args) {

        Scanner sc=new Scanner (System.in);
        System.out.println("Zadajte číslo, ktoré má aspon 3 číslice!");
        int i =sc.nextInt();
//_____________________________________________________________________
        if (!(i>99)) { //podmienka(3cif. číslo)
        System.out.println("Číslo nespĺňa podmienky!");
        }//if

        else{
        int max = Integer.MIN_VALUE;

        while (i>0) {
        int cislo = i%10;
        max = Math.max(max, cislo);
        i/= 10;
        }//while

        System.out.println("Najväčie číslo je : "+max);
        }//else
        }//main
        }//class

//class najvacsie_cislo_Satmarik {

    //public static void main(String args[]) {
        // int r,n, ld = 0;
        // Scanner sc = new Scanner(System.in);
       //  System.out.print("Enter a Number :");
        // n = sc.nextInt();

        // while (n > 0) {
        //    r = n % 10;
         //   if (ld < r) {
           //     ld = r;
          //  }
         //   n = n / 10;
         //   }
       //  System.out.println("\nThe Largest Digit is :" + ld);

  //  }}

//Scanner scan = new Scanner(System.in);
//Pattern threeDigitNumber = Pattern.compile("\\d\\d\\d");
//int j;
//System.out.println("Please enter a 3-digit number: ");
//while (!scan.hasNext(threeDigitNumber)) {
//  if (scan.hasNext()) {
//    System.out.println(scan.next() + " is not a 3-digit number! Try again!");
//  } else {
//    System.out.println("Input terminated unepxectedly");
//    System.exit(1);
//  }
//}
//j = scan.nextInt();ň


