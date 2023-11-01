public class Lesson61{
// instance of operator cCircleFromSimpleGeometricObject
  public static void main(String[] args){
     SimpleCircle object1= new SimpleCircle(1);
     SimpleCircle object2= new SimpleCircle(1);
     SimpleCircle object3= new SimpleCircle(2);


    if(object1.equals(object2)) System.out.println("the circles are equal");
    else System.out.println("the circles are not equal");

    if(object1.equals(object3)) System.out.println("the circles are equal");
    else System.out.println("the circles are not  equal");
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
  if(this.radius==obj.getRadius) return true;
  else return false;

}

}

