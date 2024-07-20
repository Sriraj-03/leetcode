class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][];
        }

       // Bubble Sort for Intervals
for (int i = 0; i < intervals.length - 1; i++) {
    for (int j = 0; j < intervals.length - i - 1; j++) {
        if (intervals[j][0] > intervals[j + 1][0]) {
            // Swap intervals[j] and intervals[j + 1]
            int[] temp = intervals[j];
            intervals[j] = intervals[j + 1];
            intervals[j + 1] = temp;
        }
    }
}


        
        List<int[]> merged = new ArrayList<>();
        int[] currentInterval = intervals[0];
        merged.add(currentInterval);

        for (int[] interval : intervals) {
            if (interval[0] <= currentInterval[1]) {
                currentInterval[1] = Math.max(currentInterval[1], interval[1]);
            } else {
                currentInterval = interval;
                merged.add(currentInterval);
            }
        }

        return merged.toArray(new int[merged.size()][]);
    }
}

// class Solution {
//     public int[][] merge(int[][] intervals) {
//         if (intervals.length == 0) {
//             return new int[0][];
//         }

//         // Sort the intervals by their start time
//         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

//         List<int[]> merged = new ArrayList<>();
//         int[] currentInterval = intervals[0];
//         merged.add(currentInterval);

//         for (int[] interval : intervals) {
//             int currentEnd = currentInterval[1];
//             int nextStart = interval[0];
//             int nextEnd = interval[1];

//             if (currentEnd >= nextStart) { // Overlapping intervals, merge them
//                 currentInterval[1] = Math.max(currentEnd, nextEnd);
//             } else { // Non-overlapping interval, add it to the list
//                 currentInterval = interval;
//                 merged.add(currentInterval);
//             }
//         }

//         return merged.toArray(new int[merged.size()][]);
//     }

// }


// // class Solution {
// //     public int[][] merge(int[][] intervals) {
// //         if (intervals.length == 1) {
// //             return intervals;
// //         }

// //         int max = 0;
// //         for (int i = 0; i < intervals.length; i++) {
// //             max = Math.max(intervals[i][0], max);
// //         }

// //         if (max == 0) {
// //             return new int[][] { intervals[0] };
// //         }

// //         int[] timeTable = new int[max + 1];
// //         for (int i = 0; i < intervals.length; i++) {
// //             int startTime = intervals[i][0];
// //             int endTime = intervals[i][1];
// //             timeTable[startTime] = Math.max(endTime + 1, timeTable[startTime]);
// //         }

// //         int resultSize = 0;
// //         int currEnd = -1;
// //         int currStart = -1;

// //         for (int i = 0; i < timeTable.length; i++) {
// //             if (timeTable[i] != 0) {
// //                 if (currStart == -1) {
// //                     currStart = i;
// //                 }
// //                 currEnd = Math.max(timeTable[i] - 1, currEnd);
// //             }
// //             if (currEnd == i) {
// //                 intervals[resultSize++] = new int[] { currStart, currEnd };
// //                 currEnd = -1;
// //                 currStart = -1;
// //             }
// //         }

// //         if (currStart != -1) {
// //             intervals[resultSize++] = new int[] { currStart, currEnd };
// //         }

// //         if (intervals.length == resultSize) {
// //             return intervals;
// //         }

// //         int[][] res = new int[resultSize][];
// //         for (int i = 0; i < resultSize; i++) {
// //             res[i] = intervals[i];
// //         }

// //         return res;
// //     }
// // }
// // public class MergeIntervals {
// //     public static void main(String[] args) {
// //         int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
// //         int[][] result = merge(intervals);
        
// //         for (int i = 0; i < result.length; i++) {
// //             System.out.println("[" + result[i][0] + "," + result[i][1] + "]");
// //         }
// //     }

// //     public static int[][] merge(int[][] intervals) {
// //         if (intervals.length <= 1) {
// //             return intervals;
// //         }

// //         // Sort intervals by starting time
// //         for (int i = 0; i < intervals.length - 1; i++) {
// //             for (int j = i + 1; j < intervals.length; j++) {
// //                 if (intervals[i][0] > intervals[j][0]) {
// //                     int[] temp = intervals[i];
// //                     intervals[i] = intervals[j];
// //                     intervals[j] = temp;
// //                 }
// //             }
// //         }

// //         // Merge intervals
// //         int[][] merged = new int[intervals.length][2];
// //         int index = 0;
// //         merged[index] = intervals[0];

// //         for (int i = 1; i < intervals.length; i++) {
// //             if (merged[index][1] >= intervals[i][0]) {
// //                 merged[index][1] = Math.max(merged[index][1], intervals[i][1]);
// //             } else {
// //                 index++;
// //                 merged[index] = intervals[i];
// //             }
// //         }

// //         // Copy the merged intervals to the result array
// //         int[][] result = new int[index + 1][2];
// //         for (int i = 0; i <= index; i++) {
// //             result[i] = merged[i];
// //         }

// //         return result;
// //     }
// // }
