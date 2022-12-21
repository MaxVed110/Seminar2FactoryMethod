package FactoryMethod.Core.Abstraction;

import java.util.Random;

/**
 * интерфейс реализации награды с рандомным количеством
 */
public interface GameItem {

    default Integer count() {
        Random rcount = new Random();
        return Math.abs(rcount.nextInt(1, 11));
    }

    /**
     * метод реализуец процесс получения награды в заданном количестве
     * @param count
     */
    void open(int count);
}
