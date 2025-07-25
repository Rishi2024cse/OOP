package skill;

public class Task1_TypeCastingImplicit {
	public static void main(String[] args) {
        int intNumber = 100;
        long longNumber;

        // Implicit casting from int to long
        longNumber = intNumber;

        System.out.println("Integer value: " + intNumber);
        System.out.println("Long value after implicit casting: " + longNumber);
    }

}
