import java.util.Scanner;

public class Lesson1{


public static void main(String[] args){
    Scanner input= new Scanner(System.in);
    System.out.println("enter the radius");

    double radius= input.nextDouble(); 
    System.out.println("enter the length");
    double length= input.nextDouble(); 


    double area= radius*radius*3.14;
    double volume = area*length;

     System.out.println(area);
     System.out.println(volume);
     
}

}