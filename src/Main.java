import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    // berechnet Zins für jedes Jahr
        Scanner in = new Scanner(System.in);
        System.out.println("Anzahl Jahre eingeben: ");
        int jahre = in.nextInt();

        System.out.println("Zinssatz eingeben: ");
        float zinssatz = in.nextFloat();

        System.out.println("Jetztiger Kontostand: ");
        float konto = in.nextFloat();

        float zins;

        for (int i = 1; i <= jahre; i++) {
            zins = zinssatz * konto;
            konto += zins;

            System.out.printf("Im %d. Jahr gibt es %.2f CHF Zins. Neuer Kontostand: %.2f CHF\n", i,zins,konto);
        }
    }
}



