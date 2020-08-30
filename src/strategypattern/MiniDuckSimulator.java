package strategypattern;

import strategypattern.duck.Duck;
import strategypattern.duck.MallardDuck;
import strategypattern.duck.ModelDuck;
import strategypattern.flybehavior.FlyRocketPowered;

public class MiniDuckSimulator {
    public static void main(String[] args){
//        Duck duck = new MallardDuck();
//        duck.performFly();
//        duck.performQuack();

        Duck duck = new ModelDuck();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehavior(new FlyRocketPowered());
        duck.performFly();
    }
}
