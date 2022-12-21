package FactoryMethod.Core;

import FactoryMethod.Core.Abstraction.ItemGenerator;
import FactoryMethod.Core.Avards.GemGenerator;
import FactoryMethod.Core.Avards.GoldGenerator;
import FactoryMethod.Core.Avards.PlatinumGenerator;
import FactoryMethod.Core.Avards.SilverGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Random random = ThreadLocalRandom.current();
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GemGenerator());
        generatorList.add(new GoldGenerator());
        generatorList.add(new PlatinumGenerator());
        generatorList.add(new SilverGenerator());

        for (int i = 0; i < 10; i++) {
            int index = Math.abs(random.nextInt() % 2 == 0 ? 0 : 1);
            ItemGenerator itemGenerator = generatorList.get(index);
            itemGenerator.openReward();
        }
    }
}
