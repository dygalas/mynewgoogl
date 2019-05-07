import java.util.Scanner;

public class TaskSeven {
    public static void main(String[] args) {
        int X= 23;
        int Y = 12;
        int Z = 4;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите T:");
        int T = sc.nextInt();
        if(T == X || T == Y || T == Z){
            System.out.println("Данное значение имеется в константах");
        }else {
            System.out.println("Такой константы нет!");
        }
 }
}
