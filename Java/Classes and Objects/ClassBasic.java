public class ClassBasic{
    public static void main(String[] args) {
        Student s1 = new Student(320, "Sahil");  //parameterized constructor called
        s1.display();
    }
}

class Student{
    //data members
    private int rno;
    private String name;

    //parameterized Constructor
    Student(int rno, String name){
        this.rno = rno;
        this.name = name;
    }

    //member functions
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Roll No.: "+rno);
    }
}