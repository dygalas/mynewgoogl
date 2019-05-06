import java.util.Scanner;

public class TaskFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inNumberLine = sc.nextLine();
        int outNumber=0;
        for (int i = 0; i < inNumberLine.length(); i++) {
            if(!inNumberLine.substring(i,i+1).equals("1")&&!inNumberLine.substring(i,i+1).equals("0")){
                System.out.println("Fatall Error Exception Milenium");
                return;
            }
            outNumber += Integer.parseInt(inNumberLine.substring(i,i+1))==1?(int)Math.pow(2, inNumberLine.length()-i-1):0;
        }
        System.out.println(outNumber);
    }
}
