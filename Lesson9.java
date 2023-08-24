import java.util.Scanner;

public class Lesson9{
 public static void main(String[] args){

    int num1= (int)(Math.random()*100);


    Scanner input = new Scanner(System.in);

    int ans= input.nextInt();

    System.out.println(num1);

    int numdigi1= num1/10;
    int numdigi2= num1/100;
    int ansdigi1= ans/10;
    int ansdigi2= ans/100;

    if(num1==ans){
  System.out.println("Congrats you won $10000");

    }else if(numdigi1==ansdigi2 && numdigi2==ansdigi1){

   System.out.println("Congrats you won $3000");


    }else if(numdigi1==ansdigi1 || numdigi2==ansdigi2||numdigi1==ansdigi2 || numdigi2==ansdigi1){
      System.out.println("Congrats you won $1000");

    }else{
        System.out.println("Sorry better luck next time");
    }



 }


}