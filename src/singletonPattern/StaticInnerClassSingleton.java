package singletonPattern;

public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton(){

    }

    private static class InnerSingleton{
        private static final StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerSingleton.instance;
    }
}
