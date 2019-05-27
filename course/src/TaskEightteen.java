import java.io.*;

public class TaskEightteen {
    private static File file;

    public static void main(String[] args) {
        int stringCount = 0;
        file = new File("TaskEightteen.txt");
        if (!file.exists()) {   //проверка - существует ли файл
            System.err.println("Файл еще не создан, введите текст для сохранения в файл");
            try {
                file.createNewFile();
                TaskSeventeen.writeFile(file); //если файл не существует, то создаем файл и записываем при помощи метода из прошлой задачи
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String s;
            System.out.println("Содержимое файла \"TaskEightteen.txt\":");
            while ((s = br.readLine()) != null) {   //печатаем содержимое файла и подсчитываем количество строк
                System.out.println(s);
                stringCount++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (stringCount > 0) {          //если файл не пустой перезаписываем файл
            writeFile(stringCount);
        } else {
            System.out.println("Файл пустой");
        }
    }

    public static void writeFile(int stringCount) {
        System.out.println("\nВведите " + stringCount + " строк текста для записи в файл:");
        try (FileWriter fw = new FileWriter(file);
             BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String s;
            for (int i = 0; i < stringCount; i++) {     //вводим количество строк равных количеству строк в считанном файле
                s = reader.readLine();
                fw.write(s + ((i + 1) == stringCount ? "" : "\r\n"));
                fw.flush();
            }
            System.out.println("Файл успешно записан!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
