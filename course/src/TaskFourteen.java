import java.util.Scanner;

public class TaskFourteen {
    public static void main(String[] args) {
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        int X = Integer.valueOf(S);
        double Y = (double)X;

        System.out.println("S: \n" + S);
        System.out.println("X: \n" + X);
        System.out.println("Y: \n" + Y);
        }
 }
