package creational.singleton;

public class ThreadSafe {

    private ThreadSafe() {
    }

    private static ThreadSafe instance = null;

    public static synchronized ThreadSafe getInstance() {
        if (null == instance) {
            instance = new ThreadSafe();
        }
        return instance;
    }


}
