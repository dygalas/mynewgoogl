import java.io.*;

public class TaskSixteen {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("TaskSixteen.txt"))) {
            String s;

            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
