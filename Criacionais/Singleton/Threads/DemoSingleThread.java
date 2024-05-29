package Singleton.Threads;

public class DemoSingleThread {
    public static void main(String[] args) {
        SingleThread st = SingleThread.getInstance("FOO");
        SingleThread anotherST = SingleThread.getInstance("BAR");

        System.out.println(st.value);
        System.out.println(anotherST.value);
    }    
}
