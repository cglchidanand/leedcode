public class FractionAddition {
    public static void main(String[] args) {
        int[] result1 = addFractions(1, 3, 3, 9);
        System.out.println("Numerator: " + result1[0] + ", Denominator: " + result1[1]); // Output: 2/3

        int[] result2 = addFractions(1, 2, 3, 2);
        System.out.println("Numerator: " + result2[0] + ", Denominator: " + result2[1]); // Output: 2/1
    }

    public static int[] addFractions(int num1, int den1, int num2, int den2) {
        int commonDenominator = den1 * den2;
        int newNum1 = num1 * den2;
        int newNum2 = num2 * den1;

        int numeratorSum = newNum1 + newNum2;

        return simplify(numeratorSum, commonDenominator);
    }

    public static int[] simplify(int numerator, int denominator) {
        int gcd = gcd(numerator, denominator);
        return new int[] {numerator / gcd, denominator / gcd};
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); 
    }
}
