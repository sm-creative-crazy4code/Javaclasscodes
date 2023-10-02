public class Lesson47{

    public static void main(String[] args){
    System.out.println("Before creating Object");
    System.out.println("The no of  objects" +CircleWithStaticMembers.getNumOfCircle());

    CircleWithStaticMembers c1= new CircleWithStaticMembers();
    System.out.println("After creating Object");
    System.out.println("c1: radius (" + c1.radius + ") and number of objects (" + c1.noOfCircle+")");


  CircleWithStaticMembers c2= new CircleWithStaticMembers(5);
  c1.radius =9;
    System.out.println("After creating Object c2 and modifying c1");
    System.out.println("c1: radius (" + c1.radius + ") and number of objects (" + c1.noOfCircle+")");
    System.out.println("c1: radius (" + c2.radius + ") and number of objects (" + c2.noOfCircle+")");

    

    }
}


class CircleWithStaticMembers{
   double radius;
   static int noOfCircle=0;

   CircleWithStaticMembers(){
    radius=1;
    noOfCircle++;
   }

   CircleWithStaticMembers(double r){
    radius=r;
    noOfCircle++;
   }

   static int getNumOfCircle(){
    return noOfCircle;
   }

   double getArea() {
    return Math.PI*radius*radius;
   }

}