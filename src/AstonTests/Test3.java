package AstonTests;

import java.util.Scanner;

public class Test3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Введите длину массива: ");
        int length = input.nextInt();
        int list [] = new int [length];
        for (int i = 0; i < length; i++) {
            System.out.println("Введите " + (i + 1) + " значение массива: ");
            list [i] = input.nextInt();
        }
        int marker = 0;
        for (int i = 0; i < length; i++) {
            if ((list [i] % 3 == 0) && (marker == 0)) {
                System.out.println("Элементы массива, кратные 3: ");
                System.out.print(list[i] + " ");
                marker = 1;
            } else if ((list [i] % 3 == 0) && (marker == 1)) {
                System.out.print(list[i] + " ");
            }
        }
        if (marker == 0) System.out.println("Элементов кратных 3 в массиве нет");
    }
}
