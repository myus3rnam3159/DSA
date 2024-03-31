package Java;

public class JavaSingleton {
    
}

class Singleton{
    public String str;
    private Singleton(){}
    public static Singleton getSingleInstance(){
        return new Singleton();
    }
}
