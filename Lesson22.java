import java.util.Scanner;
public class Lesson22{
    public static void main(String[] args){

      Scanner input = new Scanner(System.in);  

        String[] majors={"Freshmen","Sopomor","Junior","Senior"};
     
     char first = input.next().charAt(0);
     int second = input.nextInt();

      switch(first){
        case 'M': System.out.println("Mathematic"+" "+majors[second-1]); break;
        case 'I': System.out.println("Information Technology"+" "+majors[second-1]); break;
        case 'C': System.out.println("Computer Science"+" "+majors[second-1]); break;


      }

        

        
        


        
    }
}