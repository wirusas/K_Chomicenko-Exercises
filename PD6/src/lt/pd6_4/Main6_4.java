package lt.pd6_4;

public class Main6_4 {
    public static void main(String[] args) {
        int counter = 0;
        int[] age = {10, 15, 12, 16, 18, 19, 10, 12, 10};

        for (int i = 0; i < age.length; i++) {
            if (age[0] == age[i]) {
                counter++;
            }
        }
        System.out.println("Masyve elementas: " + age[0] + " pasikartojo " + counter + " kartus(ų).");

    }
}
