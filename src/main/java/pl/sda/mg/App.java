package pl.sda.mg;

public class App {
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        if (animal2 instanceof Dog) {
            System.out.println("Tutaj pies");
        }
    }
}
