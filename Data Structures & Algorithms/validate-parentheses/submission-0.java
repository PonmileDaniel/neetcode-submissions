class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            // If it's an opening bracket, put it on the stack
            if (current == '(' || current == '{' || current == '[') {
                stack.push(current);
            }
            // If it's a closing bracket
            else {
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();

                if (current == ')' && top != '('){
                    return false;
                }
                if (current == ']' && top != '['){
                    return false;
                }
                if (current == '}' && top != '{'){
                    return false;
                }
                
            }
        }
        return stack.isEmpty();
    }
}
