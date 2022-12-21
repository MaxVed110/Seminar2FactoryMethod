package FactoryMethod.Core.Avards;

import FactoryMethod.Core.Abstraction.GameItem;

/**
 * четвертая награда
 */
public class SilverReward implements GameItem {
    @Override
    public void open(int count) {
        System.out.println("silver" + " x " + count);
    }
}
