import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int x = input.nextInt();
        System.out.println("Введите второе число");
        int y = input.nextInt();
        if (x > y) {
            System.out.println("Число" + " " + x + " " + "больше числа" + " " + y);
        } else if (x < y) {
            System.out.println("Число" + " " + y + " " + "больше числа" + " " + x);

        } else {
            System.out.println("Число" + " " + y + " " + "равно числу" + " " + x);
        }
    }
}
