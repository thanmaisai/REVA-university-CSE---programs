// abstraction  - type1 => using "abstract" keyword
// must be decared with "abstract" keyword
// an avstract class can have abstract methods and non-abstract methods
// can have constructors and static methods and even final if u dont want to change data once asigned


// since here the abstract class allow to use both ab and non ab methods they are not pure abstraction
abstract class Animals{
    Animals(){
        System.out.println("You are created a new Animal");
    }
    abstract void walk();
    public void eat(){
        System.out.println("Animal eats");
    }
}


class Horse extends Animals{
    Horse(){
        System.out.println("You created Horse");
    }
    public void walk(){
        System.out.println("walks on 4 legs"); 
    }
}

class Chicken extends Animals{
    public void walk(){
        System.out.println("walks on 2 legs"); 
    }
}

public class OOPS6 {
    public static void main(String[] args) {
        // Animals animal = new Animals(); // throw erro as it is abstracted
        // animal.wait();

        Horse horse = new Horse();
        horse.walk();
        horse.eat();
    }

    
}
