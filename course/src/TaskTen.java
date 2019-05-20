import java.util.Scanner;

public class TaskTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество строк:");
        int rowSize = scanner.nextInt();
        System.out.println("Введите количество столбцов:");
        int columnSize  = scanner.nextInt();
        int[][] arr = new int[rowSize][columnSize];
        for (int i = 0; i < rowSize; i++){
            System.out.println("Введите элементы строки "  + (i+1) + ":");
            for (int j = 0; j < columnSize; j++) {
                System.out.println(" Введите элемент "  + (j+1) + ":");
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("\nВведенные данные из первой строки x3:");
//        for (int i = 0; i < rowSize; i++){
            System.out.println();
            for (int j = 0; j <columnSize; j++) {
                System.out.print ("\t" + arr[0][j]*3);
//            }
        }
 }
}
