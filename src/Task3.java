public class Task3 {
    public static void main(String[] args) {
        // Задан массив целых чисел
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Вывод четных чисел
        System.out.println("Четные числа из массива:");
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}