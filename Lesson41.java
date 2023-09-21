public class Lesson41{

    public static void main(String[] args){
    

    char [][] studentAns =new char [8][10];

    studentAns={
        {'A','B','A','C','C','D','E','E','A','D'},
        {'A','B','A','C','C','D','E','E','A','D'},
        {'A','B','A','C','C','D','E','E','A','D'},
        {'A','B','A','C','C','D','E','E','A','D'},
        {'A','B','A','C','C','D','E','E','A','D'},
        {'A','B','A','C','C','D','E','E','A','D'},
        {'A','B','A','C','C','D','E','E','A','D'},
        {'A','B','A','C','C','D','E','E','A','D'}
    };


    char[] ans =  new char[10];
    ans={'D','B','D','C','C','D','A','E','A','D'};

    int[] studentScore= new int[8];

    for(int i=0;i<studentScore.length;i++){
        studentScore[i]=0;
    }



    for(int i=0;i<studentAns.length;i++){
        int total=0;
        for(int j=0;j<studentAns[i].length;i++){
            if (studentAns[i][j]==ans[j]){
                total++;
        }
      
      studentScore[i]=total;
    }


for(int i=0;i<studentScore.length;i++)
{

    System.out.println("Score of Student " +i+" : "+ studentScore[i]);
}
    

    }
}}