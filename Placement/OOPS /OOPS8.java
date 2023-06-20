// static keyword
class Stud {
    String name;
    static String school; // Same for all instances of the class

    public static void changeSchool() {
        school = "newSchool";
    }
}

public class OOPS8 {
    public static void main(String[] args) {
        Stud.school = "BVR"; // Accessing the static variable using the class name - no need to creat obj for static variables

        Stud student1 = new Stud();
        student1.name = "tony";
        System.out.println(student1.school);
        Stud student2 = new Stud();
        student2.name="akash";
        System.out.println(student2.school);
    }
}
