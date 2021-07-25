
import java.util.Arrays;


public class MergeSort {

    public static void main(String[] args) {

        int a [] = {1,4,2,7,3};

       int result [] =  mergeSort(a, a.length);

        System.out.println(Arrays.toString(result));

    }


    public static int [] mergeSort(int [] a , int length) {


        if(length <= 1)
            return  a;


       int midPoint = length/2;
       int [] left = new int[midPoint];
       int [] right = new int[length - midPoint];

       for(int i = 0; i < midPoint; i++){
           left[i] = a[i];
       }
       for(int j = midPoint; j < length; j++){
           right[j-midPoint] = a[j];
       }

       left = mergeSort(left, left.length);
        right = mergeSort(right, right.length);

        return merge(left, right);
    }



    public static int [] merge(int [] left, int [] right) {

        int result [] = new int[left.length + right.length];
        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;


        while(leftPointer < left.length && rightPointer < right.length){

            if(left[leftPointer] < right[rightPointer]){
                result[resultPointer++] = left[leftPointer++];
            }else {
                result[resultPointer++] = right[rightPointer++];
            }
        }

        while(leftPointer < left.length){
            result[resultPointer++] = left[leftPointer++];
        }
        while(rightPointer < right.length){
            result[resultPointer++] = right[rightPointer++];
        }

        return result;

    }

    public static void printArray(int [] a) {
        for(int i : a){
            System.out.print(i + " ");
        }
    }
}
