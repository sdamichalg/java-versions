package pl.sda.mg.java14;

public record Employee(
        String firstName,
        String lastName,
        int age,
        String sex) {

    public Employee() {
        this("firstName", "lastName", 0, null);
    }

    public Employee {
        if (age < 20) {
            throw new RuntimeException("Osoba poniżej 20 lat nie może byc zatrudniona");
        }
    }

}
