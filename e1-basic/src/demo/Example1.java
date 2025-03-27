package demo;

public class Example1 {
    public static void main(String[] args) {
        Cat x;
        x = new Cat();
        Cat y = new Cat();
        Cat z = new Cat();

        x.name = "Tom";
        x.age = 1;

        y.name = "Jerry";
        y.age = 3;

        z.name = "Sylvester";
        z.age = 5;

        System.out.println(x.name + " is " + x.age + " years old.");
    }    
}
