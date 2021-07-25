
public class ContinousSubArraySum {

    public static void main(String[] args) {
        int [] intput = new int[]{4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
        int result = findMaxSumOfSubArray(intput, 3);
        System.out.println(result);

        System.out.println(smallestSubArraySize(intput, 8));
    }

    public static  int findMaxSumOfSubArray(int [] a , int  k){

        int maxSum = Integer.MIN_VALUE;
        int curSum = 0;

        for(int i = 0; i < a.length; i++) {

            curSum += a[i];

            if(i >= k-1) {
                maxSum = Math.max( maxSum, curSum);
                curSum -= a[i - (k-1)];
            }
        }
        return  maxSum;
    }

    public static int smallestSubArraySize(int [] a ,int targetSum){


        int minWindowSize = Integer.MAX_VALUE;

        int currSum = 0;

        int windowStart = 0;

        for(int windowEnd = 0; windowEnd < a.length; windowEnd++){

            currSum += a[windowEnd];

            while(currSum >= targetSum) {
                minWindowSize = Math.min(minWindowSize , windowEnd - windowStart + 1);
                currSum -= a[windowStart];
                windowStart++;
            }

        }

        return  minWindowSize;
    }
}
