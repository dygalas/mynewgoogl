import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TaskFinal3 {
    public static void main(String[] args) {
        double curCourse, inRub, inUSD;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текущий курс рубля:");
        curCourse = sc.nextDouble();
        if (curCourse == 0) {
            System.err.println("Are you bolnoy?");
            return;
        }
        System.out.println("Сумма в рублях:");
        inRub = sc.nextDouble();
        BigDecimal convertedSum = new BigDecimal(inRub / curCourse);
        inUSD = convertedSum.setScale(2, RoundingMode.CEILING).doubleValue();
        System.out.println("Сумма в долларах:");
        System.out.println(inUSD);
    }
}
