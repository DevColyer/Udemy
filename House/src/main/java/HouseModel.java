public class HouseModel {
    private static final double MIN_WIDTH = 2.4;
    private static final double MAX_WIDTH = 2.4;

    private static final double MIN_LENGTH = 2.4;
    private static final double MAX_LENGTH = 26.4;

    private static final double MIN_HEIGHT = 2.2;
    private static final double MAX_HEIGHT = 4.7;

    private final Dimension width;
    private final Dimension height;
    private final Dimension length;
    private final CarportModel carportModel;

    public HouseModel() {
        this.width = new Dimension(MAX_WIDTH, MIN_WIDTH);
        this.height = new Dimension(MAX_HEIGHT, MIN_HEIGHT);
        this.length = new Dimension(MAX_LENGTH, MIN_LENGTH);
        carportModel = new CarportModel();
    }

    public Dimension getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width.setValue(width);
    }

    public Dimension getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height.setValue(height);
    }

    public Dimension getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length.setValue(length);
    }

    public CarportModel getCarportModel() {
        return carportModel;
    }
}
