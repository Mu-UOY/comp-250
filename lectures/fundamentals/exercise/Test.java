public class Test {
    public static void main(String[] args) {
        double[] list1 = {1.0, 2.0, 3.0};
        double[] list2 = {4.0, 5.0, 6.0};
        MutableVector vect1 = new MutableVector(list1);
        MutableVector vect2 = new MutableVector(list2);
        vect1.addVect(vect2);
        System.out.println(vect1);
        for (int i = 0; i < list1.length; i++) {
            System.out.print(list1[i] + ",");
        }
        System.out.println();
        ImmutableVector ivect1 = new ImmutableVector(list1);
        ImmutableVector ivect2 = new ImmutableVector(list2);
        ImmutableVector ivect3 = ImmutableVector.addVect(ivect1, ivect2);
        System.out.println(ivect3);
    }
}
