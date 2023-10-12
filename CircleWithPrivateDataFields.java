public class CircleWithPrivateDataFields{
  private double radius=1;
  private static int noOfObjects=0;

  public CircleWithPrivateDataFields(){
    noOfObjects++;
  }

  public CircleWithPrivateDataFields(double new_radius){
    radius = new_radius;
    noOfObjects++;
  }

  public double getRadius(){
  return radius;

  }

  public void setRadius(double new_radius){
    radius = (new_radius>=0)?new_radius:0;
  }

  public static int getNumberOfObjects(){
    return noOfObjects;
  }
 
 public double getArea(){
    return radius*radius*Math.PI;
 }


}