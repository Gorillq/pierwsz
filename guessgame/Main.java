import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class Main {
    static int value;
    static int answer;
    public static void game() {
        int i;
        int k = 15;
        Random random = new Random();
        Scanner reader = new Scanner(System.in);
        value = random.nextInt(50);
        System.out.println("Zgadnij liczbe z zakresu 0 do 50. Masz 15 szans");
        for (i = 1; i <= k; i++) {
            System.out.println("Zgadnij liczbe(0 - 50)");
            answer = reader.nextInt();
            if (answer == value) {
                System.out.println("Brawo, liczba to " + answer + ", odgadles po " + i + " probach");
                break;
            }
            else if (answer > value) {
                System.out.println("Za duzo");
            }
            else {
                System.out.println("Za malo");
            }
        }
        if (i > k) {
            System.out.println("Za duzo podejsc. Sprobuj jeszcze raz?(tak)");
            String newgame = reader.nextLine();
            if (newgame.equals("Tak") || newgame.equals("tak")) {
                game();
            }
            else {
                System.exit(0);
            }
        }
    }

    public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            System.out.println("Zagrac?(tak)");
            String playgame = read.nextLine();
                if (Objects.equals(playgame, "tak") || Objects.equals(playgame, "Tak")) {
                    game();
                    }
                else {
                    System.exit(0);
                }
        }
    }