public class Lesson48{
public static void main(String[] args){
CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(5.0);
System.out.println("The area of the circle of radius " + myCircle.getRadius()+" is " + myCircle.getArea());

myCircle.setRadius(myCircle.getRadius()*1.1);
System.out.println("The area of the circle of radius " + myCircle.getRadius()+" is " + myCircle.getArea());


}



}