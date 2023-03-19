package creational.singleton;

public class StaticBlock {

    private StaticBlock() {
    }

    private static StaticBlock instance = null;

    static {
        if (null == instance) {
            instance = new StaticBlock();
        }
    }

    public static StaticBlock getInstance() {
        return instance;
    }
}
