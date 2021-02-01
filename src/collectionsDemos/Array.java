package collectionsDemos;

public class Array {

    public static void main(String[] args) {
        String[] cars = {"BMW", "VOLVO", "FORD", "MAZDA"};
        for (String i : cars) {
            System.out.println(i);
        }

        cars[2] = "Opel";
        System.out.println("after replacing ");
        for (String i : cars)
        {
            System.out.println(i);

        }

    }
}


