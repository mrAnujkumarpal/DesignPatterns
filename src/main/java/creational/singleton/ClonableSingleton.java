package creational.singleton;

public class ClonableSingleton {
    private ClonableSingleton() {
    }

    private static ClonableSingleton instance;

    public ClonableSingleton getInstance() {
        if (null == instance)
            instance = new ClonableSingleton();
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
