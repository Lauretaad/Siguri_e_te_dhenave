import java.util.Scanner;

public class VigenereDecrypt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for the cipher text and key
        System.out.print("Enter the cipher text: ");
        String cipherText = scanner.nextLine();
        
        System.out.print("Enter the key: ");
        String key = scanner.nextLine();
        
        // Decrypt the cipher text using the Vigenere Cipher
        String plainText = decryptVigenere(cipherText, key);
        
        // Output the plain text
        System.out.println("Plain Text: " + plainText);
        
        scanner.close();
    }
    
    public static String decryptVigenere(String cipherText, String key) {
        String plainText = "";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int keyIndex = 0;

        // Convert the cipher text and key to uppercase
        cipherText = cipherText.toUpperCase();
        key = key.toUpperCase();

        // Iterate through each character in the cipher text
        for (int i = 0; i < cipherText.length(); i++) {
            char cipherChar = cipherText.charAt(i);

            // Ignore any characters that are not in the alphabet
            if (!Character.isLetter(cipherChar)) {
                plainText += cipherChar;
                continue;
            }

            // Determine the corresponding row for the key character
            char keyChar = key.charAt(keyIndex);
            int rowIndex = alphabet.indexOf(keyChar);

            // Determine the corresponding column for the cipher character
            int colIndex = alphabet.indexOf(cipherChar);

            // Determine the corresponding plain text character
            int plainIndex = (colIndex - rowIndex + alphabet.length()) % alphabet.length();
            char plainChar = alphabet.charAt(plainIndex);

            // Append the plain text character to the output
            plainText += plainChar;

            // Increment the key index, wrapping around to the beginning if necessary
            keyIndex = (keyIndex + 1) % key.length();
        }

        return plainText;
    }
}
