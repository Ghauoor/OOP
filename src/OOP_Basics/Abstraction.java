package OOP_Basics;

public class Abstraction {
    public static void main(String[] args) {
        Audi audi = new Audi();
        audi.start();
    }
}

abstract class Car {
    int price;

    abstract void start();
}

class Audi extends Car {


    @Override
    void start() {
        System.out.println("Audi is Started-->");

    }
}

class BMW extends Car {

    @Override
    void start() {
        System.out.println("BMW is Started....");
    }
}