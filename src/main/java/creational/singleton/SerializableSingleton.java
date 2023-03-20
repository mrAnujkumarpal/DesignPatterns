package creational.singleton;

import java.io.Serializable;

public class SerializableSingleton implements Serializable {

    private SerializableSingleton() {
    }
    private static SerializableSingleton instance;

    public static SerializableSingleton getInstance(){
        if(null==instance){
            instance=new SerializableSingleton();
        }
        return instance;
    }
    protected  Object readResolve(){
        return instance;
    }
}
