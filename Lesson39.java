public class Lesson39{
   public static void main(String[] args){

    int[6] arr={12,86,43,57,34,67};

       selectionSort(arr);


   }

public static void selectionSort(int[] arr){

    for(int i=0; i<arr.length,i++){
      
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

