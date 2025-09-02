package core.basesyntax;

public class App {
    private static final int ARRAY_CAPACITY = 10;

    private App() {
    }

    public static void main(String[] args) {
        FigureSupplier figureSupplier = new FigureSupplier();
        Figure[] figures = new Figure[ARRAY_CAPACITY];
        for (int i = 0; i < ARRAY_CAPACITY; i++) {
            figures[i] = i < ARRAY_CAPACITY / 2
                    ? figureSupplier.getRandomFigure() : figureSupplier.getDefaultFigure();
        }
        for (Figure figure : figures) {
            if (figure instanceof Drawable) {
                Drawable drawable = (Drawable) figure;
                drawable.draw();
            }
        }
    }
}
