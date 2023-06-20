// polimorphism => 2 types:-
// compile time(function overloading/static binding) 
// run time(function overriding/dynamic binding)
// compile time - function overloading
// constructors - 3 types 
class Student {
    String name;
    int age;

    // all methods have same name "printInfo" but different parameters
    public void printInfo(String name) {
        System.out.println("Name: " + name);
    }

    public void printInfo(int age) {
        System.out.println("Age: " + age);
    }

    public void printInfo(String name, int age) { 
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class OOPS3 {
    public static void main(String[] args) {
        Student s1 = new Student(); 
        s1.name = "thanmai";
        s1.age = 21;
        s1.printInfo(s1.name); // Calling the method with one argument (name)
        s1.printInfo(s1.age); // Calling the method with one argument (age)
        s1.printInfo(s1.name, s1.age); // Calling the method with two arguments (name and age)
    }
}