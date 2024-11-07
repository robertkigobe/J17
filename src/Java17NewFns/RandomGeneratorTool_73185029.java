package Java17NewFns;

import java.util.List;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

import static java.util.stream.Collectors.toList;

class RandomGeneratorTool_73185029 {
    public static void main(String[] args) {
        RandomGeneratorFactory.all()
                .map(factory -> String.format("%-21s -> %sseedable", factory.name(), isSeedable(factory) ? "" : "not "))
                .forEach(System.out::println);
    }

    public static boolean isSeedable(RandomGeneratorFactory<RandomGenerator> factory) {
        final int ROUNDS = 3, NUMBERS_PER_ROUND = 100, SEED = 123;
        List<Integer>[] randomNumbers = new List[ROUNDS];
        for (int round = 0; round < ROUNDS; round++) {
            randomNumbers[round] = factory.create(SEED).ints(NUMBERS_PER_ROUND).boxed().collect(toList());
            if (round > 0 && !randomNumbers[round - 1].equals(randomNumbers[round]))
                return false;
        }
        return true;
    }
}
