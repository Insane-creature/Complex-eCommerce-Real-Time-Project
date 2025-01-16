class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Test {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.sound(); // Outputs: Dog barks
        System.out.println(5);
    }
}