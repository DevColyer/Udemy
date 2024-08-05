public class CarportModel {
    private static final double MIN_WIDTH = 0;
    private static final double MAX_WIDTH = 7.2;

    private static final double MIN_LENGTH = 0;
    private static final double MAX_LENGTH = 7.2;

    private final Dimension width;
    private final Dimension length;

    public CarportModel() {
        this.width = new Dimension(MAX_WIDTH, MIN_WIDTH);
        this.length = new Dimension(MAX_LENGTH, MIN_LENGTH);
    }

    public Dimension getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width.setValue(width);
    }

    public Dimension getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length.setValue(length);
    }
}
