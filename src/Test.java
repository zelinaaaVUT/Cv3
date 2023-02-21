import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index;

        boolean cyklus = true;

        while (cyklus){
            System.out.println("Zadej  1 - BPC1, 2 - BPC2, 3 - BPIS, 4 - ukonceni");
            index = scanner.nextInt();

            switch (index){
                case 1:
                {
                    Predmet predmet = new BPC1();

                    System.out.println(predmet.NazevPredmetu());
                    System.out.println("Zadej body za aktivitu: ");
                    BPC1.setBodyAktivita(scanner.nextInt());
                    System.out.println("Zadej body za zkousku: ");
                    BPC1.setBodyZkouska(scanner.nextInt());

                    System.out.println(String.format("Dosazene body jsou %s a zapocet byl %s", predmet.PocetBodu(), predmet.SplnujeZapocet()));
                    break;
                }
                case 2:{
                    Predmet predmet = new BPC2();

                    System.out.println(predmet.NazevPredmetu());
                    System.out.println("Zadej body za projekt: ");
                    BPC2.setBodyProjekt(scanner.nextInt());
                    System.out.println("Zadej body za zkousku: ");
                    BPC2.setBodyZkouska(scanner.nextInt());
                    System.out.println("Zadej body za pulsemestralku: ");
                    BPC2.setBodyPulsemka(scanner.nextInt());

                    System.out.println(String.format("Dosazene body jsou %s a zapocet byl %s", predmet.PocetBodu(), predmet.SplnujeZapocet()));
                    break;
                }
                case 3:{
                    Predmet predmet = new BPIS();

                    System.out.println(predmet.NazevPredmetu());
                    System.out.println("Udeleni zapoctu ano/ne");
                    scanner.nextLine();
                    BPIS.setZapocetUdelen(scanner.nextLine());

                    System.out.println(predmet.SplnujeZapocet());
                    break;
                }
                case 4:{
                    cyklus = false;
                    break;
                }
                default:{
                    cyklus = true;
                }

            }
        }
    }
}