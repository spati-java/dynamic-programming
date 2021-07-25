import java.util.*;

public class HowSum {

    public static void main(String[] args) {

        //test 1
        int input1 [] = {2,3};
        int [] result1 = howSum(7,input1);

        System.out.println(Arrays.toString(result1));

        int [] input2 = {5,3,4,7};
        int [] result2 = howSum(7, input2);

        System.out.println(Arrays.toString(result2));

        int [] input3 = {2,4};
        int [] result3 = howSum(7, input3);

        System.out.println(Arrays.toString(result3));


        int [] input4 = {2,3,5};
        int [] result4 = howSum(8, input4);

        System.out.println(Arrays.toString(result4));

        int [] input5 = {7,14};
        int [] result5 = howSum(3000, input5);

        System.out.println(Arrays.toString(result5));



    }

    private static int[] howSum(int targetSum, int[] numbers) {

        List<Integer> data = howSumCalculator(targetSum,numbers, new HashMap<>());
        System.out.println(data);

        return new int[0];
    }

    private static List<Integer> howSumCalculator(int targetSum, int [] numbers, Map<Integer, List<Integer>> map){

        if(map.containsKey(targetSum) )
            return map.get(targetSum);
        if(targetSum == 0 )
            return new ArrayList<>();

        if(targetSum < 0 )
            return null;

        // to create the branch for the tree structure
        for(int i = 0; i < numbers.length; i++) {
            int remainder = targetSum - numbers[i];
            List<Integer> result = howSumCalculator(remainder, numbers, map);
            if(result != null) {
                List<Integer> newRuslt = new ArrayList<>();
                newRuslt.addAll(result);
                newRuslt.add(numbers[i]);
                map.put(remainder, newRuslt);
                return map.get(remainder);
            }
        }

        //map.put(targetSum, null);
        return null;
    }

}
