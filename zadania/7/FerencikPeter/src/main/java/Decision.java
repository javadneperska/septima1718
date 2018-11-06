
import java.awt.font.FontRenderContext;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class Decision {
    public static double final_prize = 0;
    static boolean cont = true;
    static List<String> filenames = new LinkedList<String>();
    static HashMap<String, List<String>> sklad = new HashMap<String, List<String>>();
    public static void listFilesForFolder(final File folder) {
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isDirectory()) {
                listFilesForFolder(fileEntry);
            } else {
                if(fileEntry.getName().contains(".csv"))
                   // pole tmp=nacitat obsah suboru
                    try{
                        List<String> list = new ArrayList<String>();
                        FileReader fr = new FileReader(fileEntry.getPath());
                        BufferedReader br = new BufferedReader(fr);
                        String line = null;
                        while ((line=br.readLine()) != null){
                            list.add(line);
                            }
                        br.close();
                        sklad.put(fileEntry.getName().substring(0,fileEntry.getName().lastIndexOf('.')),list);
                        }
                    catch (IOException ex){ System.out.println("CHYBA"); }
                    //filenames.add(fileEntry.getName().substring(0,fileEntry.getName().lastIndexOf('.')));
                   // hash.add key=nazov, value = pole tmp
            }
        }
    }

    public static void decide () {
        while (cont = true) {
            cont = false;
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
                    System.out.println("Choose type of RAM:");
                    Set<String> RAMtypes = new HashSet<String>();
                    for (String a[] : ReadData.RAM) {
                        RAMtypes.add(a[1]);
                    }


                    System.out.println(RAMtypes);
                    Scanner s1 = new Scanner(System.in);
                    String RAMchoice = s1.next();
                    System.out.println("We offer this kind of RAM:");
                    for (String a[] : ReadData.RAM) {
                        if(a[1].equals(RAMchoice)){//16,DDR4,3000,136,2002
                            System.out.println(" ID: " + a[4]+" ,"+a[0] + " GB " + a[1] +" FREQUENCY: "+a[2] + " PRIZE: " + a[3] + "€"  );
                        }
                    }
                    System.out.println("Please, enter ID of component that you want to buy: (if you don't want to buy anything n )");
                    RAMchoice = s1.next();
                    for (String a[]: ReadData.RAM) {
                        if(a[4].equals(RAMchoice)){
                            final_prize = final_prize + Double.parseDouble(a[3]);

                        }

                    }
                    System.out.println(final_prize);
                    if (cont != true) {
                        System.out.println("Do you want to continue?(y/n)");
                        if (s1.next().equals("y")) {
                            cont = true;
                        } else {
                            System.out.println("Your final prize for components is: " + final_prize);
                            System.exit(1);
                        }
                    }
                    break;
                case 2:

                    System.out.println("Choose type of Disc:");
                    Set<String> disctypes = new HashSet<String>();
                    for (String a[] : ReadData.Disc) {
                        disctypes.add(a[0]);
                    }


                    System.out.println(disctypes);
                    Scanner s2 = new Scanner(System.in);
                    String DISCchoice = s2.next();
                        System.out.println("We offer this kind of Disc:");
                      for (String a[] : ReadData.Disc) {
                                if(a[0].equals(DISCchoice)){//HDD,1024,44,1001
                                        System.out.println(" ID: " + a[3]+" ,"+a[1] + " GB " + a[0] + " PRIZE: " + a[2] + "€"  );
                                }
                      }
                      System.out.println("Please, enter ID of component that you want to buy:");
                    DISCchoice = s2.next();
                      for (String a[]: ReadData.Disc) {
                              if(a[3].equals(DISCchoice)){
                                  final_prize = final_prize + Double.parseDouble(a[2]);

                              }

                          }
                    System.out.println(final_prize);
                   if(cont != true) {
                       System.out.println("Do you want to continue?(y/n)");
                       if (s2.next().equals("y")) {
                           cont = true;
                       } else {
                           System.out.println("Your final prize for components is: " + final_prize);
                           System.exit(1);
                       }
                   }
                    break;
                case 3:
                    System.out.println("Choose type of CPU:");
                    Set<String> CPUtypes = new HashSet<String>();
                    for (String a[] : ReadData.CPU) {
                        CPUtypes.add(a[0]);
                    }


                    System.out.println(CPUtypes);
                    Scanner s3 = new Scanner(System.in);
                    String CPUchoice = s3.next();
                    System.out.println("We offer this kind of CPU:");
                    for (String a[] : ReadData.CPU) { //i5,6,3.6,331,4002
                        if(a[0].equals(CPUchoice)){
                            System.out.println(" ID: " + a[4]+" ,"+a[1] + " Cores " + a[0] +" Frequency:"+a[2]+ " PRIZE: " + a[3] + "€"  );
                        }
                    }
                    System.out.println("Please, enter ID of component that you want to buy:");
                    CPUchoice = s3.next();
                    for (String a[]: ReadData.CPU) {
                        if(a[4].equals(CPUchoice)){
                            final_prize = final_prize + Double.parseDouble(a[3]);

                        }

                    }
                    System.out.println(final_prize);
                  if(cont != true) {
                      System.out.println("Do you want to continue?(y/n)");
                      if (s3.next().equals("y")) {
                          cont = true;
                      } else {
                          System.out.println("Your final prize for components is: " + final_prize);
                          System.exit(1);
                      }
                  }
                    break;
                case 4:
                    System.out.println("Choose type of Graphics card:");
                    Set<String> GCtypes = new HashSet<String>();
                    for (String a[] : ReadData.GC) {
                        GCtypes.add(a[1]);
                    }


                    System.out.println(GCtypes);
                    Scanner s4 = new Scanner(System.in);
                    String GCchoice = s4.next();
                    System.out.println("We offer this kind of Disc:");
                    for (String a[] : ReadData.GC) {//4,GEforceGTX1050,193,3004
                        if(a[1].equals(GCchoice)){
                            System.out.println(" ID: " + a[3]+" ,"+a[0] + " GB " + a[1] + " PRIZE: " + a[2] + "€"  );
                        }
                    }
                    System.out.println("Please, enter ID of component that you want to buy:");
                    GCchoice = s4.next();
                    for (String a[]: ReadData.GC) {
                        if(a[3].equals(GCchoice)){
                            final_prize = final_prize + Double.parseDouble(a[2]);

                        }

                    }
                    System.out.println(final_prize);
                   if(cont != true) {
                       System.out.println("Do you want to continue?(y/n)");
                       if (s4.next().equals("y")) {
                           cont = true;
                       } else {
                           System.out.println("Your final prize for components is: " + final_prize);
                           System.exit(1);
                       }
                   }
                    break;
                default:
                    System.out.println("You entered invalid value!");
                    System.out.println("Do you want to continue?(y/n)");
                    Scanner s5 = new Scanner (System.in);
                    if (s5.next().equals("y")) {
                        cont = true;
                    } else {
                        System.out.println("Your final prize for components is: " + final_prize);
                        System.exit(1);
                    }
                    break;

            }

        }
    }
}
