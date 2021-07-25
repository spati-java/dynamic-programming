import java.util.Arrays;

public class StringPermutation {

    public static void main(String[] args) {

        String input = "ABC"; //output ACB, ABC,CAB,CAB,BAC,BCA;
        permute(input, 0, input.length()-1);

    }

    public static  void permute(String str, int start , int end) {

        if(start == end){
            System.out.println(str);
        }

        for(int i = start; i < str.length(); i++){

            String swapped = swapped(str,i, start);
            permute(swapped, start+1, end);
        }
    }


    public static  String swapped(String word , int start, int end) {

        char [] char_array = word.toCharArray();

        char temp = char_array[start];
        char_array[start] = char_array[end];
        char_array[end] = temp;

        return new String(char_array);

    }

}
