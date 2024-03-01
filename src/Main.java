interface Animal {
    void makeSound();
    void eat();
}

abstract class Pet implements Animal {
    String typeOfFood;

    public void eat() {
        System.out.println("Ця тварина їсть " + typeOfFood);
    }
}


class Dog extends Pet {
    public Dog() {
        this.typeOfFood = "кістки";
    }

    public void makeSound() {
        System.out.println("Гав-гав");
    }
}

class Cat extends Pet {
    public Cat() {
        this.typeOfFood = "риба";
    }

    public void makeSound() {
        System.out.println("Мяу");
    }
}

class Bird implements Animal {
    public void makeSound() {
        System.out.println("Чирик-чирик");
    }

    public void eat() {
        System.out.println("Ця пташка їсть насіння");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();

        dog.makeSound();
        dog.eat();

        cat.makeSound();
        cat.eat();

        bird.makeSound();
        bird.eat();
    }
}