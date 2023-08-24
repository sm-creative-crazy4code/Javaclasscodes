public class Lesson3{

public static void main(String[] args){

    float i=0.0f;
    float ans=0.0f ;
    int count = 0;

    for(i=1.0f;i<=11.0f;i+=2){
        count++;
        if(count%2==0){
            ans= ans-(1/(i));
        }else if(count%2==1 ){
            ans= ans+(1/i);
        }
        
    


    }

 System.out.println(ans);


}


}