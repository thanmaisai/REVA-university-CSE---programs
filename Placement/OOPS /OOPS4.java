//inheritance - "extends" keyword
// parent/base class and child/derived class
// types - 5 => single,multilevel,heirarchial,hybrid,multiple(not there in java)


class Shape{
    public void area(){
        System.out.println("display area");
    }
}

// single level [ triangle <- shape ]
class Triangle extends Shape{
    public void area(){
        System.out.println("display area of triangle");
    }
}

// multi level - as this extends triangle which is extended from shape, [equilateralTraingle <- triangle <- shape]
class equilateralTraingle extends Triangle{
    public void area(){
        System.out.println("display area of Equilateral Traingle");
    }
}

// hierarchical  - as circle and triangle (multiple classes) extends shape class [circle <- shape]
class Circle extends Shape{
    public void area(){
        System.out.println("display area of circle");
    }
}

// hybrid - combination of all the above inheritance
// multiple inheritance - not present in java but present in c++ where a child class acces multiple parent class
// if we need to use multiple inheritance in java we use "interfaces" but cant be dont in classes

public class OOPS4 {
    public static void main(String[] args) {
        Shape s1 = new Shape(); // parent
        s1.area();

        Triangle t1 = new Triangle(); // child 
        t1.area();

        equilateralTraingle t2 = new equilateralTraingle(); // child for triangle, so triangle is parent for equitri
        t2.area();

        Circle c1 = new Circle(); // child of parent
        c1.area();
    }    
}
