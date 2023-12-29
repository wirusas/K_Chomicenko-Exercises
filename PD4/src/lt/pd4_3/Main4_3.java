package lt.pd4_3;

public class Main4_3 {
    public static void main(String[] args) {
        StringBuilder validation = new StringBuilder();
        String name = "Kazimieras";
        String surname = "Kazimieraitis";


        if (name.equals("Kazimieras") && surname.equals("Kazimieraitis")) {
            validation.append("PASSED");
            System.out.println(validation);
        } else if (!name.equals("Kazimieras") || !surname.equals("Kazimieraitis")) {
            validation.append("NOT PASSED CHECK YOUR NAME OR SURNAME");
            System.out.println(validation);

        }

    }
}
