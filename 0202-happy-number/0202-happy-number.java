class Solution {
    public boolean isHappy(int n) {
        int slow = n; // Initialize a slow pointer (starting from n)
        int fast = n; // Initialize a fast pointer (also starting from n)

        // Use Floyd's Cycle Detection Algorithm
        do {
            slow = numSquareSum(slow); // Move slow one step (calculate sum of squares of its digits)
            fast = numSquareSum(numSquareSum(fast)); // Move fast two steps (calculate sum of squares twice)
        } while (slow != fast); // Repeat until slow and fast meet

        return slow == 1; // If slow reaches 1, it's a happy number; otherwise, it's not
    }

    // Helper function to calculate the sum of squares of digits
    private int numSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }
}
