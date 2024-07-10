class Solution{
    public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
        Arrays.sort(buses);
        Arrays.sort(passengers);
        
        if(passengers[0] > buses[buses.length - 1]) return buses[buses.length - 1];
        int ans = passengers[0] - 1, j = 0;
        
        for(int i = 0; i < buses.length; i++) {
            int space = capacity;
            while(j < passengers.length && space > 0 && passengers[j] <= buses[i]) {
                if(j > 0 && passengers[j] - passengers[j-1] != 1) ans = passengers[j] - 1;
                j++;
                space--;
            }
            
            if(j > 0 && space > 0 && buses[i] != passengers[j-1]) ans = buses[i];
        }
                
        return ans;
    }
}

// class Solution {
//     public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
//         Arrays.sort(buses);
//         Arrays.sort(passengers);

//         int k = 0;
//         int n = buses.length;
//         int m = passengers.length;
//         int j = 0;
//         int ret = 0;
//         int last_bus_time = buses[n-1];

//         for(int i=0;i<n;i++) {
//             k = capacity;
//             while(j<m && passengers[j]<=buses[i] && k>0) {
//                 k--;
//                 j++;      
//             } 
//         }
// // After the for-loop, j-1 = last person on last bus   
 
//         if (k>0) {
// // if k == capacity means, last bus is empty, 
// // we can simply catch the bus at last min, which is buses[n-1];
//             if(k == capacity) { 
//                 ret = last_bus_time;
//             } else {
// // if k > 0 and k < capacity that means, 
// // there are at least one passenger on last bus, 
// // and we have to consider if that/last passenger is 
// // catch last bus on last timing which passengers[j-1] == last_bus,
// // if this is the case, we can't catch bus on last timing cuz already 
// // taken, we have to find the largest available timing. 
// // Note: passengers[j-1] is either less than 
// // or equal to last_bus_time, other wise 
// // the passenger can't onboard the bus

//                 if (passengers[j-1] == last_bus_time) { 
//                     j--;
//                     while(j>0 && passengers[j]-1 == passengers[j-1]) {
//                         j--;
//                     }
//                     ret = passengers[j]-1;
//                 } else {
//                     ret = last_bus_time;
//                 }
//             } 
//         } else {

// // this means last bus is full, 
// // we have to replace one, simply follow the rules, find the largest 
// // available timing
//             j--;
//             while(j>0 && passengers[j]-1 == passengers[j-1]) {
//                 j--;
//             }
//             ret = passengers[j]-1;
//         }
//         return ret;
//     }
// }
// class Solution {
//     public int latestTimeCatchTheBus(int[] buses, int[] passengers, int capacity) {
//         Arrays.sort(buses);
//         Arrays.sort(passengers);

//         int latestTime = Integer.MIN_VALUE; // Initialize with negative infinity

//         int busIdx = 0, passengerIdx = 0;
//         while (busIdx < buses.length && passengerIdx < passengers.length) {
//             int busTime = buses[busIdx];
//             int passengerTime = passengers[passengerIdx];

//             if (passengerTime <= busTime && passengerIdx < capacity) {
//                 // Passenger can board this bus
//                 latestTime = Math.max(latestTime, busTime);
//                 passengerIdx++;
//             }

//             busIdx++;
//         }

//         return latestTime;
//     }
// }
