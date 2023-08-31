import java.util.Scanner;
public class Lesson27{

    public static void main(String[] args){
       
        double ans=0;
        double i=0.01;

        do{
            ans+=i;
            i+=0.01;



        }while((int)i<1);




        System.out.println(ans);
        



    }
}