import java.util.HashMap;

public class FibonacciWithMemorization {

    HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {

        FibonacciWithMemorization fibonacciWithMemorization = new FibonacciWithMemorization();

        System.out.println(fibonacciWithMemorization.fib(50));

    }

    public int fib(int number ){

        if(this.map.containsKey(number))
            return this.map.get(number);

        if (number <= 2) return 1;

        this.map.put(number , fib(number -1 ) + fib(number -2));

        return this.map.get(number);

    }


}
