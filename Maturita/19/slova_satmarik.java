public class slova_satmarik {


    public class Main {

        public void main(String[] args) {
            String veta = "Dnes mame telesnú výchovu!";
            String [] slova = veta.split(" ");
            for(int i = 0;i<slova.length;i++){
                System.out.println(slova[i]);
            }
        }
    }

}
