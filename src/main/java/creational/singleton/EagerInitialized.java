package creational.singleton;

public class EagerInitialized {

    private EagerInitialized() {
    }

    private final static EagerInitialized instance = new EagerInitialized();

    public static EagerInitialized ßgetInstance() {
        return instance;
    }
}
