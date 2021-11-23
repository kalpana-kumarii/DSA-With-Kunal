package flowof_program;
import java.util.Scanner;

public class Leapyear {
public static void main(String[] args) {
        Scanner ip= new Scanner(System.in);
        // System.out.println("enter name");
        // String userName =ip.nextLine();
        
        // System.out.println("your name is "+userName);
        System.out.println("enter year");
        int num=ip.nextInt();
        if(num%400==0){
            System.out.println("true");   
        }
       else if(num%100==0){
            System.out.println("false");   
        }
       else if(num%4==0){
            System.out.println("true");
        }
      
    

        else{
            System.out.println("false");
        }
    }
}
