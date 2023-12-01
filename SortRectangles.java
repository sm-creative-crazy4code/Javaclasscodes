public class SortRectanngle{
    public staic void main(String[] args){
        ComparableRectangle[] rectangles={
            new ComparableRectangle(3.4,5.6),
            new ComparableRectangle(13.24,55.4),
            new ComparableRectangle(7.4,35.4),
            new ComparableRectangle(1.2,25.4),

    }

    java.uitils.Arrays.sort(rectangles);

   for(Rectangle r : rectangles){
     System.out.println(r+" " );
     System.out.println();
   
   }}