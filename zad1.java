import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę uczniów:");
        int liczbaUczniow = scanner.nextInt();

        for (int i = 1; i <= liczbaUczniow; i++) {
            System.out.println("Uczeń nr " + i);

            System.out.println("Podaj ocenę z matematyki:");
            double matematyka = scanner.nextDouble();

            System.out.println("Podaj ocenę z fizyki:");
            double fizyka = scanner.nextDouble();

            System.out.println("Podaj ocenę z chemii:");
            double chemia = scanner.nextDouble();

            double sredniaMatematyka = matematyka;
            double sredniaFizyka = fizyka;
            double sredniaChemia = chemia;

            System.out.println("Średnia ocen ucznia nr " + i + " z matematyki: " + sredniaMatematyka);
            System.out.println("Średnia ocen ucznia nr " + i + " z fizyki: " + sredniaFizyka);
            System.out.println("Średnia ocen ucznia nr " + i + " z chemii: " + sredniaChemia);
        }
    }
}
