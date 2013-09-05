package by.bsu.metelsky.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Alexander
 * Date: 05.09.13
 * Time: 17:47
 * To change this template use File | Settings | File Templates.
 */
public class Tree {

    protected static final int MAX_APPLES_RANDOM = 100;

    public List<Apple> apples = new ArrayList<Apple>();
    public int seedGrown = 0;
    public int seedShaked = 0;
    private boolean bloom = false;
    private int bloomCount;

    public void grow() {
        int countToGrow = bloom ? bloomCount : (int) (Math.random() * MAX_APPLES_RANDOM) ;
        bloom = false;
        for (int i = 0; i < countToGrow; i++) {
            Apple apple = new Apple();
            apples.add(apple);
            seedGrown += apple.seed;
        }
    }

    public void shake() {
        int countToRemove = (int)(Math.random() * MAX_APPLES_RANDOM);
        while( countToRemove > 0 && apples.size() > 0 ){
            Apple apple =apples.remove(0);
            seedShaked += apple.seed;
            countToRemove--;
        }
    }

    public void bloom() {
        bloom = true;
        bloomCount = (int) (Math.random() * MAX_APPLES_RANDOM);
    }
}
