package ca1.task1;

public class CaesarCypher {

	public char[] encode(char[] input, int offset) {
        for (int i = 0; i < input.length; i++) {
            char c = input[i];
            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                input[i] = (char) (base + (c - base + offset) % 26);
            }
        }
        return input;
	}
	
	public char[] decode(char[] input, int offset) {
		return null;
	}
}