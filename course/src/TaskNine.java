import java.util.Scanner;

public class TaskNine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива");
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++){
            System.out.println("Введите элемент "  + (i+1) + ":");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Введенные данные x2:");
        for (int i = 0; i < arrSize; i++){
            System.out.println( i+1 + " - " + arr[i]*2);
        }
 }
}
