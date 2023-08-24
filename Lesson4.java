public class Lesson4{
  public static void main(String[] args){
   long totalMillis = System.currentTimeMillis();

   long totalSeconds= totalMillis/1000;
   long currentSecond= totalSeconds%60;
   long totalMinutes= totalSeconds/60;
   long currentMinutes=  totalMinutes%60;
   long totalHours= totalMinutes/60;
   long currentHout= totalHours%24;

   System.out.println("Current time is "+currentHout+":"+currentMinutes+":"+currentSecond);
   


  }



}