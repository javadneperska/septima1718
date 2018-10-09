package sk.dneperska.septima1718.daniel.slanina;


public class Main {


    public static void main(String[] args) {
        utils.getInfo();
        System.out.println((int)utils.memory);
        int field[] = new int[(int) utils.memory *2 +10500000];
        for (int i = 0; i < field.length; i++) {
            field[i]= i;
        }
        System.out.println(utils.memory);
        System.out.println(utils.freeMemory/1048576);
        System.out.println(field.length);
        System.out.println("--------------------------------------------------------------------");
        utils.freeMemory = 0;
        utils.memory = 0;
        utils.maxMemory = 0;
        utils.getInfo();

    }

}
