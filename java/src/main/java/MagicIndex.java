
public class MagicIndex {


    public static void main(String[] args) {

        int [] a = {1,4,5,5,5,5};

        MagicIndex magicIndex = new MagicIndex();

        int result = magicIndex.find(a , 0, a.length-1);
    }

    private static  int find(int[] a , int start, int end) {

        int result = -1;

        while(start < end){

            int mid = (start + end)/2;


            if(a[mid] == mid)
                return mid;

            if(a[mid] > mid){

                // 1,2,3,3,3,3,5,6,7,545454,
                // 0,1,2,3,4,5,5,6,7,8
                end = mid-1;
            }
        }

        return result;
    }
}
