public class House implement Clonable,Comparable<House>{

    public int id;
    private double area;
    private java.util.Date whenBuild;


    public House(int id,double area){
        this id = id;
        this.area = area;
        whenBuild = new java.util.Date();
    }

    public int getId(){
        return id;
    }

    public double getArea(){
        return area;
    }

   public java.util.Date getDate(){
    return whenBuild;
   }


   public Object clone(){

    House houseClone= new House(id,area);
    houseClone.whenBuild=new java.util.Date();

    houseClone.getDate().setTime(whenBuild.getTime());
    return houseClone;
    }


    public int compareTo(House O){
        if(area >O.area) return 1;
        else if(area <O.area) return -1;
        else return 0;
    }

}



