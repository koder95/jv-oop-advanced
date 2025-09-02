package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final Random RANDOM = new Random();
    private static final Figure DEFAULT_FIGURE = new Circle(Color.WHITE, 10);
    private static final int FIGURE_COUNT = 5;
    private static final double MAX_RANDOM_VALUE = 10;

    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int figure = RANDOM.nextInt(FIGURE_COUNT + 1);
        switch (figure) {
            case 0:
                return new Circle(colorSupplier.getRandomColor(), getRandomValue());
            case 1:
                return new IsoscelesTrapezoid(
                        colorSupplier.getRandomColor(),
                        getRandomValue(), getRandomValue(), getRandomValue()
                );
            case 2:
                return new Rectangle(
                        colorSupplier.getRandomColor(),
                        getRandomValue(), getRandomValue()
                );
            case 3:
                return new RightTriangle(
                        colorSupplier.getRandomColor(),
                        getRandomValue(), getRandomValue()
                );
            default:
                return new Square(colorSupplier.getRandomColor(), getRandomValue());
        }
    }

    private double getRandomValue() {
        return RANDOM.nextDouble(MAX_RANDOM_VALUE);
    }

    public Figure getDefaultFigure() {
        return DEFAULT_FIGURE;
    }
}
