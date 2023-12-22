import foundationalMathematics.ModularArithmetic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //for console input
        System.out.println(ModularArithmetic.binaryExponentiation(scanner.nextLong(), scanner.nextLong(), (long) (1e9 + 7)));
    }
}