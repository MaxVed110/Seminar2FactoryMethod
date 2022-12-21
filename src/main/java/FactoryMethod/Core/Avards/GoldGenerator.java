package FactoryMethod.Core.Avards;

import FactoryMethod.Core.Abstraction.GameItem;
import FactoryMethod.Core.Abstraction.ItemGenerator;

/**
 * фабрика, создает обхекты типа GoldReward
 */
public class GoldGenerator extends ItemGenerator {

    @Override
    public GameItem createItem() {
        return new GoldReward();
    }
}
