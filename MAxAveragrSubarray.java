public class MaxAverageSubarray {

    public static double findMaxAverage(int[] nums, int k) {
        int n = nums.length;

        // Step 1: calculate sum of first k elements
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // Step 2: sliding window
        for (int i = k; i < n; i++) {
            sum = sum + nums[i] - nums[i - k];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        // Step 3: return maximum average
        return (double) maxSum / k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        double result = findMaxAverage(nums, k);
        System.out.printf("%.5f\n", result);
    }
}
