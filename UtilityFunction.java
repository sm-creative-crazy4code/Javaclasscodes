import java.util.Scanner;
public class UtilityFunction{

    public static int findMax( int n){

        Scanner input = new Scanner(System.in);
     
      int ans=0;
      for(int i=0; i<n; i++){

        int temp = input.nextInt();
        if(temp>ans) ans=temp;


     }

return ans;

}}