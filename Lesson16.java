public class Lesson16{

public static void main(String[] args){

    double A=(Math.toRadians(360*Math.random()));
    int r=40;
    double x1=r*(Math.cos(A));
    double y1=r*(Math.sin(A));

 double B=(Math.toRadians(360*Math.random()));
    double x2=r*(Math.cos(B));
    double y2=r*(Math.sin(B));

     double C=Math.toRadians(360*Math.random());
    double x3=r*(Math.cos(C));
    double y3=r*(Math.sin(C));



 double a2 = ((x1 - x2)*(x1 - x2)) + ((y1 -y2)*(y1 -y2));
    double a= (double)Math.sqrt(a2);
    double b2 = ((x2 - x3)*(x2 - x3)) + ((y2 -y3)*(y2 -y3));
    double b= (double)Math.sqrt(b2);

double c2 = ((x3 - x1)*(x3 - x1)) + ((y3 -y1)*(y3 -y1));
    double c=(double) Math.sqrt(b2);

double alpha=Math.toDegrees( Math.acos((a*a-b*b-c*c)/(-2*b*c)));
double beta= Math.toDegrees( Math.acos((b*b-a*a-c*c)/(-2*a*c)));
double gamma= Math.toDegrees( Math.acos((c*c-b*b-a*a)/(-2*b*a)));

System.out.println(alpha);
System.out.println(beta);
System.out.println(gamma);



}}