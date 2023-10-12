import java.math.*;
public class Lesson55{
    public static void main(String[] args){
     long n =Long.MAX_VALUE;
     int i =(int)Math.sqrt(n);
     
      BigInteger sq=BigInteger.ONE;
     for(int diff=0;diff<10;diff++){
        int num=i+diff;

        sq=sq.multiply(new BigInteger(num+""));
        sq=sq.multiply(new BigInteger(num+""));
        System.out.println(num+"  square is :"+sq);


     }

    }
}