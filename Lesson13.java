// find chinese Zodiac sign
import java.util.Scanner;


public class Lesson13{


    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
    System.out.println("Enter your birh year");
     int year= input.nextInt();

     int z= year%12;
     switch (z) {
       case 0:System.out.println("Rat");break;
       case 1:System.out.println("Ox");break;
       case 2:System.out.println("Tiger");break;
       case 3:System.out.println("Rabbit");break;
       case 4:System.out.println("Dragon");break;
       case 5:System.out.println("Snake");break;
       case 6:System.out.println("Horse");break;
       case 7:System.out.println("Sheep");break;
       case 8:System.out.println("Monkey");break;
       case 9:System.out.println("Rooster");break;
       case 10:System.out.println("Dog");break;
       case 11:System.out.println("Pig");break;
     }


        
    }
}