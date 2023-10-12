public class Lesson56{
    public static void main(String[] args){
// java does not supports multiple inheritance
// but it can be achieved with interfaces in java
// abbstract class may or may not include abstract methods
// abstract class aannnot be instantiaatible but can be subclassed

// super keyword to call and intialize the properties of super classes from child classes
// to invoke it explicitly







    }



    class SimpleGeometicObject{
        private String colour="white";
        private boolean filled;
        private java.util.Date dateCreated;


        
        public SimpleGeometicObject(){
            dateCreated = new java.util.Date();
        }

        public SimpleGeometicObject(String color,boolean filled){
            dateCreated = new java.util.Date();
            this.colour=color;
            this.filled=filled;
        }

        public String getColour(){
            return this.colour;
        }

        public void setColour(String colour){
            this.colour=colour;
        }

        public boolean isFilled(){
            return this.filled;
        }

        public java.util.Date getDateCreated(){
            return dateCreated;
        }

        public string toString(){
            return "Created on " + dateCreated+"\n color: " + this.colour;+" and filled: " + this.filled;
        }
    }
}