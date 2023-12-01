public interface Edible{
    public abstract String howToEat();
}

public class Lesson64{


public static void main(String[] args){
Object[] objects={new Tiger(),new Chicken(),new Apple()};

for (int i=0;i<objects.length;i++){

    System.out.println(((Edible)objects[i].howToEat()));
    if (objects[i] instanceof Animal){
        System.out.println(((Animal)objects[i]).sound());
    }
}
}
}


abstract class Animal {

    

    public  String sound() {
        
    }
}



public class Chicken extends Animal implements Edible{
public String howToEat() {
        return "Chicken :Fry it";
    }

    public String sound() {
        return "Chicken:cook-a-doodle-doo";
    }
}


public class Tiger extends Animal{

    public String sound() {
        return "Tiger:RROOAAR";
    }


}



abstract class Fruit implements Edible{

}



class Apple extends Fruit {
    public String howToEat(){
        return "Apple: make apple cider";
    }
}

class   Orange extends Fruit {
    public String howToEat(){
        return "Orange: make orange juice";
    }
}