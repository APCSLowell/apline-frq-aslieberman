public class APLine {
    private int a;
    private int b;
    private int c;

    public APLine(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getSlope() {
        if (b == 0) {
            return Double.NaN; // Represents undefined slope (vertical line)
        }
        return -(double) a / b;
    }

    public boolean isOnLine(int x, int y) {
        return (a * x + b * y + c == 0);
    }
}
