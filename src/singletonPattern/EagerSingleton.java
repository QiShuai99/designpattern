package singletonPattern;

public class EagerSingleton {
    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton(){

    }

    public static EagerSingleton getInstance(){
        return instance;
    }

    public static void main(String[] args){
        System.out.println(EagerSingleton.getInstance() == EagerSingleton.getInstance());
    }

}
