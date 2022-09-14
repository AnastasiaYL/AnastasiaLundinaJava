package AstonTests;

import java.util.Scanner;

public class Test1WithValidation {
    public static void main(String[] args) {
        final int LIMIT = 7;
        Scanner input = new Scanner (System.in);
        String str;
        boolean check;
        do {
            System.out.println("Введите число: ");
            str = input.nextLine();
            check = str.matches("^[-]{0,1}[0-9]+[.]{0,1}[0-9]{0,}");
        } while (!check);
        double number = Double.parseDouble(str);
        if (number > LIMIT) System.out.println("Привет");
    }
}
