package sk.dneperska.work;

public class Main {

    public static void main(String[] args) {
	    String veta = "Kubo je picus";
	    String [] slova = veta.split(" ");
	    for(int i = 0;i<slova.length;i++){
            System.out.println(slova[i]);
        }
    }
}
