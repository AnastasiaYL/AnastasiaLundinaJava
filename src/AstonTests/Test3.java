package AstonTests;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        ArrayList<Integer> multipleOfThree = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Введите целые числа, завершив ввод значением 0: ");
        int value = 1;
        do {
            try {
                value = input.nextInt();
                if (value % 3 == 0)
                    multipleOfThree.add(value);
            } catch (InputMismatchException ex) {
                System.out.println("Введено не целое число!");
                input.next();
            }
        } while (value != 0);
        input.close();
        if (multipleOfThree.size() > 1) {
            System.out.println("Числа, кратные 3: ");
            for (int i = 0; i < multipleOfThree.size() - 1; i++) {
                System.out.print(multipleOfThree.get(i) + " ");
            }
        } else System.out.println("Чисел, кратных 3 нет");
    }
}
