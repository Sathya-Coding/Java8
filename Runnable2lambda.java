

public class Runnable2lambda {
    public static void main(String[]args){
        Runnable s=()->System.out.println("Hello from Lambda Thread");
        new Thread(s).start();

    }
}
