/**
 * Checks if given <code>value</code> is a power of two
 *
 * @author Valentyn Mozul
 * @version 1.0
 */

package primitiveTypes;

public class PowerOfTwo {
    /**
     * Program entry point.
     * @param args command Line arguments
     */
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(-2));
    }

    public static boolean isPowerOfTwo(int value) {
        /*for (int x = 1; x <= value; x *= 2)
        {
            if (x == value) return true;
        }
        return false;*/
        /*return value > 0 && (value & -value) == value;*/
        int ert = Math.abs(value);
        return ert > 0 && (ert & (ert - 1)) == 0;
       /* if (value == 0) {
            return false;
        }
        else {
            int res = Math.abs(value);
            return (res & (res - 1)) == 0;
        }*/
    }
}

