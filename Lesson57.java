public class Lesson57{
  
//   CONSTRUCTOR CHAINING
  public static void main(String[] args){
    Faculty f1= new Faculty();
  }


}

class Faculty extends Employee{
     public Faculty(){
        System.out.println("(4) performs faculty task");

     }

}


class Employee  extends Person{
    public Employee(){
        this("(2) Invoke employee overloaded constructor");
        System.out.println("(3) performs employess TASK");

    }

    public Employee(String name){
        System.out.println(name);
    }


}

class Person {
    public Person(){
        System.out.println("(1) performs person tSKS");
    }
}