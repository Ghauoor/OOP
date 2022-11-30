package OOP_Basics;

import OOP_Basics.Encapsulation.Encapsulation;

class MainClass {
    public static void main(String[] args) {

        Encapsulation encapsulation = new Encapsulation();


        /*

        Developer developer = new Developer(33, "Naruto");

        developer.eating("Burger");


        Person person = new Person();
        Person p = new Person();
        person.age = 33;
        person.name = "Naruto";

        Person person = new Person(33, "Naruto");

        System.out.println(Person.count);

        // System.out.println("My name " + person.name + " ans my age is " + person.age);
        person.eating("Bread");
        person.walking(222);

         */


    }

}

class Developer extends Person {

    Developer(int age, String name) {
        super(age, name);
    }
}


class Person {
    static int count;
    String name;
    int age;

//    Person() {
//        count++;
//        System.out.println("Creating New Object");
//    }

    Person(int age, String name) {


        this.name = name;
        this.age = age;
    }

    //Behavior
    void walking(int steps) {
        System.out.println(name + " is walking " + steps + " Steps per day");
    }

    void eating(String meal) {
        System.out.println(name + " is eating a " + meal);
    }

    void doWork(String name) {
        System.out.println("Doing some Work");
    }
}


