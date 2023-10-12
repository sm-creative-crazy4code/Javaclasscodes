public class Lesson49{

    public static void main(String[] args){
        
    CircleWithPrivateDataFields myCircle = new CircleWithPrivateDataFields(1);
    int n =5;

    CircleWithPrivateDataFields[] myCircles= new CircleWithPrivateDataFields[10];

    for(int i=1;i<=n;i++){
        myCircles[i-1]= new CircleWithPrivateDataFields(i);
    }


    System.out.println("Passing the circle");
    printArea(myCircle,n);

    System.out.println("Passing the circle array");

    printAreaArrays(myCircles,n);


    System.out.println("\n"+"Radius: "+myCircle.getRadius());
    System.out.println("\n"+"n: "+n);

    }



    public static void printArea(CircleWithPrivateDataFields c,int times){
      System.out.println("Radius \t\tArea");

      while(times>=1){
        System.out.println(c.getRadius()+"\t\t"+c.getArea());
        c.setRadius(c.getRadius()+1);
        times--;
      }

    }


    public static void printAreaArrays(CircleWithPrivateDataFields[] circles,int times){
        int n= 0;
        while(n<times){
        System.out.println(circles[n].getRadius()+"\t\t"+circles[n].getArea());
        circles[n].setRadius(circles[n].getRadius()+1);
        n++;
      }



    }
}