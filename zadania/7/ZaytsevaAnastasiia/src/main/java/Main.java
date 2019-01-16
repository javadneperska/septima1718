import java.io.File;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    LinkedList<Object> shoppingCart = new LinkedList<>();
    File disk, ram, procesor, gfx;
    LinkedList<Processor> processors = new LinkedList<>();
    LinkedList<RAM> rams = new LinkedList<>();
    LinkedList<Disk> disks = new LinkedList<>();
    LinkedList<GraphicCard> graphics = new LinkedList<>();
    Scanner sc;

    public Main() {
        program();
    }



    private void program() {
        init();
        boolean isRunning = true;
        int choice = 0;
        while(isRunning) {
            sc = new Scanner(System.in);
            System.out.println("----------------");
            System.out.println("1) Processors");
            System.out.println("2) RAM-s");
            System.out.println("3) Disks");
            System.out.println("4) Graphic cards");
            System.out.print("Your choice (1-4): ");
            choice = sc.nextInt();
            int i = 1;
            switch(choice) {
                case 1:
                    System.out.println("0 - back");
                    for(Processor p:processors) {
                        System.out.println(i+") " + p.toString());
                        i++;
                    }
                    choice = sc.nextInt();
                    if(choice>0&&choice-1<processors.size()) {
                        shoppingCart.add(processors.get(choice-1));
                    }
                    break;
                case 2:
                    System.out.println("0 - back");
                    for(RAM r:rams) {
                        System.out.println(i+") " + r.toString());
                        i++;
                    }
                    choice = sc.nextInt();
                    if(choice>0&&choice-1<rams.size()) {
                        shoppingCart.add(rams.get(choice-1));
                    }
                    break;
                case 3:
                    System.out.println("0 - back");
                    for(Disk d:disks) {
                        System.out.println(i+") " + d.toString());
                        i++;
                    }
                    choice = sc.nextInt();
                    if(choice>0&&choice-1<disks.size()) {
                        shoppingCart.add(disks.get(choice-1));
                    }
                    break;
                case 4:
                    System.out.println("0 - back");
                    for(GraphicCard g:graphics) {
                        System.out.println(i+") " + g.toString());
                        i++;
                    }
                    choice = sc.nextInt();
                    if(choice>0&&choice-1<graphics.size()) {
                        shoppingCart.add(graphics.get(choice-1));
                    }
                    break;
                default:
                    System.out.println("Bad choice");
                    break;
            }
            System.out.println("Do you want to continue? (1/0)");
            choice = sc.nextInt();
            if(choice != 1) {
                isRunning = false;
            }
        }
        float finalPrice = 0;
        for(Object o:shoppingCart) {
            System.out.println(o.toString());
            if(o instanceof RAM) {
                finalPrice+=((RAM)o).getPrice();
            }
            else if(o instanceof Processor) {
                finalPrice+=((Processor)o).getPrice();
            }
            else if(o instanceof Disk) {
                finalPrice+=((Disk)o).getPrice();
            }else {
                finalPrice+=((GraphicCard)o).getPrice();
            }

        }
        System.out.println("-------------\nFinal price: "+finalPrice);
    }


    private void init() {
        try {
            disk = new File(this.getClass().getResource("disk.txt").toURI());
            sc = new Scanner(disk);
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] params = line.split(",");
                disks.add(new Disk(params[0], params[1], params[2], params[3],Float.parseFloat(params[4])));
            }
            sc.close();
            procesor = new File(this.getClass().getResource("processor.txt").toURI());
            sc = new Scanner(procesor);
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] params = line.split(",");
                processors.add(new Processor(params[0], params[1], params[2], Float.parseFloat(params[3])));
            }
            sc.close();
            ram = new File(this.getClass().getResource("ram.txt").toURI());
            sc = new Scanner(ram);
            while(sc.hasNext()) {
                String line = sc.nextLine();
                String[] params = line.split(",");
                rams.add(new RAM(params[0], params[1],params[2],Float.parseFloat(params[3])));
            }
            sc.close();

            gfx = new File(this.getClass().getResource("gfx.txt").toURI());
            sc = new Scanner(gfx);
            while(sc.hasNext()) {
                String line = sc.nextLine();
                String[] params = line.split(",");
                graphics.add(new GraphicCard(params[0], params[1], params[2], Float.parseFloat(params[3])));
            }

        }catch(Exception ex) {
        }


    }

    public static void main(String[] args) {
        new Main();
    }


}
