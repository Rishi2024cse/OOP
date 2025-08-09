package practical_Task2;

public class String_Handling {
	    public static void main(String[] args) {
	    	
	        String message = "Hello, Java!";
	        
	        
	        System.out.println("Original String: " + message);

	       
	        int length = message.length();
	        System.out.println("Length of the string: " + length);

	       
	        String greeting = "Welcome";
	        String fullMessage = greeting + " to " + message;
	        System.out.println("Concatenated String: " + fullMessage);

	        
	        char firstChar = message.charAt(0);
	        System.out.println("First character: " + firstChar);

	        
	        String anotherMessage = "Hello, Java!";
	        boolean areEqual = message.equals(anotherMessage);
	        System.out.println("Are strings equal (case-sensitive)? " + areEqual);

	       
	        String differentCaseMessage = "hello, java!";
	        boolean areEqualIgnoreCase = message.equalsIgnoreCase(differentCaseMessage);
	        System.out.println("Are strings equal (case-insensitive)? " + areEqualIgnoreCase);
	    }
	}

