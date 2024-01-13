/**
 * Parašykite Java metodą, kuris priima argumentą ir grąžina jo tipą.
 */

package lt.techin.pd7;

import java.math.BigDecimal;

public class PD7_13 {
    public static void main(String[] args) {
        // TODO
        Object myVariable = true;
        System.out.println(inputTypeCheck(myVariable));
    }

    public static Object inputTypeCheck(Object usersInput) {
        Object typeOfInput = usersInput.getClass();
        String typeOfArg = "";

        if (usersInput.getClass() == Integer.class) {
            typeOfArg = "Type of argument is Integer";
        }
        if (usersInput.getClass() == String.class) {
            typeOfArg = "Type of argument is String";
        }
        if (usersInput.getClass() == Boolean.class) {
            typeOfArg = "Type of argument is Boolean";
        }
        if (usersInput.getClass() == Double.class) {
            typeOfArg = "Type of argument is Double";
        }
        if (usersInput.getClass() == Long.class) {
            typeOfArg = "Type of argument is Long";
        }
        if (usersInput.getClass() == BigDecimal.class) {
            typeOfArg = "Type of argument is BigDecimal";
        }
        if (usersInput.getClass() == Character.class) {
            typeOfArg = "Type of argument is Character";
        }
        if (usersInput.getClass() == Float.class) {
            typeOfArg = "Type of argument is Float";
        }
        return typeOfArg;
    }
}
