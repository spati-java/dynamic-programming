import java.util.HashMap;

public class FibonachiWithMemorization {

    HashMap<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {

        FibonachiWithMemorization fibonachiWithMemorization = new FibonachiWithMemorization();

        System.out.println(fibonachiWithMemorization.fib(50));

    }

    public int fib(int number ){

        if(this.map.containsKey(number))
            return this.map.get(number);

        if (number <= 2) return 1;

        this.map.put(number , fib(number -1 ) + fib(number -2));

        return this.map.get(number);

    }
}
