import java.util.Scanner;

public class TaskFive {
    private static int userNumber;
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        userNumber= sc.nextInt();
        System.out.println("Таблица умножения для заданного числа:");
     //   System.out.println("1 x " + userNumber + " = " + 1 * userNumber);
        printMultiple(1);
    }

    private static void printMultiple(int num){
        if (num > userNumber){ return;}
        System.out.println(userNumber + " x " + num + " = " + num * userNumber);
        printMultiple(++num);
    }
}
