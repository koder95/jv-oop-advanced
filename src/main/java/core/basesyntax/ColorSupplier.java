package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private static final Random RANDOM = new Random();

    public Color getRandomColor() {
        Color[] values = Color.values();
        int index = RANDOM.nextInt(values.length) + 1;
        return values[index];
    }
}
