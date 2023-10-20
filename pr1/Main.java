import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int ans = 0;
        Scanner reader = new Scanner(System.in);
        System.out.println("Hello World");
        System.out.print("Enter your name:");
        String username = reader.next();
        if (username.equals("Alice") || username.equals("Gregory")) {
            System.out.println("Hello" + " " + username);
        }
        else if (username.equals("Bob")) {
            System.out.println("Praise the" + " " + username);
        }
        else {
            System.out.println("Name not registered");
        }
        System.out.print("Choose:\n1.");
        int choose = reader.nextInt();
        if (choose == 1){
            int x = reader.nextInt();
            for (int i = 1; i <= x; i++) {
                ans+= i;
            }
            System.out.println(ans);
        }
        if (choose == 2) {
            System.exit(0);
        }
    }
}