import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner UserIn = new Scanner(System.in);

        System.out.println("Výtej hráči 1");
        Thread.sleep(1000);
        System.out.println("Vyber si obtížnost");
        System.out.println("1 - Jednoduchá");
        System.out.println("2 - Střední");
        System.out.println("3 - Složitá");
        int UserDiff = UserIn.nextInt();

        switch (UserDiff){
            case 1:
                System.out.print("Dobrá volba srabe");
                System.out.print("");

        }
    }

    static void Game1(){

    }
}