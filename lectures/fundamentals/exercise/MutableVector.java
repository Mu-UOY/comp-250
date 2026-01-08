public class MutableVector {
    private double[] elements;

    public MutableVector(double[] elements) {
        this.elements = elements.clone();
    }

    public void addVect(MutableVector other) {
        for (int i = 0; i < this.elements.length; i++) {
            this.elements[i] += other.elements[i];
        }
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