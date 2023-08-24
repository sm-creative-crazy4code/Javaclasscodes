import java.util.Scanner;

public class Lesson6{
  public static void main (String[] args){


    int num1 =(int) (System.currentTimeMillis() %10);
    int num2 =(int) (System.currentTimeMillis()*7%10);

    Scanner input = new Scanner(System.in);


    System.out.println("What is the"+num1+"+"+num2+"?");

    int ans= input.nextInt();

    System.out.println(num1+"+"+num2+"="+ans+" is"+(num1+num2==ans));


 }

}