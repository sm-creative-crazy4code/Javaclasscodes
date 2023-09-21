import java.util.Scanner;
public class Lesson39{
   public static void main(String[] args){
   

   Scanner input = new Scanner(System.in);


    int[6] arr=new int[6];
    for(int i=0; i<arr.length;i++){
    int x = input.nextInt();
      arr[i] = x;
}



       selectionSort(arr);


   }

public static void selectionSort(int[] arr){

    for(int i=0; i<arr.length;i++){
      
      int currMin= list[i];
      int currMinIndex= i;
      for(int j=i; j<arr.length; j++){  
        if(currMin>list[j]){
            currMin=list[j];
            currMinIndex=j;
      }

      if(currMinIndex!=i){
        list[currMinIndex]=list[i];
        list[i]=currMin;
      }
       
      }}
     

     for(int i=0; i<arr.length; i++){
        System.out.println(list[i]+" ");
     }



    }
}

