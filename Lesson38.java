
import java.util.Scanner;
public class Lesson38{

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


public static int BinarySearch(int[] list,int toFind1){
int low=0;
int high=list.length-1;


int result=-1;
int toFind=toFind1;

while(high>=low){
mid= (high+low)/2;



}   


 return result;

}


}

