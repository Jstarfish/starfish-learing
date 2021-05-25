package strategy;

/**
 * @description:
 * @author: starfish
 * @date: 2021/4/16 16:01
 */
public class ConcreteStrategyA implements Strategy {
    @Override
    public void operate() {
        //具体的算法实现
        System.out.println("ConcreteStrategyA operate");
    }
}
