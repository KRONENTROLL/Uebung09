package p1;

import java.util.Arrays;
import java.util.Random;

public class P1_main {

    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        System.out.println(Arrays.toString(randomArray(x)));
        System.out.println(Arrays.toString(randomArray2(x)));
        System.out.println(Arrays.toString(randomArray3()));
        System.out.println(Arrays.toString(randomArray4(n)));
    }

    public static int[] randomArray(int x) {
        int[] arr = new int[x];
        Random random = new Random();

        for (int i = 0; i < x; i++) {
            arr[i] = random.nextInt();
        }

        return arr;
    }

    public static int[] randomArray2(int x) {
        int[] arr = new int[x];
        Random random = new Random();

        for (int i = 0; i < x; i++) {
            arr[i] = random.nextInt(x);
        }

        return arr;
    }

    public static int[] randomArray3() {
        int[] arr = new int[6];
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            arr[i] = random.nextInt(55, 76);
        }
        return arr;
    }

    public static int[] randomArray4(int n) {
        int[] arr = new int[n + 1];
        Random random = new Random();
        int summe = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = random.nextInt(1, 51);
            summe = summe + arr[i];
        }
        System.out.println(arr[3]);
        arr[n] = Math.round((float) summe / n);



        return arr;
    }
}
