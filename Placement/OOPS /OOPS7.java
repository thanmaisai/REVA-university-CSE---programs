// abstraction - type2 => using "interface" keyword / pure abstraction happens

//interfaces - 
// * all the feilds in interface are public, static and abstract by default
// * a class that implements an interface must implement all the methods declared in the interface
// * interface support the functionality of multiple inheritance

interface Animals{ // no need of using access specifiers 
    int eyes = 2; // it cannot be changed by any class
    void walk();
}

interface Herbivore {
    // void eat();
}

class Horse implements Animals,Herbivore{ // multiple inheritance
    public void walk(){ // here the access modifier must be public
        System.out.println("walks on 4 legs"); 
    }
}



public class OOPS7 {
    
}
