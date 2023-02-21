public class BPC1 implements Predmet{
    public String nazev_predmetu = "BPC1";
    public static int BodyAktivita = 0;
    public static int BodyZkouska = 0;

    public String NazevPredmetu(){
        return nazev_predmetu;
    }
    public int PocetBodu(){
        return BodyAktivita + BodyZkouska;
    }
    public String SplnujeZapocet(){
        if (PocetBodu() >= Predmet.MinBodu){
            return "udelen";
        }
        else return "neudelen";
    }

    public static void setBodyAktivita(int Bodyaktivita){
        if (Bodyaktivita <= 20 && ((BodyAktivita + Bodyaktivita) <= 20)){
            BodyAktivita = Bodyaktivita;
        }
        else System.out.println("Zadal jsi mimo okruh.");
    }
    public static void setBodyZkouska(int Bodyzkouska){
        if (Bodyzkouska <= 80 && ((BodyZkouska + Bodyzkouska) <= 80)){
            BodyZkouska = Bodyzkouska;
        }
        else System.out.println("Zadal jsi mimo okruh.");
    }

}
