package strategypattern.duck;

import strategypattern.flybehavior.FlyWithWings;
import strategypattern.quackbehavior.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("RedheadDuck display");
    }
}
