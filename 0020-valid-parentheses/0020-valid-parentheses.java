// import java.util.Stack;
// public class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<Character>();
//         for (char c : s.toCharArray()) {
//             if (c == '(')
//                 stack.push(')');
//             else if (c == '{')
//                 stack.push('}');
//             else if (c == '[')
//                 stack.push(']');
//             else if (stack.isEmpty() || stack.pop() != c)
//                 return false;
//         }
//         return stack.isEmpty();
//     }
// }
public class Solution {
    public boolean isValid(String s) {
        int n = s.length();
        if (n % 2 != 0) return false; // Early exit for odd length strings

        char[] stack = new char[n];
        int top = -1;

        for (char c : s.toCharArray()) {
            switch (c) {
                case '(': stack[++top] = ')'; break;
                case '{': stack[++top] = '}'; break;
                case '[': stack[++top] = ']'; break;
                default:
                    if (top == -1 || stack[top--] != c) return false;
            }
        }
        return top == -1;
    }
}
