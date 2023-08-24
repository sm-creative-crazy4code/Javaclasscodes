import java.util.Scanner;

public class Lesson10{
  

  public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of the a,b and c of quadratic equation");

        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double ans1,ans2;

     if(a==0.0){
      System.out.println("invalid value. a cannot be 0");

     }else{


      if((b*b)-(2*a*c)>0){
              ans1=(-b+Math.sqrt((b*b)-(2*a*c)))/(2*a);
               System.out.println("root 1 = " + ans1);
                ans2=(-b-Math.sqrt((b*b)-(2*a*c)))/(2*a);

        System.out.println("root 1 = " + ans1+ " root 2 = " + ans2);
      }else{
          double realans1= (-b/(2*a));
          double imgans1=((2*a*c)-(b*b))/(2*a);
          System.out.println("root 1 = " + realans1+" + "+imgans1+"i");
          System.out.println("root 2 = " + realans1+" - "+imgans1+"i");


      }
       
       



     }

  



  }


}