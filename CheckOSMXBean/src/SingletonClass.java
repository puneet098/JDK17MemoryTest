import java.io.Serializable;

public class SingletonClass implements Serializable,Cloneable {
    private static SingletonClass instance = new SingletonClass();

    private SingletonClass(){}

    public static SingletonClass getInstance() {
        if(instance == null)
            instance = new SingletonClass();
        return instance;
    }
    protected Object clone() throws CloneNotSupportedException{
        return new CloneNotSupportedException();
    }

    protected static Object readResolve(){return instance;}
}
