class Solution {
    public int findTheWinner(int n, int k) {
        int[] friends = new int[n];
        for (int i = 0; i < n; i++) {
            friends[i] = i + 1; // Initialize the array with friend numbers.
        }

        int current = 0;
        int remainingFriends = n;
        while (remainingFriends > 1) {
            // Move the pointer k steps clockwise.
            current = (current + k - 1) % remainingFriends;

            // Remove the friend at the current position.
            for (int i = current; i < remainingFriends - 1; i++) {
                friends[i] = friends[i + 1];
            }
            remainingFriends--;
        }

        return friends[0];
    }
}
