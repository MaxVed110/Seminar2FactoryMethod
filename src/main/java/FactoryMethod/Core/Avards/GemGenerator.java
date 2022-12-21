package FactoryMethod.Core.Avards;

import FactoryMethod.Core.Abstraction.GameItem;
import FactoryMethod.Core.Abstraction.ItemGenerator;

/**
 * фабрика, создает обхекты типа GemReward
 */
public class GemGenerator extends ItemGenerator {

    @Override
    public GameItem createItem() {
        return new GemReward();
    }
}
