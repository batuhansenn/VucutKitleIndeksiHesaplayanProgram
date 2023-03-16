import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double kilo, boy, vki;

        Scanner inp = new Scanner(System.in);

        System.out.print("Lütlen boyunuzu metre cinsinden giriniz: ");
        boy = inp.nextDouble();
        System.out.print("Lütlen kilonuzu giriniz giriniz: ");
        kilo = inp.nextDouble();

        vki = kilo / (boy * boy);
        System.out.println("Vucut Kitle indeksiniz: " + vki);

    }
}