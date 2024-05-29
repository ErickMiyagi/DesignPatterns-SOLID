package Singleton.Threads;

public class DemoMultiThread {
   public static void main(String[] args) {
        Thread tFoo = new Thread(new ThreadFoo());
        Thread tBar = new Thread(new ThreadBar());
        tFoo.start();
        tBar.start();
    }

    static class ThreadFoo implements Runnable{
        @Override
        public void run() {
            SingleThread st = SingleThread.getInstance("FOO");
            System.out.println(st.value);
        }
    }
    static class ThreadBar implements Runnable{
        @Override
        public void run() {
            SingleThread st = SingleThread.getInstance("BAR");
            System.out.println(st.value);
        }
    }

}
