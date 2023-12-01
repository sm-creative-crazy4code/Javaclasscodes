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

class SimpleCircle {
    int radius;
    
   public SimpleCircle(){
      radius=1;
    }
   public SimpleCircle(int a){
        radius= a;
    }

    


   public double getArea() { 
       return Math.PI*radius*radius;

    }

     public double getPerimeter() {
        return Math.PI*radius*2;
    }

public int getRadius() {
  return radius;
}

public void setRadius(int r) {
    radius=r;
}


public boolean equals (SimpleCircle obj) { 
  if(this.radius==obj.radius) return true;
  else return false;

}

}

