public class App {
    public static void main(String[] args) {
        SimplifiedAES aes = new SimplifiedAES();
        Crypto c = new NoBlockCypher(aes);
        String secretKey = "as";

        String textString = "This is a message";

        Pair<String, String> encrypted = c.encrypt(textString, secretKey);
        System.out.println("Encrypted text: \n" + encrypted.first + "\n");


        Pair<String, String> decrypted = c.decrypt(encrypted.first, encrypted.second);
        System.out.println("Decrypted text: \n" + decrypted.first + "\n");

    }
}
