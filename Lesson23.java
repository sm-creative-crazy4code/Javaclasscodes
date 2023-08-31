import java.util.Scanner;
public class Lesson23{
 public static void main(String[] args){
 double target1 =(int)((Math.random())*100);
 int target = (int)target1;
 Scanner input = new Scanner(System.in);

 while(true){
int guess = input.nextInt();
System.out.println(target);
if(guess==target){

    System.out.println("hurray you got the correct ans");
    break;
}else if(guess< target){
    System.out.println("You guesses to low //try again");
}else{
    System.out.println("You guesses to high //try again");
}


 }


 }




}