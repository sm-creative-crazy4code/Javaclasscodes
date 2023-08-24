import java.util.Scanner;

public class Lesson7{
  public static void main(String[] args){
         int num1= (int)(Math.random()*10);
         int num2= (int)(Math.random()*10);


Scanner input = new Scanner(System.in);

    if(num1<num2){

        int temp=num1;
        num1=num2;
        num2=temp;
    }


System.out.println("what is " + num1 + "-" + num2+ "?");

int ans= input.nextInt();

System.out.println(num1 + "-" + num2+"="+ans + " is "+(num1-num2==ans));




  }


}