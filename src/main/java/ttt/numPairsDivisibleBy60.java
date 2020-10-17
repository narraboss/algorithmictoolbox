package ttt;

import java.util.Arrays;

public class numPairsDivisibleBy60 {

    public static void main(String[] args) {
        int[] x = {60,0,0};
        int y = numPairsDivisibleBy60(x);
        System.out.println(y);
    }

    public static int numPairsDivisibleBy60(int[] time) {
        int c[] = new int[60], res = 0;
        for (int t : time) {
            res += c[(60 - t % 60) % 60];
            c[t % 60] += 1;
            System.out.println(Arrays.toString(c));
        }
        //System.out.println(Arrays.toString(c));
        return res;
    }

}