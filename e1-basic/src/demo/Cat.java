package demo;

public class Cat {
    String name;
    int age;

    Cat () {
        System.out.println("A new cat has been created!");
    }

    void sayMeow() {
        System.out.println("Meow! My name is " + this.name);
    }
}
