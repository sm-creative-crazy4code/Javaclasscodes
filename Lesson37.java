
import java.util.Scanner;
public class Lesson37{

public static void main(String[] args){

Scanner input = new Scanner(System.in);  
int[] list= new int[10];

for(int i=0; i<list.length;i++){
    int x = input.nextInt();
      list[i] = x;
}

int toFind1 = input.nextInt();

int ans=LinearSearch(list, toFind1);

if(ans==-1)System.out.println("No matches found");


}


public static int LinearSearch(int[] list,int toFind1){


int result=-1;
int toFind=toFind1;
for(int i=0; i<list.length; i++){

    if (toFind==list[i]){
        System.out.println("Elememt found at index " + i);
        result = i;
        return result;
    }

   
}

 return result;

}


}

