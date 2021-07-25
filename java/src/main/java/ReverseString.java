
public class ReverseString {

    public static int num = 0;

    public static void main(String[] args) {

        task.run();
        Thread t = new Thread(task);
        t.start();

    }

   static  Runnable task = () -> {

        num = num +1;
        System.out.println(num);
        if(num == 100)
            System.exit(0);

    };




}
