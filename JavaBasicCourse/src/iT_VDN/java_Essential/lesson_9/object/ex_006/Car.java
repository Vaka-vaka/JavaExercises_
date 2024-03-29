/**
 * java basic
 * lesson 9
 *
 * @version 1.0 from 2023-11-01
 * @author Valentyn Mozul
 */

package iT_VDN.java_Essential.lesson_9.object.ex_006;

public class Car {
    private boolean booleanValue = true;
    private char charValue = 'd';
    private String stringValue = "Opana";
    private long longValue = 1231234422L;
    private float floatValue = 1244124.21F;
    private double doubleValue = 9873234.123;
    private byte[] arrayValue = {1, 2, 3, 4};

    public Car(String stringValue, long longValue, float floatValue) {
        this.stringValue = stringValue;
        this.longValue = longValue;
        this.floatValue = floatValue;
    }

    // переопределенный хэш-код(руками)
    @Override
    public int hashCode() {
        int result = 17;

        result = 37 * result + (booleanValue ? 1 : 0);
        result = 37 * result + (int) charValue;
        result = 37 * result + (stringValue == null ? 0 : stringValue.hashCode());
        result = 37 * result + (int) (longValue ^ (longValue >>> 32));
        result = 37 * result + Float.floatToIntBits(floatValue);
        long longBits = Double.doubleToLongBits(doubleValue);
        result = 37 * result + (int) (longBits ^ (longBits >>> 32));
        for (byte b : arrayValue)
            result = 37 * result + (int) b;

        return result;
    }
}
