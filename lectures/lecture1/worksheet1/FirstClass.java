public class FirstClass {
    public static void main(String[] args) {
        char c = 'x';
        int n = 5;
        char shiftedChar = charRightShift(c, n);
        System.out.println("Original character: " + c);
        System.out.println("Shifted character: " + shiftedChar);
    }
    //Write your method here
    public static char charRightShift(char c, int n) {
        if ((short)c < (short)'a' || (short)c > (short)'z') {
            return c;
        } 
        int shift_val = (short)c + n;
        short d = (short)shift_val;
        char new_c = (char)d;
        return new_c;
        }
    }
