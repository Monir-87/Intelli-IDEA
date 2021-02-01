public class Employee {
    int id;
    String name;
    int salary;

    public Employee(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public static void main(String args[]){
        Employee emp1 = new Employee(1,"Huma",10000);
        Employee emp2 = new Employee(2,"Ferhan",12000);
        Employee emp3 = new Employee(3,"Monir",9000);
        emp1.makeMoney("Huma", 1, 10000 );
        emp2.makeMoney("Ferhan", 2, 12000);
        emp3.makeMoney("Monir", 3, 9000);
    }

    public void makeMoney(String employeeName, int id, int salary){
        System.out.println(employeeName + " is here to make money $ " + salary + " with id " + id);
    }

}
