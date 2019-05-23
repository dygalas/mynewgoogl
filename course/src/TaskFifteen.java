import java.util.Scanner;

public class TaskFifteen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов массива:");
        int arrSize = scanner.nextInt();
        int[] arr = new int[arrSize];
        for (int i = 0; i < arrSize; i++){
            System.out.println("Введите элемент "  + (i+1) + ":");
            arr[i] = scanner.nextInt();
        }
        System.out.println("Остортированный массив:");
        //for (int j = arrSize-1; j > 0; j--) {
        boolean needCheck;
        do{
            needCheck = false;
        for (int i = 0; i < arrSize-1; i++){
            if (arr[i] > arr[i+1]){
                needCheck = true;
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
            }
        }
        }while(needCheck);
        for (int i = 0; i < arrSize; i++) {
            System.out.println(arr[i]);
        }
    }
}
