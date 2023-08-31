import java.util.Scanner;
public class Lesson26{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int ans=0;
        while(true){
        int a= input.nextInt();
        if(a==0) break;
        ans+=a;

        }

        System.out.println(ans);
        



    }
}