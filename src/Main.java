import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args){

        Scanner UserIn = new Scanner(System.in);

        System.out.println("Výtej hráči 1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
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

        }
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