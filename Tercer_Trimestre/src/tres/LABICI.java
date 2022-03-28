package tres;

public class LABICI {

    public static void main(String[] args) {
        System.out.println(Anadir.add(5,6));
        System.out.println(Anadir.add(5, 6, 8));
        Vehicle.run();
        Bike2.run();
    }
}

class Anadir {
    static int add(int a, int b) {return a+b;}
    static int add(int a, int b, int c) {return a+b+c;}
}

class Vehicle{
    static void run() {
    System.out.println("Vehicle is running");
    }
}

class Bike2 extends Vehicle{
    static void run() {
        System.out.println("Bike is running safely");
    }
}
