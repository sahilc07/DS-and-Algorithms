public class BasicInheritance {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Parent p2 = new Child();
        //Child c1 = new Parent();
        Child c2 = new Child();

        System.out.println("__________Case 1___________");
        System.out.println(p1.d);
        System.out.println(p1.d1);
        p1.fun();
        p1.fun1();

        System.out.println("__________Case 2___________");
        System.out.println(p2.d);
        System.out.println(p2.d1);
        System.out.println(((Child)p2).d2);
        p2.fun();
        p2.fun1();
        ((Child)p2).fun2();

        System.out.println("__________Case 4___________");
        System.out.println(c2.d);
        System.out.println(c2.d1);
        System.out.println(c2.d2);
        c2.fun();
        c2.fun1();
        c2.fun2();

    }
}

class Parent{
    int d  = 10;
    int d1 = 100;

    public void fun(){
        System.out.println("Parent class fun()");
    }

    public void fun1(){
        System.out.println("Parent class fun1()");
    }
}

class Child extends Parent{
    int d  = 20;
    int d2 = 200;

    public void fun(){
        System.out.println("Child class fun()");
    }

    public void fun2(){
        System.out.println("Child class fun2()");
    }
}