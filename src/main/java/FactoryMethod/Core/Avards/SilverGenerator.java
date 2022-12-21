package FactoryMethod.Core.Avards;

import FactoryMethod.Core.Abstraction.GameItem;
import FactoryMethod.Core.Abstraction.ItemGenerator;

/**
 * фабрика, создает обхекты типа SilverReward
 */
public class SilverGenerator extends ItemGenerator {

    @Override
    public GameItem createItem() {
        return new SilverReward();
    }
}
