public class Dimension {

    private final double max;
    private final double min;
    private double value;

    public Dimension(double max, double min) {
        this.max = max;
        this.value = this.min = min;
    }

    public double getMax() {
        return max;
    }

    public double getMin() {
        return min;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        if (value > max) {
            this.value = max;
        } else if (value < min) {
            this.value = min;
        }
        this.value = value;
    }
}
