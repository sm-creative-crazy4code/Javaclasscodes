
import java.util.Scanner;
public class Lesson32{

    public static void main(String[] args){
           Scanner input = new Scanner(System.in);  


           int[] nums= new int[10];

           for(int i=0;i<10;i++){
                int x = input.nextInt();
                nums[i] = x;

           }

           int sum =0;

           for(int i=0;i<10;i++){
              sum += nums[i];

           }

           double avarage = (double) sum / 10;
System.out.println("avarage="+avarage);

int count =0;
           for(int i=0;i<10;i++){
           if(nums[i]>(int)avarage){
            count++;

           }


           

    }

    System.out.println("count="+count);
}}