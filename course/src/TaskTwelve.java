import java.util.Scanner;

public class TaskTwelve {
    public static void main(String[] args) {
        System.out.println("Введите строку...");
        Scanner scanner = new Scanner(System.in);
        String in = scanner.nextLine();
        in = in.replaceAll(" ","");
        System.out.println("Обработанная строка: \n" + in);
        }
 }
