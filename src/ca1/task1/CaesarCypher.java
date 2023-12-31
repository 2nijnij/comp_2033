package ca1.task1;
import java.util.Scanner;


public class CaesarCypher {

	// Encode function
	public static char encodeChar(char c, int offset) {
		if (Character.isLetter(c)) {
			char base = Character.isLowerCase(c) ? 'a' : 'A';
			return (char) (base + (c - base + offset) % 26);
            }
		return c;
        }

	
	// Decode function
	public static char[] encode(char[] input, int offset) {
		for (int i = 0; i < input.length; i++) {
			input[i] = encodeChar(input[i], offset);
		}
		return input;
	}
    
    public static char[] decode(char[] input, int offset) {
        for (int i = 0; i < input.length; i++) {
            if (Character.isLetter(input[i])) {
                char base = Character.isLowerCase(input[i]) ? 'a' : 'A';
                input[i] = (char) (base + (input[i] - base - offset + 26) % 26);
            }
        }
        return input;
    }
	
	// Use a Scanner so that users can enter the messages and an offset by themselves
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		//Method for user to choose encode or decode
		System.out.println("Do you want to 'Encode' or 'Decode'?");
		String choice = scanner.nextLine();
		
		//Printed messages for encode and decode
        System.out.print("Enter a message: ");
        String message = scanner.nextLine();

        System.out.print("Enter an offset: ");
        int offset = scanner.nextInt();
        char[] result;
        
        //Allow system to ignore case error (IgnoreCase)
        if (choice.equalsIgnoreCase("encode")) {
            result = encode(message.toCharArray(), offset);
            System.out.println("Encoded: " + new String(result));
        } else if (choice.equalsIgnoreCase("decode")) {
            result = decode(message.toCharArray(), offset);
            System.out.println("Decoded: " + new String(result));
        } else {
            System.out.println("Invalid choice. Please enter 'Encode' or 'Decode'.");
        }
        scanner.close();
	}
}