class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt(); //Finds max(piles)
        int result = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            long hours = 0;

            for (int p : piles) {
                hours += (p + mid - 1) / mid;
            }
            if (hours <= h) {
                result = Math.min(result, mid);
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;

        
    }
}
