package core.basesyntax;

public class Square extends Figure implements Drawable {
    private double size;

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public double getArea() {
        return size * size;
    }

    @Override
    public void draw() {
        System.out.println("Figure: square, area: " + getArea() + " units^2, size: " + getSize() + " units");
    }
}