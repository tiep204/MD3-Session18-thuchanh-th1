public class Main {
    public static void main(String[] args) {
        System.out.println("Main thread running... ");
        RunnableDemo runnableDemo1 = new RunnableDemo("luong 1");
        runnableDemo1.start();
        RunnableDemo runnableDemo2 = new RunnableDemo("luong 2");
        runnableDemo2.start();
        System.out.println("Main thread stopped!!! ");
    }
}