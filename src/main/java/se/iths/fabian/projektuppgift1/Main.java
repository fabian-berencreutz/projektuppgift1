package se.iths.fabian.projektuppgift1;

public class Main {
    public static void main(String[] args) {

        Method method = new Method();

        //Första metoden
        String[] helloWorld = {"Hello", "World", "!"};
        method.takeArray(helloWorld);

        //Andra metoden.
        int[] numbers = {1, 5, 23, 24, 25, 93};
        System.out.println(method.maxInArray(numbers));

        //Tredje metoden
        System.out.println(method.maxDouble(12.29, 12.25));

        //Fjärde metoden
        method.fullName("Fabian", "Berencreutz");
    }
}