import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        task1();
        task2();
        task3();
        task4();

        
    }
    // Объявить метод «сгенерироватьМассив»
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    private static void task1() {
        int[ ] money = generateRandomArray();
        System.out.println(Arrays.toString(money));
        int sum = 0;
        for (int i = 0; i < money.length; i++) {
            sum = sum + money[i];
            System.out.println("Сумма трат за месяц составила " + sum + " рублец");
        }
    }
    private static void task2() {
        int[ ] money = generateRandomArray();
        System.out.println(Arrays.toString(money));
        int min = money[0];
        int max = money [0];
        for (int i = 0; i < money.length; i++) {
            if (money[i]>max){
                max = money[i];
            }
            if (money[i]<min) {
                min = money[i];
            }
            System.out.println("Минимальная сумма трат за день составила " + min + " рублец. Максимальная сумма трат за день составила" + max + " рублец.");
        }
    }
    private static void task3() {
        int[ ] money = generateRandomArray();
        System.out.println(Arrays.toString(money));
        int sum = 0;
        for (int i = 0; i < money.length; i++) {
            sum = sum + money[i];
            System.out.println("Средняя сумма трат за месяц составила " + (double)sum/money.length + " рублеq");
        }
    }
    private static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}