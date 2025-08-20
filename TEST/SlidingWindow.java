package TEST;

public class SlidingWindow {
     public static int longestSubarray(int[] arr, int k) {
        int start = 0;
        int sum = 0, maxLen = 0;

        for (int end = 0; end < arr.length; end++) {
            sum += arr[end];  

            
            while (sum > k && start <= end) {
                sum -= arr[start];
                start++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, end - start + 1);
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
         int[] arr = {1,2,3,2,5,1};

         int k =5;

         
        System.out.println(longestSubarray(arr, k));


    }
}
