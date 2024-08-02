import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.lang.Math;

/**
 * @author c.w
 * @className BaseDataType
 * @description
 * @date 2024/07/30
 **/
public class BaseDataType {

    private static final int x = 1;
    private static final int y = 100;

    @Test
    public void testLong() {
        long personIdNumber = 410621201011110082L;
        long personIdNumber_ = 410621_2010_11_11_0082L;
        System.out.println("1:" + personIdNumber);
        System.out.println("2:" + personIdNumber_);
    }

    @Test
    public void testTime() {
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
        Date date = new Date();
        System.out.println(date);
    }

    @Test
    public void testComputeSign() {
        int a = 1;
        int b = 2;
        int e = 9;
        float c = 3.5F;
        double d = 4.2D;
        a += 2.5;
        //b = b + c;
        /*b = b + 2.5;
        e = e + c + d;*/

        System.out.println(a);
        System.out.println(b);
    }

    @Test
    public void testSwitch() {
        int a = 103;
        int b = 102;
        final int z = 100;
        switch (b) {
            case 102:
                b++;
                System.out.println(b);
                //break;
            case 103:
                System.out.println(b);
                break;
            default:
                System.out.println(0);
        }
    }

    @Test
    public void testMath() {
        Math.sin(Math.PI / 2);
    }

    @Test
    public void testCeil_floor_rint_round() {
        List<Object> l = new ArrayList<>();
        l.add(Math.ceil(2.1D));
        l.add(Math.ceil(2.0D));
        l.add(Math.ceil(-2.0D));
        l.add(Math.ceil(-2.1D));
        l.add(Math.floor(2.1D));
        l.add(Math.floor(2.0D));
        l.add(Math.floor(-2.0D));
        l.add(Math.floor(-2.1D));
        l.add(Math.rint(2.1D));
        l.add(Math.rint(-2.0D));
        l.add(Math.rint(-2.1D));
        l.add(Math.rint(2.5D));
        l.add(Math.rint(4.5D));
        l.add(Math.rint(-2.5D));
        l.add(Math.round(2.6F));
        l.add(Math.round(2.0D));
        l.add(Math.round(-2.0F));
        l.add(Math.round(-2.6D));
        l.add(Math.round(-2.4D));
        for (int i = 0; i < l.size(); i++) {
            System.out.println("类型:" + getType(l.get(i)) + "  值:" + l.get(i));
        }
    }

    public static String getType(Object o) {
        return o.getClass().getTypeName();
    }

    @Test
    public void testMinMaxAbs() {
        System.out.println(Math.max(2, 6));
        System.out.println(Math.min(2, 6));
        System.out.println(Math.abs(2));
        System.out.println(Math.abs(-2));
    }



}


