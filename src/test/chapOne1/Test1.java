package test.chapOne1;

import org.junit.Test;

import utils.StdOut;
import utils.StdRandom;

public class Test1 {

    @Test
    public void test1_1() {
        StdOut.println((0 + 15) / 2); // 7
        StdOut.println(2.0e-6 * 100000000.1); // 200.0000002
        StdOut.println(true&&false||true&&true); // true
    }

    @Test
    public void test1_2() {
        StdOut.println((1 + 2.236)/2); // 1.618
        StdOut.println(1 + 2 + 3 + 4.0); // 10.0
        StdOut.println(4.1 >= 4); // true
        StdOut.println(1 + 2 + "3"); // "33"
        StdOut.println();
    }

    @Test
    public void test1_3() {
        int num1 = StdRandom.uniform(3);
        int num2 = StdRandom.uniform(3);
        int num3 = StdRandom.uniform(3);
        StdOut.println(num1 + "_" + num2 + "_" + num3);
        if(num1 == num2 && num2 == num3) {
            StdOut.println("equal");
        } else {
            StdOut.println("not equal");
        }
    }

    @Test
    public void test1_4() {
        int a, b, c;
        a = b = c = 0;
        // if (a > b) then c = 0; // then 多余
        // if a > b {c = 0;} // 条件需要括号
        if (a > b) c = 0;
        // if (a < b) c = 0 else b = 0; // 缺少分号
    }

    @Test
    public void test1_5() {
        double x = StdRandom.uniform(0.0, 2.0);
        double y = StdRandom.uniform(0.0, 2.0);
        StdOut.println(x + "_" + y);
        StdOut.println(0 < x && x < 1 && 0< y && y < 1);
    }

    @Test
    public void test1_6() {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            StdOut.printf(f + " "); // 0 1 1 2 3 5 8 ...
            f = f + g;
            g = f - g;
        }
    }

    @Test
    public void test1_7() {
        // a
        double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001)
            t = (9.0/t + t) / 2.0;
        StdOut.printf("%.5f\n", t); // 
        // b
        // c
    }
    
}