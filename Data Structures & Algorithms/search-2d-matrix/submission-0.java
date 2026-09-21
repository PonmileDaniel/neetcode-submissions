class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int column = matrix[0].length;
        int left = 0;
        int right = rows * column - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            int row = middle / column;
            int columns = middle % column;
            int value = matrix[row][columns];

            if (value == target) {
                return true;
            }
            if (value < target){
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return false;

        
    }
}