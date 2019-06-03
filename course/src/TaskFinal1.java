import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TaskFinal1 {
    public static void main(String[] args) {
        String inNumberLine = "";
        System.out.println("Введите число в двоичной системе:");
        try (BufferedReader sc = new BufferedReader(new InputStreamReader(System.in))) {
            inNumberLine = sc.readLine(); //считываем введенную пользователем строку целиком
        } catch (IOException e) {
            e.printStackTrace();
        }
        int outNumber = 0;
        for (int i = 0; i < inNumberLine.length(); i++) { //перебираем все элементы строки
            if (!inNumberLine.substring(i, i + 1).equals("1") && !inNumberLine.substring(i, i + 1).equals("0")) { // проверяем, если пользователь ввел что-то , кроме 1 или 0 завершаем работу с ошибкой
                System.err.println("Fatall Error Exception Milenium! I need only 1 or 0 mazafaka");
                return;
            }
            // берем подстроку содержащую один элемент и сравниваем: -если это 1, то то возводим двойку в стемень равную местоположению элемента в строке, иначе 0. Итеративно скалдываем все полученное
            outNumber += Integer.parseInt(inNumberLine.substring(i, i + 1)) == 1 ? (int) Math.pow(2, inNumberLine.length() - i - 1) : 0;
        }
        System.out.println("В десятичной системе:");
        System.out.println(outNumber);
    }
}
