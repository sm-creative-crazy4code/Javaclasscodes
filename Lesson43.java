import java.util.Scanner;
public class Lesson43{
   static int findMinElements(int[] arr,int start){
        int minelem=arr[start];
        int ans=start;
        int i =start;
        for( i=start;i<arr.length;i++){
            if(arr[i]<minelem){
                minelem=arr[i];
                ans=i;
        

            }

        }
        return ans;
    }


    static void RecursiveSeclectionSort(int[ ] arr,int start){
    if(start==arr.length) {return;}
    
    int minElem= arr[start];
    int ind=findMinElements(arr,start);
    int temp= arr[start];
    arr[start]= arr[ind];
    arr[ind]= temp;
    RecursiveSeclectionSort(arr,start+1);



    }

    public static void main(String[] args){
         Scanner input = new Scanner(System.in);
        int[] arr= new int[6];


        for(int i=0;i<arr.length;i++){
            int temp= input.nextInt();
            arr[i]=temp;
        }
        

        RecursiveSeclectionSort(arr,0); 
         System.out.println("Sorted array:" );
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}