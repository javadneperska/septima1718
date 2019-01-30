package sk.dneperska.work;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num = load();
        String write = "";
        String space = "";
        String result = "";
        for(int x = 0; x<num;x++){
            write = write + "x";
        }
        space = write.replaceAll("x"," ");
        System.out.println(write);
        for(int y = 1; y<num;y++){
            result = result + space;
            System.out.println(result + write);
        }
    }
    static int load(){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        try{
            num = sc.nextInt();
        }catch(Exception e){
            System.exit(0);
        }
        return num;
    }
}
