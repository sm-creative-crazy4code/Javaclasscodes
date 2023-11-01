public class Lesson58{
    // staic method resoulution takes place during complilation and hence it cannot be overridden
    public static void main(String[] args){
        A a = new A();
        a.p(12);
        a.p(110.5);

    }
}

class B {
    public void p(double x){
    System.out.println(x*2);}
}

class A extends B{
    // public void  p(double b){
    //     System.out.println(b);
    // }

    public void p(int x){
        System.out.println(x);
    }
}