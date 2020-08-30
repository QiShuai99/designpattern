package strategypattern.duck;


import strategypattern.flybehavior.FlyNoWay;
import strategypattern.quackbehavior.MuteQuack;

public class ModelDuck extends Duck {
    public ModelDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display() {
        System.out.println("ModelDuck");
    }
}
