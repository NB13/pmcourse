package by.bsu.metelsky.model;

/**
 * Created with IntelliJ IDEA.
 * User: Alexander
 * Date: 05.09.13
 * Time: 17:48
 * To change this template use File | Settings | File Templates.
 */
public class Apple {
    private static final int MAX_SEEDS = 100;
    public int seed;

    public Apple(){
        seed = (int)(Math.random() * MAX_SEEDS);
    }

}
