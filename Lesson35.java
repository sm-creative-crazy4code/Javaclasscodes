public class Lesson35{
  public static void main(String[] args){
    
    char[] array = new char[100];
     int[] count= new int[26];

for(int i=0; i<26; i++){
    count[i] =0;
}



   for(int i=0; i<100; i++){
     int r = (int)(Math.random()*26);
     char a= (char)(97+r);
     array[i] = a; 
     count[array[i]-'a']++;



   }

   
    
    for(int i=0;i<26;i++){
        if (count[i]>0){

            char c= (char)(i+'a');
            System.out.println(c+" : "+count[i]);
        }

    }





  }



}