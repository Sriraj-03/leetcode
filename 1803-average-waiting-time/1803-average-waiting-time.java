class Solution {
    public double averageWaitingTime(int[][] customers) {
     
         int n = customers.length;
        int chefTime = 0;
        int totalWaitingTime = 0;

        for (int i = 0; i < n; i++) {
            int arrivalTime = customers[i][0];
            int preparationTime = customers[i][1];

            if (arrivalTime > chefTime) {
                chefTime = arrivalTime;
            }

            chefTime += preparationTime;

            totalWaitingTime += chefTime - arrivalTime;
        }

        return (double) totalWaitingTime / n;
    }
}