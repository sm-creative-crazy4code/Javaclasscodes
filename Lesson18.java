public class Lesson18{


    public static void main(String[] args){

        String s1= "Welcome".toLowerCase();
        String s2= "Welcome".toUpperCase();
        String s3= "Welcome".trim();
        String s4= "Welcome".replace('e','A');
        String s5= "Welcome".replaceFirst("e","AB");
        String s6= "Welcome".replaceAll("e","AB");
        String s7 = "Welcome".replaceAll("el","AB");

        System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+s4+"\n"+s5+"\n"+s6+"\n"+s7+"\n");

        String[] tokens= "Java#Html#Perl".split("#",0);
         for(int i=0;i<tokens.length;i++){
            System.out.println(tokens[i]+"\n");
         }

         String s="a+b$#c".replaceAll("[$+#]","NNN");
         System.out.println(s);

         String[] tokens2= "Java.C?C#,C++".split("[><:;,?]");
         for(int i=0;i<tokens2.length;i++){
            System.out.println(tokens2[i]+"\n");
         }

    }
}