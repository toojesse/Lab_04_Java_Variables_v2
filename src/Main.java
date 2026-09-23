
public class Main {
    public static void main(String[] args) {
        // Integer Operands & Results
        int intOperandA = 12;
        int intOperandB = 5;
        int intSum;
        int intProduct;
        int intDifference;
        int intQuotient;
        int intModulo;

        // Double Operands & Results
        double doubleOperandA = 12.50;
        double doubleOperandB = 3.50;
        double doubleSum;
        double doubleProduct;
        double doubleDifference;
        double doubleQuotient;

        // Integer Arithmetic Operations
        intSum = intOperandA + intOperandB;
        System.out.println("The sum using ints of " + intOperandA + " " + intOperandB + " is " + intSum);

        intDifference = intOperandA - intOperandB;
        System.out.println("The difference using ints of " + intOperandA + " " + intOperandB + " is " + intDifference);

        intProduct = intOperandA * intOperandB;
        System.out.println("The product using ints of " + intOperandA + " " + intOperandB + " is " + intProduct);

        intQuotient = intOperandA / intOperandB;
        System.out.println("The quotient using ints of " + intOperandA + " " + intOperandB + " is " + intQuotient);

        intModulo = intOperandA % intOperandB;
        System.out.println("The modulo using ints of " + intOperandA + " " + intOperandB + " is " + intModulo);

        System.out.println(); // Blank line for spacing

        // Double Arithmetic Operations
        doubleSum = doubleOperandA + doubleOperandB;
        System.out.println("The sum using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleSum);

        doubleDifference = doubleOperandA - doubleOperandB;
        System.out.println("The difference using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleDifference);

        doubleProduct = doubleOperandA * doubleOperandB;
        System.out.println("The product using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleProduct);

        doubleQuotient = doubleOperandA / doubleOperandB;
        System.out.println("The quotient using doubles of " + doubleOperandA + " " + doubleOperandB + " is " + doubleQuotient);

        System.out.println(); // Blank line for spacing
// Variable Declarations & Assignments for Personal Attributes
        int familyKidsCount = 2;
        boolean isRaining = false;
        double pricePerGallonGas = 3.49;
        int favoriteNumber = 7;
        double shoeSize = 10.5;
        int birthMonth = 8;
        String fullName = "Alex Smith";

        // Displaying Variables
        System.out.println("Number of kids in family: " + familyKidsCount);
        System.out.println("Is it raining? " + isRaining);
        System.out.println("Price of a gallon of gas: $" + pricePerGallonGas);
        System.out.println("Favorite number: " + favoriteNumber);
        System.out.println("Shoe size: " + shoeSize);
        System.out.println("Birth month: " + birthMonth);
        System.out.println("Full name: " + fullName);
    }
}