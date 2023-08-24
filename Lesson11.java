import java.util.Scanner;

public class Lesson11{
   public static void main(String[] args){
    
   Scanner input = new Scanner(System.in);

    int status=input.nextInt();

   int stabLimits[4][6]={
      {8350,399950,82250,171550,372950}

   }

   int taxrate[6]={0.10,0.15,0.25,0.28,0.30,0.33}

int i =0;
int j=0;




for(int j=0;j<6;j++){
    if(income>stabLimits[i][j]){
        tax+=(stabLimits[i][j]*taxrate[j]);
}else{
    ta


}


}


    






   switch(status){
     case 0:  ; break;
     case 1: ; break;
     case 2: ; break;
     case 3: ; break;


   }

double income= input.nextDouble();


double tax= 0;

if(status==0){
  if(income<8350){
    tax+=income*(10/100);
  }else if( income<=33950){
    tax=(8350*(10/100))+((income-8350)*(15/100));
  }else if( income<=82250){
    tax=(8350*0.10)+((33950-8350)*0.15)+((income-33950)*0.25);
  }else if(income<=171550){
     tax=(8350*0.10)+((33950-8350)*0.15)+((172550-82250)*0.25)+((income-171550)*0.28);
  }else if(income<=372950){
     tax=(8350*0.10)+((33950-8350)*0.15)+((172550-82250)*0.25)+((372950-171550)*0.28)+((income-372950)*0.33);
  }else{
     tax=(8350*0.10)+((33950-8350)*0.15)+(((82250)-33950)*0.25)+((171550-82250)*0.28)+((372950-171550)*0.33)+((income-372950)*0.35);
  }

}else if(status=1){



}else if(status==2){



}else if(status == 3){




}











    






   }


}