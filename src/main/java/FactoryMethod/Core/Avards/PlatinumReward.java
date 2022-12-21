package FactoryMethod.Core.Avards;

import FactoryMethod.Core.Abstraction.GameItem;

/**
 * третья награда
 */
public class PlatinumReward implements GameItem {
    @Override
    public void open(int count) {
        System.out.println("platinum" + " x " + count);
    }
}
