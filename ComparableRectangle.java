public class ComparableRectangle extends Rectangle implements Comparable <ComparableRectangle>{


    public ComparableRectangle(double width,double height){
        super(width,height);
    }




    public int compareTO(ComparableRectangle o){
        if(getArea() > o.getArea())
          return 1;
          else if(getArea() < o.getArea()) return -1;
          else return 0;
    }

public String toString(){
return "Width: " + getWidth() + " Height: " + getHeight()+  "Area: " + getArea();
}

}