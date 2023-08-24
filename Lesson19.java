import java.util.Scanner;

public class Lesson19{
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     String s =input.nextLine();

    char[] sarr= s.toCharArray();
    int n =sarr.length;
    // int i;

boolean ans= true;
    for(int i=0; i<(sarr.length)/2;i++){
        //  Character temp= new Character(sarr[i]);
        //  Character temp2= new Character(sarr[n-i-1]);
         
        if(sarr[i]!=sarr[n-i-1]) {ans=false;
         break;
        }
    }


if(ans){
    System.out.println("string is Palindrome");
}else{
     System.out.println("string is not Palindrome");
}
    

    }
}