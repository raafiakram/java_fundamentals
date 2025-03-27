package demo;

public class Example2 {
    public static void main(String[] args) {
        Cat c = new Cat();

        c.name = "Tom";
        c.age = 1;

        c.sayMeow();

        Cat l = new Cat();

        l.name = "Leo";
        l.age = 5;

        l.sayMeow();
    }
}
