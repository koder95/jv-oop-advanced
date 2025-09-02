package core.basesyntax;

public class App {
    private static final int ARRAY_CAPACITY = 10;
    private static final FigureSupplier FIGURE_SUPPLIER = new FigureSupplier();

    private App() {
    }

    public static void main(String[] args) {
        Figure[] figures = new Figure[ARRAY_CAPACITY];
        for (int i = 0; i < ARRAY_CAPACITY; i++) {
            figures[i] = i < ARRAY_CAPACITY / 2 ? FIGURE_SUPPLIER.getRandomFigure() : FIGURE_SUPPLIER.getDefaultFigure();
        }
        for (Figure figure : figures) {
            if (figure instanceof Drawable) {
                Drawable drawable = (Drawable) figure;
                drawable.draw();
            }
        }
    }
}
