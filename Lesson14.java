import java.utils.Scanner;
public class Lesson14{

    public static void main(String[] args){
 Scanner input = new Scanner(System.in);

 int v0= input.nextInt();
int a= input.nextInt();
int t= input.nextInt();

double ans= (double)(v0*t)+(0.5*a*t*t);

System.out.println(ans);


    }
}