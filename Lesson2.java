
import java.util.Scanner;
public class Lesson2{

    public static void main(String[] args){

         Scanner input= new Scanner(System.in);
         System.out.println("enter the number");

         int num = input.nextInt();
         int result = 0;

         while(num>=0){
          int rem = num%10;
          result=result+rem;
          num=num/10;

         }

         System.out.println(result);




    }
}