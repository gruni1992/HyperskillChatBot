
public final class ComplexNumber {
    private final double re;
    private final double im;

    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }

    public double getRe() {
        return re;
    }

    public double getIm() {
        return im;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (!(other instanceof ComplexNumber)) {
            return false;
        }

        ComplexNumber that = (ComplexNumber) other;
        return this.re == that.re && this.im == that.im;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(re, im);
    }
}