public class BPC2 implements Predmet{
    public String nazev_predmetu = "BPC2";
    public static int BodyProjekt = 0;
    public static int BodyZkouska = 0;
    public static int BodyPulsemka = 0;

    public String NazevPredmetu(){
        return nazev_predmetu;
    }
    public int PocetBodu(){
        return BodyProjekt + BodyZkouska + BodyPulsemka;
    }
    public String SplnujeZapocet(){
        if (PocetBodu() >= Predmet.MinBodu){
            return "udelen";
        }
        else return "neudelen";
    }

    public static void setBodyProjekt(int Bodyprojekt){
        if (Bodyprojekt <= 30 && ((BodyProjekt + Bodyprojekt) <= 30)){
            BodyProjekt = Bodyprojekt;
        }
        else System.out.println("Zadal jsi mimo okruh.");
    }
    public static void setBodyZkouska(int Bodyzkouska){
        if (Bodyzkouska <= 50 && ((BodyZkouska+ Bodyzkouska) <= 50)){
            BodyZkouska = Bodyzkouska;
        }
        else System.out.println("Zadal jsi mimo okruh.");
    }
    public static void setBodyPulsemka(int Bodypulsemka){
        if (Bodypulsemka <= 20 && ((BodyPulsemka+ Bodypulsemka) <= 20)){
            BodyPulsemka = Bodypulsemka;
        }
        else System.out.println("Zadal jsi mimo okruh.");
    }
}
