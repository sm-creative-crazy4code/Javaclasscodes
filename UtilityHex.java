public class UtilityHex{

    public static void hextodec(int a){
        
        char hexchar[]={'A','B','C','D','E','F'};
     int k =a;
     if(k<=0) return;
     int ans= k%16;
     hextodec(k/16);
     if(ans>9) {
         
        System.out.println(hexchar[ans-10]);}
     else System.out.print(ans);


    }


    public static int dectoDec(String hex){
    int count=0;
    int ans=0;
    for (int i=hex.length();i>0;i--){
        if(hex.charAt(i)>='A' && hex.charAt(i)<='F'){
           ans+=  parseInt(hex.charAt(i))*Math.pow(16 ,count);
           count++;

        }




    }

return ans;
}

}