/**
 * Sukurkite klasę / objektą kuris moka šifruoti pateiktą tekstą šešioliktainiu kodu.
 */

package lt.techin.pd8;

public class PD8_3 {
    public static void main(String[] args) {
        HexEncoder hexEncoder = new HexEncoder();

        System.out.println(hexEncoder.encoderToHex("I love Java :)"));
        // TODO
    }
}
