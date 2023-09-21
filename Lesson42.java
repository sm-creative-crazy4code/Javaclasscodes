import java.util.Scanner;
public class Lesson42{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       int [][] points= new int[8][2];

       int [] minDistantPont= new int[8];
       double [] minDistant= new double[8];

       for(int i=0; i<points.length; i++){
        for(int j=0; j<points[i].length; j++){
              points[i][j] = input.nextInt();
        }       
        
        }
 

        for(int i=0;i<points.length;i++){
            double minDistance=100000;
            for(int j=0; j<points.length; j++){
                if(j!=i){
                    int x1=points[i][0];
                    int y1=points[i][1];
                    int x2=points[j][0];
                    int y2=points[j][1];
                    int sqx=(x1-x2)*(x1-x2);
                    int sqy=(y1-y2)*(y1-y2);

                    double distance=Math.sqrt(sqx+sqy);

                    if(distance<minDistance){
                        minDistance=distance;
                        minDistantPont[i]=j;
                        minDistant[i]=distance;

                    }
                }

                }
            }



            for(int i=0;i<8;i++){
                System.out.println("Minimum Distance point of " + i+ " is "+minDistantPont[i] +" at "+minDistant[i]);
            }


        }


    }
