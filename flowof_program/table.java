package flowof_program;
import java.util.Scanner;
public class table {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("enter num to print table");
      int tb= input.nextInt();
      for(int i=1;i<=10;i++){
          System.out.print(" "+tb*i);
      }

    }
}
