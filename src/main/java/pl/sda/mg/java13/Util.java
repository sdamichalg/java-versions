package pl.sda.mg.java13;

public class Util {
    private String oldString = "Linia 1 \n" +
            "Linia 2... \n" + "Linia 3...";

    private String newString = """
            Linia 1
            Linia 2
            Linia kolejna
            """;

    public void printOld() {
        System.out.println(oldString);
    }
    public void printNew() {
        System.out.println(newString);
    }
}
