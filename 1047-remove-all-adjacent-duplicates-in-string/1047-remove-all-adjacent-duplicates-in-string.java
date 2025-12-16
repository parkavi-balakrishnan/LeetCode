class Solution {
    public String removeDuplicates(String s) {
        StringBuilder stack = new StringBuilder();

        for (char ch : s.toCharArray()) {
            int len = stack.length();

            // If top of stack == current char → remove
            if (len > 0 && stack.charAt(len - 1) == ch) {
                stack.deleteCharAt(len - 1);
            } 
            // Else push current char
            else {
                stack.append(ch);
            }
        }

        return stack.toString();
    }
}
