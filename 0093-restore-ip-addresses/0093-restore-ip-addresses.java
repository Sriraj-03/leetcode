
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        restoreIp(s, 0, "", 0, result);
        return result;
    }

    private void restoreIp(String s, int start, String current, int part, List<String> result) {
        if (part == 4 && start == s.length()) {
            result.add(current.substring(0, current.length() - 1)); // Remove the last dot
            return;
        }
        if (part == 4 || start == s.length()) {
            return;
        }

        for (int len = 1; len <= 3 && start + len <= s.length(); len++) {
            String segment = s.substring(start, start + len);
            if (isValidSegment(segment)) {
                restoreIp(s, start + len, current + segment + ".", part + 1, result);
            }
        }
    }

    private boolean isValidSegment(String segment) {
        if (segment.length() > 1 && segment.charAt(0) == '0') {
            return false; // Leading zero
        }
        int value = 0;
        for (int i = 0; i < segment.length(); i++) {
            value = value * 10 + (segment.charAt(i) - '0');
        }
        return value >= 0 && value <= 255;
    }
}


// import java.util.Scanner;

// public class ValidIPAddresses {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         String s = scanner.nextLine();
//         scanner.close();
        
//         String[] result = new String[100]; // Assuming a maximum of 100 valid IPs
//         int count = restoreIpAddresses(s, 0, 0, "", result, 0);
        
//         for (int i = 0; i < count; i++) {
//             System.out.println(result[i]);
//         }
//     }

//     private static int restoreIpAddresses(String s, int start, int part, String current, String[] result, int count) {
//         if (part == 4 && start == s.length()) {
//             result[count++] = current.substring(0, current.length() - 1); // Remove the last dot
//             return count;
//         }
//         if (part == 4 || start == s.length()) {
//             return count;
//         }

//         for (int len = 1; len <= 3 && start + len <= s.length(); len++) {
//             String segment = s.substring(start, start + len);
//             if (isValidSegment(segment)) {
//                 count = restoreIpAddresses(s, start + len, part + 1, current + segment + ".", result, count);
//             }
//         }
//         return count;
//     }

//     private static boolean isValidSegment(String segment) {
//         if (segment.length() > 1 && segment.charAt(0) == '0') {
//             return false; // Leading zero
//         }
//         int value = 0;
//         for (int i = 0; i < segment.length(); i++) {
//             value = value * 10 + (segment.charAt(i) - '0');
//         }
//         return value >= 0 && value <= 255;
//     }
// }
