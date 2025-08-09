package practical_Task2;

public class String_Immutable {
    public static void main(String[] args) {
    	String s1 = "Hello ";
    	System.out.println("Original s1: " + s1);
     	s1 = s1.concat(" World ");
    	System.out.println("Modified s1: " + s1);
    	String s2 = "Hello";
    	System.out.println("s2: "+s2);
    }
}
