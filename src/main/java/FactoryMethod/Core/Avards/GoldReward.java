package FactoryMethod.Core.Avards;

import FactoryMethod.Core.Abstraction.GameItem;

/**
 * первая награда
 */
class GoldReward implements GameItem {

    @Override
    public void open(int count) {
        System.out.println("Gold" + " x " + count);
    }
}
