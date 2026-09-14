class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<int[]> stk = new Stack<>();
        int max_area = 0;

        for (int i = 0; i < n; i++) {
            int height = heights[i];
            int start = i;

            // while stack is not empty and the current length is less than the stack's top height
            while (!stk.isEmpty() && height < stk.peek()[0]) {
                int[] popped = stk.pop();
                int h = popped[0];
                int j = popped[1];
                int w = i - j;
                int area = h * w;
                max_area = Math.max(max_area, area);
                start = j;
            }
            stk.push(new int[]{height, start});
        }
        // Process the remaining bars in the stack
        while (!stk.isEmpty()) {
            int[] popped = stk.pop();
            int h = popped[0];
            int j = popped[1];
            int w = n - j;
            max_area = Math.max(max_area, h * w);
        }
        return max_area;
    }
}
