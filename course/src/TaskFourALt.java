import java.util.Scanner;

public class TaskFourALt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inNumberLine = sc.nextLine();
        int outNumber= Integer.parseInt(inNumberLine, 2);
        System.out.println(outNumber);
    }
}
