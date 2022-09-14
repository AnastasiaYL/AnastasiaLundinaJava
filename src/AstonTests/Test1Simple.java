package AstonTests;

import java.util.Scanner;

public class Test1Simple {
    public static void main(String[] args) {
        final int LIMIT = 7;
        Scanner input = new Scanner (System.in);
        System.out.println("Введите число: ");
        int number = input.nextInt();
        if (number > LIMIT) System.out.println("Привет");
    }
}
