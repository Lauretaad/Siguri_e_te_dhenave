import java.util.Scanner;
import java.util.Scanner;

public class VigenereCipher{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
/*Kerkojme nga useri te futet teksti origjinal 
 * 
 */
        System.out.print("Enter the plaintext: ");
        String plaintext = input.nextLine();
/*kerkojme poashtu te futet celesi
 * 
 */
        System.out.print("Enter the key: ");
        String key = input.nextLine();
/*Thirret metoda vigenereCipher per enkriptim
 * 
 */
        String ciphertext = vigenereCipher(plaintext, key);

        System.out.println("Ciphertext: " + ciphertext);
    }

    public static String vigenereCipher(String plaintext, String key) {
    	/*Merren teksti origjinal dhe celesi si UpperCases
    	 * 
    	 */
        String ciphertext = "";
        plaintext = plaintext.toUpperCase();
        key = key.toUpperCase();
        
        for (int i = 0, j = 0; i < plaintext.length(); i++) {
            char c = plaintext.charAt(i);
            if (c < 'A' || c > 'Z') {
                continue;
            }
            ciphertext += (char) ((c + key.charAt(j) - 2 * 'A') % 26 + 'A');
            j = ++j % key.length();
        }

        return ciphertext;
    }
}
