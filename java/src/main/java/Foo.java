import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Foo  {

    String r1 = "Java";
    String r2 = "Spring";

    int num = 0;
    public static void main(String[] args) {
        Foo foo = new Foo();
        foo.execute();
    }

    public void execute() {
        new Thread(this::processThis).start();
        new Thread(this::processThat).start();
    }

    public void processThis() {

        synchronized (r1) {
            System.out.println("Locked r1 " + num );

            try{
                Thread.sleep(2000);
            }catch (Exception e){
                e.printStackTrace();
            }
            synchronized (r2){
                System.out.println("Locked r2" + num);

            }
        }
    }
    public void processThat(){
        synchronized (r1){
            System.out.println("Locked r2 " + num);
            synchronized (r2){
                System.out.println("Locked r1" + num);
                print(r1);

            }
        }
    }

    public void print(String resource){
        for(int i = 0; i < 5; i++){
            System.out.println("printing " + resource);
        }
    }

}
