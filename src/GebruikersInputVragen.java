import java.util.Scanner;

public class GebruikersInputVragen {

    double[] vraagGebruikerInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hoeveel getallen wil je invoeren? ");
        int lengte = scanner.nextInt();
        double[] data = new double[lengte];
        for (int i = 0; i < lengte; i++) {
            System.out.printf("Welke getal wil je op %d: ", i);
            data[i] = scanner.nextDouble();

        }
        return data;

    }

    double berekenGemiddelde(double[] data) {
        double resultaat = 0;
        for(double getal: data) {
            resultaat += getal;
        }
        return resultaat / data.length;

    }


}