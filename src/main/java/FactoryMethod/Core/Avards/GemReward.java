package FactoryMethod.Core.Avards;

import FactoryMethod.Core.Abstraction.GameItem;

/**
 * вторая награда
 */
class GemReward implements GameItem {

    @Override
    public void open(int count) {
        System.out.println("Gem" + " x " + count);
    }
}
