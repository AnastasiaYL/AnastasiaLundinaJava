package AstonTests;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        final String NAME = "вячеслав";
        Scanner input = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String str = input.nextLine();
        int check = str.toLowerCase().indexOf(NAME);
        if (check >= 0) System.out.println("Привет, Вячеслав");
        else System.out.println("Нет такого имени");
    }
}
