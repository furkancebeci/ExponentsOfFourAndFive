import java.util.Scanner;

public class ExponentsOfFourAndFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Exponents of four: ");
        for (int i=4; i<=number; i*=4) {
            System.out.println(i);
        }
        System.out.println("Exponents of five: ");
        for (int j=5; j<=number; j*=5) {
            System.out.println(j);
        }
    }
}