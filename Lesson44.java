import java.util.Scanner;
public class Lesson44{

    static int binarySearch(int[] arr, int low,int high,int k){
        if(low>high) return -1;
        
        int l =low;
        int r =high;
        int mid=(l+r)/2;

       

            if(mid==k) return mid;
            if(mid>k) return binarySearch(arr,l,mid-1,k);
            return  binarySearch(arr,mid,r+1,k);
            
            
            
            }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] arr= new int[6];
        for(int i=0;i<arr.length;i++){
            int temp= input.nextInt();
            arr[i]=temp;
        }

        System.out.println("enter elem to search");

        int k = input.nextInt();

        int ans=binarySearch(arr,0,arr.length-1,k);

        if(ans==-1){
            System.out.println("not found");
        }
        else{
           System.out.println("found at  index : "+ans); 
        }     

    }
}