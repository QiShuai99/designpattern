package singletonPattern;

public enum  EnumSingleton {
    INSTANCE;

    private String singleton =  "singleton";

    public void doSomething(){
        System.out.println("doSomething" + singleton);
    }

    public static void main(String[] args){
        System.out.println(EnumSingleton.INSTANCE == EnumSingleton.INSTANCE);
    }
}
