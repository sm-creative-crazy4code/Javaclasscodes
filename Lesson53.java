import java.util.Scanner;
import java.util.ArrayList;
public class Lesson53{

    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter some non 0 integer values");
        int number = input.nextInt();

        while(number!=0){
            list.add(number);
            number = input.nextInt();
        }



        System.out.println("nums in reverse are");
        for(int i=list.size()-1; i>=0; i--){
            System.out.println(list.get(i));
        }
    }
}
