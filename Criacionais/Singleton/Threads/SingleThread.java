package Singleton.Threads;

public final class SingleThread {
    private static SingleThread instance;
    public String value;

    private SingleThread(String value){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    public static SingleThread getInstance(String value){
        if(instance == null){
            instance = new SingleThread(value);
        }
        return instance;
    }
}
