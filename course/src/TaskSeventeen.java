import java.io.*;

public class TaskSeventeen {
    public static void main(String[] args) {
        System.out.println("Введите текст для записи в файл. Для выхода введите слово \"стоп\":");
        try (FileWriter fw = new FileWriter("TaskSeven.txt");
             BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String s;
            while (true) {
                s = reader.readLine();
                if (s.equalsIgnoreCase("стоп")) {
                    break;
                }
                fw.write(s+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
