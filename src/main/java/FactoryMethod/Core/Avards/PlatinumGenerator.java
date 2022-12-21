package FactoryMethod.Core.Avards;

import FactoryMethod.Core.Abstraction.GameItem;
import FactoryMethod.Core.Abstraction.ItemGenerator;

/**
 * фабрика, создает обхекты типа PlatinumReward
 */
public class PlatinumGenerator extends ItemGenerator {
    @Override
    public GameItem createItem() {
        return new PlatinumReward();
    }
}
