package FactoryMethod.Core.Abstraction;

/**
 * прообраз фабрик
 */
public abstract class ItemGenerator {
    public void openReward() {
        GameItem gameItem = createItem();
        gameItem.open(gameItem.count());
    }

    /**
     * абстрактный метод создания награды
     */
    public abstract GameItem createItem();
}
