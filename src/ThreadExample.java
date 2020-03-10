public class ThreadExample {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Iam Runnable"));
thread.run();



    }



}
