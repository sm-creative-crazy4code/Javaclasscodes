public class Lesson61{
// instance of operator cCircleFromSimpleGeometricObject
  public static void main(String[] args){
     Object object1= new CircleFromSimpleGeometricObject(1);
     Object object2= new RectangleFromSimpleGeometricObject(1,1);

     displayObject(object1);
     displayObject(object2);
  }
   

   public static void displayObject(Object object){
   if(object instanceof CircleFromSimpleGeometricObject){ //
  System.out.println("The area of circle"+((CircleFromSimpleGeometricObject)object).getArea());
  System.out.println("The diameter of circle"+((CircleFromSimpleGeometricObject)object).getDiameter());
   }else if(object instanceof RectangleFromSimpleGeometricObject){
    System.out.println("The area of Rectangle"+((RectangleFromSimpleGeometricObject)object).getArea());
   }
  
}


