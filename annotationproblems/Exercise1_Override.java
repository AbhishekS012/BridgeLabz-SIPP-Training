package annotationproblems;

class Animal {
    void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

public class Exercise1_Override {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound();
    }
}