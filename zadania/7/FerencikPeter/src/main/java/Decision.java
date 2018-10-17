

import java.util.Arrays;
import java.util.Scanner;

public class Decision {
    public static double final_prize = 0;
    static boolean cont = true;
    public static void decide () {
        while (cont = true) {
            System.out.println("Choose component which you want:");
            System.out.println("1-RAM");
            System.out.println("2-DISC");
            System.out.println("3-CPU");
            System.out.println("4-Graphics card");
            int decision = 0;
            Scanner sc = new Scanner(System.in);
            decision = sc.nextInt();
            switch (decision) {
                case 1:
                    ReadData.readRAM();
                    System.out.println("Choose type of RAM:");
                    for (int i = 0; i < ReadData.RAM.length; i++) {
                        System.out.println(ReadData.RAM[i][1]);
                    }
                    Scanner s = new Scanner(System.in);
                    String ram = s.next();
                    if (ram.equals(ReadData.RAM[0][1])) {
                        System.out.println("We offer this kind of RAM:");
                        System.out.println(ReadData.RAM[0][0] + " GB " + ReadData.RAM[0][1] + " " + ReadData.RAM[0][2] + " GHZ" + " PRIZE: " + ReadData.RAM[0][3] + "€");
                        System.out.println("Do you want to buy it? (y/n)");
                        if (s.next().equals("y")) {
                            final_prize = final_prize + Double.valueOf(ReadData.RAM[0][3]);
                            System.out.println("Do you want to continue?(y/n)");
                            if (s.next().equals("y")) {
                                cont = true;

                            } else {
                                System.exit(1);
                            }
                        } else {
                            System.out.println("Do you want to continue?(y/n)");
                            if (s.next().equals("y")) {
                                cont = true;

                            } else {
                                System.exit(1);
                            }
                        }

                    } else if (ram.equals(ReadData.RAM[1][1])) {
                        System.out.println("We offer this kind of RAM:");
                        System.out.println(ReadData.RAM[1][0] + " GB " + ReadData.RAM[1][1] + " " + ReadData.RAM[1][2] + " GHZ" + " PRIZE: " + ReadData.RAM[1][3] + "€");
                        System.out.println("Do you want to buy it? (y/n)");
                        if (s.next().equals("y")) {
                            final_prize = final_prize + Double.valueOf(ReadData.RAM[1][3]);
                            System.out.println("Do you want to continue?(y/n)");
                            if (s.next().equals("y")) {
                                cont = true;

                            } else {
                                System.exit(1);
                            }
                        } else {
                            System.out.println("Do you want to continue?(y/n)");
                            if (s.next().equals("y")) {
                                cont = true;

                            } else {
                                System.exit(1);
                            }
                        }



                    } else if (ram.equals(ReadData.RAM[2][1])) {
                        System.out.println("We offer this kind of RAM:");
                        System.out.println(ReadData.RAM[2][0] + " GB " + ReadData.RAM[2][1] + " " + ReadData.RAM[2][2] + " GHZ" + " PRIZE: " + ReadData.RAM[2][3] + "€");
                        System.out.println("Do you want to buy it? (y/n)");
                        if (s.next().equals("y")) {
                            final_prize = final_prize + Double.valueOf(ReadData.RAM[2][3]);
                            //System.out.println(final_prize);
                            System.out.println("Do you want to continue?(y/n)");
                            if (s.next().equals("y")) {
                                cont = true;

                            } else {
                                System.exit(1);
                            }
                        } else {
                            System.out.println("Do you want to continue?(y/n)");
                            if (s.next().equals("y")) {
                                cont = true;

                            } else {
                                System.exit(1);
                            }
                        }

                    } else {
                        System.out.println("We dont offer this kind of RAM");
                        System.out.println("Do you want to continue?(y/n)");
                        if (s.next().equals("y")) {
                            cont = true;

                        } else {
                            System.exit(1);
                        }

                    }

                    break;
                case 2:
                    ReadData.ReadDisc();
                    System.out.println("Choose type of Disc:");
                    for (int i = 0; i < 2; i++) {
                        System.out.println(ReadData.Disc[i][0]);
                    }
                    Scanner s1 = new Scanner(System.in);
                    String disc = s1.next();
                    if (disc.equals(ReadData.Disc[0][0])||disc.equals(ReadData.Disc[2][0])) {
                        System.out.println("We offer this kind of Disc:");

                        for (String a[] : ReadData.Disc) {
                            for (String b : a) {
                               // System.out.println(b);
                                if(b.equals("HDD")){
                                    //System.out.println(Arrays.deepToString(a));
                                   System.out.println(a[1] + " GB " + b + " " + " PRIZE: " + a[2] + "€");

                                }

                            }
                        }

                        System.out.println("Do you want to buy it? (y/n)");
                        if (s1.next().equals("y")) {
                            final_prize = final_prize + Double.valueOf(ReadData.Disc[0][3]);
                            System.out.println("Do you want to continue?(y/n)");
                            if (s1.next().equals("y")) {
                                cont = true;

                            } else {
                                System.exit(1);
                            }
                        } else {
                            System.out.println("Do you want to continue?(y/n)");
                            if (s1.next().equals("y")) {
                                cont = true;

                            } else {
                                System.exit(1);
                            }
                        }

                    }
                    break;
                case 3:

                    break;
                case 4:

                    break;
                default:

                    break;

            }

        }
    }
}
