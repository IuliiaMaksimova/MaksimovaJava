import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;

        // Ввод чисел a и b
        System.out.print("Введите первое целое число (a): ");

        try {
            a = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Число (a) введено неверно");
            return;
        }

        System.out.print("Введите второе целое число (b): ");

        try {
            b = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Число (b) введено неверно");
            return;
        }


        // Сравнение чисел
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }

        // Арифметические операции
        System.out.println("Сложение: a + b = " + (a + b));
        System.out.println("Вычитание: a - b = " + (a - b));
        System.out.println("Умножение: a * b = " + (a * b));
        if (b != 0) {
            System.out.println("Деление: a / b = " + (a / b));
        } else {
            System.out.println("Деление невозможно: делитель равен 0");
        }
    }
}
