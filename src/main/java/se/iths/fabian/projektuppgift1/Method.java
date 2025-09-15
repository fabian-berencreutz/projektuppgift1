package se.iths.fabian.projektuppgift1;

public class Method {

    public void takeArray(String[] takeArray) {
        for (String s : takeArray) {
            System.out.println(s);
        }
    }

    public int maxInArray(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Arrayen får inte vara tom.");
        }
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }

    public double maxDouble(double a, double b) {
        return Math.max(a, b);
    }
//        if (a > b) {
//            return a;
//        } else {
//            return b;
//        }

    public void fullName(String firstName, String lastName) {
        System.out.println(firstName + " " + lastName);
    }
}
