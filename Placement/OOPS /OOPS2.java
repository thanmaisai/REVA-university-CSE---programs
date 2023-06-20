// constructors - 3 types 
class Student{
    String name;
    int age;

    // default constructor
    Student(){
        System.out.println("default constructor called");
    }

    //parameterized constructor
    Student(String name,int age){
        System.out.println("constructor called");
        this.name=name;
        this.age=age;
    }

    // copy constructor
    Student(Student s2){
        this.name= s2.name;
        this.age= s2.age;
    }

    public void printName(){
        System.out.println("Name: " + this.name);
    }

    public void printAge(){
        System.out.println("Age: " + this.age);
    }
}

public class OOPS2 {
    public static void main(String args []) {
        // Student s1= new Student(); //default constructor called
        Student s1 = new Student("thanmai",21); // parameterized constructor called
        Student s2 = new Student(s1);  //copy constructor called
        s2.printName(); 
        s2.printAge();
    }
}
