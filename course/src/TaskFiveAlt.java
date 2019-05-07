import java.util.Scanner;

public class TaskFiveAlt {
    private static int userNumber;
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        userNumber= sc.nextInt();
        System.out.println("Таблица умножения для заданного числа:");
        System.out.println(userNumber  + " x 1" + " = " +     userNumber);
        System.out.println(userNumber  + " x 2" + " = " + 2 * userNumber);
        System.out.println(userNumber  + " x 3" + " = " + 3 * userNumber);
        System.out.println(userNumber  + " x 4" + " = " + 4 * userNumber);
        System.out.println(userNumber  + " x 5" + " = " + 5 * userNumber);
        System.out.println(userNumber  + " x 6" + " = " + 6 * userNumber);
        System.out.println(userNumber  + " x 7" + " = " + 7 * userNumber);
        System.out.println(userNumber  + " x 8" + " = " + 8 * userNumber);
        System.out.println(userNumber  + " x 9" + " = " + 9 * userNumber);
        System.out.println(userNumber  + " x 10" + " = " + 10 * userNumber);
    }
}
