import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę uczniów:");
        int liczbaUczniow = scanner.nextInt();

        for (int i = 1; i <= liczbaUczniow; i++) {
            System.out.println("Dla ucznia nr " + i + ":");

            double sredniaMatematyka = obliczSrednia(scanner, "matematyki");
            double sredniaFizyka = obliczSrednia(scanner, "fizyki");
            double sredniaChemia = obliczSrednia(scanner, "chemii");

            System.out.println("Średnia ocen z matematyki dla ucznia nr " + i + ": " + sredniaMatematyka);
            System.out.println("Średnia ocen z fizyki dla ucznia nr " + i + ": " + sredniaFizyka);
            System.out.println("Średnia ocen z chemii dla ucznia nr " + i + ": " + sredniaChemia);
            System.out.println(); // Pusta linia dla lepszej czytelności
        }
    }

    private static double obliczSrednia(Scanner scanner, String przedmiot) {
        System.out.println("Ile ocen chcesz wprowadzić z " + przedmiot + "?");
        int liczbaOcen = scanner.nextInt();
        double suma = 0;

        for (int j = 0; j < liczbaOcen; j++) {
            System.out.println("Podaj ocenę nr " + (j + 1) + ":");
            suma += scanner.nextDouble();
        }

        return liczbaOcen > 0 ? suma / liczbaOcen : 0;
    }
}
