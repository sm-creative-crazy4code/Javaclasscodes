import java.util.Scanner;
public class Lesson46{

public static void main(String[] args){
Scanner input = new Scanner(System.in);


SimpleCircle circle1= new SimpleCircle();
System.out.println("The area of the circle of radius " +circle1.radius + " is " +circle1.getArea() );

SimpleCircle circle2 = new SimpleCircle(25);
System.out.println("The area of the circle of radius " +circle2.radius + " is " +circle2.getArea() );

SimpleCircle circle3= new SimpleCircle(125);
System.out.println("The area of the circle of radius " +circle3.radius + " is " +circle3.getArea() );

circle2.radius = 100;
System.out.println("The area of the circle of radius " +circle2.radius + " is " +circle2.getArea() );

}
}

class SimpleCircle {
    int radius;
    
    SimpleCircle(){
      radius=1;
    }
    SimpleCircle(int a){
        radius= a;
    }

    


    double getArea() { 
       return Math.PI*radius*radius;

    }

    double getPerimeter() {
        return Math.PI*radius*2;
    }

void setRadius(int r) {
    radius=r;
}

}