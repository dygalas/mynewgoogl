import java.util.Scanner;

public class TaskSix {
    public static void main(String[] args) {
        int X,Y,Z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите X");
        X = sc.nextInt();
        System.out.println("Введите Y");
        Y = sc.nextInt();
        System.out.println("Введите Z");
        Z = sc.nextInt();

        int avg = (X+Y+Z)/3;

        System.out.println("Среднее арифметическое введенных чисел = " + avg);

        int avgPopolam = avg / 2;
        if(avgPopolam > 3){
            System.out.println("Программа выполнена корректно");
        }
 }
}
