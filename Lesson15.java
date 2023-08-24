import java.util.Scanner;

public class Lesson15{

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int x1, y1, x2, y2,x3,y3;
    x1 = input.nextInt();
    y1 = input.nextInt();
    x2 = input.nextInt();
    y2 = input.nextInt();
    x3 = input.nextInt();
    y3 = input.nextInt();

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





    }
}