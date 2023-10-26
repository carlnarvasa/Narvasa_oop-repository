import java.util.Scanner;

 class AnimalSound {
    public static void main(String[] args) {
        System.out.println("========== Activity One: What does the animal say? ===========");
        Selections choose = new Selections();
        choose.choices();
    }
}

interface Animal {
    void makeSound();
}

class Bird implements Animal {
    public void makeSound() {
        System.out.println("tweet! tweet! tweet!");
    }
}

class Tiger implements Animal {
    public void makeSound() {
        System.out.println("roar! roar! roar!");
    }
}

class Frog implements Animal {
    public void makeSound() {
        System.out.println("kookak! kookak! kookak!");
    }
}

class Cat implements Animal {
    public void makeSound() {
        System.out.println("meow! meow! meow!");
    }
}

class Selections {
    private Scanner scan = new Scanner(System.in);

    public void choices() {
        int number;
        System.out.println("Select an animal: ");
        System.out.println("1. Bird");
        System.out.println("2. Tiger");
        System.out.println("3. Frog");
        System.out.println("4. Cat");
        System.out.println("\nEnter a number: ");
        number = scan.nextInt();

        Animal animal = null;

        switch (number) {
            case 1:
                System.out.println("Animal: Bird");
                animal = new Bird();
                break;
            case 2:
                System.out.println("Animal: Tiger");
                animal = new Tiger();
                break;
            case 3:
                System.out.println("Animal: Frog");
                animal = new Frog();
                break;
            case 4:
                System.out.println("Animal: Cat");
                animal = new Cat();
                break;
            default:
                System.out.println("Out of the choices");
        }

        if (animal != null) {
            animal.makeSound();
        }
    }
}