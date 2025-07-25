package skill;

public class Task1_TypeCastingExplicit {
	public static void main(String[] args) {
        double decimalNumber = 9.78;
        int wholeNumber;

        // Explicit casting from double to int
        wholeNumber = (int) decimalNumber;

        System.out.println("Double value: " + decimalNumber);
        System.out.println("Integer value after casting: " + wholeNumber);
    }

}
