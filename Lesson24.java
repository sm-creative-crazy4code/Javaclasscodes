import java.util.Scanner;
public class Lesson24{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b= input.nextInt();

        int small=a<b?a:b;
        int large=a>b?a:b;
        int ans=1;

        for(int i=2; i<=small; i++){
            if(small%i==0 && large%i==0) ans=i;
        

        }
         System.out.println(ans);



    }
}