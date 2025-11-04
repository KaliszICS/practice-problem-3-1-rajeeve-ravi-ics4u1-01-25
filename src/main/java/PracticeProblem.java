public class PracticeProblem {

	public static void main(String args[]) {

	}
   
    public static int sumOfDigits(int x) {
        // If negative, make it positive
        if (x < 0) {
            x = x * -1;
        }

        // Base case: single digit (0-9)
        if (x < 10) {
            return x;
        }

        // Recursive case: last digit + sum of remaining digits
        return (x % 10) + sumOfDigits(x / 10);
    }

    
    public static int factorial(int n) {
        // If negative, return 0
        if (n < 0) {
            return 0;
        }

        // Base case: 0! = 1
        if (n == 0) {
            return 1;
        }

        // Recursive case: n! = n * (n-1)!
        return n * factorial(n - 1);
    }

}
