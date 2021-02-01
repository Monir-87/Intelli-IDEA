class Animal {
    public void animalSound() {
        System.out.println("The animal makes various sounds");
    }
}

class Chicken extends Animal {
    public void animalSound() {
        System.out.println("The Chicken says: Pock Pock");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The Dog says: bow bow");
    }
}

class Cow extends Animal {
    public void animalSound() {
        System.out.println("The Cow Says: Hamba Bamba");
    }
}

class Main {
    public static void main(String[] args) {
        Animal AnimalName = new Animal();
        Animal toni = new Chicken();
        Animal rocky = new Dog();
        Animal Gobi = new Cow();

        AnimalName.animalSound();
        toni.animalSound();
        rocky.animalSound();
        Gobi.animalSound();
    }
}
