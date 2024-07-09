class Solution {
    public int maximumPopulation(int[][] logs) {
        // Initialize an array to track population changes
        int[] d = new int[101]; // Covers years 1950 to 2050

        // Populate the array with population deltas
        for (int[] log : logs) {
            d[log[0] - 1950]++; // Increment birth year
            d[log[1] - 1950]--; // Decrement death year (exclusive)
        }

        // Calculate cumulative population
        int maxPopulation = 0;
        int currentPopulation = 0;
        int maxYear = 0;

        for (int i = 0; i < 101; i++) {
            currentPopulation += d[i];
            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                maxYear = i;
            }
        }

        // Add back the 1950 offset to get the actual year
        return maxYear + 1950;
    }
}
// class Solution {
//     public int maximumPopulation(int[][] logs) {
//         // Initialize an array to track population changes
//         int[] d = new int[101]; // Covers years 1950 to 2050

//         // Populate the array with population deltas
//         for (int[] log : logs) {
//             d[log[0] - 1950]++; // Increment birth year
//             d[log[1] - 1950]--; // Decrement death year (exclusive)
//         }

//         // Calculate cumulative population
//         int maxPopulation = 0;
//         int currentPopulation = 0;
//         int maxYear = 0;

//         for (int i = 0; i < 101; i++) {
//             currentPopulation += d[i];
//             if (currentPopulation > maxPopulation) {
//                 maxPopulation = currentPopulation;
//                 maxYear = i;
//             }
//         }

//         // Add back the 1950 offset to get the actual year
//         return maxYear + 1950;
//     }
// }

// You are given a list of people’s birth and death years. Each person is represented by a pair of years: [birthi, deathi]. The population of a specific year x is the number of people alive during that year. However, a person is not counted in the year of their death.

// Your task is to find the earliest year with the maximum population.

// Example:
// Let’s look at an example to illustrate the problem:

// Input:

// logs = [[1993, 1999], [2000, 2010]]

// Person 1 was born in 1993 and died in 1999.
// Person 2 was born in 2000 and died in 2010.
// Output: The maximum population is 1, and the earliest year with this population is 1993.

// Approach:
// Create an array to track population changes for each year.
// Increment the population at a person’s birth year and decrement it at their death year (excluding the year of death).
// Calculate the cumulative population over the years.
// Keep track of the maximum population and the corresponding earliest year.