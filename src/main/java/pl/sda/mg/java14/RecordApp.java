package pl.sda.mg.java14;

public class RecordApp {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Jan", "Kowalski", 60, "M");

        employee1.age();

        System.out.println(employee1);

        Employee employee2 = new Employee("Adam", "Nowak", 19, "M");
    }
}
