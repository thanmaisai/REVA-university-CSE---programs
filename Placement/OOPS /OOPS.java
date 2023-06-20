// class and objects
class Pen{
    String Color;
    String type; //gel or ball
    public void write(){
        System.err.println("writing Somthing");
    }
    public void printColor(){
        System.out.println(this.Color);
    }
}

public class OOPS {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        Pen pen2 = new Pen();
        pen1.Color = "Blue";
        pen1.type = "Gel";
        pen2.Color = "Red";
        pen2.type = "Ball";
        pen1.printColor();
        pen2.printColor();
        pen1.write();
    }
}