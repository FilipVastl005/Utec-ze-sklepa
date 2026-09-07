import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args){

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
        System.out.println("1 - Jednoduchá");
        System.out.println("2 - Normální");
        System.out.println("3 - Složitá");
        int UserDiff = UserIn.nextInt();

        switch (UserDiff){
            case 1:
                System.out.println("Dobrá volba srabe");
                Game1();
                break;
            case 2:
                System.out.println("Asi ok");
                Game2();
                break;
            case 3:
                System.out.println("Egoisto");
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
        System.out.println("Game1");

    }

    static void Game2(){
        System.out.println("Game1");

    }

    static void Game3(){
        System.out.println("Game1");

    }
}