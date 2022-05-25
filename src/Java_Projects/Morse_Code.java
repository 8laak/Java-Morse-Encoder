package Java_Projects;

/**
 *This helper class enables the encoding of plain text to Morse Code, and the decoding of Morse Code to plain text.
 * @author User
 */
public class Morse_Code {
    public static final char[] ALPHABET = new char[] { 
      'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 
      'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 
      'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3', 
      '4', '5', '6', '7', '8', '9' };
    
    public static final String[] CODE = new String[] { 
      ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", 
      "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", 
      "..-", "...-", ".--", "-..-", "-.--", "--..", ".----", "..---", "...--", "....-", 
      ".....", "-....", "--...", "---..", "----.", "-----" };
  
    /*
    *This method takes a string of plain text from the textarea in the program and encodes it into morse code
    *allowing appending 1 space between characters and 2 spaces between words
    */
    public static String encode(String text) {
    StringBuffer encoded = new StringBuffer();
    for (int i = 0; i < text.length(); i++) {
      for (int j = 0; j < ALPHABET.length; j++) { 
        if (text.charAt(i) == ALPHABET[j]) {
          encoded.append(CODE[j]);
          encoded.append(" ");
          break;
        } 
        if (text.charAt(i) == '\n' || text.charAt(i) == ' ') {
          encoded.append("  ");
          break;
        } 
      } 
    } 
    String output = encoded.toString();
    return output.substring(0, output.length()-1);
  }
  
    /*
    *This method takes a string of morse code from the textarea in the program and decodes it into plain text
    *appending for 1 space between words 
    */
  public static String decode(String text) {
    StringBuffer decoded = new StringBuffer();
    String[] words = text.split("  ");
    for (int i = 0; i < words.length; i++) {
      String[] codes = words[i].split(" ");
      for (int j = 0; j < codes.length; j++) {
        for (int k = 0; k < CODE.length; k++) {
          if (codes[j].equals(CODE[k])) {
            decoded.append(ALPHABET[k]);
            break;
          } 
        } 
      } 
      decoded.append(" ");
    } 
    String output = decoded.toString();
    return output.substring(0, output.length()-1);
  }
}
