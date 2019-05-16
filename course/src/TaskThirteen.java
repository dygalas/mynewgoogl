import java.util.Scanner;

public class TaskThirteen {
    public static void main(String[] args) {
        System.out.println("Введите строку 1...");
        Scanner scanner = new Scanner(System.in);
        String stringFst = scanner.nextLine();

        System.out.println("Введите строку 2...");
        String stringScnd = scanner.nextLine();
        System.out.println("Наибольшая длина у строки: \n" + (stringFst.length() > stringScnd.length() ? stringFst : stringScnd));
        }
 }
