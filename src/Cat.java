public class Cat {
    String name;
    int age;
    String color;

    public Cat(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public static void main(String args []){
        Cat mimi = new Cat("mimi", 5, "Golden Brown");
        Cat toni = new Cat("toni", 4, "white");
        Cat Pumba = new Cat("Pumba", 6, "Black and White");
        mimi.catShop("mimi", 5, "Golden brown");
        toni.catShop("toni", 4, "white");
        Pumba.catShop("Pumba", 6, "Black and white");

    }

    public void catShop(String catName, int age, String color){
        System.out.println(catName + " is a good cat. " + " she is " + age + " years old. " + " she is a " + color + " color cat. " );
    }
}
