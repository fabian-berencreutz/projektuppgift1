package se.iths.fabian.projektuppgift1;

public class Main {
    public static void main(String[] args) {
        String[] helloWorld = {"Hello, World, !"};

        takeArray(helloWorld);

        int[] numbers = {1, 5, 23, 24, 25};

        System.out.println(maxInArray(numbers));

        System.out.println(maxDouble(12.24, 12.25));

        fullName("Fabian", "Berencreutz");
    }

    public static void takeArray(String[] takeArray) {
        for (String s : takeArray) {
            System.out.println(s);
        }
    }

    public static int maxInArray(int[] array) {
        int max = 0;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }

    public static double maxDouble(double a, double b) {
        return Math.max(a, b);

//        if (a > b) {
//            return a;
//        } else {
//            return b;
//        }
    }

    public static void fullName(String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }
}
