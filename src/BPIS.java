import java.util.Objects;

public class BPIS implements Predmet{
    public String nazev_predmetu = "BPIS";
    public static int BodyCelkem = 0;

    public String NazevPredmetu(){
        return nazev_predmetu;
    }
    public int PocetBodu(){
        return BodyCelkem;
    }
    public String SplnujeZapocet(){
        if (PocetBodu() >= Predmet.MinBodu){
            return "udelen";
        }
        else return "neudelen";
    }

    public static void setZapocetUdelen(String Zapocet){
        if (Objects.equals(Zapocet, "ano")){
            BodyCelkem = 100;
        } else if (Objects.equals(Zapocet, "ne")) {
            BodyCelkem = 0;
        }
        else {
            System.out.println("Zadal jsi neco spatne.");
        }
    }
}
