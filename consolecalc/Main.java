import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input a");
        int a = input.nextInt();
        System.out.println("input b");
        int b = input.nextInt();
        System.out.println("""
                Options:
                1. Sum
                2. Subtraction
                3. Multiplication
                4. Division""");
        int option = input.nextInt();
        Calculator obj = new Calculator();
        int tmp;
        double tmpo;
        switch(option) {
            case 1:
                tmp = obj.add(a, b);
                System.out.println("Sum of a and b: " + tmp);
                break;
            case 2:
                tmp = obj.subs(a,b);
                System.out.println("Subtraction b from a: " + tmp);
                break;
            case 3:
                tmp = obj.multp(a, b);
                System.out.println("a multiplied by b: " + tmp);
                break;
            case 4:
                tmpo = obj.divd(a, b);
                System.out.println("a divided by b: " + tmpo);
                break;
            default:
                System.out.println("Wrong input");
                System.exit(1);
        }
    }
}