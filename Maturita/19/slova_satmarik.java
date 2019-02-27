public class slova_satmarik {

    public static void main(String[] args) {
        String text = "Dnes máme telesnú výchovu!";
        String[] rozdelene = text.split(" ");

        if (text.isEmpty()) {
            System.out.println("Neplatný vstup. (Text je prázdny!)");
        } else {
            for (Integer position = 0; position < rozdelene.length; position++) {

                System.out.println(rozdelene[position]);
            }
        }
    }

}
