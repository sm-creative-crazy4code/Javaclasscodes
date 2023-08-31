import java.util.Scanner;


public class Lesson29{


    // public static int findMax(int a,int b){

    //     return a > b ? a : b;
    // }

  public static void main(String[] args){
   Scanner input = new Scanner(System.in);
     System.out.println("Enter the number of integers you want to find max of");





        int a=input.nextInt();
        

        int ans= UtilityFunction.findMax(a);

        System.out.println("The max number is"+ans);


  }

}






