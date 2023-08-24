import java.util.Scanner;
public class Lesson5{
    /**
     *  @author Sneha Mandal
     *  @version 1.0
     *  @param  programme calculates the acceleration over a given period of time
     */

    public static void main(String[] args){
   
   Scanner input= new Scanner(System.in);
   System.out.println("Enter vo, v1,t");

//    Takiing inputs for vo,v1 and t
   double v0 = input.nextDouble();
   double v1=input.nextDouble();
   double t=input.nextDouble();

//    Check to handel invalid runtime error

   if(t==0.f){
    System.out.println("Invalid operation denominator camnno tbe 0");
   }

   double a = (v1-v0)/t;
   System.out.println("Acceleration: " + a);

    }
}