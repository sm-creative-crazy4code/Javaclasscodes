import java.util.Scanner;

public class Lesson8{
   public static void main(String[] args){

          Scanner input = new Scanner(System.in);

          int num=input.nextInt();

    //    divisible by 2 and 3

    if(num%6==0){
System.out.println(num+" is divisible by 2 and 3");

    }

  if(num%2==0 || num%3==0){
System.out.println(num+" is divisible by 2 or 3");

    }
 

if((num%2==0 || num%3==0 )&& (num%6!=0)){
System.out.println(num+" is divisible by 2 or 3 but not by both");

    }




   }


}