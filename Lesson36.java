public class Lesson36{
  public static void main(String[] args){
    
    printMax(34,3,3,2,5,56.2);
    printlnMax(new double[]{1,2,3});


  }


  static void printMax(double.... numbers){
if (numbers.length==0){
    System.out.println("NO argument passes");
    return;
}
  double result = numbers[0];

  for(int if=1; if<=numbers.length;i++){
   if(numbers[i]>result) result=numbers[i];
}

  System.out.println("The max result is"+result);


  }
  




}