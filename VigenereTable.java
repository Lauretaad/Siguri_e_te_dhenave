
public class VigenereTable {
	/*Klasa krijon tabelen e vigenere cipher per dekriptim 
	 * te merret parasysh se ky kod eshte shkruar per alfabetin e gjuhes angleze
	 */
    public static void main(String[] args) {
        int n = 26; // size of the table
        char[][] table = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                table[i][j] = (char) ((i + j) % n + 'A');
            }
        }

        // print the table
        System.out.print("  ");
        for (int i = 0; i < n; i++) {
            System.out.print((char) (i + 'A') + " ");
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.print((char) (i + 'A') + " ");
            for (int j = 0; j < n; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }
}
