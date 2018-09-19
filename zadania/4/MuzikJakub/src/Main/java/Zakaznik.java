
public class Zakaznik {

    public Zakaznik(String meno, String priezvisko) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        
        pocetZakaznikov++;
    }
    private String meno;
    private String priezvisko;
    
    public static int pocetZakaznikov=0;

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }
}
