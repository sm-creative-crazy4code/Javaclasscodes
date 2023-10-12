import java.math.*;
public class Lesson54{
public static void main(String[] args){
    System.out.println("50! is \n"+ factorial(50));


}

public static BigInteger factorial(long n){
    BigInteger res=BigInteger.ONE;
    for(int i=1;i<=n;i++){
        res=res.multiply(new BigInteger(i+""));
        
    }
    return res;
}

}