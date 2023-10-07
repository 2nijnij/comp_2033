package ca1.task1;
import java.util.Scanner;


public class CaesarCypher {

	// Encode function
	public static char[] encode(char[] input, int offset) {
        for (int i = 0; i < input.length; i++) {
            char c = input[i];
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                input[i] = (char) (base + (c - base + offset) % 26);
            }
        }
        return input;
	}
	
	// Decode function
	public static char[] decode(char[] input, int offset) {
        return encode(input, -offset);
	}

	
	// Use a Scanner so that users can enter the messages and an offset by themselves
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message: ");
        String message = scanner.nextLine();

        System.out.print("Enter an offset: ");
        int offset = scanner.nextInt();

        char[] encodedMessage = encode(message.toCharArray(), offset);
        System.out.println("Encoded: " + new String(encodedMessage));

        char[] decodedMessage = decode(encodedMessage, offset);
        System.out.println("Decoded: " + new String(decodedMessage));

        scanner.close();
	}
}