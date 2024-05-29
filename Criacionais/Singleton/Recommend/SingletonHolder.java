package Singleton.Recommend;

public class SingletonHolder {
    private SingletonHolder() {}

    private static class Holder {
        private static final SingletonHolder instance = new SingletonHolder();
    }
    public static SingletonHolder getInstance(){
        return Holder.instance;
    }
}
