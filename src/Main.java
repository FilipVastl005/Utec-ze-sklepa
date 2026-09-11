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

        System.out.println("Vítej hráči 1");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        for (int i = 0; i < 50; i++) System.out.println();

        System.out.println("Vyber si obtížnost");
        System.out.println("1 - Zamknuto - (Jednoduchá)");
        System.out.println("2 - Zával - (Normální)");
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
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        for (int i = 0; i < 50; i++) System.out.println();

        System.out.println("Jsi v únikové místnosti, tvůj cíl je dostat se ven.");
        System.out.println("Místnost 1");
        System.out.println("Po tvé levici jsou zamklé dveře s čtvercovou klíčovou dírkou, najdeš klíč? Před tebou je kostlivec, vpravo skříň a nad tebou poklop.");

        try {
            Thread.sleep(5000);
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

    static void G1KeyFound(){
        for (int i = 0; i < 50; i++) System.out.println();
        System.out.println("Našel jsi klíč. Co s ním uděláš?");
        System.out.println("1 - Použít klíč na zamknuté dveře");
        System.out.println("2 - Zahodit klíč a jít k poklopu");

        Scanner ChoiceKey = new Scanner(System.in);
        int UserChKey = ChoiceKey.nextInt();

        switch (UserChKey){
            case 1:
                G1Door();
                break;
            case 2:
                G1Hatch();
                break;
            default:
                Idiot();
        }
    }

    static void G1Door(){
        for (int i = 0; i < 50; i++) System.out.println();
        System.out.println("Stojíš u zamčených dveří a klíč pasuje.");
        System.out.println("1 - Otočit klíčem doprava");
        System.out.println("2 - Otočit klíčem doleva");

        Scanner ChoiceDoor = new Scanner(System.in);
        int UserChDoor = ChoiceDoor.nextInt();

        switch (UserChDoor){
            case 1:
                System.out.println("Zámek cvaknul a otevřel tajný průchod.");
                G1SecretRoom();
                break;
            case 2:
                System.out.println("Zámek spustil past a ze zdi vyjel šíp.");
                YouLoose();
                break;
            default:
                Idiot();
        }
    }

    static void G1SecretRoom(){
        for (int i = 0; i < 50; i++) System.out.println();
        System.out.println("Jsi v tajné místnosti s báňským vozíkem.");
        System.out.println("1 - Nasednout do vozíku a pustit brzdu");
        System.out.println("2 - Prohledat truhlu v rohu");

        Scanner ChoiceSecret = new Scanner(System.in);
        int UserChSecret = ChoiceSecret.nextInt();

        switch (UserChSecret){
            case 1:
                System.out.println("Vozík tě vyvezl přímo ven z komplexu!");
                YouWin();
                break;
            case 2:
                System.out.println("Truhla byla plná jedem napuštěných jehel.");
                YouLoose();
                break;
            default:
                Idiot();
        }
    }

    static void Game2(){
        for (int i = 0; i < 50; i++) System.out.println();
        System.out.println("Game2");
        System.out.println("Zával");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        for (int i = 0; i < 50; i++) System.out.println();

        System.out.println("Jsi v tmavém dole a stropy se hroutí.");
        System.out.println("Kameny ti zablokovaly cestu zpět.");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        for (int i = 0; i < 50; i++) System.out.println();

        System.out.println("Co uděláš?");
        System.out.println("1 - Odhazovat kameny ručně");
        System.out.println("2 - Použít starý krumpáč na zdi");
        System.out.println("3 - Zapálit starou výbušninu");

        Scanner ChoiseGame2 = new Scanner(System.in);
        int UserChGm2 = ChoiseGame2.nextInt();

        switch (UserChGm2){
            case 1:
                System.out.println("Strhl se další zával a zavalil tě.");
                YouLoose();
                break;
            case 2:
                System.out.println("Prorazil jsi slabou zeď a objevil skrytou šachtu.");
                G2Shaft();
                break;
            case 3:
                System.out.println("Výbuch zničil celý podzemní komplex.");
                YouLoose();
                break;
            default:
                Idiot();
        }
    }

    static void G2Shaft(){
        for (int i = 0; i < 50; i++) System.out.println();
        System.out.println("Jsi v úzké šachtě. Vidíš žebřík vedoucí nahoru a temný tunel dolů.");
        System.out.println("1 - Lézt po žebříku nahoru");
        System.out.println("2 - Jít temným tunelem dolů");

        Scanner ChoiceShaft = new Scanner(System.in);
        int UserChShaft = ChoiceShaft.nextInt();

        switch (UserChShaft){
            case 1:
                System.out.println("Šplháš výš a vidíš denní světlo!");
                YouWin();
                break;
            case 2:
                G2Tunnel();
                break;
            default:
                Idiot();
        }
    }

    static void G2Tunnel(){
        for (int i = 0; i < 50; i++) System.out.println();
        System.out.println("Tunel tě dovedl k zatopené jeskyni.");
        System.out.println("1 - Přeplavat na druhou stranu");
        System.out.println("2 - Vrátit se zpět");

        Scanner ChoiceTunnel = new Scanner(System.in);
        int UserChTunnel = ChoiceTunnel.nextInt();

        switch (UserChTunnel){
            case 1:
                System.out.println("Voda byla ledová a podchladil ses.");
                YouLoose();
                break;
            case 2:
                System.out.println("Tunel se za tebou zřítil.");
                YouLoose();
                break;
            default:
                Idiot();
        }
    }

    static void Game3(){
        for (int i = 0; i < 50; i++) System.out.println();
        System.out.println("Game3");
        System.out.println("Potopa");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        for (int i = 0; i < 50; i++) System.out.println();

        System.out.println("Místnost se plní studenou vodou.");
        System.out.println("Voda ti už dosahuje po krk.");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        for (int i = 0; i < 50; i++) System.out.println();

        System.out.println("Co uděláš?");
        System.out.println("1 - Zkusit otočit rezavým ventilem");
        System.out.println("2 - Rozbít okno a vyplavat");
        System.out.println("3 - Čekat než voda přestane téct");

        Scanner ChoiseGame3 = new Scanner(System.in);
        int UserChGm3 = ChoiseGame3.nextInt();

        switch (UserChGm3){
            case 1:
                System.out.println("Ventil otevřel těžké tlakové dveře do velína.");
                G3ControlRoom();
                break;
            case 2:
                System.out.println("Tlak vody tě protáhl sklem a pořezal.");
                YouLoose();
                break;
            case 3:
                System.out.println("Voda dosáhla stropu a utopil ses.");
                YouLoose();
                break;
            default:
                Idiot();
        }
    }

    static void G3ControlRoom(){
        for (int i = 0; i < 50; i++) System.out.println();
        System.out.println("Jsi ve velínu. Voda sem pomalu zatéká.");
        System.out.println("1 - Stisknout červené tlačítko nouzového vypouštění");
        System.out.println("2 - Použít žebřík k únikovému poklopu ve stropě");

        Scanner ChoiceControl = new Scanner(System.in);
        int UserChControl = ChoiceControl.nextInt();

        switch (UserChControl){
            case 1:
                System.out.println("Systém selhal a elektrický zkrat tě usmrtil.");
                YouLoose();
                break;
            case 2:
                System.out.println("Otevřel jsi poklop a dostal se bezpečně na střechu!");
                YouWin();
                break;
            default:
                Idiot();
        }
    }

    static void G1Hatch(){
        System.out.println("Jsi v nechutně osvětlené místnosti.");
        System.out.println("Zkus neoslepnout a najít cestu ven");
        try {
            Thread.sleep(3000);
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

        System.out.println("1 - Prohmatáš polstrování");
        System.out.println("2 - Prozkoumáš světla");
        System.out.println("3 - Porozhlédneš se");

        Scanner ChoiseHatchGame1 = new Scanner(System.in);
        int UserHatchGm1 = ChoiseHatchGame1.nextInt();

        switch (UserHatchGm1){
            case 1:
                System.out.println("Našel jsi skrytý spínač, který otevřel východ!");
                YouWin();
                break;
            case 2:
                System.out.println("Světlo tě oslepilo a spadl jsi do pasti.");
                YouLoose();
                break;
            case 3:
                System.out.println("Nic jsi nenašel a došel ti čas.");
                YouLoose();
                break;
            default:
                Idiot();
        }
    }

    static void YouLoose(){
        System.out.println("Prohrál jsi.");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        for (int i = 0; i < 50; i++) System.out.println();
        Start();
    }

    static void YouWin(){
        System.out.println("Vyhrál jsi! Podařilo se ti uniknout!");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        for (int i = 0; i < 50; i++) System.out.println();
        Start();
    }
}