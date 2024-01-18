package lt.techin.pd8;

public class HexEncoder {

    public String encoderToHex(String text){
StringBuilder hexChars = new StringBuilder();
for (char ch : text.toCharArray()){
    hexChars.append(String.format("%02x", (int) ch));
}
        return hexChars.toString();
    }
}
