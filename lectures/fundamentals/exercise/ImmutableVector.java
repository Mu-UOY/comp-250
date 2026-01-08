public class ImmutableVector {
    private double[] elements;

    public ImmutableVector(double[] elements) {
        this.elements = elements.clone();
    }

    public static ImmutableVector addVect(ImmutableVector a, ImmutableVector b) {
        double[] result = new double[a.elements.length];
        for (int i = 0; i < a.elements.length; i++) {
            result[i] = a.elements[i] + b.elements[i];
        }
        return new ImmutableVector(result);
    }

    @Override
    public String toString() {
        String elem = "<";
        for (int i = 0; i < this.elements.length; i++) {
            elem += String.valueOf(this.elements[i]);
            if (i < this.elements.length - 1) {
                elem += ", ";
            }
        }
        return elem + ">";
    }
}