import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę uczniów:");
        int liczbaUczniow = scanner.nextInt();

        for (int i = 1; i <= liczbaUczniow; i++) {
            System.out.println("Uczeń nr " + i);

            List<Double> ocenyMatematyka = wprowadzOceny(scanner, "matematyki");
            List<Double> ocenyFizyka = wprowadzOceny(scanner, "fizyki");
            List<Double> ocenyChemia = wprowadzOceny(scanner, "chemii");

            double sredniaMatematyka = obliczSrednia(ocenyMatematyka);
            double sredniaFizyka = obliczSrednia(ocenyFizyka);
            double sredniaChemia = obliczSrednia(ocenyChemia);

            System.out.println("Średnia ocen ucznia nr " + i + " z matematyki: " + sredniaMatematyka);
            System.out.println("Średnia ocen ucznia nr " + i + " z fizyki: " + sredniaFizyka);
            System.out.println("Średnia ocen ucznia nr " + i + " z chemii: " + sredniaChemia);
        }
    }

    private static List<Double> wprowadzOceny(Scanner scanner, String przedmiot) {
        List<Double> oceny = new ArrayList<>();
        System.out.println("Ile ocen chcesz wprowadzić z " + przedmiot + "?");
        int liczbaOcen = scanner.nextInt();
        System.out.println("Wprowadź oceny z " + przedmiot + " (tylko oceny od 1 do 6):");
        for (int j = 0; j < liczbaOcen; j++) {
            double ocena = scanner.nextDouble();
            while (ocena < 1 || ocena > 6) {
                System.out.println("Ocena jest poza zakresem. Podaj ocenę od 1 do 6:");
                ocena = scanner.nextDouble();
            }
            oceny.add(ocena);
        }
        return oceny;
    }

    private static double obliczSrednia(List<Double> oceny) {
        if (oceny.isEmpty()) return 0;
        double suma = 0;
        for (Double ocena : oceny) {
            suma += ocena;
        }
        return suma / oceny.size();
    }
}
