package practical_Task2;

public class String_Manipulation {
	    public static void main(String[] args) {

	        // String Creation
	        String str1 = "Hello";
	        String str2 = new String(" World!");

	        //Concatenation
	        String combinedString = str1.concat(str2); // Using concat() method
	        String combinedString2 = str1 + str2;     // Using '+' operator
	        System.out.println("Concatenated String (concat()): " + combinedString);
	        System.out.println("Concatenated String (+ operator): " + combinedString2);

	        //Length of a String
	        int length = combinedString.length();
	        System.out.println("Length of combinedString: " + length);

	        //Case Conversion
	        String upperCaseString = combinedString.toUpperCase();
	        String lowerCaseString = combinedString.toLowerCase();
	        System.out.println("Uppercase: " + upperCaseString);
	        System.out.println("Lowercase: " + lowerCaseString);

	        //Substring Extraction
	        String sub = combinedString.substring(6, 11); // Extracts "World"
	        System.out.println("Substring: " + sub);

	        //Character at a specific index
	        char charAtIndex = combinedString.charAt(0); // 'H'
	        System.out.println("Character at index 0: " + charAtIndex);

	        //Searching for a substring
	        int indexOfWorld = combinedString.indexOf("World");
	        System.out.println("Index of 'World': " + indexOfWorld);

	        //Replacing characters or substrings
	        String replacedString = combinedString.replace('o', 'X');
	        System.out.println("String after replacing 'o' with 'X': " + replacedString);
	        
	        //Using StringBuilder for efficient concatenation (especially in loops)
	        StringBuilder sb = new StringBuilder();
	        sb.append("Efficient ");
	        sb.append("Concatenation ");
	        sb.append("with StringBuilder.");
	        System.out.println(sb.toString());
	    }
	}

