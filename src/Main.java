import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args){

        System.out.println("Welcome to the game");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        Start();
    }

    static void Start(){

        Scanner UserIn = new Scanner(System.in);

        System.out.println("Výtej hráči 1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        for (int i = 0; i < 50; i++) System.out.println();

        System.out.println("Vyber si obtížnost");
        System.out.println("1 - Zamknuto - (Jednoduchá)");
        System.out.println("2 - Zával -(Normální)");
        System.out.println("3 - Potopa - (Složitá)");
        int UserDiff = UserIn.nextInt();

        switch (UserDiff){
            case 1:
                System.out.println("Zavolej");
                Game1();
                break;
            case 2:
                System.out.println("BUM");
                Game2();
                break;
            case 3:
                System.out.println("Neklesni na dno");
                Game3();
                break;
            default:
                Idiot();

        }

    }

    static void Idiot(){

        System.out.println("To tě nenapadlo vybírat z možností...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.print(".");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.print(".");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.print(".");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.print(".");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Duh...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Debile.");

        for (int i = 0; i < 50; i++) System.out.println();
        Start();

    }

    static void Game1(){


        for (int i = 0; i < 50; i++) System.out.println();
        System.out.println("Game1");
        System.out.println("Zamknuto");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        for (int i = 0; i < 50; i++) System.out.println();

        System.out.println("Jsi v ůnikové místnosti, tvůj cíl je dostat se ven.");
        System.out.println("Místnost 1");
        System.out.println("Po tvé levici jsou zamklé dveře s čtvercovou klíčovou dirkou, najdeš klíč?" +
                "Před tebou je kostlivec, v pravo skříň a nad tebou poklop.");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        for (int i = 0; i < 50; i++) System.out.println();

        System.out.println("Co uděláš?");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        for (int i = 0; i < 50; i++) System.out.println();

        System.out.println("1 - odlámeš kostlivci žebra");
        System.out.println("2 - otevřeš skříň");
        System.out.println("3 - pokusíš se otevřít poklop");

        Scanner ChoiseGame1 = new Scanner(System.in);
        int UserChGm1 = ChoiseGame1.nextInt();

        switch (UserChGm1){
            case 1:
                System.out.println("Gratuluju ty vocasi, zničil si to.");
                YouLoose();
                break;
            case 2:
                System.out.println("Nalezen byl klíč");
                G1KeyFound();

                break;
            case 3:
                System.out.println("Byla Nalezena nová místnost");
                G1Hatch();

                break;
            default:
                Idiot();
        }

    }

    static void Game2(){
        System.out.println("Game1");

    }

    static void Game3(){
        System.out.println("Game1");

    }

    static void G1Hatch(){
        System.out.println("Jsi v nechutně osvětlené místnosti.");
        System.out.println("Zkus neoslepnout a najít cestu ven");
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Co uděláš?");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        for (int i = 0; i < 50; i++) System.out.println();

        System.out.println("1 - Prohmatáš póstrování");
        System.out.println("2 - Prozkoumáš světla");
        System.out.println("3 - Porozhlédneš se");

        Scanner ChoiseHatchGame1 = new Scanner(System.in);
        int UserHatchGm1 = ChoiseHatchGame1.nextInt();

    }

    static void YouLoose(){
        System.out.println("Prohrál jsi.");
    }
    static void G1KeyFound(){System.out.println("Našel si klíč ale je ti k ničemu. Gratuluju."); YouLoose();}
}