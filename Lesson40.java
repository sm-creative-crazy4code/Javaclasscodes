import java.util.Scanner;
public class Lesson40{
   public static void main(String[] args){
   

   Scanner input = new Scanner(System.in);


    int[] arr=new int[6];
    for(int i=0; i<arr.length;i++){
    int x = input.nextInt();
      arr[i] = x;
}



       InsertionSort(arr);


   }

public static void InsertionSort(int[] arr){
    int i=0;
    int j=1;

    while(j<arr.length){
       int elem = arr[j];
       insertIntoCorrectPosition(i,j,arr);
       j++;}


    
System.out.println("\n Output\n");
     for(i=0; i<arr.length; i++){
        System.out.println(arr[i]+" ");
     }



    }


    public static void insertIntoCorrectPosition(int i,int j,int[]arr){

    for(int ind=i;ind<j;ind++){
        if(arr[ind]>arr[j]){
            int temp =arr[ind];
            arr[ind]= arr[j];
            arr[j]= temp;
        }
    }
    
    }
}

